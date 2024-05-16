package net.guh.cenezoicfauna;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.impl.object.builder.FabricEntityType;
import net.guh.cenezoicfauna.blocks.ModBlocks;
import net.guh.cenezoicfauna.entity.ModEntities;
import net.guh.cenezoicfauna.entity.custom.MegalonyxEntity;
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
		ModBlocks.registerModBlocks	();

		FabricDefaultAttributeRegistry.register(ModEntities.MEGALONYX, MegalonyxEntity.createMegalonyxAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.THYLACINE, MegalonyxEntity.createMegalonyxAttributes());
	}
}