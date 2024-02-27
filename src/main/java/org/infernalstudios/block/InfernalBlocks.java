package org.infernalstudios.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.block.enums.Instrument;
import net.minecraft.block.piston.PistonBehavior;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import org.infernalstudios.InfernalExpansion;

public class InfernalBlocks {
    public static final Block GLOWLIGHT_TORCH = registerBlock("glowlight_torch", new GlowTorchBlock(ParticleTypes.FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance((state) -> 14).sounds(BlockSoundGroup.WOOD).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WALL_GLOWLIGHT_TORCH = registerBlock("wall_glowlight_torch", new WallTorchBlock(ParticleTypes.FLAME, AbstractBlock.Settings.create().noCollision().breakInstantly().luminance((state) -> 14).sounds(BlockSoundGroup.WOOD).dropsLike(GLOWLIGHT_TORCH).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block GLOWLIGHT_LANTERN = registerBlockWithItem("glowlight_lantern", new LanternBlock(FabricBlockSettings.copy(Blocks.LANTERN)));

    public static final Block QUARTZ_GLASS = registerBlockWithItem("quartz_glass", new TransparentBlock(AbstractBlock.Settings.create().instrument(Instrument.HAT).strength(2.0f, 6.0f).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never)));
    public static final Block QUARTZ_GLASS_PANE = registerBlockWithItem("quartz_glass_pane", new PaneBlock(AbstractBlock.Settings.create().instrument(Instrument.HAT).strength(2.0f, 6.0f).sounds(BlockSoundGroup.GLASS).nonOpaque()));

    public static final Block GLOWLIGHT_GLASS = registerBlockWithItem("glowlight_glass", new TransparentBlock(AbstractBlock.Settings.create().instrument(Instrument.HAT).strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().allowsSpawning(Blocks::never).solidBlock(Blocks::never).suffocates(Blocks::never).blockVision(Blocks::never).luminance(value -> 10)));
    public static final Block GLOWLIGHT_GLASS_PANE = registerBlockWithItem("glowlight_glass_pane", new PaneBlock(AbstractBlock.Settings.create().instrument(Instrument.HAT).strength(0.3f).sounds(BlockSoundGroup.GLASS).nonOpaque().luminance(value -> 10)));

    public static final Block CRIMSON_NYLIUM_CARPET = registerBlockWithItem("crimson_nylium_carpet", new CarpetBlock(AbstractBlock.Settings.create().mapColor(MapColor.DULL_RED).strength(0.1f).sounds(BlockSoundGroup.NYLIUM).pistonBehavior(PistonBehavior.DESTROY)));
    public static final Block WARPED_NYLIUM_CARPET = registerBlockWithItem("warped_nylium_carpet", new CarpetBlock(AbstractBlock.Settings.create().mapColor(MapColor.TEAL).strength(0.1f).sounds(BlockSoundGroup.NYLIUM).pistonBehavior(PistonBehavior.DESTROY)));

    public static final Block COBBLED_BASALT = registerBlockWithItem("cobbled_basalt", new PillarBlock(AbstractBlock.Settings.copy(Blocks.GRAVEL).sounds(BlockSoundGroup.BASALT)));
    public static final Block COBBLED_BASALT_SLAB = registerBlockWithItem("cobbled_basalt_slab", new SlabBlock(AbstractBlock.Settings.copy(Blocks.GRAVEL).sounds(BlockSoundGroup.BASALT)));

    public static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(InfernalExpansion.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    private static Block registerBlock(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(InfernalExpansion.MOD_ID, name), block);
    }

    private static Block registerBlockWithItem(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(InfernalExpansion.MOD_ID, name), block);
    }

    public static void registerBlocks() {
        InfernalExpansion.LOGGER.info("Registering blocks for " + InfernalExpansion.MOD_ID + ".");
    }
}
