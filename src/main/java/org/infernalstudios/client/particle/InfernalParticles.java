package org.infernalstudios.client.particle;

import net.fabricmc.fabric.api.client.particle.v1.ParticleFactoryRegistry;
import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.infernalstudios.InfernalExpansion;

public class InfernalParticles {

    public static final DefaultParticleType GLOWSTONE_SPARKLE_PARTICLE = FabricParticleTypes.simple();

    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(InfernalExpansion.MOD_ID, "glowstone_sparkle_particle"), GLOWSTONE_SPARKLE_PARTICLE);
    }

    public static void registerParticlesClient() {
        ParticleFactoryRegistry.getInstance().register(InfernalParticles.GLOWSTONE_SPARKLE_PARTICLE, GlowstoneSparkleParticle.Factory::new);
    }
}
