package net.guh.cenozoicfauna;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.guh.cenozoicfauna.blocks.ModBlocks;
import net.guh.cenozoicfauna.entity.ModEntities;
import net.guh.cenozoicfauna.entity.custom.MegalonyxEntity;
import net.guh.cenozoicfauna.entity.custom.SmilodonEntity;
import net.guh.cenozoicfauna.entity.custom.ThylacineEntity;
import net.guh.cenozoicfauna.items.ModItems;
import net.guh.cenozoicfauna.items.ModItemsGroups;
import net.guh.cenozoicfauna.world.gen.ModEntityGeneration;
import net.guh.cenozoicfauna.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CenozoicFauna implements ModInitializer {
	public static final String MOD_ID = "cenozoicfauna";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemsGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks	();

		ModEntityGeneration.addSpawns();

		FabricDefaultAttributeRegistry.register(ModEntities.MEGALONYX, MegalonyxEntity.createMegalonyxAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.THYLACINE, ThylacineEntity.createThylacineAttributes());
		FabricDefaultAttributeRegistry.register(ModEntities.SMILODON, SmilodonEntity.createSmilodonAttributes());

		ModWorldGeneration.generateModWorldGen();
	}
}