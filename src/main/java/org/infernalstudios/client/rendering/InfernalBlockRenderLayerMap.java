package org.infernalstudios.client.rendering;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import static org.infernalstudios.block.InfernalBlocks.*;

public class InfernalBlockRenderLayerMap {
    public static void registerBlockRenderLayerMap() {
        Block[] blocksToRegisterCutout = {
                GLOWLIGHT_TORCH,
                WALL_GLOWLIGHT_TORCH,
                GLOWLIGHT_LANTERN,
                GLOWLIGHT_GLASS,
                GLOWLIGHT_GLASS_PANE,
                QUARTZ_GLASS,
                QUARTZ_GLASS_PANE
        };

        for (Block block : blocksToRegisterCutout) {
            BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getCutout());
        }
    }
}
