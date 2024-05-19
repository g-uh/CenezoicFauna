package net.guh.cenozoicfauna.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.guh.cenozoicfauna.blocks.ModBlocks;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.AMBER_ORE)
                .add(ModBlocks.DEEPSLATE_AMBER_ORE)
                ;
        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
                ;

        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
                ;

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(ModBlocks.DUNG_BLOCK)
                ;


        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                ;

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                ;

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                ;

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "need_tool_level_4")))
                ;


    }
}
