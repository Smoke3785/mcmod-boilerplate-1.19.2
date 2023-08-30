package com.iliad.smokeshulkersexpanded.utils;




import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntity;

public class SmokeBlock extends Block {
    public SmokeBlock(Block.Properties properties) {
        super(properties);
    }

    public static SmokeBlockEntity getAttachedEntity(Level world, BlockPos pos) {
        BlockEntity entity = world.getBlockEntity(pos);
        return entity instanceof BlockEntity ? (SmokeBlockEntity) entity : null;
    }

    public static SmokeBlock getAttachedBlock(Level world, BlockPos pos) {
        return (SmokeBlock) world.getBlockState(pos).getBlock();
    }
}
