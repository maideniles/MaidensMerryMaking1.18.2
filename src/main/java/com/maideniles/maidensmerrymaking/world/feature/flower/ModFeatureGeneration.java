package com.maideniles.maidensmerrymaking.world.feature.flower;

import com.maideniles.maidensmerrymaking.init.ModPlacements;
import com.maideniles.maidensmerrymaking.util.MerryMakingConfig;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.event.world.BiomeLoadingEvent;

import java.util.Set;

public class ModFeatureGeneration {


    public static void generateFlowers(final BiomeLoadingEvent event) {
        ResourceKey<Biome> key = ResourceKey.create(Registry.BIOME_REGISTRY, event.getName());
        Set<BiomeDictionary.Type> types = BiomeDictionary.getTypes(key);




        //EASTER LILY IN JUNGLE AND SAVANNAH//
        if (event.getCategory() == Biome.BiomeCategory.JUNGLE || event.getCategory() == Biome.BiomeCategory.SAVANNA) {

            if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) {
                event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.EASTER_LILY_PLACEMENT);
            }
        }

        //CLOVER IN PLAINS//
        if (event.getCategory() == Biome.BiomeCategory.PLAINS) {
            if (MerryMakingConfig.ST_PATRICKS_DAY_ENABLED.get() == Boolean.TRUE) {
                event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.CLOVER_PLACEMENT);
                event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.GRAVESTONE_PLACEMENT);

            }

        }
//HYDRANGEA IN HILLS/FOREST//
        if (event.getCategory() == Biome.BiomeCategory.FOREST || event.getCategory() == Biome.BiomeCategory.MOUNTAIN
                || event.getCategory() == Biome.BiomeCategory.EXTREME_HILLS) {
            if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) {
                event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.HYDRANGEA_PLACEMENT);
            }

        }

//HYACINTH IN PLAINS,PLATEAU,RIVER//
        if (event.getCategory() == Biome.BiomeCategory.PLAINS || event.getCategory() == Biome.BiomeCategory.SWAMP
                || event.getCategory() == Biome.BiomeCategory.RIVER) {
            if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) {
                event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.HYACINTH_PLACEMENT);
            }

        }


//HIDE EASTER EGGS IN ALL BIOME CATEGORIES//
        if (event.getCategory() == Biome.BiomeCategory.MESA || event.getCategory() == Biome.BiomeCategory.FOREST || event.getCategory() == Biome.BiomeCategory.PLAINS
                || event.getCategory() == Biome.BiomeCategory.MOUNTAIN || event.getCategory() == Biome.BiomeCategory.EXTREME_HILLS || event.getCategory() == Biome.BiomeCategory.SWAMP
                || event.getCategory() == Biome.BiomeCategory.DESERT || event.getCategory() == Biome.BiomeCategory.ICY || event.getCategory() == Biome.BiomeCategory.TAIGA
                || event.getCategory() == Biome.BiomeCategory.BEACH || event.getCategory() == Biome.BiomeCategory.JUNGLE || event.getCategory() == Biome.BiomeCategory.MUSHROOM
                || event.getCategory() == Biome.BiomeCategory.SAVANNA || event.getCategory() == Biome.BiomeCategory.RIVER) {

            if (MerryMakingConfig.EASTER_ENABLED.get() == Boolean.TRUE) {
                event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.EASTER_EGG_GEN_PLACEMENT);

            }
        }


        if (event.getCategory() == Biome.BiomeCategory.ICY || event.getCategory() == Biome.BiomeCategory.TAIGA) {


            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.TINY_SPRUCE_PLACEMENT);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION, ModPlacements.HOLLY_CHECKED);
            event.getGeneration().addFeature(GenerationStep.Decoration.VEGETAL_DECORATION,ModPlacements.HOLLY_ON_SNOW);
        }



    }

    }



