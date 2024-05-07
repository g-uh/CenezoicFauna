package net.guh.cenezoicfauna;

import net.fabricmc.api.ModInitializer;

import net.guh.cenezoicfauna.blocks.ModBlocks;
import net.guh.cenezoicfauna.items.ModItems;
import net.guh.cenezoicfauna.items.ModItemsGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CenezoicFauna implements ModInitializer {
	public static final String MOD_ID = "cenezoicfauna";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}