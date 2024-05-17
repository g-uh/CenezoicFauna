package net.guh.cenezoicfauna.items;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;

public class ModFoodComponents {
    public static final FoodComponent MAMMOTHMEATBALL = new FoodComponent.Builder()
            .hunger(20).saturationModifier(20f)
            .meat().build();
}
