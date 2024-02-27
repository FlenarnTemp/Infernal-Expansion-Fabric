package org.infernalstudios.client.particle;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.minecraft.client.particle.*;
import net.minecraft.client.world.ClientWorld;
import net.minecraft.particle.DefaultParticleType;
import org.jetbrains.annotations.Nullable;

@Environment(EnvType.CLIENT)
public class InfectionParticle extends SpriteBillboardParticle {

    protected InfectionParticle(ClientWorld clientWorld, double x, double y, double z, double velocityX, double velocityY, double velocityZ, SpriteProvider sprites) {
        super(clientWorld, x, y, z, 0.5 - Math.random(), velocityY, 0.5 - Math.random());

        this.velocityY *= -0.1;

        if (velocityX == 0 && velocityY == 0) {
            this.velocityX *= 0.1;
            this.velocityZ *= 0.1;
        }

        this.scale *= 0.75;
        this.maxAge = (int) (16 / (Math.random() * 0.8 + 0.2));
        this.collidesWithWorld = false;

        this.red = 0.5f;
        this.green = (float) Math.random() * 0.1f;
        this.blue = (float) Math.random() * 0.1f;

        this.setSprite(sprites);
    }

    @Override
    public void tick() {
        this.prevPosX = this.x;
        this.prevPosY = this.y;
        this.prevPosZ = this.z;

        if (this.age++ >= this.maxAge) {
            this.markDead();
        } else {
            this.velocityY -= 0.001;
            this.move(this.velocityX, this.velocityY, this.velocityZ);

            if (this.y == this.prevPosY) {
                this.velocityX *= 1.1;
                this.velocityZ *= 1.1;
            }

            this.velocityX *= 0.96;
            this.velocityY *= 0.96;
            this.velocityZ *= 0.96;

            if (this.onGround) {
                this.velocityX *= 0.7;
                this.velocityZ *= 0.7;
            }

            this.red = (float) (0.7f + (0.2f * Math.sin(this.age / 10f)));
        }
    }

    @Override
    public ParticleTextureSheet getType() {
        return ParticleTextureSheet.PARTICLE_SHEET_TRANSLUCENT;
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
            return new InfectionParticle(world, x, y, z, velocityX, velocityY, velocityZ, this.sprites);
        }
    }
}
