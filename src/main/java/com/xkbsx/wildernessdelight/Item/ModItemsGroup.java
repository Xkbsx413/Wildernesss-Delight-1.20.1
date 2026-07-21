package com.xkbsx.wildernessdelight.item;

import com.xkbsx.wildernessdelight.WildernesssDelight;
import com.xkbsx.wildernessdelight.block.ModBlock;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroup {
    public static final ItemGroup Wilderness_Delight = FabricItemGroup.builder()
            .displayName(Text.translatable("itemGroup.wilderness-delight.wilderness-delight"))
            .icon(() -> new ItemStack(ModItems.ICE_FLOWERS))
            .entries((displayContext, entries) -> {
                entries.add(ModBlock.CHINESE_TOON_LEAVES_ITEM);
                entries.add(ModBlock.SHEPHERD_PURSE_ITEM);
                entries.add(ModBlock.CROP_DANDELION_ITEM);
                entries.add(ModBlock.HOUTTUYNIA_ITEM);
                entries.add(ModBlock.BRACKEN_FERN_SHOOT_ITEM);
                entries.add(ModBlock.WILD_GARLIC_ITEM);
                entries.add(ModBlock.WATER_DROPWORT_ITEM);
                entries.add(ModBlock.PURSLANE_ITEM);
                entries.add(ModBlock.MUGWORT_SPROUT_ITEM);
                entries.add(ModBlock.REED_SHOOT_ITEM);
                entries.add(ModBlock.MINT_ITEM);
                entries.add(ModBlock.POISON_HEMLOCK_ITEM);
                entries.add(ModBlock.LYCORIS_ITEM);
                entries.add(ModBlock.TREE_OF_HEAVEN_ITEM);
                entries.add(ModBlock.BUTTERCUP_ITEM);
                entries.add(ModBlock.CUDWEED_ITEM);
                entries.add(ModBlock.CHINESE_TOON_SAPLING_ITEM);
                entries.add(ModItems.ICE_FLOWERS);
                entries.add(ModItems.HORSEWEED);
                entries.add(ModItems.SHEPHERD_PURSE);
                entries.add(ModItems.CROP_DANDELION);
                entries.add(ModItems.HOUTTUYNIA);
                entries.add(ModItems.BRACKEN_FERN_SHOOT);
                entries.add(ModItems.WILD_GARLIC);
                entries.add(ModItems.WATER_DROPWORT);
                entries.add(ModItems.PURSLANE);
                entries.add(ModItems.MUGWORT_SPROUT);
                entries.add(ModItems.REED_SHOOT);
                entries.add(ModItems.MINT);
                entries.add(ModItems.POISON_HEMLOCK);
                entries.add(ModItems.LYCORIS);
                entries.add(ModItems.TREE_OF_HEAVEN);
                entries.add(ModItems.BUTTERCUP);
                entries.add(ModItems.CUDWEED);
                entries.add(ModItems.CHINESE_TOON_SPROUT);
            })
            .build();

    public static void RegisterGroups() {
        Registry.register(
                Registries.ITEM_GROUP,
                new Identifier(WildernesssDelight.MOD_ID, "wilderness_delight"),
                Wilderness_Delight
        );
    }
}