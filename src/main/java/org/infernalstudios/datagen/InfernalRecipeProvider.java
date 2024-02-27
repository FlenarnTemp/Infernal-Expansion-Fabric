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
                .input('G', InfernalItems.GLOWCOKE)
                .input('S', Items.STICK)
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);
    }
}
