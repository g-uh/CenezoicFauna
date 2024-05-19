package net.guh.cenozoicfauna.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.guh.cenozoicfauna.CenozoicFauna;
import net.guh.cenozoicfauna.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MAMMOTH_MEATBALL = registerItem("mammoth_meatball",
            new Item(new FabricItemSettings().food(ModFoodComponents.MAMMOTH_MEATBALL)));
    public static final Item DUNG = registerItem("dung",
            new Item(new FabricItemSettings()));
    public static final Item AMBER = registerItem("amber",
            new Item(new FabricItemSettings()));
    public static final Item PELT = registerItem("pelt",
            new Item(new FabricItemSettings()));

    public static final Item SABRETOOTH_SHIV = registerItem("sabretooth_shiv",
            new SwordItem(ModToolMaterial.SABRETOOTH, 5, 1, new FabricItemSettings()));

    public static final Item MEGALONYX_SPAWN_EGG = registerItem("megalonyx_spawn_egg",
            new SpawnEggItem(ModEntities.MEGALONYX, 0xc9a374, 0xd8c391, new FabricItemSettings()));
    public static final Item THYLACINE_SPAWN_EGG = registerItem("thylacine_spawn_egg",
            new SpawnEggItem(ModEntities.THYLACINE, 0xd3a45d0, 0x382312, new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CenozoicFauna.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CenozoicFauna.LOGGER.info("Registering Mod Items for " + CenozoicFauna.MOD_ID);

    }
}
