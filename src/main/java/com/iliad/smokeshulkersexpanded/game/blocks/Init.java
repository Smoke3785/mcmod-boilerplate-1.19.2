package com.iliad.smokeshulkersexpanded.game.blocks;

import com.iliad.smokeshulkersexpanded.Main;

// Forge
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegisterEvent;
import net.minecraftforge.fml.common.Mod;

// Minecraft
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;

// Java
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.function.Supplier;

// Entities

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class Init {

    public static List<String> proscribedBlocks = new ArrayList<>(Arrays.asList("smokeshulkerepanded:block_name"));

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS,
            Main.MODID);

    // This listens for the register event for blocks, and registers a block item
    // for each block. Exlcudes blocks with proscribed ids.
    @SubscribeEvent
    public static void onRegisterItems(final RegisterEvent event) {
        if (event.getRegistryKey().equals(ForgeRegistries.Keys.ITEMS)) {
            BLOCKS.getEntries().forEach((blockRegistryObject) -> {
                boolean isProscribed = proscribedBlocks
                        .contains(blockRegistryObject.getId().toString());
                System.out.println((isProscribed ? "Skipping auto-registry for "
                        : "Registering block item for ") + blockRegistryObject.getId());

                if (!isProscribed) {
                    Block block = blockRegistryObject.get();
                    Item.Properties properties = new Item.Properties()
                            .tab(com.iliad.smokeshulkersexpanded.game.items.Init.ModCreativeTab.instance);
                    Supplier<Item> blockItemFactory = () -> new BlockItem(block, properties);

                    event.register(ForgeRegistries.Keys.ITEMS, blockRegistryObject.getId(),
                            blockItemFactory);
                }
            });
        }
    }
}
