package com.xkbsx.wildernessdelight.world.biome;

import com.xkbsx.wildernessdelight.WildernesssDelight;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BiomeMoodSound;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeEffects;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.biome.SpawnSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.carver.ConfiguredCarver;
import net.minecraft.world.gen.feature.PlacedFeature;

/**
 * 自定义群系注册表：
 * 只负责「定义 + 注册」群系，实际如何选入世界由 TerraBlender 的 Region 决定。
 * bootstrap 方法会在 datagen 运行时被调用，把群系序列化为
 * data/wildernesss-delight/worldgen/biome/firefly_meadow.json。
 */
public class Modbiomes {
    /**
     * 群系的注册键（RegistryKey）：
     * 相当于群系在注册表中的"身份证"，
     * 填 ModId + 群系名，供 TerraBlender 替换地块（replaceBiome）和生物改造（BiomeModifications）引用。
     */
    public static final RegistryKey<Biome> FIREFLY_MEADOW = RegistryKey.of(RegistryKeys.BIOME,
            new Identifier(WildernesssDelight.MOD_ID, "firefly_meadow"));

    /**
     * datagen 引导入口：在 buildRegistry 阶段被 Fabric API 调用，
     * 通过 Registerable 把上面定义好的群系对象注册进动态注册表。
     */
    public static void bootstrap(Registerable<Biome> biomeRegisterable) {
        /* 拿到两个「查询表」，用于引用其他动态注册表里的东西（矿石、植物等都需要它） */
        // placed feature 查询表：世界里能实际落地生成的地物（如 ore_iron、我们的植物散布）
        RegistryEntryLookup<PlacedFeature> placedFeatureLookup = biomeRegisterable.getRegistryLookup(RegistryKeys.PLACED_FEATURE);
        // 洞穴雕刻师查询表：cave / canyon 这类挖洞的地物
        RegistryEntryLookup<ConfiguredCarver<?>> carverLookup = biomeRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_CARVER);

        // 地物生成器：按 11 个生成阶段（步骤）逐层添加 placed feature
        // 顶层是 LookupBackedBuilder —— 直接用 id 引用任何已注册的 placed feature
        GenerationSettings.LookupBackedBuilder generationSettings = new GenerationSettings.LookupBackedBuilder(placedFeatureLookup, carverLookup);

        // 阶段：洞穴雕刻 —— 空气类的三个原版洞穴逐层挖空地下
        generationSettings.carver(GenerationStep.Carver.AIR,
                RegistryKey.of(RegistryKeys.CONFIGURED_CARVER, new Identifier("minecraft:cave")));
        // 深层附加洞穴（Y 较深处的额外洞穴）
        generationSettings.carver(GenerationStep.Carver.AIR,
                RegistryKey.of(RegistryKeys.CONFIGURED_CARVER, new Identifier("minecraft:cave_extra_underground")));
        // 峡谷
        generationSettings.carver(GenerationStep.Carver.AIR,
                RegistryKey.of(RegistryKeys.CONFIGURED_CARVER, new Identifier("minecraft:canyon")));

        /**
         * 以下为 11 个生成阶段的依次塞入：
         * RAWS 原样照抄原版草原（plains）表中的内容，保证萤火原野的地下/矿物资源和原版一致。
         */
        // 1.lakes 阶段：不深/地表岩浆湖
        addFeature(generationSettings, GenerationStep.Feature.LAKES,
                "minecraft:lake_lava_underground", "minecraft:lake_lava_surface");
        // 2.local_modifications 阶段：紫水晶洞
        addFeature(generationSettings, GenerationStep.Feature.LOCAL_MODIFICATIONS, "minecraft:amethyst_geode");
        // 3.underground_structures 阶段：地牢（怪物房）
        addFeature(generationSettings, GenerationStep.Feature.UNDERGROUND_STRUCTURES,
                "minecraft:monster_room", "minecraft:monster_room_deep");
        // 6.underground_ores 阶段：全部原版矿物 + 水下岩浆 + 沙滩圆石/沙/黏土
        addFeature(generationSettings, GenerationStep.Feature.UNDERGROUND_ORES,
                "minecraft:ore_dirt", "minecraft:ore_gravel",
                "minecraft:ore_granite_upper", "minecraft:ore_granite_lower",
                "minecraft:ore_diorite_upper", "minecraft:ore_diorite_lower",
                "minecraft:ore_andesite_upper", "minecraft:ore_andesite_lower",
                "minecraft:ore_tuff",
                "minecraft:ore_coal_upper", "minecraft:ore_coal_lower",
                "minecraft:ore_iron_upper", "minecraft:ore_iron_middle", "minecraft:ore_iron_small",
                "minecraft:ore_gold", "minecraft:ore_gold_lower",
                "minecraft:ore_redstone", "minecraft:ore_redstone_lower",
                "minecraft:ore_diamond", "minecraft:ore_diamond_large", "minecraft:ore_diamond_buried",
                "minecraft:ore_lapis", "minecraft:ore_lapis_buried",
                "minecraft:ore_copper",
                "minecraft:underwater_magma",
                "minecraft:disk_sand", "minecraft:disk_clay", "minecraft:disk_gravel");
        // 6.fluid_springs（泉）阶段：水泉和岩浆泉
        addFeature(generationSettings, GenerationStep.Feature.FLUID_SPRINGS,
                "minecraft:spring_water", "minecraft:spring_lava");
        // 7.vegetal_decoration 植被阶段：萤火原野的特色菜地
        // 注意：共享的原版地物必须与原版平原群系保持完全一致的相对顺序，
        // 否则会触发 "Feature order cycle" 崩溃（阶段内地物顺序需全局一致）。
        // Mod 属地（如注水获取的野草）在外部群系中是按 feature id 字母序附加的，
        // 因此这里也必须按字母序排列，否则两边的相对顺序不一致会成环
        addFeature(generationSettings, GenerationStep.Feature.VEGETAL_DECORATION,
                "minecraft:trees_plains",                // 草原树的零散树木
                "minecraft:flower_plains",              // 野花
                "minecraft:patch_grass_plain",          // 普通草
                "minecraft:brown_mushroom_normal",      // 棕蘑菇
                "minecraft:red_mushroom_normal",        // 红蘑菇
                "minecraft:patch_sugar_cane",           // 甘蔗
                "minecraft:patch_pumpkin",              // 南瓜
                "wildernesss-delight:buttercup_covered_land",      // 石龙芮
                "wildernesss-delight:crop_dandelion_covered_land", // 蒲公英
                "wildernesss-delight:cudweed_covered_land",      // 鼠曲草
                "wildernesss-delight:firefly_briar_covered_land", // 萤息灌木（高频率生成）
                "wildernesss-delight:firefly_briar_covered_grass", // 萤息灌木（草频率版，每区块必触发）
                "wildernesss-delight:foxtail_grass_covered_land", // 狗尾巴草
                "wildernesss-delight:horseweed_covered_land",    // 飞蓬草
                "wildernesss-delight:mugwort_sprout_covered_land", // 蒌蒿
                "wildernesss-delight:shepherd_purse_covered_land"); // 荠菜
        // 10.top_layer_modification 顶层阶段：冻结最上层（水面结冰/雪）
        addFeature(generationSettings, GenerationStep.Feature.TOP_LAYER_MODIFICATION, "minecraft:freeze_top_layer");

