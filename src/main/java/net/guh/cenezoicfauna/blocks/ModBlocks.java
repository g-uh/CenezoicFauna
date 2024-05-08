package net.guh.cenezoicfauna.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.guh.cenezoicfauna.CenezoicFauna;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

public class ModBlocks {
    public static final Block DUNGBLOCK = registerBlock("dungblock" ,
            new Block(FabricBlockSettings.copyOf(Blocks.MUD)));
    public static final Block AMBERORE = registerBlock("amberore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.IRON_ORE).strength(2f), UniformIntProvider.create(5, 8)));
    public static final Block DEEPSLATEAMBERORE = registerBlock("deepslateamberore",
            new ExperienceDroppingBlock(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE).strength(3.5f), UniformIntProvider.create(7, 10)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(CenezoicFauna.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new  Identifier(CenezoicFauna.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        CenezoicFauna.LOGGER.info("Registering ModBlocks for" + CenezoicFauna.MOD_ID);
    }
}
