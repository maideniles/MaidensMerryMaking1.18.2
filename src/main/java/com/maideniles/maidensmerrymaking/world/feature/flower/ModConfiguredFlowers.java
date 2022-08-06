package com.maideniles.maidensmerrymaking.world.feature.flower;

import com.maideniles.maidensmerrymaking.init.ModBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.FeatureUtils;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.util.InclusiveRange;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.RandomPatchConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.SimpleBlockConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.DualNoiseProvider;
import net.minecraft.world.level.levelgen.feature.stateproviders.NoiseProvider;
import net.minecraft.world.level.levelgen.placement.BlockPredicateFilter;
import net.minecraft.world.level.levelgen.placement.InSquarePlacement;
import net.minecraft.world.level.levelgen.synth.NormalNoise;

import java.util.List;

public class ModConfiguredFlowers {



    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> CLOVER_CONFIG = FeatureUtils.register("clover_config",
            Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.CLOVER.get()))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> EASTER_LILY_CONFIG = FeatureUtils.register("easter_lily_config",
            Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.EASTER_LILY_BLOCK.get()))));

    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HYDRANGEA_CONFIG = FeatureUtils.register("hdrangea_config",
            Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HYDRANGEA_BLOCK.get()))));
    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> HYACINTH_CONFIG = FeatureUtils.register("hyacinth_config",
            Feature.RANDOM_PATCH, FeatureUtils.simplePatchConfiguration(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(BlockStateProvider.simple(ModBlocks.HYACINTH_BLOCK.get()))));



    public static final Holder<ConfiguredFeature<RandomPatchConfiguration, ?>> EASTER_EGG_GEN_CONFIG = FeatureUtils.register("egg_gen_config",
            Feature.FLOWER, new RandomPatchConfiguration(1, 0, 0, PlacementUtils.onlyWhenEmpty(Feature.SIMPLE_BLOCK,
                    new SimpleBlockConfiguration(new DualNoiseProvider(new InclusiveRange<Integer>(1, 3),
                            new NormalNoise.NoiseParameters(-10, 1.0D), 1.0F, 2345L,
                            new NormalNoise.NoiseParameters(-3, 1.0D), 1.0F,
                            List.of(
                                    ModBlocks.BLUE_MULTI_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.BLUE_PURPLE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.BLUE_PURPLE_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.BLUE_PURPLE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.BLUE_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.BLUE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_BLUE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_BLUE_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_BLUE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_MULTI_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_MONOCHROME_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_PURPLE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_PURPLE_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_PURPLE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.CYAN_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_BLUE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_BLUE_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_BLUE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_CYAN_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_CYAN_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_CYAN_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_MONOCHROME_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_MULTI_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_PURPLE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_PURPLE_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_PURPLE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PINK_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PURPLE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PURPLE_PINK_FLOWER_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.PURPLE_STRIPES_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.RAINBOW_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.RAINBOW_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.RAINBOW_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_BLUE_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_BLUE_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_BLUE_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_MONOCHROME_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_PINK_FADE_DOTS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_PINK_FADE_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_PINK_FADE_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_WHITE_FLOWERS_EASTER_EGG_GEN_BLOCK.get().defaultBlockState(),
                                    ModBlocks.YELLOW_ZIGZAG_EASTER_EGG_GEN_BLOCK.get().defaultBlockState()))))));

}