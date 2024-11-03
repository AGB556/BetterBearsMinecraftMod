package org.agb.betterbears.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.Tameable;
import net.minecraft.entity.passive.HorseEntity;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.OnAStickItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.agb.betterbears.BetterBears;


public class ModItems {


    //public static final Item SALMON_ON_A_STICK = registerItem("salmon_on_a_stick", new OnAStickItem<>(new Item.Settings(), PolarBearEntity, 1));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(BetterBears.MOD_ID, name), item);
    }

    public static void registerModItems() {
        BetterBears.LOGGER.info("Registering Mod Items for " + BetterBears.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(fabricItemGroupEntries -> {
            //fabricItemGroupEntries.add(SALMON_ON_A_STICK);

        });
    }
}
