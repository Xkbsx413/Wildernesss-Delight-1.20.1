package com.xkbsx.wildernessdelight.world.biome;

import com.mojang.datafixers.util.Pair;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class ModOverWorldRegion extends Region {
    public ModOverWorldRegion(Identifier name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }

    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, modifiedVanillaOverworldBuilder ->
                modifiedVanillaOverworldBuilder.replaceBiome(BiomeKeys.PLAINS, Modbiomes.FIREFLY_MEADOW));

        // 繁茂草甸与原版草甸共存：只接管原版草甸噪声域的「负怪异性（weirdness）」半边，
        // 正半边仍保留原版草甸，两者按噪声交错出现。
        this.addBiome(mapper, MultiNoiseUtil.createNoiseHypercube(
                MultiNoiseUtil.ParameterRange.of(-0.45F, 0.2F),    // temperature（原版草甸所在 -0.45~0.2）
                MultiNoiseUtil.ParameterRange.of(-1.0F, 0.3F),     // humidity（草甸行：-1~0.3）
                MultiNoiseUtil.ParameterRange.of(0.03F, 1.0F),     // continentalness（内陆至深远内陆）
                MultiNoiseUtil.ParameterRange.of(-0.375F, -0.2225F), // erosion（草甸山坡侵蚀带）
                MultiNoiseUtil.ParameterRange.of(0.0F),            // depth（地表）
                MultiNoiseUtil.ParameterRange.of(-0.9333F, -0.4F), // weirdness：只取负高异形带
                0.0F                                               // offset
        ), Modbiomes.LUSH_MEADOW);
    }
}
