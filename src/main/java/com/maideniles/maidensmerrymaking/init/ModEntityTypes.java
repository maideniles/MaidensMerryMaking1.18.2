package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredBunnyEntity;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredChickenEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;




public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES,MaidensMerryMaking.MOD_ID);

    //BEGIN COLORED BUNNIES AND SIZES//
    //BEGIN PINK BUNNIES//
    public static final RegistryObject<EntityType<ColoredBunnyEntity>> PINK_BUNNY = ENTITY_TYPES.register("pink_bunny",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "pink_bunny").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> PINK_BUNNY_SMALL = ENTITY_TYPES.register("pink_bunny_small",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.4f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "pink_bunny_small").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> PINK_BUNNY_LARGE = ENTITY_TYPES.register("pink_bunny_large",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 0.8f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "pink_bunny_large").toString()));

    //BEGIN BLUE BUNNY//
    public static final RegistryObject<EntityType<ColoredBunnyEntity>> BLUE_BUNNY = ENTITY_TYPES.register("blue_bunny",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "blue_bunny").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> BLUE_BUNNY_SMALL = ENTITY_TYPES.register("blue_bunny_small",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.4f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "blue_bunny_small").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> BLUE_BUNNY_LARGE = ENTITY_TYPES.register("blue_bunny_large",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 0.8f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "blue_bunny_large").toString()));

    //BEGIN CYAN BUNNY//
    public static final RegistryObject<EntityType<ColoredBunnyEntity>> CYAN_BUNNY = ENTITY_TYPES.register("cyan_bunny",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "cyan_bunny").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> CYAN_BUNNY_SMALL = ENTITY_TYPES.register("cyan_bunny_small",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.4f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "cyan_bunny_small").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> CYAN_BUNNY_LARGE = ENTITY_TYPES.register("cyan_bunny_large",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 0.8f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "cyan_bunny_large").toString()));

    //BEGIN PURPLE BUNNY//
    public static final RegistryObject<EntityType<ColoredBunnyEntity>> PURPLE_BUNNY = ENTITY_TYPES.register("purple_bunny",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "purple_bunny").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> PURPLE_BUNNY_SMALL = ENTITY_TYPES.register("purple_bunny_small",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.4f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "purple_bunny_small").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> PURPLE_BUNNY_LARGE = ENTITY_TYPES.register("purple_bunny_large",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 0.8f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "purple_bunny_large").toString()));

    //BEGIN YELLOW BUNNY//
    public static final RegistryObject<EntityType<ColoredBunnyEntity>> YELLOW_BUNNY = ENTITY_TYPES.register("yellow_bunny",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.8f, 0.6f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "yellow_bunny").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> YELLOW_BUNNY_SMALL = ENTITY_TYPES.register("yellow_bunny_small",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(0.5f, 0.4f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "yellow_bunny_small").toString()));

    public static final RegistryObject<EntityType<ColoredBunnyEntity>> YELLOW_BUNNY_LARGE = ENTITY_TYPES.register("yellow_bunny_large",
            () -> EntityType.Builder.of(ColoredBunnyEntity::new, MobCategory.CREATURE)
                    .sized(1.0f, 0.8f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "yellow_bunny_large").toString()));
//END BUNNIES//

    //CHICKEN//
    public static final RegistryObject<EntityType<ColoredChickenEntity>> COLORED_CHICKEN = ENTITY_TYPES.register("colored_chicken",
            () -> EntityType.Builder.of(ColoredChickenEntity::new, MobCategory.CREATURE)
                    .sized(0.4f, 0.7f)
                    .build(new ResourceLocation(MaidensMerryMaking.MOD_ID, "colored_chicken").toString()));



    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}







