package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.util.BlockUtil;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.VoxelShape;

public class HangingRod extends BlockUtil {

    public static final VoxelShape FLOOR_NORTH_SOUTH_SHAPE = Block.box(5, 0, 5, 11, 8, 11);
    public static final VoxelShape FLOOR_EAST_WEST_SHAPE = Block.box(5, 0, 5, 11, 8, 11);
    public static final VoxelShape WALL_SOUTH_SHAPE = Block.box(5, 5, 0, 11, 11, 8);
    public static final VoxelShape WALL_NORTH_SHAPE = Block.box(5, 5, 8, 11, 11, 16);
    public static final VoxelShape WALL_WEST_SHAPE = Block.box(8, 5, 5, 16, 11, 11);
    public static final VoxelShape WALL_EAST_SHAPE = Block.box(0, 5, 5, 8, 11, 11);
    public static final VoxelShape CEILING_NORTH_SOUTH_SHAPE = Block.box(5, 8, 5, 11, 16, 11);
    public static final VoxelShape CEILING_EAST_WEST_SHAPE = Block.box(5, 8, 5, 11, 16, 11);

    public HangingRod(Properties properties) {
        super(properties);
    }

    @Override
    protected VoxelShape getVoxelShape(BlockState state) {
        Direction direction = state.getValue(FACING);
        return switch (state.getValue(FACE)) {
            case FLOOR -> (direction == Direction.NORTH || direction == Direction.SOUTH)
                    ? FLOOR_NORTH_SOUTH_SHAPE : FLOOR_EAST_WEST_SHAPE;
            case WALL -> switch (direction) {
                case SOUTH -> WALL_SOUTH_SHAPE;
                case EAST -> WALL_EAST_SHAPE;
                case WEST -> WALL_WEST_SHAPE;
                default -> WALL_NORTH_SHAPE;
            };
            case CEILING -> (direction == Direction.NORTH || direction == Direction.SOUTH)
                    ? CEILING_NORTH_SOUTH_SHAPE : CEILING_EAST_WEST_SHAPE;
        };
    }

    // Override the block name prefix for dyeing functionality
    @Override
    protected String getBlockNamePrefix() {
        return "centre_full_panel";
    }
}