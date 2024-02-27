package org.infernalstudios.block;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.block.BlockState;
import net.minecraft.block.TorchBlock;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import org.infernalstudios.client.particle.InfernalParticles;

public class GlowTorchBlock extends TorchBlock {
    public GlowTorchBlock(DefaultParticleType particle, Settings settings) {
        super(particle, settings);
    }

    @Environment(EnvType.CLIENT)
    @Override
    public void randomDisplayTick(BlockState state, World world, BlockPos pos, Random random) {
        double d = (double)pos.getX() + 0.5;
        double e = (double)pos.getY() + 0.7;
        double f = (double)pos.getZ() + 0.5;
        world.addParticle(ParticleTypes.SMOKE, d, e, f, 0.0, 0.0, 0.0);
        if (random.nextInt(2) == 1) {
            world.addParticle(InfernalParticles.GLOWSTONE_SPARKLE_PARTICLE, d, e, f, 0.0, 0.0, 0.0);
        }
    }
}
