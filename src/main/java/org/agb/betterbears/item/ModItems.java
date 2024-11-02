package org.agb.betterbears.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.agb.betterbears.BetterBears;

public class ModItems {

    public static final Item SALMON_ON_A_STICK = registerItem("salmon_on_a_stick", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BetterBears.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterBears.LOGGER.info("Registering Mod Items for " + BetterBears.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(SALMON_ON_A_STICK);
        });
    }
}
