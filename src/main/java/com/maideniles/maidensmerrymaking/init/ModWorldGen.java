package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.world.feature.flower.ModFeatureGeneration;
import com.maideniles.maidensmerrymaking.world.gen.ModEntityGeneration;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID)
public class ModWorldGen {
    @SubscribeEvent
    public static void ModModWorldGen(final BiomeLoadingEvent event) {

        ModFeatureGeneration.generateFlowers(event);
        ModEntityGeneration.onEntitySpawn(event);
    }
}
