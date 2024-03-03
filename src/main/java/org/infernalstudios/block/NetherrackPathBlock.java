package org.infernalstudios.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.DirtPathBlock;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;

public class NetherrackPathBlock extends DirtPathBlock {
    public NetherrackPathBlock(Settings settings) {
        super(settings);
    }

    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        if (!this.getDefaultState().canPlaceAt(ctx.getWorld(), ctx.getBlockPos())) {
            return Block.pushEntitiesUpBeforeBlockChange(this.getDefaultState(), Blocks.NETHERRACK.getDefaultState(), ctx.getWorld(), ctx.getBlockPos());
        }
        return super.getPlacementState(ctx);
    }

    @Override
    public void scheduledTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        world.setBlockState(pos, Blocks.NETHERRACK.getDefaultState());
    }
}
