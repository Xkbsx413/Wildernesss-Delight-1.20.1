package com.xkbsx.wildernessdelight.datagen;

import com.xkbsx.wildernessdelight.WildernesssDelight;
import com.xkbsx.wildernessdelight.item.ModItems;
import com.xkbsx.wildernessdelight.block.HorseweedCropBlock;
import com.xkbsx.wildernessdelight.block.ModBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.minecraft.util.Identifier;

public class Model extends FabricModelProvider {
    public Model(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.blockStateCollector
                .accept(VariantsBlockStateSupplier.create(ModBlock.HORSEWEEDBLOCK)
                                .coordinate(BlockStateVariantMap.create(HorseweedCropBlock.AGE)
                                                .register(stage -> {
                                                    int textureStage = stage % 5;
                                                    Identifier textureId = new Identifier(WildernesssDelight.MOD_ID, "block/horseweedblock_stage" + textureStage);
                                                    return BlockStateVariant.create()
                                                                    .put(VariantSettings.MODEL, blockStateModelGenerator.createSubModel(ModBlock.HORSEWEEDBLOCK, "_stage" + stage,
                                                                             Models.CROSS, (id) -> TextureMap.cross(textureId)));
                                                })
                                )
                );

        blockStateModelGenerator.registerFlowerPotPlant(ModBlock.ICE_FLOWERS,ModBlock.POTTED_ICE_FLOWERS,BlockStateModelGenerator.TintType.NOT_TINTED);
        //blockStateModelGenerator.registerTintableCross(ModBlock.HORSEWEEDBLOCK,BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.SHEPHERD_PURSE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.CROP_DANDELION, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.HOUTTUYNIA, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.BRACKEN_FERN_SHOOT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.WILD_GARLIC, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.WATER_DROPWORT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.PURSLANE, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.MUGWORT_SPROUT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.REED_SHOOT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.MINT, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.POISON_HEMLOCK, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.LYCORIS, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.BUTTERCUP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.CUDWEED, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlock.CHINESE_TOON_LEAVES);
        blockStateModelGenerator.registerTintableCross(ModBlock.CHINESE_TOON_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlock.TREE_OF_HEAVEN_LEAVES);
        blockStateModelGenerator.registerTintableCross(ModBlock.TREE_OF_HEAVEN_SAPLING, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.HORSEWEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHEPHERD_PURSE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CROP_DANDELION, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOUTTUYNIA, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRACKEN_FERN_SHOOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.WILD_GARLIC, Models.GENERATED);
        itemModelGenerator.register(ModItems.WATER_DROPWORT, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURSLANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUGWORT_SPROUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.REED_SHOOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.MINT, Models.GENERATED);
        itemModelGenerator.register(ModItems.POISON_HEMLOCK, Models.GENERATED);
        itemModelGenerator.register(ModItems.LYCORIS, Models.GENERATED);
        itemModelGenerator.register(ModItems.TREE_OF_HEAVEN, Models.GENERATED);
        itemModelGenerator.register(ModItems.BUTTERCUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.CUDWEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHINESE_TOON_SPROUT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_BRACKEN_FERN_SHOOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_REED_SHOOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_PURSLANE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_SHEPHERD_PURSE, Models.GENERATED);
        itemModelGenerator.register(ModItems.COOKED_WATER_DROPWORT, Models.GENERATED);

        // ═══════════ 🥘 锅料理 ═══════════
        itemModelGenerator.register(ModItems.CHINESE_TOON_SCRAMBLED_EGGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHEPHERD_PURSE_DUMPLINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.HOUTTUYNIA_SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.PURSLANE_MOZZARELLA_SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.BRACKEN_FERN_WITH_BACON, Models.GENERATED);
        itemModelGenerator.register(ModItems.MUGWORT_WITH_CORN, Models.GENERATED);
        itemModelGenerator.register(ModItems.WATER_DROPWORT_ONION_SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.DANDELION_TOMATO_EGG_SOUP, Models.GENERATED);
        itemModelGenerator.register(ModItems.REED_SHOOT_CHICKEN_LETTUCE, Models.GENERATED);
        itemModelGenerator.register(ModItems.WILD_GARLIC_CORN_PANCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.HORSEWEED_MOZZARELLA_HONEY, Models.GENERATED);
        itemModelGenerator.register(ModItems.MIXED_WILD_STIR_FRY, Models.GENERATED);
        itemModelGenerator.register(ModItems.DOUBLE_WILD_VEG_SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.WILD_VEG_PANCAKE, Models.GENERATED);
        itemModelGenerator.register(ModItems.THREE_FRESH_SALAD, Models.GENERATED);
        itemModelGenerator.register(ModItems.WILD_VEGETABLE_SOUP, Models.GENERATED);
        // ═══════════ 🔥 烤炉料理 ═══════════
        itemModelGenerator.register(ModItems.MINT_LAMB_HAM, Models.GENERATED);
        // ═══════════ ⚒️ 合成台料理 ═══════════
        itemModelGenerator.register(ModItems.ICE_FLOWER_FRUIT_SALAD, Models.GENERATED);
        // ═══════════ 🧃 饮品 ═══════════
        itemModelGenerator.register(ModItems.MINT_TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.DANDELION_ROOT_TEA, Models.GENERATED);
        itemModelGenerator.register(ModItems.ICE_FLOWER_MINT_SOUP, Models.GENERATED);
        // ═══════════ 🍡 甜点 ═══════════
        itemModelGenerator.register(ModItems.CUDWEED_RICE_DUMPLING, Models.GENERATED);
    }
}