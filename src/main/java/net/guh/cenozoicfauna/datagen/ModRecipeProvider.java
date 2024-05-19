package net.guh.cenozoicfauna.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.guh.cenozoicfauna.blocks.ModBlocks;
import net.guh.cenozoicfauna.items.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> AMBER_SMELTABLES = List.of(ModBlocks.AMBER_ORE, ModBlocks.DEEPSLATE_AMBER_ORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }





    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, AMBER_SMELTABLES, RecipeCategory.MISC, ModItems.AMBER,
                0.7f, 200, "amber");
        offerBlasting(exporter, AMBER_SMELTABLES, RecipeCategory.MISC, ModItems.AMBER,
                0.7f, 100, "amber");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DUNG, RecipeCategory.DECORATIONS, ModBlocks.DUNG_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SABRETOOTH_SHIV,1)
                .pattern("#")
                .pattern("|")
                .input('#', ModItems.AMBER)
                .input('|', Items.STICK)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SABRETOOTH_SHIV)));
    }

}
