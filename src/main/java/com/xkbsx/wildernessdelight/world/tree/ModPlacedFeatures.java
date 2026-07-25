package com.xkbsx.wildernessdelight.world.tree;

import com.xkbsx.wildernessdelight.WildernesssDelight;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.Heightmap;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightmapPlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SurfaceWaterDepthFilterPlacementModifier;

public class ModPlacedFeatures {
    public static final RegistryKey<PlacedFeature> ICE_FLOWERS_COVERED_LAND = of("ice_flowers_covered_land");
    public static final RegistryKey<PlacedFeature> HORSEWEED_COVERED_LAND = of("horseweed_covered_land");
    public static final RegistryKey<PlacedFeature> SHEPHERD_PURSE_COVERED_LAND = of("shepherd_purse_covered_land");
    public static final RegistryKey<PlacedFeature> CROP_DANDELION_COVERED_LAND = of("crop_dandelion_covered_land");
    public static final RegistryKey<PlacedFeature> HOUTTUYNIA_COVERED_LAND = of("houttuynia_covered_land");
    public static final RegistryKey<PlacedFeature> BRACKEN_FERN_SHOOT_COVERED_LAND = of("bracken_fern_shoot_covered_land");
    public static final RegistryKey<PlacedFeature> WILD_GARLIC_COVERED_LAND = of("wild_garlic_covered_land");
    public static final RegistryKey<PlacedFeature> WATER_DROPWORT_COVERED_LAND = of("water_dropwort_covered_land");
    public static final RegistryKey<PlacedFeature> PURSLANE_COVERED_LAND = of("purslane_covered_land");
    public static final RegistryKey<PlacedFeature> MUGWORT_SPROUT_COVERED_LAND = of("mugwort_sprout_covered_land");
    public static final RegistryKey<PlacedFeature> REED_SHOOT_COVERED_LAND = of("reed_shoot_covered_land");
    public static final RegistryKey<PlacedFeature> POISON_HEMLOCK_COVERED_LAND = of("poison_hemlock_covered_land");
    public static final RegistryKey<PlacedFeature> MINT_COVERED_LAND = of("mint_covered_land");
    public static final RegistryKey<PlacedFeature> LYCORIS_COVERED_LAND = of("lycoris_covered_land");
    public static final RegistryKey<PlacedFeature> BUTTERCUP_COVERED_LAND = of("buttercup_covered_land");
    public static final RegistryKey<PlacedFeature> CUDWEED_COVERED_LAND = of("cudweed_covered_land");
    public static final RegistryKey<PlacedFeature> FOXTAIL_GRASS_COVERED_LAND = of("foxtail_grass_covered_land");
    public static final RegistryKey<PlacedFeature> GINSENG_COVERED_LAND = of("ginseng_covered_land");
    public static final RegistryKey<PlacedFeature> LINGZHI_COVERED_LAND = of("lingzhi_covered_land");
    public static final RegistryKey<PlacedFeature> HERICIUM_COVERED_LAND = of("hericium_covered_land");
    public static final RegistryKey<PlacedFeature> CHINESE_TOON_SMALL_TREE_LAND = of("chinese_toon_small_tree_land");
    public static final RegistryKey<PlacedFeature> CHINESE_TOON_NORMAL_TREE_LAND = of("chinese_toon_normal_tree_land");
    public static final RegistryKey<PlacedFeature> TREE_OF_HEAVEN_SMALL_TREE_LAND = of("tree_of_heaven_small_tree_land");
    public static final RegistryKey<PlacedFeature> TREE_OF_HEAVEN_NORMAL_TREE_LAND = of("tree_of_heaven_normal_tree_land");


