package net.guh.cenezoicfauna.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.guh.cenezoicfauna.blocks.ModBlocks;
import net.guh.cenezoicfauna.items.ModItems;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.DUNG_BLOCK);

        addDrop(ModBlocks.AMBER_ORE, oreDrops(ModBlocks.AMBER_ORE, ModItems.AMBER));
        addDrop(ModBlocks.DEEPSLATE_AMBER_ORE, oreDrops(ModBlocks.DEEPSLATE_AMBER_ORE, ModItems.AMBER));
    }


}