        // 生物生成设置：group 按生态分类，权重越大越容易出现
        SpawnSettings.Builder spawnSettings = new SpawnSettings.Builder();
        // 环境类：蝙蝠（洞穴里）
        spawnSettings.spawn(SpawnGroup.AMBIENT, new SpawnSettings.SpawnEntry(EntityType.BAT, 10, 8, 8));
        // 动物类：羊 / 猪 / 鸡 / 牛，草食动物主力（平原标配）
        spawnSettings.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.SHEEP, 12, 4, 4));
        spawnSettings.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.PIG, 10, 4, 4));
        spawnSettings.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.CHICKEN, 10, 4, 4));
        spawnSettings.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.COW, 8, 4, 4));
        // 马群：马 / 驴（平原地标性物种）
        spawnSettings.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.HORSE, 5, 2, 6));
        spawnSettings.spawn(SpawnGroup.CREATURE, new SpawnSettings.SpawnEntry(EntityType.DONKEY, 1, 1, 3));
        // 怪物类：标准平原夜怪（蜘蛛/僵尸/骷髅/苦力怕/史莱姆 + 稀有的末影人/女巫）
        spawnSettings.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SPIDER, 100, 4, 4));
        spawnSettings.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ZOMBIE, 95, 4, 4));
        spawnSettings.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ZOMBIE_VILLAGER, 5, 1, 1));
        spawnSettings.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SKELETON, 100, 4, 4));
        spawnSettings.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.CREEPER, 100, 4, 4));
        spawnSettings.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.SLIME, 100, 4, 4));
        spawnSettings.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.ENDERMAN, 10, 1, 4));
        spawnSettings.spawn(SpawnGroup.MONSTER, new SpawnSettings.SpawnEntry(EntityType.WITCH, 5, 1, 1));
        // 地下水系生物：发光鱿鱼
        spawnSettings.spawn(SpawnGroup.UNDERGROUND_WATER_CREATURE,
                new SpawnSettings.SpawnEntry(EntityType.GLOW_SQUID, 10, 4, 6));

        // 视觉效果（effects）：天空/水体/淡雾色 + 音效 + 萤火虫粒子
        BiomeEffects effects = new BiomeEffects.Builder()
                // 雾色（远处朦胧的蓝色）
                .fogColor(3030364)
                // 水的颜色（萤火虫沼泽的深青）
                .waterColor(1407590)
                // 水中看出去的颜色
                .waterFogColor(536636)
                // 天空颜色（夜空蓝紫）
                .skyColor(4678287)
                // 草地颜色（暖绿）
                .grassColor(8175465)
                // 树叶颜色
                .foliageColor(9684079)
                // 洞穴回声氛围音
                .moodSound(BiomeMoodSound.CAVE)
                .build();

        // 最后把整群系组合并注册进注册表
        biomeRegisterable.register(FIREFLY_MEADOW, new Biome.Builder()
                .precipitation(true)          // 会降雨
                .temperature(0.8F)             // 温和
                .downfall(0.4F)                // 湿度一般
                .effects(effects)              // 视觉效果
                .spawnSettings(spawnSettings.build())          // 生物生成
                .generationSettings(generationSettings.build()) // 地物生成
                .build());
    }

    /**
     * 小工具：把一批 placed feature 的 id（namespace:path，如 wildernesss-delight:horseweed_covered_land）
     * 批量添加到指定生成阶段。
     */
    private static void addFeature(GenerationSettings.LookupBackedBuilder builder, GenerationStep.Feature step, String... ids) {
        for (String id : ids) {
            // RegistryKey.of 将字符串 id 转成注册键，Lookup 再解析成真实的注册条目
            builder.feature(step, RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(id)));
        }
    }
}