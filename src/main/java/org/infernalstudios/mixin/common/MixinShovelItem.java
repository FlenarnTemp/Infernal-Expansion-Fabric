package org.infernalstudios.mixin.common;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.NyliumBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ShovelItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import static org.infernalstudios.block.InfernalBlocks.*;

@Mixin(ShovelItem.class)
public class MixinShovelItem {
    @Inject(at = @At("HEAD"), method = "useOnBlock")
    private void InfernalOnItemUse(ItemUsageContext context, CallbackInfoReturnable<ActionResult> cir) {
        World world = context.getWorld();
        BlockPos blockPos = context.getBlockPos();
        BlockState blockState = world.getBlockState(blockPos);
        if (context.getSide() != Direction.DOWN) {
            PlayerEntity playerEntity = context.getPlayer();
            BlockState secondaryState;

            if ((blockState.getBlock() instanceof NyliumBlock || blockState.getBlock() == Blocks.SOUL_SOIL) && world.getBlockState(blockPos.up()).isAir()) {
                if (blockState.getBlock() == Blocks.CRIMSON_NYLIUM) {
                    secondaryState = CRIMSON_NYLIUM_PATH.getDefaultState();
                } else if (blockState.getBlock() == Blocks.WARPED_NYLIUM) {
                    secondaryState = WARPED_NYLIUM_PATH.getDefaultState();
                } else {
                    secondaryState = SOUL_SOIL_PATH.getDefaultState();
                }

                world.playSound(playerEntity, blockPos, SoundEvents.ITEM_SHOVEL_FLATTEN, SoundCategory.BLOCKS, 1.0f, 1.0f);
                world.setBlockState(blockPos, secondaryState);
                if (playerEntity != null) {
                    context.getStack().damage(1, playerEntity, p -> p.sendToolBreakStatus(context.getHand()));
                }
            }
        }
    }
}
