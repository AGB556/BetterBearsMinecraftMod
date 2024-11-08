package org.agb.betterbears;

import net.fabricmc.api.ModInitializer;

import org.agb.betterbears.block.ModBlocks;
import org.agb.betterbears.item.ModItemGroups;
import org.agb.betterbears.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BetterBears implements ModInitializer {
	public static final String MOD_ID = "betterbears";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}