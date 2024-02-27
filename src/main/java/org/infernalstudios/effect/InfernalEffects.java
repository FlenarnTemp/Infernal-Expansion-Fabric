package org.infernalstudios.effect;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.infernalstudios.InfernalExpansion;

public class InfernalEffects {
    public static final StatusEffect INFECTION_EFFECT = new InfectionEffect();

    public static void registerEffects() {
        InfernalExpansion.LOGGER.info("Registering effects for " + InfernalExpansion.MOD_ID + ".");

        Registry.register(Registries.STATUS_EFFECT, new Identifier("infernal_expansion", "infection"), INFECTION_EFFECT);
    }
}
