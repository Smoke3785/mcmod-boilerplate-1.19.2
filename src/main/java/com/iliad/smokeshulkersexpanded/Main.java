package com.iliad.smokeshulkersexpanded;

import com.iliad.smokeshulkersexpanded.game.EventListener;

// Smoke's Shulkers Expanded

// Forge
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

// Minecraft
import com.mojang.logging.LogUtils;

// Java
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(Main.MODID)
public class Main {
    // Define mod id in a common place for everything to reference
    public static final String MODID = "smokeshulkersexpanded";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public Main() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register general forge event listener
        MinecraftForge.EVENT_BUS.register(new EventListener());

        // Register stuff
        com.iliad.smokeshulkersexpanded.game.enchantments.Init.register(modEventBus);
        com.iliad.smokeshulkersexpanded.game.entities.Init.register(modEventBus);
        com.iliad.smokeshulkersexpanded.game.effects.Init.register(modEventBus);
        com.iliad.smokeshulkersexpanded.game.blocks.Init.register(modEventBus);
        com.iliad.smokeshulkersexpanded.game.items.Init.register(modEventBus);
        com.iliad.smokeshulkersexpanded.game.sounds.Init.register(modEventBus);
        com.iliad.smokeshulkersexpanded.game.blockentities.Init.register(modEventBus);

    }

    private void commonSetup(final FMLCommonSetupEvent event) {
        // Some common setup code
        LOGGER.info("HELLO FROM COMMON SETUP");
    }

    // This is the client setup method. It is called after commonSetup.
    private void clientSetup(final FMLClientSetupEvent event) {
        // Some client setup code
        LOGGER.info("HELLO FROM CLIENT SETUP");
    }

    // This registers custom renderers.
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            // ItemBlockRenderTypes.setRenderLayer(ModFluids.SOURCE_SOAP_WATER.get(),
            // RenderType.translucent());

            // ItemBlockRenderTypes.setRenderLayer(ModFluids.FLOWING_SOAP_WATER.get(),
            // RenderType.translucent());

            // MenuScreens.register(ModMenuTypes.GEM_INFUSING_STATION_MENU.get(),
            // GemInfusingStationScreen::new);

            // EntityRenderers.register(EntityInit.CRUDE_JJ.get(), CrudeJJRenderer::new);
            // BlockEntityRenderers.register(BlockEntityInit.JJ_GLASSES_ENTITY.get(),
            // JJGlassesBlockRenderer::new);
        }
    }
}
