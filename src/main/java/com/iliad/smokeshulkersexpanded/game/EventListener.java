package com.iliad.smokeshulkersexpanded.game;

// Smoke's Shulkers Expanded
import com.iliad.smokeshulkersexpanded.Main;

// Forge
import net.minecraftforge.fml.common.Mod;

// Minecraft

public class EventListener {
    @Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
    public static class ForgeEventBusEvents {
    }

    @Mod.EventBusSubscriber(modid = Main.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {

    }
}
