package org.infernalstudios.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.infernalstudios.InfernalExpansion;

import static org.infernalstudios.block.InfernalBlocks.*;
import static org.infernalstudios.item.InfernalItems.*;

public class InfernalItemGroups {
    public static final ItemGroup INFERNAL_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(InfernalExpansion.MOD_ID, "infernal_expansion"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.InfernalTab"))
                    .icon(() -> new ItemStack(TAB_ITEM)).entries((displayContext, entries) -> {
                        entries.add(GLOWCOKE);
                        entries.add(DULLROCKS);
                        entries.add(MOTH_DUST);
                        entries.add(MOLTEN_GOLD_CLUSTER);
                        entries.add(GLOWSILK);
                        entries.add(SOUL_SALT_CLUMP);

                        entries.add(BLINDSIGHT_TONGUE);
                        entries.add(BLINDSIGHT_TONGUE_STEW);
                        entries.add(CURED_JERKY);
                        entries.add(SPIRIT_EYE);
                        entries.add(RAW_HOGCHOP);
                        entries.add(COOKED_HOGCHOP);

                        entries.add(GLOWLIGHT_TORCH_ITEM);
                        entries.add(MUSIC_DISC_FLUSH);
                        entries.add(MUSIC_DISC_SOUL_SPUNK);

                        entries.add(COBBLED_BASALT);
                        entries.add(COBBLED_BASALT_SLAB);

                        entries.add(GLOWLIGHT_LANTERN);
                        entries.add(CRIMSON_NYLIUM_CARPET);
                        entries.add(WARPED_NYLIUM_CARPET);
                        entries.add(QUARTZ_GLASS);
                        entries.add(QUARTZ_GLASS_PANE);
                        entries.add(GLOWLIGHT_GLASS);
                        entries.add(GLOWLIGHT_GLASS_PANE);
                    }).build());

    public static void registerItemGroups() {
        InfernalExpansion.LOGGER.info("Registering item groups for " + InfernalExpansion.MOD_ID + ".");
    }
}
