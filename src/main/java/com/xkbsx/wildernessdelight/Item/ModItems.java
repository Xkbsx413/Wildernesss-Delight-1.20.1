package com.xkbsx.wildernessdelight.item;

import com.xkbsx.wildernessdelight.WildernesssDelight;
import com.xkbsx.wildernessdelight.block.ModBlock;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ICE_FLOWERS = registerItems("ice_flowers", new BlockItem(ModBlock.ICE_FLOWERS, new Item.Settings()));//寒霜花
    //public static final Item POTTED_ICE_FLOWERS = registerItems("potted_ice_flowers", new BlockItem(ModBlock.POTTED_ICE_FLOWERS, new Item.Settings()));
    public static final Item HORSEWEED = registerItems("horseweed", new AliasedBlockItem(ModBlock.HORSEWEEDBLOCK, new Item.Settings().food(ModFoodComponents.Horseweed)));//飞蓬草
    public static final Item SHEPHERD_PURSE = registerItems("shepherd_purse", new Item(new Item.Settings().food(ModFoodComponents.Shepherd_purse)));//荠菜
    public static final Item CROP_DANDELION = registerItems("crop_dandelion", new Item(new Item.Settings().food(ModFoodComponents.Crop_Dandelion)));//蒲公英叶
    public static final Item HOUTTUYNIA = registerItems("houttuynia", new Item(new Item.Settings().food(ModFoodComponents.Houttuynia)));//折耳根
    public static final Item BRACKEN_FERN_SHOOT = registerItems("bracken_fern_shoot", new Item(new Item.Settings().food(ModFoodComponents.Bracken_Fern_Shoot)));//蕨菜
    public static final Item WILD_GARLIC = registerItems("wild_garlic", new Item(new Item.Settings().food(ModFoodComponents.Wild_Garlic)));//野葱
    public static final Item WATER_DROPWORT = registerItems("water_dropwort", new Item(new Item.Settings().food(ModFoodComponents.Water_Dropwort)));//水芹茎
    public static final Item PURSLANE = registerItems("purslane", new Item(new Item.Settings().food(ModFoodComponents.Purslane)));//马齿苋
    public static final Item MUGWORT_SPROUT = registerItems("mugwort_sprout", new Item(new Item.Settings().food(ModFoodComponents.Mugwort_Sprout)));//蒌蒿
    public static final Item REED_SHOOT = registerItems("reed_shoot", new Item(new Item.Settings().food(ModFoodComponents.Reed_Shoot)));//芦苇笋
    public static final Item MINT = registerItems("mint", new Item(new Item.Settings().food(ModFoodComponents.Mint)));//薄荷叶
    public static final Item POISON_HEMLOCK = registerItems("poison_hemlock", new Item(new Item.Settings().food(ModFoodComponents.Poison_Hemlock)));//毒芹
    public static final Item LYCORIS = registerItems("lycoris", new Item(new Item.Settings().food(ModFoodComponents.Lycoris)));//石蒜
    public static final Item TREE_OF_HEAVEN = registerItems("tree_of_heaven", new Item(new Item.Settings().food(ModFoodComponents.Tree_of_Heaven)));//臭椿
    public static final Item BUTTERCUP = registerItems("buttercup", new Item(new Item.Settings().food(ModFoodComponents.Buttercup)));//石龙芮
    public static final Item CUDWEED = registerItems("cudweed", new Item(new Item.Settings().food(ModFoodComponents.Cudweed)));//鼠曲草
    public static final Item CHINESE_TOON_SPROUT = registerItems("chinese_toon_sprout", new Item(new Item.Settings().food(ModFoodComponents.Chinese_Toon_Sprout)));//香椿
    public static final Item COOKED_BRACKEN_FERN_SHOOT = registerItems("cooked_bracken_fern_shoot", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Bracken_Fern_Shoot)));//烤蕨菜
    public static final Item COOKED_REED_SHOOT = registerItems("cooked_reed_shoot", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Reed_Shoot)));//烤芦苇笋
    public static final Item COOKED_PURSLANE = registerItems("cooked_purslane", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Purslane)));//烤马齿苋
    public static final Item COOKED_SHEPHERD_PURSE = registerItems("cooked_shepherd_purse", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Shepherd_Purse)));//烤荠菜
    public static final Item COOKED_WATER_DROPWORT = registerItems("cooked_water_dropwort", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Water_Dropwort)));//烤水芹
    public static final Item FOXTAIL_GRASS = registerItems("foxtail_grass", new BlockItem(ModBlock.FOXTAIL_GRASS, new Item.Settings()));//狗尾巴草
    public static final Item GINSENG = registerItems("ginseng", new Item(new Item.Settings().food(ModFoodComponents.Ginseng)));//人参
    public static final Item LINGZHI = registerItems("lingzhi", new Item(new Item.Settings().food(ModFoodComponents.Lingzhi)));//灵芝
    public static final Item HERICIUM = registerItems("hericium", new Item(new Item.Settings().food(ModFoodComponents.Hericium)));//猴头菇
    public static final Item GINSENG_SOUP = registerItems("ginseng_soup", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Ginseng_Soup), false));//人参汤
    public static final Item HERICIUM_COOKIE = registerItems("hericium_cookie", new Item(new Item.Settings().food(ModFoodComponents.Hericium_Cookie)));//猴头菇饼干
    public static final Item LINGZHI_CHICKEN_SOUP = registerItems("lingzhi_chicken_soup", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Lingzhi_Chicken_Soup), false));//灵芝鸡汤
    public static final Item DANDELION_CLOCK = registerItems("dandelion_clock", new DandelionClockItem(new Item.Settings()));//蒲公英毛球

    // ═══════════ 🥘 锅料理 ═══════════
    public static final Item CHINESE_TOON_SCRAMBLED_EGGS = registerItems("chinese_toon_scrambled_eggs", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Chinese_Toon_Scrambled_Eggs), false));//香椿炒蛋
    public static final Item SHEPHERD_PURSE_DUMPLINGS = registerItems("shepherd_purse_dumplings", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Shepherd_Purse_Dumplings), false));//荠菜饺子
    public static final Item HOUTTUYNIA_SALAD = registerItems("houttuynia_salad", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Houttuynia_Salad), false));//凉拌折耳根
    public static final Item PURSLANE_MOZZARELLA_SALAD = registerItems("purslane_mozzarella_salad", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Purslane_Mozzarella_Salad), false));//马齿苋沙拉
    public static final Item BRACKEN_FERN_WITH_BACON = registerItems("bracken_fern_with_bacon", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Bracken_Fern_With_Bacon), false));//蕨菜炒培根
    public static final Item MUGWORT_WITH_CORN = registerItems("mugwort_with_corn", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Mugwort_With_Corn), false));//芦蒿玉米粒
    public static final Item WATER_DROPWORT_ONION_SALAD = registerItems("water_dropwort_onion_salad", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Water_Dropwort_Onion_Salad), false));//水芹洋葱沙拉
    public static final Item DANDELION_TOMATO_EGG_SOUP = registerItems("dandelion_tomato_egg_soup", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Dandelion_Tomato_Egg_Soup), false));//蒲公英番茄汤
    public static final Item REED_SHOOT_CHICKEN_LETTUCE = registerItems("reed_shoot_chicken_lettuce", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Reed_Shoot_Chicken_Lettuce), false));//芦苇笋鸡丁
    public static final Item WILD_GARLIC_CORN_PANCAKE = registerItems("wild_garlic_corn_pancake", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Wild_Garlic_Corn_Pancake), false));//野葱玉米烙
    public static final Item HORSEWEED_MOZZARELLA_HONEY = registerItems("horseweed_mozzarella_honey", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Horseweed_Mozzarella_Honey), false));//飞蓬芝士焗
    public static final Item MIXED_WILD_STIR_FRY = registerItems("mixed_wild_stir_fry", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Mixed_Wild_Stir_Fry), false));//山野炒时蔬
    public static final Item DOUBLE_WILD_VEG_SALAD = registerItems("double_wild_veg_salad", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Double_Wild_Veg_Salad), false));//凉拌双蔬
    public static final Item WILD_VEG_PANCAKE = registerItems("wild_veg_pancake", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Wild_Veg_Pancake), false));//野菜薄饼
    public static final Item THREE_FRESH_SALAD = registerItems("three_fresh_salad", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Three_Fresh_Salad), false));//三鲜沙拉
    public static final Item WILD_VEGETABLE_SOUP = registerItems("wild_vegetable_soup", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Wild_Vegetable_Soup), false));//野菜浓汤
    // ═══════════ 🔥 烤炉料理 ═══════════//锅炉==烤炉
    public static final Item MINT_LAMB_HAM = registerItems("mint_lamb_ham", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Mint_Lamb_Ham), false));//薄荷羊肉
    // ═══════════ ⚒️ 合成台料理 ═══════════
    public static final Item ICE_FLOWER_FRUIT_SALAD = registerItems("ice_flower_fruit_salad", new Item(new Item.Settings().food(ModFoodComponents.Ice_Flower_Fruit_Salad)));//寒霜花水果沙拉
    // ═══════════ 🧃 饮品 ═══════════
    public static final Item MINT_TEA = registerItems("mint_tea", new ContainerFoodItem(Items.GLASS_BOTTLE, new Item.Settings().food(ModFoodComponents.Mint_Tea), true));//薄荷茶
    public static final Item DANDELION_ROOT_TEA = registerItems("dandelion_root_tea", new ContainerFoodItem(Items.GLASS_BOTTLE, new Item.Settings().food(ModFoodComponents.Dandelion_Root_Tea), true));//蒲公英根茶
    public static final Item ICE_FLOWER_MINT_SOUP = registerItems("ice_flower_mint_soup", new ContainerFoodItem(Items.GLASS_BOTTLE, new Item.Settings().food(ModFoodComponents.Ice_Flower_Mint_Soup), true));//寒霜花汤
    // ═══════════ 🍡 甜点 ═══════════
    public static final Item CUDWEED_RICE_DUMPLING = registerItems("cudweed_rice_dumpling", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Cudweed_Rice_Dumpling), false));//鼠曲草青团
    public static final Item HUNDRED_HERBS_DELICACY = registerItems("hundred_herbs_delicacy", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Hundred_Herbs_Delicacy), false));//百草灵膳

    public static Item registerItems(String id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, new Identifier(WildernesssDelight.MOD_ID, id), item);
    }

    public static void registerItems() {
    }
}