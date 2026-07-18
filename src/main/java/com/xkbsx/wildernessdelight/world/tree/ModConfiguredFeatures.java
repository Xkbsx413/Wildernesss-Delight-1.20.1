package com.xkbsx.wildernessdelight.world.tree;

import com.xkbsx.wildernessdelight.WildernesssDelight;
import com.xkbsx.wildernessdelight.block.ModBlock;
import net.minecraft.block.Block;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> ICE_FLOWERS_COVERED = of("ice_flowers_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HORSEWEED_COVERED = of("horseweed_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> SHEPHERD_PURSE_COVERED = of("shepherd_purse_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CROP_DANDELION_COVERED = of("crop_dandelion_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CHINESE_TOON_SPROUT_COVERED = of("chinese_toon_sprout_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> HOUTTUYNIA_COVERED = of("houttuynia_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BRACKEN_FERN_SHOOT_COVERED = of("bracken_fern_shoot_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WILD_GARLIC_COVERED = of("wild_garlic_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> WATER_DROPWORT_COVERED = of("water_dropwort_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> PURSLANE_COVERED = of("purslane_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MUGWORT_SPROUT_COVERED = of("mugwort_sprout_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> REED_SHOOT_COVERED = of("reed_shoot_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> POISON_HEMLOCK_COVERED = of("poison_hemlock_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> MINT_COVERED = of("mint_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> LYCORIS_COVERED = of("lycoris_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> TREE_OF_HEAVEN_COVERED = of("tree_of_heaven_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> BUTTERCUP_COVERED = of("buttercup_covered");
    public static final RegistryKey<ConfiguredFeature<?, ?>> CUDWEED_COVERED = of("cudweed_covered");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> featureRegisterable) {
        register(featureRegisterable, ICE_FLOWERS_COVERED, ModBlock.ICE_FLOWERS, 7);
        register(featureRegisterable, HORSEWEED_COVERED, ModBlock.HORSEWEEDBLOCK, 5);
        register(featureRegisterable, SHEPHERD_PURSE_COVERED, ModBlock.SHEPHERD_PURSE, 7);
        register(featureRegisterable, CROP_DANDELION_COVERED, ModBlock.CROP_DANDELION, 9);
        register(featureRegisterable, CHINESE_TOON_SPROUT_COVERED, ModBlock.CHINESE_TOON_SPROUT, 6);
        register(featureRegisterable, HOUTTUYNIA_COVERED, ModBlock.HOUTTUYNIA, 8);
        register(featureRegisterable, BRACKEN_FERN_SHOOT_COVERED, ModBlock.BRACKEN_FERN_SHOOT, 7);
        register(featureRegisterable, WILD_GARLIC_COVERED, ModBlock.WILD_GARLIC, 8);
        register(featureRegisterable, WATER_DROPWORT_COVERED, ModBlock.WATER_DROPWORT, 7);
        register(featureRegisterable, PURSLANE_COVERED, ModBlock.PURSLANE, 5);
        register(featureRegisterable, MUGWORT_SPROUT_COVERED, ModBlock.MUGWORT_SPROUT, 7);
        register(featureRegisterable, REED_SHOOT_COVERED, ModBlock.REED_SHOOT, 8);
        register(featureRegisterable, POISON_HEMLOCK_COVERED, ModBlock.POISON_HEMLOCK, 5);
        register(featureRegisterable, MINT_COVERED, ModBlock.MINT, 7);
        register(featureRegisterable, LYCORIS_COVERED, ModBlock.LYCORIS, 5);
        register(featureRegisterable, TREE_OF_HEAVEN_COVERED, ModBlock.TREE_OF_HEAVEN, 6);
        register(featureRegisterable, BUTTERCUP_COVERED, ModBlock.BUTTERCUP, 9);
        register(featureRegisterable, CUDWEED_COVERED, ModBlock.CUDWEED, 7);
    }

    private static void register(Registerable<ConfiguredFeature<?, ?>> featureRegisterable,
                                  RegistryKey<ConfiguredFeature<?, ?>> key, Block block, int tries) {
        ConfiguredFeatures.register(featureRegisterable, key, Feature.FLOWER,
                new RandomPatchFeatureConfig(tries, 4, 3,
                        PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                                new SimpleBlockFeatureConfig(BlockStateProvider.of(block)))));
    }

    private static RegistryKey<ConfiguredFeature<?, ?>> of(String id) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(WildernesssDelight.MOD_ID, id));
    }
}
