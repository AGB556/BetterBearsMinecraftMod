package org.agb.betterbears.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.agb.betterbears.BetterBears;
import org.agb.betterbears.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup BETTER_BEARS_ITEMS = Registry.register(Registries.ITEM_GROUP, Identifier.of(BetterBears.MOD_ID, "better_bears_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.SALMON_ON_A_STICK))
                    .displayName(Text.translatable("itemgroup.betterbears.better_bears_items"))
                    .entries((displayContext, entries) -> {
                            entries.add(ModItems.SALMON_ON_A_STICK);

                    }).build());

    public static final ItemGroup BETTER_BEARS_BLOCKS = Registry.register(Registries.ITEM_GROUP, Identifier.of(BetterBears.MOD_ID, "better_bears_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.BEAR_TRAP))
                    .displayName(Text.translatable("itemgroup.betterbears.better_bears_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.BEAR_TRAP);

                    }).build());


    public static void registerItemGroups(){
        BetterBears.LOGGER.info("Registering Item Groups for " + BetterBears.MOD_ID);
    }
}
