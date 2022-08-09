package com.maideniles.maidensmerrymaking.event;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.init.ModEntityTypes;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.Monster;
import net.minecraft.world.entity.monster.Zombie;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID)
public class HalloweenEntityEvents {

    @SubscribeEvent(priority =  EventPriority.HIGH)
    public static void addSpawn(BiomeLoadingEvent event) {
        Biome biome = ForgeRegistries.BIOMES.getValue(event.getName());
        if(biome != null) {
            MobSpawnSettings info = biome.getMobSettings();
            List<MobSpawnSettings.SpawnerData> spawns = event.getSpawns().getSpawner(MobCategory.MONSTER);
            for(MobSpawnSettings.SpawnerData entry : info.getMobs(MobCategory.MONSTER).unwrap()) {
            
                registerSpawn(spawns, entry, EntityType.ZOMBIE, ModEntityTypes.COSTUMED_ZOMBIE.get());

            }
        }
    }

    public static void initializeMobs() {
        SpawnPlacements.register(ModEntityTypes.COSTUMED_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
     }

    public static void registerEntityAttributes(EntityAttributeCreationEvent event) {

        event.put(ModEntityTypes.COSTUMED_ZOMBIE.get(), Zombie.createAttributes().build());

    }

    public static void registerSpawn(List<MobSpawnSettings.SpawnerData> spawns, MobSpawnSettings.SpawnerData entry, EntityType<? extends LivingEntity> oldEntity, EntityType<? extends LivingEntity> newEntity) {
        if(entry.type == oldEntity) {
            spawns.add(new MobSpawnSettings.SpawnerData(newEntity, Math.min(1, entry.getWeight().asInt() / 5), entry.minCount, entry.maxCount));
        }
    }
}
