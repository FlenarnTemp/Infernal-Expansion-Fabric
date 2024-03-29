package org.infernalstudios.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

import static org.infernalstudios.block.InfernalBlocks.*;

public class InfernalBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public InfernalBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(BASALT_IRON_ORE)
                .add(WARPED_NYLIUM_PATH)
                .add(CRIMSON_NYLIUM_PATH);

        getOrCreateTagBuilder(BlockTags.SHOVEL_MINEABLE)
                .add(SOUL_SOIL_PATH);
    }
}
