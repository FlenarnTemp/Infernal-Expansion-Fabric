package org.infernalstudios.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.Item;

import static org.infernalstudios.block.InfernalBlocks.*;
import static org.infernalstudios.item.InfernalItems.*;

public class InfernalModelProvider extends FabricModelProvider {
    public InfernalModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerTorch(GLOWLIGHT_TORCH, WALL_GLOWLIGHT_TORCH);
        blockStateModelGenerator.registerLantern(GLOWLIGHT_LANTERN);

        blockStateModelGenerator.registerGlassPane(QUARTZ_GLASS, QUARTZ_GLASS_PANE);
        blockStateModelGenerator.registerGlassPane(GLOWLIGHT_GLASS, GLOWLIGHT_GLASS_PANE);

        blockStateModelGenerator.registerSimpleCubeAll(DULLSTONE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        Item[] itemsToRegisterGeneratedModel = {
                GLOWCOKE,
                DULLROCKS,
                MOTH_DUST,
                GLOWSILK,
                SOUL_SALT_CLUMP,
                BLINDSIGHT_TONGUE,
                BLINDSIGHT_TONGUE_STEW,
                CURED_JERKY,
                SPIRIT_EYE,
                RAW_HOGCHOP,
                COOKED_HOGCHOP,
                MUSIC_DISC_SOUL_SPUNK,
                MUSIC_DISC_FLUSH,
                TAB_ITEM
        };

        for (Item item : itemsToRegisterGeneratedModel) {
            itemModelGenerator.register(item, Models.GENERATED);
        }
    }
}
