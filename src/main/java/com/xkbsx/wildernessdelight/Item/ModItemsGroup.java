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
                entries.add(ModBlock.TREE_OF_HEAVEN_LEAVES_ITEM);
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
                entries.add(ModBlock.BUTTERCUP_ITEM);
                entries.add(ModBlock.CUDWEED_ITEM);
                entries.add(ModBlock.GINSENG_ITEM);
                entries.add(ModBlock.LINGZHI_ITEM);
                entries.add(ModBlock.HERICIUM_ITEM);
                entries.add(ModBlock.CHINESE_TOON_SAPLING_ITEM);
                entries.add(ModBlock.TREE_OF_HEAVEN_SAPLING_ITEM);
                entries.add(ModItems.ICE_FLOWERS);
                entries.add(ModItems.HORSEWEED);
                entries.add(ModItems.SHEPHERD_PURSE);
                entries.add(ModItems.CROP_DANDELION);
                entries.add(ModItems.DANDELION_CLOCK);
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
                entries.add(ModItems.FOXTAIL_GRASS);
                entries.add(ModItems.GINSENG);
                entries.add(ModItems.LINGZHI);
                entries.add(ModItems.HERICIUM);
                entries.add(ModItems.CHINESE_TOON_SPROUT);
                entries.add(ModItems.COOKED_BRACKEN_FERN_SHOOT);
                entries.add(ModItems.COOKED_REED_SHOOT);
                entries.add(ModItems.COOKED_PURSLANE);
                entries.add(ModItems.COOKED_SHEPHERD_PURSE);
                entries.add(ModItems.COOKED_WATER_DROPWORT);

                // ═══════════ 🥘 锅料理 ═══════════
                entries.add(ModItems.CHINESE_TOON_SCRAMBLED_EGGS);
                entries.add(ModItems.SHEPHERD_PURSE_DUMPLINGS);
                entries.add(ModItems.HOUTTUYNIA_SALAD);
                entries.add(ModItems.PURSLANE_MOZZARELLA_SALAD);
                entries.add(ModItems.BRACKEN_FERN_WITH_BACON);
                entries.add(ModItems.MUGWORT_WITH_CORN);
                entries.add(ModItems.WATER_DROPWORT_ONION_SALAD);
                entries.add(ModItems.DANDELION_TOMATO_EGG_SOUP);
                entries.add(ModItems.REED_SHOOT_CHICKEN_LETTUCE);
                entries.add(ModItems.WILD_GARLIC_CORN_PANCAKE);
                entries.add(ModItems.HORSEWEED_MOZZARELLA_HONEY);
                entries.add(ModItems.MIXED_WILD_STIR_FRY);
                entries.add(ModItems.DOUBLE_WILD_VEG_SALAD);
                entries.add(ModItems.WILD_VEG_PANCAKE);
                entries.add(ModItems.THREE_FRESH_SALAD);
                entries.add(ModItems.WILD_VEGETABLE_SOUP);
                // ═══════════ 🔥 烤炉料理 ═══════════
                entries.add(ModItems.MINT_LAMB_HAM);
                // ═══════════ ⚒️ 合成台料理 ═══════════
                entries.add(ModItems.ICE_FLOWER_FRUIT_SALAD);
                // ═══════════ 🧃 饮品 ═══════════
                entries.add(ModItems.MINT_TEA);
                entries.add(ModItems.DANDELION_ROOT_TEA);
                entries.add(ModItems.ICE_FLOWER_MINT_SOUP);
                // ═══════════ 🌿 新食材 ═══════════
                entries.add(ModItems.GINSENG_SOUP);
                entries.add(ModItems.HERICIUM_COOKIE);
                entries.add(ModItems.LINGZHI_CHICKEN_SOUP);
                entries.add(ModItems.HUNDRED_HERBS_DELICACY);
                // ═══════════ 🍡 甜点 ═══════════
                entries.add(ModItems.CUDWEED_RICE_DUMPLING);
                // ═══════════ 🚩 旗帜 ═══════════
                entries.add(ModBlock.WILDERNESS_BANNER_ITEM);
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