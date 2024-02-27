package org.infernalstudios;

import net.fabricmc.api.ClientModInitializer;
import org.infernalstudios.client.particle.InfernalParticles;
import org.infernalstudios.client.rendering.InfernalBlockRenderLayerMap;

public class InfernalExpansionClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        InfernalBlockRenderLayerMap.registerBlockRenderLayerMap();
        InfernalParticles.registerParticlesClient();
    }
}
