package com.iliad.smokeshulkersexpanded.utils;

// Forge

// Minecraft
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.entity.BlockEntityType;

// Java

public class SmokeBlockEntity extends BlockEntity {
    public SmokeBlockEntity(BlockEntityType<?> blockEntityType, BlockPos pos, BlockState state) {
        super(blockEntityType, pos, state);
    }

    public static SmokeBlock getAttachedBlock(Level level, BlockPos position) {
        return (SmokeBlock) level.getBlockState(position).getBlock();
    }

    public static SmokeBlockEntity getAttachedEntity(Level level, BlockPos position) {
        BlockEntity entity = level.getBlockEntity(position);
        return entity instanceof BlockEntity ? (SmokeBlockEntity) entity : null;
    }
}
