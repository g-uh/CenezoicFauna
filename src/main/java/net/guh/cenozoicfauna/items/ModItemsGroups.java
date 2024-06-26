package net.guh.cenozoicfauna.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.guh.cenozoicfauna.CenozoicFauna;
import net.guh.cenozoicfauna.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroups {
    public final static ItemGroup CENOZOIC_FAUNA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CenozoicFauna.MOD_ID, "cenozoic_fauna"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cenozoicfauna"))
                    .icon(() -> new ItemStack(ModItems.MAMMOTH_MEATBALL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DUNG);
                        entries.add(ModItems.MAMMOTH_MEATBALL);
                        entries.add(ModItems.AMBER);
                        entries.add(ModItems.PELT);

                        entries.add(ModItems.SABRETOOTH_SHIV);

                        entries.add(ModItems.MEGALONYX_SPAWN_EGG);
                        entries.add(ModItems.THYLACINE_SPAWN_EGG);

                        entries.add(ModBlocks.DUNG_BLOCK);
                        entries.add(ModBlocks.AMBER_ORE);
                        entries.add(ModBlocks.DEEPSLATE_AMBER_ORE);

                    }).build());

    public static void registerItemGroups(){

        CenozoicFauna.LOGGER.info("Registering Item Groups for " + CenozoicFauna.MOD_ID);

    }
}
