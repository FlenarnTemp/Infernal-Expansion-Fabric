package org.infernalstudios.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import org.jetbrains.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class GlowstoneSparkleParticle extends SpriteBillboardParticle {

    protected GlowstoneSparkleParticle(ClientWorld clientWorld, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
        super(clientWorld, x, y, z);

        this.velocityX = (velocityX + random.nextFloat() - 0.5) / 3;
        this.velocityY = (velocityY + random.nextFloat()) / 5;
        this.velocityZ = (velocityZ + random.nextFloat() - 0.5) / 3;
        this.scale *= 0.75f;
        this.maxAge = 60 + random.nextInt(12);
    }

    @Override
    public void move(double dx, double dy, double dz) {
        this.setBoundingBox(this.getBoundingBox().offset(dx, dy, dz));
        this.repositionFromBoundingBox();
    }

    @Override
    public void tick() {
        this.prevPosX = this.x;
        this.prevPosY = this.y;
        this.prevPosZ = this.z;

        if (this.age++ >= this.maxAge) {
            this.markDead();
        } else {
            this.x += this.velocityX;
            this.y += this.velocityY;
            this.z += this.velocityZ;
            if (this.velocityX > 0.1) {
                this.velocityX *= 0.9;
            }
            if (this.velocityY > 0.1) {
                this.velocityY *= 0.9;
            }
            if (this.velocityZ > 0.1) {
                this.velocityZ *= 0.9;
            }
        }
    }

    @Override
    public int getBrightness(float tint) {
        return 15728880;
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_LIT;
    }

    @Environment(EnvType.CLIENT)
    public static class Factory implements ParticleFactory<DefaultParticleType> {
        private final SpriteProvider sprites;

        public Factory(SpriteProvider spriteSet) {
            this.sprites = spriteSet;
        }

        @Nullable
        @Override
        public Particle createParticle(DefaultParticleType parameters, ClientWorld world, double x, double y, double z, double velocityX, double velocityY, double velocityZ) {
            GlowstoneSparkleParticle glowstoneSparkleParticle = new GlowstoneSparkleParticle(world, x, y, z, velocityX, velocityY, velocityZ);
            glowstoneSparkleParticle.setSprite(this.sprites);
            glowstoneSparkleParticle.scale(0.5f);
            return glowstoneSparkleParticle;
        }
    }
}
