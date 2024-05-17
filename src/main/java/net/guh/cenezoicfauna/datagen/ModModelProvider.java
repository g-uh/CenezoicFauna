package net.guh.cenezoicfauna.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.guh.cenezoicfauna.blocks.ModBlocks;
import net.guh.cenezoicfauna.items.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

import java.util.Optional;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATEAMBERORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AMBERORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DUNGBLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MAMMOTHMEATBALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUNG, Models.GENERATED);
        itemModelGenerator.register(ModItems.PELT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SABRETOOTHSHIV, Models.GENERATED);

        itemModelGenerator.register(ModItems.MEGALONYXSPAWNEGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(ModItems.THYLACINESPAWNEGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

    }
}
