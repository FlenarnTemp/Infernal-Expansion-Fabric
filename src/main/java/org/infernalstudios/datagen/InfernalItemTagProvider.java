package org.infernalstudios.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import org.infernalstudios.item.InfernalItems;

import java.util.concurrent.CompletableFuture;

public class InfernalItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public InfernalItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.MUSIC_DISCS)
                .add(InfernalItems.MUSIC_DISC_FLUSH)
                .add(InfernalItems.MUSIC_DISC_SOUL_SPUNK);
    }
}
