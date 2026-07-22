package com.xkbsx.wildernessdelight.world.flowers;

import com.xkbsx.wildernessdelight.world.tree.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModFlowersGenerator {
    public static void registerFlowers() {
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.SNOWY_PLAINS, BiomeKeys.ICE_SPIKES, BiomeKeys.SNOWY_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.ICE_FLOWERS_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.SAVANNA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.HORSEWEED_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.FLOWER_FOREST, BiomeKeys.CHERRY_GROVE, BiomeKeys.MEADOW),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.SHEPHERD_PURSE_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.GROVE, BiomeKeys.FOREST, BiomeKeys.WINDSWEPT_HILLS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CROP_DANDELION_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.SWAMP, BiomeKeys.JUNGLE, BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.HOUTTUYNIA_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.TAIGA, BiomeKeys.OLD_GROWTH_PINE_TAIGA, BiomeKeys.OLD_GROWTH_BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BRACKEN_FERN_SHOOT_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.DARK_FOREST, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA, BiomeKeys.BIRCH_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WILD_GARLIC_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.MANGROVE_SWAMP, BiomeKeys.TAIGA, BiomeKeys.OLD_GROWTH_SPRUCE_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.WATER_DROPWORT_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.SAVANNA, BiomeKeys.WOODED_BADLANDS, BiomeKeys.SUNFLOWER_PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PURSLANE_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.SAVANNA_PLATEAU, BiomeKeys.WINDSWEPT_SAVANNA, BiomeKeys.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MUGWORT_SPROUT_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.MANGROVE_SWAMP, BiomeKeys.JUNGLE, BiomeKeys.LUSH_CAVES),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.REED_SHOOT_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.LUSH_CAVES, BiomeKeys.SWAMP, BiomeKeys.GROVE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.POISON_HEMLOCK_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.OLD_GROWTH_BIRCH_FOREST, BiomeKeys.SPARSE_JUNGLE, BiomeKeys.WINDSWEPT_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.MINT_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.WINDSWEPT_FOREST, BiomeKeys.OLD_GROWTH_PINE_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.LYCORIS_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.SNOWY_SLOPES, BiomeKeys.CHERRY_GROVE, BiomeKeys.FLOWER_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BUTTERCUP_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.WOODED_BADLANDS, BiomeKeys.MEADOW, BiomeKeys.SNOWY_TAIGA),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CUDWEED_COVERED_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.JUNGLE, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CHINESE_TOON_SMALL_TREE_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.FLOWER_FOREST, BiomeKeys.WINDSWEPT_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.CHINESE_TOON_NORMAL_TREE_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.JUNGLE, BiomeKeys.BAMBOO_JUNGLE, BiomeKeys.SPARSE_JUNGLE),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TREE_OF_HEAVEN_SMALL_TREE_LAND);
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(
                BiomeKeys.FLOWER_FOREST, BiomeKeys.WINDSWEPT_FOREST),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.TREE_OF_HEAVEN_NORMAL_TREE_LAND);
    }
}
