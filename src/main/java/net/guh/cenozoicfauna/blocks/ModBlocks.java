package net.guh.cenozoicfauna.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.guh.cenozoicfauna.CenozoicFauna;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block DUNG_BLOCK = registerBlock("dung_block" ,
            new Block(FabricBlockSettings.copyOf(Blocks.MUD)));
    public static final Block AMBER_ORE = registerBlock("amber_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(2f), UniformIntProvider.create(5, 8)));
    public static final Block DEEPSLATE_AMBER_ORE = registerBlock("deepslate_amber_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(3.5f), UniformIntProvider.create(7, 10)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CenozoicFauna.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new  Identifier(CenozoicFauna.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        CenozoicFauna.LOGGER.info("Registering ModBlocks for" + CenozoicFauna.MOD_ID);
    }
}
