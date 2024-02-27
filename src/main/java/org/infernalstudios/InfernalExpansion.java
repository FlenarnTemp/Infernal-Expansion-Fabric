package org.infernalstudios;

import net.fabricmc.api.ModInitializer;

import org.infernalstudios.block.InfernalBlocks;
import org.infernalstudios.client.particle.InfernalParticles;
import org.infernalstudios.effect.InfernalEffects;
import org.infernalstudios.fuel.InfernalFuels;
import org.infernalstudios.item.InfernalItemGroups;
import org.infernalstudios.item.InfernalItems;
import org.infernalstudios.sound.InfernalSounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class InfernalExpansion implements ModInitializer {

	public static final String MOD_ID = "infernal_expansion";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		InfernalItemGroups.registerItemGroups();
		InfernalSounds.registerSounds();
		InfernalItems.registerItems();
		InfernalBlocks.registerBlocks();
		InfernalFuels.registerFuels();
		InfernalEffects.registerEffects();
		InfernalParticles.registerParticles();
	}
}