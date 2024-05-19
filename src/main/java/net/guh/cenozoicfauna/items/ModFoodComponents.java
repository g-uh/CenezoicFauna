package net.guh.cenozoicfauna.items;

import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent MAMMOTH_MEATBALL = new FoodComponent.Builder()
            .hunger(20).saturationModifier(20f)
            .meat().build();
}
