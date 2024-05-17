package net.guh.cenezoicfauna.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.guh.cenezoicfauna.CenezoicFauna;
import net.guh.cenezoicfauna.entity.ModEntities;
import net.minecraft.item.Item;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item MAMMOTHMEATBALL = registerItem("mammothmeatball",
            new Item(new FabricItemSettings().food(ModFoodComponents.MAMMOTHMEATBALL)));
    public static final Item DUNG = registerItem("dung",
            new Item(new FabricItemSettings()));
    public static final Item AMBER = registerItem("amber",
            new Item(new FabricItemSettings()));
    public static final Item PELT = registerItem("pelt",
            new Item(new FabricItemSettings()));

    public static final Item SABRETOOTHSHIV = registerItem("sabretoothshiv",
            new SwordItem(ModToolMaterial.SABRETOOTH, 5, 1, new FabricItemSettings()));

     public static final Item MEGALONYXSPAWNEGG = registerItem("megalonyxspawnegg",
            new SpawnEggItem(ModEntities.MEGALONYX, 0xc9a374, 0xd8c391, new FabricItemSettings()));
     public static final Item THYLACINESPAWNEGG = registerItem("thylacinespawnegg",
            new SpawnEggItem(ModEntities.THYLACINE, 0xd3a45d0, 0x382312, new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(CenezoicFauna.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CenezoicFauna.LOGGER.info("Registering Mod Items for " + CenezoicFauna.MOD_ID);

    }
}
