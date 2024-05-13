package net.guh.cenezoicfauna.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.guh.cenezoicfauna.CenezoicFauna;
import net.guh.cenezoicfauna.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MAMMOTHMEATBALL = registerItem("mammothmeatball",
            new Item(new FabricItemSettings()));
    public static final Item DUNG = registerItem("dung",
            new Item(new FabricItemSettings()));
    public static final Item AMBER = registerItem("amber",
            new Item(new FabricItemSettings()));
     public static final Item MEGALONYXSPAWNEGG = registerItem("megalonyxspawnegg",
            new SpawnEggItem(ModEntities.MEGALONYX, 0xc9a374, 0xd8c391, new FabricItemSettings()));

    private static void addItemsToIngredientTabItemGroup(FabricItemGroupEntries entries) {
        entries.add(MAMMOTHMEATBALL);
        entries.add(DUNG);
        entries.add(AMBER);
    }


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CenezoicFauna.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CenezoicFauna.LOGGER.info("Registering Mod Items for " + CenezoicFauna.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientTabItemGroup);
    }
}
