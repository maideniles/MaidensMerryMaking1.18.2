package com.maideniles.maidensmerrymaking.event;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredBunnyEntity;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredChickenEntity;
import com.maideniles.maidensmerrymaking.init.ModAdvancements;
import com.maideniles.maidensmerrymaking.init.ModEntityTypes;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.player.Player;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.event.entity.player.AdvancementEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {

    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {

        //pink bun//
        event.put(ModEntityTypes.PINK_BUNNY.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.PINK_BUNNY_SMALL.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.PINK_BUNNY_LARGE.get(), ColoredBunnyEntity.setAttributes());
        //blue bun//
        event.put(ModEntityTypes.BLUE_BUNNY.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.BLUE_BUNNY_SMALL.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.BLUE_BUNNY_LARGE.get(), ColoredBunnyEntity.setAttributes());
        //purple bun//
        event.put(ModEntityTypes.PURPLE_BUNNY.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.PURPLE_BUNNY_SMALL.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.PURPLE_BUNNY_LARGE.get(), ColoredBunnyEntity.setAttributes());
        //cyan bun//
        event.put(ModEntityTypes.CYAN_BUNNY.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.CYAN_BUNNY_SMALL.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.CYAN_BUNNY_LARGE.get(), ColoredBunnyEntity.setAttributes());
        //yellow bun//
        event.put(ModEntityTypes.YELLOW_BUNNY.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.YELLOW_BUNNY_SMALL.get(), ColoredBunnyEntity.setAttributes());
        event.put(ModEntityTypes.YELLOW_BUNNY_LARGE.get(), ColoredBunnyEntity.setAttributes());

        event.put(ModEntityTypes.COLORED_CHICKEN.get(), ColoredChickenEntity.setAttributes());
    }

    @SubscribeEvent
    public static void registerModifierSerializers(@Nonnull final RegistryEvent.Register<GlobalLootModifierSerializer<?>>
                                                           event) {
        event.getRegistry().registerAll(
                new SpruceLeavesConverterModifier.Serializer().setRegistryName
                        (new ResourceLocation(MaidensMerryMaking.MOD_ID,"tiny_spruce_from_leaves")),
                new EasterChestLootModifier.Serializer().setRegistryName
                        (new ResourceLocation(MaidensMerryMaking.MOD_ID,"easter_chest_loot_modifier")),

        new ChestLootModifier.Serializer().setRegistryName
                (new ResourceLocation(MaidensMerryMaking.MOD_ID,"chest_loot_modifier"))


        );
    }

}