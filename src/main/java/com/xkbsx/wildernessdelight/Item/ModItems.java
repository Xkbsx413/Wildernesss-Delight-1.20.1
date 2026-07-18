package com.xkbsx.wildernessdelight.item;

import com.xkbsx.wildernessdelight.WildernesssDelight;
import com.xkbsx.wildernessdelight.block.ModBlock;
import com.xkbsx.wildernessdelight.item.ModFoodComponents;
import net.minecraft.item.AliasedBlockItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item ICE_FLOWERS = registerItems("ice_flowers", new BlockItem(ModBlock.ICE_FLOWERS, new Item.Settings()));
    public static final Item POTTED_ICE_FLOWERS = registerItems("potted_ice_flowers", new BlockItem(ModBlock.POTTED_ICE_FLOWERS, new Item.Settings()));
    public static final Item HORSEWEED = registerItems("horseweed", new AliasedBlockItem(ModBlock.HORSEWEEDBLOCK, new Item.Settings().food(ModFoodComponents.Horseweed)));
    public static final Item SHEPHERD_PURSE = registerItems("shepherd_purse", new Item(new Item.Settings().food(ModFoodComponents.Shepherd_purse)));
    public static final Item CROP_DANDELION = registerItems("crop_dandelion", new Item(new Item.Settings().food(ModFoodComponents.Crop_Dandelion)));
    public static final Item CHINESE_TOON_SPROUT = registerItems("chinese_toon_sprout", new Item(new Item.Settings().food(ModFoodComponents.Chinese_Toon_Sprout)));
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

    public static Item registerItems(String id, Item item) {
        if (item instanceof BlockItem) {
            ((BlockItem)item).appendBlocks(Item.BLOCK_ITEMS, item);
        }
        return Registry.register(Registries.ITEM, new Identifier(WildernesssDelight.MOD_ID, id), item);
    }

    public static void registerItems() {
    }
}