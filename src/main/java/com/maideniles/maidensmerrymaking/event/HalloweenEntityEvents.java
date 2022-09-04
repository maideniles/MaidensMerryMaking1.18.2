package com.maideniles.maidensmerrymaking.event;


import com.google.common.collect.ImmutableList;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.init.ModEntityTypes;
import net.minecraft.data.worldgen.StructureFeatures;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.entity.monster.*;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.biome.MobSpawnSettings;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.feature.PillagerOutpostFeature;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.util.Lazy;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.event.world.StructureSpawnListGatherEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;

@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class HalloweenEntityEvents {

    @SubscribeEvent(priority =  EventPriority.HIGH)

    public static void addSpawn(BiomeLoadingEvent event) {
        Biome biome = ForgeRegistries.BIOMES.getValue(event.getName());
        if(biome != null) {
            MobSpawnSettings info = biome.getMobSettings();
            List<MobSpawnSettings.SpawnerData> spawns = event.getSpawns().getSpawner(MobCategory.MONSTER);
            for(MobSpawnSettings.SpawnerData entry : info.getMobs(MobCategory.MONSTER).unwrap()) {
            
                registerSpawn(spawns, entry, EntityType.ZOMBIE, ModEntityTypes.COSTUMED_ZOMBIE.get());
                registerSpawn(spawns, entry, EntityType.SKELETON, ModEntityTypes.COSTUMED_SKELETON.get());
                registerSpawn(spawns, entry, EntityType.WITHER_SKELETON, ModEntityTypes.COSTUMED_WITHER_SKELETON.get());
                registerSpawn(spawns, entry, EntityType.DROWNED, ModEntityTypes.COSTUMED_DROWNED.get());
                registerSpawn(spawns, entry, EntityType.DROWNED, ModEntityTypes.COSTUMED_DROWNED_MERMAID.get());
                registerSpawn(spawns, entry, EntityType.HUSK, ModEntityTypes.COSTUMED_HUSK.get());
                registerSpawn(spawns, entry, EntityType.ZOMBIE_VILLAGER, ModEntityTypes.COSTUMED_ZOMBIE_VILLAGER.get());
                registerSpawn(spawns, entry, EntityType.PILLAGER, ModEntityTypes.COSTUMED_PILLAGER.get());
                registerSpawn(spawns, entry, EntityType.VINDICATOR, ModEntityTypes.COSTUMED_VINDICATOR.get());
                registerSpawn(spawns, entry, EntityType.EVOKER, ModEntityTypes.COSTUMED_EVOKER.get());
                registerSpawn(spawns, entry, EntityType.WITCH, ModEntityTypes.COSTUMED_WITCH.get());
                registerSpawn(spawns, entry, EntityType.CREEPER, ModEntityTypes.COSTUMED_CREEPER.get());
                registerSpawn(spawns, entry, EntityType.SPIDER, ModEntityTypes.COSTUMED_SPIDER.get());

            }
        }
    }

    public static void initializeMobs() {
        SpawnPlacements.register(ModEntityTypes.COSTUMED_ZOMBIE.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_SKELETON.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_WITHER_SKELETON.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_HUSK.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_DROWNED.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_DROWNED_MERMAID.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);

        SpawnPlacements.register(ModEntityTypes.COSTUMED_ZOMBIE_VILLAGER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_PILLAGER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_VINDICATOR.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_EVOKER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_WITCH.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_CREEPER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);
        SpawnPlacements.register(ModEntityTypes.COSTUMED_SPIDER.get(), SpawnPlacements.Type.ON_GROUND, Heightmap.Types.MOTION_BLOCKING_NO_LEAVES, Monster::checkMonsterSpawnRules);


    }

    public static void registerEntityAttributes(EntityAttributeCreationEvent event) {

        event.put(ModEntityTypes.COSTUMED_ZOMBIE.get(), Zombie.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_SKELETON.get(), Skeleton.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_WITHER_SKELETON.get(), WitherSkeleton.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_HUSK.get(), Husk.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_ZOMBIE_VILLAGER.get(), ZombieVillager.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_PILLAGER.get(), Pillager.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_VINDICATOR.get(), Vindicator.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_EVOKER.get(), Evoker.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_WITCH.get(), Witch.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_DROWNED.get(), Drowned.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_DROWNED_MERMAID.get(), Drowned.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_CREEPER.get(), Creeper.createAttributes().build());
        event.put(ModEntityTypes.COSTUMED_SPIDER.get(), Spider.createAttributes().build());


    }

    public static void registerSpawn(List<MobSpawnSettings.SpawnerData> spawns, MobSpawnSettings.SpawnerData entry, EntityType<? extends LivingEntity> oldEntity, EntityType<? extends LivingEntity> newEntity) {
        if(entry.type == oldEntity) {
            spawns.add(new MobSpawnSettings.SpawnerData(newEntity, Math.min(25, entry.getWeight().asInt()), entry.minCount, entry.maxCount));
        }
    }

@SubscribeEvent
    public static void setupStructureSpawns(final StructureSpawnListGatherEvent event) {
        if (event.getStructure() == StructureFeatures.PILLAGER_OUTPOST ) {
            event.addEntitySpawns(MobCategory.MONSTER, OUTPOST_MONSTERS.get());
        }

        if (event.getStructure() == StructureFeatures.WOODLAND_MANSION ) {
            event.addEntitySpawns(MobCategory.MONSTER, MANSION_MONSTERS.get());
        }

        if (event.getStructure() == StructureFeatures.FORTRESS ) {
            event.addEntitySpawns(MobCategory.MONSTER, FORTRESS_MONSTERS.get());
        }
    }

//LIST MONSTERS FOR STRUCTURES//
    private static final Lazy<List<MobSpawnSettings.SpawnerData>> OUTPOST_MONSTERS = Lazy.of(() -> ImmutableList.of(
            new MobSpawnSettings.SpawnerData(ModEntityTypes.COSTUMED_PILLAGER.get(), 200, 4, 9)));

    private static final Lazy<List<MobSpawnSettings.SpawnerData>> MANSION_MONSTERS = Lazy.of(() -> ImmutableList.of(
            new MobSpawnSettings.SpawnerData(ModEntityTypes.COSTUMED_VINDICATOR.get(), 200, 4, 9),
            new MobSpawnSettings.SpawnerData(ModEntityTypes.COSTUMED_EVOKER.get(), 200, 4, 9),
            new MobSpawnSettings.SpawnerData(ModEntityTypes.COSTUMED_WITCH.get(), 200, 4, 9)));

    private static final Lazy<List<MobSpawnSettings.SpawnerData>> FORTRESS_MONSTERS = Lazy.of(() -> ImmutableList.of(
            new MobSpawnSettings.SpawnerData(ModEntityTypes.COSTUMED_WITHER_SKELETON.get(), 200, 4, 9)));

}
