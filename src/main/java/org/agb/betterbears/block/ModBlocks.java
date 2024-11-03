package org.agb.betterbears.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.agb.betterbears.BetterBears;

public class ModBlocks {

    public static final Block BEAR_TRAP = registerBlock("bear_trap",
            new Block(AbstractBlock.Settings.create().strength(2f).requiresTool().sounds(BlockSoundGroup.ANVIL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BetterBears.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(BetterBears.MOD_ID, name),new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks(){
        BetterBears.LOGGER.info("Registering Mod Blocks for " + BetterBears.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(ModBlocks.BEAR_TRAP);
        });
    }
}