    public static void bootstrap(Registerable<PlacedFeature> featureRegisterable) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> lookup = featureRegisterable.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);
        register(featureRegisterable, lookup, ICE_FLOWERS_COVERED_LAND, ModConfiguredFeatures.ICE_FLOWERS_COVERED, 6);
        register(featureRegisterable, lookup, HORSEWEED_COVERED_LAND, ModConfiguredFeatures.HORSEWEED_COVERED, 7);
        register(featureRegisterable, lookup, SHEPHERD_PURSE_COVERED_LAND, ModConfiguredFeatures.SHEPHERD_PURSE_COVERED, 7);
        register(featureRegisterable, lookup, CROP_DANDELION_COVERED_LAND, ModConfiguredFeatures.CROP_DANDELION_COVERED, 7);
        register(featureRegisterable, lookup, HOUTTUYNIA_COVERED_LAND, ModConfiguredFeatures.HOUTTUYNIA_COVERED, 7);
        register(featureRegisterable, lookup, BRACKEN_FERN_SHOOT_COVERED_LAND, ModConfiguredFeatures.BRACKEN_FERN_SHOOT_COVERED, 7);
        register(featureRegisterable, lookup, WILD_GARLIC_COVERED_LAND, ModConfiguredFeatures.WILD_GARLIC_COVERED, 7);
        register(featureRegisterable, lookup, WATER_DROPWORT_COVERED_LAND, ModConfiguredFeatures.WATER_DROPWORT_COVERED, 7);
        register(featureRegisterable, lookup, PURSLANE_COVERED_LAND, ModConfiguredFeatures.PURSLANE_COVERED, 7);
        register(featureRegisterable, lookup, MUGWORT_SPROUT_COVERED_LAND, ModConfiguredFeatures.MUGWORT_SPROUT_COVERED, 7);
        register(featureRegisterable, lookup, REED_SHOOT_COVERED_LAND, ModConfiguredFeatures.REED_SHOOT_COVERED, 7);
        register(featureRegisterable, lookup, POISON_HEMLOCK_COVERED_LAND, ModConfiguredFeatures.POISON_HEMLOCK_COVERED, 7);
        register(featureRegisterable, lookup, MINT_COVERED_LAND, ModConfiguredFeatures.MINT_COVERED, 7);
        register(featureRegisterable, lookup, LYCORIS_COVERED_LAND, ModConfiguredFeatures.LYCORIS_COVERED, 7);
        register(featureRegisterable, lookup, BUTTERCUP_COVERED_LAND, ModConfiguredFeatures.BUTTERCUP_COVERED, 7);
        register(featureRegisterable, lookup, CUDWEED_COVERED_LAND, ModConfiguredFeatures.CUDWEED_COVERED, 7);
        register(featureRegisterable, lookup, FOXTAIL_GRASS_COVERED_LAND, ModConfiguredFeatures.FOXTAIL_GRASS_COVERED, 7);
        register(featureRegisterable, lookup, GINSENG_COVERED_LAND, ModConfiguredFeatures.GINSENG_COVERED, 7);
        register(featureRegisterable, lookup, LINGZHI_COVERED_LAND, ModConfiguredFeatures.LINGZHI_COVERED, 7);
        register(featureRegisterable, lookup, HERICIUM_COVERED_LAND, ModConfiguredFeatures.HERICIUM_COVERED, 7);
        PlacedFeatures.register(featureRegisterable, CHINESE_TOON_SMALL_TREE_LAND,
                lookup.getOrThrow(ModConfiguredFeatures.CHINESE_TOON_SMALL_TREE),
                RarityFilterPlacementModifier.of(6),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                HeightmapPlacementModifier.of(Heightmap.Type.WORLD_SURFACE_WG),
                BiomePlacementModifier.of());
        PlacedFeatures.register(featureRegisterable, CHINESE_TOON_NORMAL_TREE_LAND,
                lookup.getOrThrow(ModConfiguredFeatures.CHINESE_TOON_NORMAL_TREE),
                RarityFilterPlacementModifier.of(8),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                HeightmapPlacementModifier.of(Heightmap.Type.WORLD_SURFACE_WG),
                BiomePlacementModifier.of());
        PlacedFeatures.register(featureRegisterable, TREE_OF_HEAVEN_SMALL_TREE_LAND,
                lookup.getOrThrow(ModConfiguredFeatures.TREE_OF_HEAVEN_SMALL_TREE),
                RarityFilterPlacementModifier.of(6),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                HeightmapPlacementModifier.of(Heightmap.Type.WORLD_SURFACE_WG),
                BiomePlacementModifier.of());
        PlacedFeatures.register(featureRegisterable, TREE_OF_HEAVEN_NORMAL_TREE_LAND,
                lookup.getOrThrow(ModConfiguredFeatures.TREE_OF_HEAVEN_NORMAL_TREE),
                RarityFilterPlacementModifier.of(8),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                HeightmapPlacementModifier.of(Heightmap.Type.WORLD_SURFACE_WG),
                BiomePlacementModifier.of());
    }

    private static void register(Registerable<PlacedFeature> featureRegisterable,
                                  RegistryEntryLookup<ConfiguredFeature<?, ?>> lookup,
                                  RegistryKey<PlacedFeature> key,
                                  RegistryKey<ConfiguredFeature<?, ?>> configuredFeature,
                                  int rarity) {
        PlacedFeatures.register(featureRegisterable, key,
                lookup.getOrThrow(configuredFeature),
                RarityFilterPlacementModifier.of(rarity),
                SquarePlacementModifier.of(),
                SurfaceWaterDepthFilterPlacementModifier.of(0),
                PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP,
                BiomePlacementModifier.of());
    }

    private static RegistryKey<PlacedFeature> of(String id) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(WildernesssDelight.MOD_ID, id));
    }
}
