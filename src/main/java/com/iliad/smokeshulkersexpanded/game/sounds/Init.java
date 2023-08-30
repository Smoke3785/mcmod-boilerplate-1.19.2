package com.iliad.smokeshulkersexpanded.game.sounds;

// Smoke's Shulkers Expanded
import com.iliad.smokeshulkersexpanded.Main;

// Forge
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

// Minecraft
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;

// Java

public class Init {

    public static final DeferredRegister<SoundEvent> SOUNDS = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS,
            Main.MODID);

    public static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }

    private static RegistryObject<SoundEvent> registerSoundEvent(String name) {
        ResourceLocation id = new ResourceLocation(Main.MODID, name);
        return SOUNDS.register(name, () -> new SoundEvent(id));
    }
}
