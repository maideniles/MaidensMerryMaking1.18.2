package com.maideniles.maidensmerrymaking.init;


import com.maideniles.maidensmerrymaking.world.feature.flower.ModConfiguredFlowers;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.TreeFeatures;
import net.minecraft.data.worldgen.features.VegetationFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.data.worldgen.placement.VegetationPlacements;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.blockpredicates.BlockPredicate;
import net.minecraft.world.level.levelgen.placement.*;


import static net.minecraft.data.worldgen.placement.TreePlacements.SNOW_TREE_FILTER_DECORATOR;

public class ModPlacements {


    public static final Holder<PlacedFeature> TINY_SPRUCE_PLACEMENT = PlacementUtils.register("tiny_spruce_placement", ModFeatures.TINY_SPRUCE_CONFIG,
            RarityFilter.onAverageOnceEvery(26), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HOLLY_CHECKED = PlacementUtils.register("holly_checked", ModFeatures.HOLLY_TREE, PlacementUtils.filteredByBlockSurvival(Blocks.SPRUCE_SAPLING));

    public static final Holder<PlacedFeature> HOLLY_ON_SNOW = PlacementUtils.register("holly_on_snow", ModFeatures.HOLLY_TREE, SNOW_TREE_FILTER_DECORATOR);

    public static final Holder<PlacedFeature> EASTER_EGG_GEN_PLACEMENT = PlacementUtils.register("easter_egg_sparse", ModConfiguredFlowers.EASTER_EGG_GEN_CONFIG, RarityFilter.onAverageOnceEvery(48), InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> CLOVER_PLACEMENT = PlacementUtils.register("clover_placement", ModConfiguredFlowers.CLOVER_CONFIG, InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> EASTER_LILY_PLACEMENT = PlacementUtils.register("easter_lily_placement", ModConfiguredFlowers.EASTER_LILY_CONFIG, InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HYDRANGEA_PLACEMENT = PlacementUtils.register("hydrangea_placement", ModConfiguredFlowers.HYDRANGEA_CONFIG, InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> HYACINTH_PLACEMENT = PlacementUtils.register("hyacinth_placement", ModConfiguredFlowers.HYACINTH_CONFIG, InSquarePlacement.spread(), PlacementUtils.HEIGHTMAP, BiomeFilter.biome());

    public static final Holder<PlacedFeature> GRAVESTONE_PLACEMENT = PlacementUtils.register("gravestone_placement", ModConfiguredFlowers.GRAVESTONE_CONFIG, PlacementUtils.countExtra(0, 0.01F, 1), InSquarePlacement.spread(),VegetationPlacements.TREE_THRESHOLD, PlacementUtils.HEIGHTMAP_OCEAN_FLOOR, BlockPredicateFilter.forPredicate(BlockPredicate.wouldSurvive(Blocks.OAK_SAPLING.defaultBlockState(), BlockPos.ZERO)), BiomeFilter.biome());



}

