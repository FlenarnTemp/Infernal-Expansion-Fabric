package org.infernalstudios.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

import static org.infernalstudios.block.InfernalBlocks.*;

public class InfernalLootTableProvider extends FabricBlockLootTableProvider {
    public InfernalLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(GLOWLIGHT_TORCH);
        addDrop(GLOWLIGHT_LANTERN);
    }
}
