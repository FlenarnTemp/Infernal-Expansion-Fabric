package org.infernalstudios.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import org.infernalstudios.item.InfernalItems;

public class InfernalRecipeProvider extends FabricRecipeProvider {
    public InfernalRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, InfernalItems.GLOWLIGHT_TORCH_ITEM, 4)
                .pattern("G")
                .pattern("S")
                .pattern("B")
                .input('G', Items.COAL)
                .input('S', Items.STICK)
                .input('B', Items.GLOWSTONE_DUST)
                .criterion(hasItem(Items.GLOWSTONE_DUST), conditionsFromItem(Items.GLOWSTONE_DUST))
                .offerTo(exporter);
    }
}
