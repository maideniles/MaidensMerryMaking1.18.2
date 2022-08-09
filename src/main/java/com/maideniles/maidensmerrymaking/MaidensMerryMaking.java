package com.maideniles.maidensmerrymaking;

import com.maideniles.maidensmerrymaking.client.RenderLayers;
import com.maideniles.maidensmerrymaking.entity.client.render.*;
import com.maideniles.maidensmerrymaking.entity.client.render.halloween_costumes.ZombieCostumeRenderer;
import com.maideniles.maidensmerrymaking.entity.render.ColoredChickenRenderer;
import com.maideniles.maidensmerrymaking.event.HalloweenEntityEvents;
import com.maideniles.maidensmerrymaking.init.*;
import com.maideniles.maidensmerrymaking.util.MerryMakingConfig;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Locale;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MaidensMerryMaking.MOD_ID)
public class MaidensMerryMaking {
    public static final String MOD_ID = "maidensmerrymaking";
    // Directly reference a log4j logger.
    public static final Logger LOGGER = LogManager.getLogger();




    public MaidensMerryMaking() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();


        ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MerryMakingConfig.CLIENT_CONFIG);
        ModLoadingContext.get().registerConfig(ModConfig.Type.SERVER, MerryMakingConfig.SERVER_CONFIG);
        IEventBus forgeBus = MinecraftForge.EVENT_BUS;



        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        RenderLayers.safeRunClient();
        ModEntityTypes.register(eventBus);

        ModSoundEvents.register(eventBus);
        ModAdvancements.init();
        ModStructures.register(eventBus);



        eventBus.addListener(HalloweenEntityEvents::registerEntityAttributes);

        eventBus.addListener(this::setup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    // add a comment
    public void setup(final FMLCommonSetupEvent event) {


        event.enqueueWork(() -> {
            HalloweenEntityEvents.initializeMobs();

            EntityRenderers.register(ModEntityTypes.COLORED_CHICKEN.get(), ColoredChickenRenderer::new);

            EntityRenderers.register(ModEntityTypes.PINK_BUNNY.get(), PinkBunnyRenderer::new);
            EntityRenderers.register(ModEntityTypes.PINK_BUNNY_SMALL.get(), PinkBunnyRendererSmall::new);
            EntityRenderers.register(ModEntityTypes.PINK_BUNNY_LARGE.get(), PinkBunnyRendererLarge::new);

            EntityRenderers.register(ModEntityTypes.BLUE_BUNNY.get(), BlueBunnyRenderer::new);
            EntityRenderers.register(ModEntityTypes.BLUE_BUNNY_SMALL.get(), BlueBunnyRendererSmall::new);
            EntityRenderers.register(ModEntityTypes.BLUE_BUNNY_LARGE.get(), BlueBunnyRendererLarge::new);

            EntityRenderers.register(ModEntityTypes.CYAN_BUNNY.get(), CyanBunnyRenderer::new);
            EntityRenderers.register(ModEntityTypes.CYAN_BUNNY_SMALL.get(), CyanBunnyRendererSmall::new);
            EntityRenderers.register(ModEntityTypes.CYAN_BUNNY_LARGE.get(), CyanBunnyRendererLarge::new);

            EntityRenderers.register(ModEntityTypes.PURPLE_BUNNY.get(), PurpleBunnyRenderer::new);
            EntityRenderers.register(ModEntityTypes.PURPLE_BUNNY_SMALL.get(), PurpleBunnyRendererSmall::new);
            EntityRenderers.register(ModEntityTypes.PURPLE_BUNNY_LARGE.get(), PurpleBunnyRendererLarge::new);

            EntityRenderers.register(ModEntityTypes.YELLOW_BUNNY.get(), YellowBunnyRenderer::new);
            EntityRenderers.register(ModEntityTypes.YELLOW_BUNNY_SMALL.get(), YellowBunnyRendererSmall::new);
            EntityRenderers.register(ModEntityTypes.YELLOW_BUNNY_LARGE.get(), YellowBunnyRendererLarge::new);
//HALLOWEEN//
            EntityRenderers.register(ModEntityTypes.COSTUMED_ZOMBIE.get(), ZombieCostumeRenderer::new);
        });

        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());


    }

    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(MOD_ID, name.toLowerCase(Locale.ROOT));
    }




}
