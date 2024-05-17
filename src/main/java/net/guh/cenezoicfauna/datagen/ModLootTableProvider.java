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
        addDrop(ModBlocks.DUNGBLOCK);

        addDrop(ModBlocks.AMBERORE, oreDrops(ModBlocks.AMBERORE, ModItems.AMBER));
        addDrop(ModBlocks.DEEPSLATEAMBERORE, oreDrops(ModBlocks.DEEPSLATEAMBERORE, ModItems.AMBER));
    }


}
