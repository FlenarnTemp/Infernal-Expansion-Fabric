package org.infernalstudios.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.VerticallyAttachableBlockItem;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.math.Direction;
import org.infernalstudios.InfernalExpansion;
import org.infernalstudios.block.InfernalBlocks;
import org.infernalstudios.sound.InfernalSounds;

public class InfernalItems {

    public static final Item GLOWLIGHT_TORCH_ITEM = registerItem("glowlight_torch_item", new VerticallyAttachableBlockItem(InfernalBlocks.GLOWLIGHT_TORCH, InfernalBlocks.WALL_GLOWLIGHT_TORCH, new Item.Settings(), Direction.DOWN));

    public static final Item DULLROCKS = registerItem("dullrocks", new Item(new FabricItemSettings()));
    public static final Item MOTH_DUST = registerItem("moth_dust", new Item(new FabricItemSettings()));
    public static final Item GLOWSILK = registerItem("glowsilk", new Item(new FabricItemSettings()));
    public static final Item SOUL_SALT_CLUMP = registerItem("soul_salt_clump", new Item(new FabricItemSettings()));

    public static final Item BLINDSIGHT_TONGUE = registerItem("blindsight_tongue", new Item(new FabricItemSettings().food(InfernalFoodComponents.BLINDSIGHT_TONGUE)));
    public static final Item BLINDSIGHT_TONGUE_STEW = registerItem("blindsight_tongue_stew", new Item(new FabricItemSettings().food(InfernalFoodComponents.BLINDSIGHT_TONGUE_STEW)));
    public static final Item CURED_JERKY = registerItem("cured_jerky", new Item(new FabricItemSettings().food(InfernalFoodComponents.CURED_JERKY)));
    public static final Item SPIRIT_EYE = registerItem("spirit_eye", new Item(new FabricItemSettings().food(InfernalFoodComponents.SPIRIT_EYE)));
    public static final Item RAW_HOGCHOP = registerItem("raw_hogchop", new Item(new FabricItemSettings().food(InfernalFoodComponents.RAW_HOGCHOP)));
    public static final Item COOKED_HOGCHOP = registerItem("cooked_hogchop", new Item(new FabricItemSettings().food(InfernalFoodComponents.COOKED_HOGCHOP)));

    public static final Item MUSIC_DISC_SOUL_SPUNK = registerItem("music_disc_soul_spunk", new MusicDiscItem(8, InfernalSounds.SOUL_SPUNK, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 233));
    public static final Item MUSIC_DISC_FLUSH = registerItem("music_disc_flush", new MusicDiscItem(7, InfernalSounds.FLUSH, new FabricItemSettings().maxCount(1).rarity(Rarity.RARE), 261));

    public static final Item TAB_ITEM = registerItem("tab_icon", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(InfernalExpansion.MOD_ID, name), item);
    }

    public static void registerItems() {
        InfernalExpansion.LOGGER.info("Registering items for " + InfernalExpansion.MOD_ID + ".");
    }
}
