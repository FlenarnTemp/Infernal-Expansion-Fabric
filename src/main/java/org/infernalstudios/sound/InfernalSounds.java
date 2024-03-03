package org.infernalstudios.sound;

import net.minecraft.block.BlockSetType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.Identifier;
import org.infernalstudios.InfernalExpansion;

public class InfernalSounds {

    public static final SoundEvent SOUL_SPUNK = registerSoundEvent("record.soul_spunk");
    public static final SoundEvent FLUSH = registerSoundEvent("record.flush");

    public static final SoundEvent DULLSTONE_BREAK = registerSoundEvent("block.dullstone.break");
    public static final SoundEvent DULLSTONE_STEP = registerSoundEvent("block.dullstone.step");
    public static final SoundEvent DULLSTONE_PLACE = registerSoundEvent("block.dullstone.place");
    public static final SoundEvent DULLSTONE_HIT = registerSoundEvent("block.dullstone.hit");
    public static final SoundEvent DULLSTONE_FALL = registerSoundEvent("block.dullstone.fall");

    //public static final BlockSetType DULLSTONE = BlockSetType.register(new BlockSetType("crimson", true, true, true, BlockSetType.ActivationRule.EVERYTHING, BlockSoundGroup.NETHER_WOOD, SoundEvents.BLOCK_NETHER_WOOD_DOOR_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_DOOR_OPEN, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_CLOSE, SoundEvents.BLOCK_NETHER_WOOD_TRAPDOOR_OPEN, SoundEvents.BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_OFF, SoundEvents.BLOCK_NETHER_WOOD_PRESSURE_PLATE_CLICK_ON, SoundEvents.BLOCK_NETHER_WOOD_BUTTON_CLICK_OFF, SoundEvents.BLOCK_NETHER_WOOD_BUTTON_CLICK_ON));



    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(InfernalExpansion.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    //private static BlockSetType registerBlockSetType()

    public static void registerSounds() {
        InfernalExpansion.LOGGER.info("Registering sounds for " + InfernalExpansion.MOD_ID + ".");
    };


}
