package com.iliad.smokeshulkersexpanded.game.items;

import com.iliad.smokeshulkersexpanded.Main;

// Forge
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

// Minecraft

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;

// Java

public class Init {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Main.MODID);

    // This adds a creative tab to the mod.
    public static class ModCreativeTab extends CreativeModeTab {
        private ModCreativeTab(int index, String label) {
            super(index, label);
        }

        @Override
        // This is the icon for the creative tab.
        public ItemStack makeIcon() {
            return new ItemStack(Items.COBBLESTONE);
        }

        public static final ModCreativeTab instance = new ModCreativeTab(CreativeModeTab.TABS.length,
                "smokes_shulkers_expanded");

    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
