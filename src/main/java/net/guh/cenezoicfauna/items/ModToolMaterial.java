package net.guh.cenezoicfauna.items;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;


public enum ModToolMaterial implements ToolMaterial {
   SABRETOOTH(0, 1500, 0, 3, 26,
           () -> Ingredient.ofItems(ModItems.AMBER))
    ;

   private final int miningLevel;
   private final int itemDurability;
   private final int miningSpeed;
   private final int attackDamage;
   private final int enchantability;
   private final Supplier<Ingredient> repairIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, int miningSpeeed, int attackDamae, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeeed;
        this.attackDamage = attackDamae;
        this.enchantability = enchantability;
        this.repairIngredient = repairIngredient;
    }


    @Override
    public int getDurability() {
        return this.itemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
