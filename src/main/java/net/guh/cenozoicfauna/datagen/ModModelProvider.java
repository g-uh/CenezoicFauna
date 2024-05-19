package net.guh.cenozoicfauna.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.guh.cenozoicfauna.blocks.ModBlocks;
import net.guh.cenozoicfauna.items.ModItems;
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
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_AMBER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AMBER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DUNG_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.MAMMOTH_MEATBALL, Models.GENERATED);
        itemModelGenerator.register(ModItems.AMBER, Models.GENERATED);
        itemModelGenerator.register(ModItems.DUNG, Models.GENERATED);
        itemModelGenerator.register(ModItems.PELT, Models.GENERATED);
        itemModelGenerator.register(ModItems.SABRETOOTH_SHIV, Models.GENERATED);

        itemModelGenerator.register(ModItems.MEGALONYX_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));
        itemModelGenerator.register(ModItems.THYLACINE_SPAWN_EGG,
                new Model(Optional.of(new Identifier("item/template_spawn_egg")), Optional.empty()));

    }
}
