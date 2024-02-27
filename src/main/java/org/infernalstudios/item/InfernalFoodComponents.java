package org.infernalstudios.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import org.infernalstudios.effect.InfernalEffects;

public class InfernalFoodComponents {
    public static final FoodComponent BLINDSIGHT_TONGUE = new FoodComponent.Builder().hunger(3).saturationModifier(0.5f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 100, 1), 1.0f).build();

    public static final FoodComponent BLINDSIGHT_TONGUE_STEW = new FoodComponent.Builder().hunger(6).saturationModifier(0.9f)
            .statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 1200, 1), 1.0f).build();

    public static final FoodComponent CURED_JERKY = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build();

    public static final FoodComponent SPIRIT_EYE = new FoodComponent.Builder().hunger(4).saturationModifier(0.8f)
            .statusEffect(new StatusEffectInstance(StatusEffects.GLOWING, 200), 1.0F).build();

    public static final FoodComponent RAW_HOGCHOP = new FoodComponent.Builder().hunger(4).saturationModifier(0.3f).meat()
            .statusEffect(new StatusEffectInstance(InfernalEffects.INFECTION_EFFECT, 200, 1), 1.0f).build();

    public static final FoodComponent COOKED_HOGCHOP = new FoodComponent.Builder().hunger(10).saturationModifier(0.8f).meat()
            .statusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 1), 1.0f).build();
}
