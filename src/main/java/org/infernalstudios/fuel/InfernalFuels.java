package org.infernalstudios.fuel;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import org.infernalstudios.InfernalExpansion;
import org.infernalstudios.item.InfernalItems;

public class InfernalFuels {

    public static void registerFuels() {
        FuelRegistry.INSTANCE.add(InfernalItems.GLOWCOKE, 1600);
        InfernalExpansion.LOGGER.info("Registering fuels for " + InfernalExpansion.MOD_ID + ".");
    }
}
