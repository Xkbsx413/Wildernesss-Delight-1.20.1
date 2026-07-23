package com.xkbsx.wildernessdelight.item;

import com.xkbsx.wildernessdelight.WildernesssDelight;
import com.xkbsx.wildernessdelight.block.ModBlock;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ICE_FLOWERS = registerItems("ice_flowers", new BlockItem(ModBlock.ICE_FLOWERS, new Item.Settings()));
    //public static final Item POTTED_ICE_FLOWERS = registerItems("potted_ice_flowers", new BlockItem(ModBlock.POTTED_ICE_FLOWERS, new Item.Settings()));
    public static final Item HORSEWEED = registerItems("horseweed", new AliasedBlockItem(ModBlock.HORSEWEEDBLOCK, new Item.Settings().food(ModFoodComponents.Horseweed)));
    public static final Item SHEPHERD_PURSE = registerItems("shepherd_purse", new Item(new Item.Settings().food(ModFoodComponents.Shepherd_purse)));
    public static final Item CROP_DANDELION = registerItems("crop_dandelion", new Item(new Item.Settings().food(ModFoodComponents.Crop_Dandelion)));
    public static final Item HOUTTUYNIA = registerItems("houttuynia", new Item(new Item.Settings().food(ModFoodComponents.Houttuynia)));
    public static final Item BRACKEN_FERN_SHOOT = registerItems("bracken_fern_shoot", new Item(new Item.Settings().food(ModFoodComponents.Bracken_Fern_Shoot)));
    public static final Item WILD_GARLIC = registerItems("wild_garlic", new Item(new Item.Settings().food(ModFoodComponents.Wild_Garlic)));
    public static final Item WATER_DROPWORT = registerItems("water_dropwort", new Item(new Item.Settings().food(ModFoodComponents.Water_Dropwort)));
    public static final Item PURSLANE = registerItems("purslane", new Item(new Item.Settings().food(ModFoodComponents.Purslane)));
    public static final Item MUGWORT_SPROUT = registerItems("mugwort_sprout", new Item(new Item.Settings().food(ModFoodComponents.Mugwort_Sprout)));
    public static final Item REED_SHOOT = registerItems("reed_shoot", new Item(new Item.Settings().food(ModFoodComponents.Reed_Shoot)));
    public static final Item MINT = registerItems("mint", new Item(new Item.Settings().food(ModFoodComponents.Mint)));
    public static final Item POISON_HEMLOCK = registerItems("poison_hemlock", new Item(new Item.Settings().food(ModFoodComponents.Poison_Hemlock)));
    public static final Item LYCORIS = registerItems("lycoris", new Item(new Item.Settings().food(ModFoodComponents.Lycoris)));
    public static final Item TREE_OF_HEAVEN = registerItems("tree_of_heaven", new Item(new Item.Settings().food(ModFoodComponents.Tree_of_Heaven)));
    public static final Item BUTTERCUP = registerItems("buttercup", new Item(new Item.Settings().food(ModFoodComponents.Buttercup)));
    public static final Item CUDWEED = registerItems("cudweed", new Item(new Item.Settings().food(ModFoodComponents.Cudweed)));
    public static final Item CHINESE_TOON_SPROUT = registerItems("chinese_toon_sprout", new Item(new Item.Settings().food(ModFoodComponents.Chinese_Toon_Sprout)));
    public static final Item COOKED_BRACKEN_FERN_SHOOT = registerItems("cooked_bracken_fern_shoot", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Bracken_Fern_Shoot)));
    public static final Item COOKED_REED_SHOOT = registerItems("cooked_reed_shoot", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Reed_Shoot)));
    public static final Item COOKED_PURSLANE = registerItems("cooked_purslane", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Purslane)));
    public static final Item COOKED_SHEPHERD_PURSE = registerItems("cooked_shepherd_purse", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Shepherd_Purse)));
    public static final Item COOKED_WATER_DROPWORT = registerItems("cooked_water_dropwort", new Item(new Item.Settings().food(ModFoodComponents.Cooked_Water_Dropwort)));

    // ═══════════ 🥘 锅料理 ═══════════
    public static final Item CHINESE_TOON_SCRAMBLED_EGGS = registerItems("chinese_toon_scrambled_eggs", new Item(new Item.Settings().food(ModFoodComponents.Chinese_Toon_Scrambled_Eggs)));
    public static final Item SHEPHERD_PURSE_DUMPLINGS = registerItems("shepherd_purse_dumplings", new Item(new Item.Settings().food(ModFoodComponents.Shepherd_Purse_Dumplings)));
    public static final Item HOUTTUYNIA_SALAD = registerItems("houttuynia_salad", new Item(new Item.Settings().food(ModFoodComponents.Houttuynia_Salad)));
    public static final Item PURSLANE_MOZZARELLA_SALAD = registerItems("purslane_mozzarella_salad", new Item(new Item.Settings().food(ModFoodComponents.Purslane_Mozzarella_Salad)));
    public static final Item BRACKEN_FERN_WITH_BACON = registerItems("bracken_fern_with_bacon", new Item(new Item.Settings().food(ModFoodComponents.Bracken_Fern_With_Bacon)));
    public static final Item MUGWORT_WITH_CORN = registerItems("mugwort_with_corn", new Item(new Item.Settings().food(ModFoodComponents.Mugwort_With_Corn)));
    public static final Item WATER_DROPWORT_ONION_SALAD = registerItems("water_dropwort_onion_salad", new Item(new Item.Settings().food(ModFoodComponents.Water_Dropwort_Onion_Salad)));
    public static final Item DANDELION_TOMATO_EGG_SOUP = registerItems("dandelion_tomato_egg_soup", new Item(new Item.Settings().food(ModFoodComponents.Dandelion_Tomato_Egg_Soup)));
    public static final Item REED_SHOOT_CHICKEN_LETTUCE = registerItems("reed_shoot_chicken_lettuce", new Item(new Item.Settings().food(ModFoodComponents.Reed_Shoot_Chicken_Lettuce)));
    public static final Item WILD_GARLIC_CORN_PANCAKE = registerItems("wild_garlic_corn_pancake", new Item(new Item.Settings().food(ModFoodComponents.Wild_Garlic_Corn_Pancake)));
    public static final Item HORSEWEED_MOZZARELLA_HONEY = registerItems("horseweed_mozzarella_honey", new Item(new Item.Settings().food(ModFoodComponents.Horseweed_Mozzarella_Honey)));
    public static final Item MIXED_WILD_STIR_FRY = registerItems("mixed_wild_stir_fry", new Item(new Item.Settings().food(ModFoodComponents.Mixed_Wild_Stir_Fry)));
    public static final Item DOUBLE_WILD_VEG_SALAD = registerItems("double_wild_veg_salad", new Item(new Item.Settings().food(ModFoodComponents.Double_Wild_Veg_Salad)));
    public static final Item WILD_VEG_PANCAKE = registerItems("wild_veg_pancake", new Item(new Item.Settings().food(ModFoodComponents.Wild_Veg_Pancake)));
    public static final Item THREE_FRESH_SALAD = registerItems("three_fresh_salad", new Item(new Item.Settings().food(ModFoodComponents.Three_Fresh_Salad)));
    public static final Item WILD_VEGETABLE_SOUP = registerItems("wild_vegetable_soup", new Item(new Item.Settings().food(ModFoodComponents.Wild_Vegetable_Soup)));
    // ═══════════ 🔥 烤炉料理 ═══════════//锅炉==烤炉
    public static final Item MINT_LAMB_HAM = registerItems("mint_lamb_ham", new Item(new Item.Settings().food(ModFoodComponents.Mint_Lamb_Ham)));
    // ═══════════ ⚒️ 合成台料理 ═══════════
    public static final Item ICE_FLOWER_FRUIT_SALAD = registerItems("ice_flower_fruit_salad", new Item(new Item.Settings().food(ModFoodComponents.Ice_Flower_Fruit_Salad)));
    // ═══════════ 🧃 饮品 ═══════════
    public static final Item MINT_TEA = registerItems("mint_tea", new Item(new Item.Settings().food(ModFoodComponents.Mint_Tea)));
    public static final Item DANDELION_ROOT_TEA = registerItems("dandelion_root_tea", new Item(new Item.Settings().food(ModFoodComponents.Dandelion_Root_Tea)));
    public static final Item ICE_FLOWER_MINT_SOUP = registerItems("ice_flower_mint_soup", new Item(new Item.Settings().food(ModFoodComponents.Ice_Flower_Mint_Soup)));
    // ═══════════ 🍡 甜点 ═══════════
    public static final Item CUDWEED_RICE_DUMPLING = registerItems("cudweed_rice_dumpling", new Item(new Item.Settings().food(ModFoodComponents.Cudweed_Rice_Dumpling)));

    public static Item registerItems(String id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, new Identifier(WildernesssDelight.MOD_ID, id), item);
    }

    public static void registerItems() {
    }
}