package com.iliad.smokeshulkersexpanded.game.enchantments;

// Smoke's Shulkers Expanded
import com.iliad.smokeshulkersexpanded.Main;

// Forge
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

// Minecraft
import net.minecraft.world.item.enchantment.Enchantment;

// Java

public class Init {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS = DeferredRegister
            .create(ForgeRegistries.ENCHANTMENTS, Main.MODID);

    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }

}
