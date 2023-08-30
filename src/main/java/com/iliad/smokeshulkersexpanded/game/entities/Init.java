package com.iliad.smokeshulkersexpanded.game.entities;

// Smoke's Shulkers Expanded
import com.iliad.smokeshulkersexpanded.Main;

// Forge
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

// Minecraft
import net.minecraft.world.entity.EntityType;

// Java

public class Init {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister
            .create(ForgeRegistries.ENTITY_TYPES, Main.MODID);

    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
