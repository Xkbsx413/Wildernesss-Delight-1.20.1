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
        blockStateModelGenerator.registerTintableCross(ModBlock.CHINESE_TOON_SPROUT, BlockStateModelGenerator.TintType.NOT_TINTED);
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
        blockStateModelGenerator.registerTintableCross(ModBlock.TREE_OF_HEAVEN, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.BUTTERCUP, BlockStateModelGenerator.TintType.NOT_TINTED);
        blockStateModelGenerator.registerTintableCross(ModBlock.CUDWEED, BlockStateModelGenerator.TintType.NOT_TINTED);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.HORSEWEED, Models.GENERATED);
        itemModelGenerator.register(ModItems.SHEPHERD_PURSE, Models.GENERATED);
        itemModelGenerator.register(ModItems.CROP_DANDELION, Models.GENERATED);
        itemModelGenerator.register(ModItems.CHINESE_TOON_SPROUT, Models.GENERATED);
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
    }
}