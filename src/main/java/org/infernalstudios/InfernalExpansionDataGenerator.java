package org.infernalstudios;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import org.infernalstudios.datagen.*;

public class InfernalExpansionDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(InfernalItemTagProvider::new);
		pack.addProvider(InfernalBlockTagProvider::new);
		pack.addProvider(InfernalModelProvider::new);
		pack.addProvider(InfernalLootTableProvider::new);
		pack.addProvider(InfernalRecipeProvider::new);
	}
}
