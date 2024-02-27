package org.infernalstudios.sound;

import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import org.infernalstudios.InfernalExpansion;

public class InfernalSounds {

    public static final SoundEvent SOUL_SPUNK = registerSoundEvent("record.soul_spunk");
    public static final SoundEvent FLUSH = registerSoundEvent("record.flush");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(InfernalExpansion.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {
        InfernalExpansion.LOGGER.info("Registering sounds for " + InfernalExpansion.MOD_ID + ".");
    };


}
