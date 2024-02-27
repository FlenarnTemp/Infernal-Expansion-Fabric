package org.infernalstudios.effect;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectCategory;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.predicate.entity.EntityPredicates;

public class InfectionEffect extends StatusEffect {
    public InfectionEffect() {
        super(StatusEffectCategory.HARMFUL, 12856114);
    }

    @Override
    public boolean canApplyUpdateEffect(int duration, int amplifier) {
        if (this == InfernalEffects.INFECTION_EFFECT) {
            int j = 50 >> amplifier;
            if (j > 0) {
                return (duration & j) == 0;
            } else {
                return true;
            }
        }
        return false;
    }

    @Override
    public void applyUpdateEffect(LivingEntity entity, int amplifier) {
        if (entity.getHealth() > 1.0f) {
            entity.damage(entity.getDamageSources().magic(), 1.0f);
        }

        for (LivingEntity nearbyEntity : entity.getEntityWorld().getEntitiesByClass(LivingEntity.class, entity.getBoundingBox().expand(3), EntityPredicates.VALID_LIVING_ENTITY)) {
            if (!nearbyEntity.hasStatusEffect(InfernalEffects.INFECTION_EFFECT) && !nearbyEntity.getEntityWorld().isClient()) {
                nearbyEntity.addStatusEffect(new StatusEffectInstance(InfernalEffects.INFECTION_EFFECT, entity.getStatusEffect(InfernalEffects.INFECTION_EFFECT).getDuration() / 2));
            }
        }
    }
}


