package com.iliad.smokeshulkersexpanded.game.effects;

// Smoke's Shulkers Expanded
import com.iliad.smokeshulkersexpanded.Main;

import net.minecraftforge.eventbus.api.IEventBus;
// Forge
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

// Minecraft
import net.minecraft.world.effect.MobEffect;

// Java

public class Init {
    public static final DeferredRegister<MobEffect> EFFECTS = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS,
            Main.MODID);

    public static void register(IEventBus eventBus) {
        EFFECTS.register(eventBus);
    }

}
