package net.guh.cenezoicfauna.items;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

import net.guh.cenezoicfauna.CenezoicFauna;
import net.guh.cenezoicfauna.blocks.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemsGroups {
    public final static ItemGroup CENEZOICFAUNA_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(CenezoicFauna.MOD_ID, "cenezoicfauna"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.cenezoicfauna"))
                    .icon(() -> new ItemStack(ModItems.MAMMOTHMEATBALL)).entries((displayContext, entries) -> {
                        entries.add(ModItems.DUNG);
                        entries.add(ModItems.MAMMOTHMEATBALL);
                        entries.add(ModItems.AMBER);

                        entries.add(ModItems.MEGALONYXSPAWNEGG);

                        entries.add(ModBlocks.DUNGBLOCK);
                        entries.add(ModBlocks.AMBERORE);
                        entries.add(ModBlocks.DEEPSLATEAMBERORE);

                    }).build());

    public static void registerItemGroups(){

        CenezoicFauna.LOGGER.info("Registering Item Groups for " + CenezoicFauna.MOD_ID);

    }
}
