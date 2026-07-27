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
    // 植物/生食材
    public static Item ICE_FLOWERS;//寒霜花
    public static Item HORSEWEED;//飞蓬草
    public static Item SHEPHERD_PURSE;//荠菜
    public static Item CROP_DANDELION;//蒲公英
    public static Item HOUTTUYNIA;//折耳根
    public static Item BRACKEN_FERN_SHOOT;//蕨菜
    public static Item WILD_GARLIC;//野葱
    public static Item WATER_DROPWORT;//水芹
    public static Item PURSLANE;//马齿苋
    public static Item MUGWORT_SPROUT;//芦蒿
    public static Item REED_SHOOT;//芦苇笋
    public static Item MINT;//薄荷
    public static Item POISON_HEMLOCK;//毒芹
    public static Item LYCORIS;//石蒜
    public static Item TREE_OF_HEAVEN;//臭椿
    public static Item BUTTERCUP;//石龙芮
    public static Item CUDWEED;//鼠曲草
    public static Item CHINESE_TOON_SPROUT;//香椿
    public static Item COOKED_BRACKEN_FERN_SHOOT;//烤蕨菜
    public static Item COOKED_REED_SHOOT;//烤芦苇笋
    public static Item COOKED_PURSLANE;//烤马齿苋
    public static Item COOKED_SHEPHERD_PURSE;//烤荠菜
    public static Item COOKED_WATER_DROPWORT;//烤水芹
    public static Item FOXTAIL_GRASS;//狗尾巴草
    public static Item GINSENG;//人参
    public static Item LINGZHI;//灵芝
    public static Item HERICIUM;//猴头菇
    public static Item GINSENG_SOUP;//人参汤
    public static Item HERICIUM_COOKIE;//猴头菇饼干
    public static Item LINGZHI_CHICKEN_SOUP;//灵芝鸡汤
    public static Item DANDELION_CLOCK;//蒲公英毛球

    // 锅料理
    public static Item CHINESE_TOON_SCRAMBLED_EGGS;//香椿炒蛋
    public static Item SHEPHERD_PURSE_DUMPLINGS;//荠菜饺子
    public static Item HOUTTUYNIA_SALAD;//凉拌折耳根
    public static Item PURSLANE_MOZZARELLA_SALAD;//马齿苋沙拉
    public static Item BRACKEN_FERN_WITH_BACON;//蕨菜炒培根
    public static Item MUGWORT_WITH_CORN;//芦蒿玉米粒
    public static Item WATER_DROPWORT_ONION_SALAD;//水芹洋葱沙拉
    public static Item DANDELION_TOMATO_EGG_SOUP;//蒲公英番茄汤
    public static Item REED_SHOOT_CHICKEN_LETTUCE;//芦苇笋鸡丁
    public static Item WILD_GARLIC_CORN_PANCAKE;//野葱玉米烙
    public static Item HORSEWEED_MOZZARELLA_HONEY;//飞蓬芝士焗
    public static Item MIXED_WILD_STIR_FRY;//山野炒时蔬
    public static Item DOUBLE_WILD_VEG_SALAD;//凉拌双蔬
    public static Item WILD_VEG_PANCAKE;//野菜薄饼
    public static Item THREE_FRESH_SALAD;//三鲜沙拉
    public static Item WILD_VEGETABLE_SOUP;//野菜浓汤
    public static Item MINT_LAMB_HAM;//薄荷羊肉
    public static Item ICE_FLOWER_FRUIT_SALAD;//冰花水果沙拉

    // 饮品 & 甜点
    public static Item MINT_TEA;//薄荷茶
    public static Item DANDELION_ROOT_TEA;//蒲公英根茶
    public static Item ICE_FLOWER_MINT_SOUP;//寒霜花汤
    public static Item CUDWEED_RICE_DUMPLING;//鼠曲草青团
    public static Item HUNDRED_HERBS_DELICACY;//百草灵膳

    public static void registerItems() {
        ModFoodComponents.init();

        ICE_FLOWERS = register("ice_flowers", new BlockItem(ModBlock.ICE_FLOWERS, new Item.Settings()));
        HORSEWEED = register("horseweed", new AliasedBlockItem(ModBlock.HORSEWEEDBLOCK, new Item.Settings().food(ModFoodComponents.Horseweed)));
        SHEPHERD_PURSE = register("shepherd_purse", new Item(new Item.Settings().food(ModFoodComponents.Shepherd_purse)));
        CROP_DANDELION = register("crop_dandelion", new Item(new Item.Settings().food(ModFoodComponents.Crop_Dandelion)));
        HOUTTUYNIA = register("houttuynia", new Item(new Item.Settings().food(ModFoodComponents.Houttuynia)));
        BRACKEN_FERN_SHOOT = register("bracken_fern_shoot", new Item(new Item.Settings().food(ModFoodComponents.Bracken_Fern_Shoot)));
        WILD_GARLIC = register("wild_garlic", new Item(new Item.Settings().food(ModFoodComponents.Wild_Garlic)));
        WATER_DROPWORT = register("water_dropwort", new Item(new Item.Settings().food(ModFoodComponents.Water_Dropwort)));
        PURSLANE = register("purslane", new Item(new Item.Settings().food(ModFoodComponents.Purslane)));
        MUGWORT_SPROUT = register("mugwort_sprout", new Item(new Item.Settings().food(ModFoodComponents.Mugwort_Sprout)));
        REED_SHOOT = register("reed_shoot", new Item(new Item.Settings().food(ModFoodComponents.Reed_Shoot)));
        MINT = register("mint", new Item(new Item.Settings().food(ModFoodComponents.Mint)));
        CHINESE_TOON_SPROUT = register("chinese_toon_sprout", new Item(new Item.Settings().food(ModFoodComponents.Chinese_Toon_Sprout)));
        POISON_HEMLOCK = register("poison_hemlock", new Item(new Item.Settings().food(ModFoodComponents.Poison_Hemlock)));
        LYCORIS = register("lycoris", new Item(new Item.Settings().food(ModFoodComponents.Lycoris)));
        TREE_OF_HEAVEN = register("tree_of_heaven", new Item(new Item.Settings().food(ModFoodComponents.Tree_of_Heaven)));
        BUTTERCUP = register("buttercup", new Item(new Item.Settings().food(ModFoodComponents.Buttercup)));
        CUDWEED = register("cudweed", new Item(new Item.Settings().food(ModFoodComponents.Cudweed)));
        GINSENG = register("ginseng", new FoodEffectItem(new Item.Settings().food(ModFoodComponents.Ginseng)));
        LINGZHI = register("lingzhi", new FoodEffectItem(new Item.Settings().food(ModFoodComponents.Lingzhi)));
        HERICIUM = register("hericium", new Item(new Item.Settings().food(ModFoodComponents.Hericium)));
        COOKED_BRACKEN_FERN_SHOOT = register("cooked_bracken_fern_shoot", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Bracken_Fern_Shoot)));
        COOKED_REED_SHOOT = register("cooked_reed_shoot", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Reed_Shoot)));
        COOKED_PURSLANE = register("cooked_purslane", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Purslane)));
        COOKED_SHEPHERD_PURSE = register("cooked_shepherd_purse", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Shepherd_Purse)));
        COOKED_WATER_DROPWORT = register("cooked_water_dropwort", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Water_Dropwort)));
        FOXTAIL_GRASS = register("foxtail_grass", new BlockItem(ModBlock.FOXTAIL_GRASS, new Item.Settings()));
        DANDELION_CLOCK = register("dandelion_clock", new DandelionClockItem(new Item.Settings()));
        GINSENG_SOUP = register("ginseng_soup", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Ginseng_Soup), false));
        HERICIUM_COOKIE = register("hericium_cookie", new FoodEffectItem(new Item.Settings().food(ModFoodComponents.Hericium_Cookie)));
        LINGZHI_CHICKEN_SOUP = register("lingzhi_chicken_soup", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Lingzhi_Chicken_Soup), false));

        CHINESE_TOON_SCRAMBLED_EGGS = register("chinese_toon_scrambled_eggs", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Chinese_Toon_Scrambled_Eggs), false));
        SHEPHERD_PURSE_DUMPLINGS = register("shepherd_purse_dumplings", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Shepherd_Purse_Dumplings), false));
        HOUTTUYNIA_SALAD = register("houttuynia_salad", new FoodEffectItem(new Item.Settings().food(ModFoodComponents.Houttuynia_Salad)));
        PURSLANE_MOZZARELLA_SALAD = register("purslane_mozzarella_salad", new FoodEffectItem(new Item.Settings().food(ModFoodComponents.Purslane_Mozzarella_Salad)));
        BRACKEN_FERN_WITH_BACON = register("bracken_fern_with_bacon", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Bracken_Fern_With_Bacon), false));
        MUGWORT_WITH_CORN = register("mugwort_with_corn", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Mugwort_With_Corn), false));
        WATER_DROPWORT_ONION_SALAD = register("water_dropwort_onion_salad", new FoodEffectItem(new Item.Settings().food(ModFoodComponents.Water_Dropwort_Onion_Salad)));
        DANDELION_TOMATO_EGG_SOUP = register("dandelion_tomato_egg_soup", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Dandelion_Tomato_Egg_Soup), false));
        REED_SHOOT_CHICKEN_LETTUCE = register("reed_shoot_chicken_lettuce", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Reed_Shoot_Chicken_Lettuce), false));
        WILD_GARLIC_CORN_PANCAKE = register("wild_garlic_corn_pancake", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Wild_Garlic_Corn_Pancake), false));
        HORSEWEED_MOZZARELLA_HONEY = register("horseweed_mozzarella_honey", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Horseweed_Mozzarella_Honey), false));
        MIXED_WILD_STIR_FRY = register("mixed_wild_stir_fry", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Mixed_Wild_Stir_Fry), false));
        DOUBLE_WILD_VEG_SALAD = register("double_wild_veg_salad", new FoodEffectItem(new Item.Settings().food(ModFoodComponents.Double_Wild_Veg_Salad)));
        WILD_VEG_PANCAKE = register("wild_veg_pancake", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Wild_Veg_Pancake), false));
        THREE_FRESH_SALAD = register("three_fresh_salad", new FoodEffectItem(new Item.Settings().food(ModFoodComponents.Three_Fresh_Salad)));
        WILD_VEGETABLE_SOUP = register("wild_vegetable_soup", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Wild_Vegetable_Soup), false));
        MINT_LAMB_HAM = register("mint_lamb_ham", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Mint_Lamb_Ham), false));
        ICE_FLOWER_FRUIT_SALAD = register("ice_flower_fruit_salad", new FoodEffectItem(new Item.Settings().food(ModFoodComponents.Ice_Flower_Fruit_Salad)));

        MINT_TEA = register("mint_tea", new ContainerFoodItem(Items.GLASS_BOTTLE, new Item.Settings().food(ModFoodComponents.Mint_Tea), true));
        DANDELION_ROOT_TEA = register("dandelion_root_tea", new ContainerFoodItem(Items.GLASS_BOTTLE, new Item.Settings().food(ModFoodComponents.Dandelion_Root_Tea), true));
        ICE_FLOWER_MINT_SOUP = register("ice_flower_mint_soup", new ContainerFoodItem(Items.GLASS_BOTTLE, new Item.Settings().food(ModFoodComponents.Ice_Flower_Mint_Soup), true));
        CUDWEED_RICE_DUMPLING = register("cudweed_rice_dumpling", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Cudweed_Rice_Dumpling), false));
        HUNDRED_HERBS_DELICACY = register("hundred_herbs_delicacy", new ContainerFoodItem(Items.BOWL, new Item.Settings().food(ModFoodComponents.Hundred_Herbs_Delicacy), false));
    }

    private static Item register(String id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, new Identifier(WildernesssDelight.MOD_ID, id), item);
    }
}