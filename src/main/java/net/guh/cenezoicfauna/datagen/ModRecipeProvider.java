package net.guh.cenezoicfauna.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.guh.cenezoicfauna.blocks.ModBlocks;
import net.guh.cenezoicfauna.items.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.ShapedRecipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> AMBERSMELTABLES = List.of(ModBlocks.AMBERORE, ModBlocks.DEEPSLATEAMBERORE);

    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, AMBERSMELTABLES, RecipeCategory.MISC, ModItems.AMBER,
                0.7f, 200, "amber");
        offerBlasting(exporter, AMBERSMELTABLES, RecipeCategory.MISC, ModItems.AMBER,
                0.7f, 100, "amber");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.DUNG, RecipeCategory.DECORATIONS, ModBlocks.DUNGBLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.SABRETOOTHSHIV,1)
                .pattern("#")
                .pattern("|")
                .input('#', ModItems.AMBER)
                .input('|', Items.STICK)
                .criterion(hasItem(ModItems.AMBER), conditionsFromItem(ModItems.AMBER))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.SABRETOOTHSHIV)));


    }
}
