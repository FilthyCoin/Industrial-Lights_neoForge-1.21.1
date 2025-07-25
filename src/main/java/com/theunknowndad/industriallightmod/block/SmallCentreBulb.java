package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.util.BlockUtil;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SmallCentreBulb extends BlockUtil {


    public static final VoxelShape FLOOR_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(6, 1, 6, 10, 6, 10), Block.box(5, 0, 5, 11, 1, 11));
    public static final VoxelShape FLOOR_EAST_WEST_SHAPE = Shapes.or(Block.box(6, 1, 6, 10, 6, 10), Block.box(5, 0, 5, 11, 1, 11));
    public static final VoxelShape WALL_NORTH_SHAPE = Shapes.or(Block.box(6, 6, 10, 10, 10, 15), Block.box(5, 5, 15, 11, 11, 16));
    public static final VoxelShape WALL_SOUTH_SHAPE = Shapes.or(Block.box(6, 6, 1, 10, 10, 6), Block.box(5, 5, 0, 11, 11, 1));
    public static final VoxelShape WALL_WEST_SHAPE = Shapes.or(Block.box(10, 6, 6, 15, 10, 10), Block.box(15, 5, 5, 16, 11, 11));
    public static final VoxelShape WALL_EAST_SHAPE = Shapes.or(Block.box(1, 6, 6, 6, 10, 10), Block.box(0, 5, 5, 1, 11, 11));
    public static final VoxelShape CEILING_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(6, 10, 6, 10, 15, 10), Block.box(5, 15, 5, 11, 16, 11));
    public static final VoxelShape CEILING_EAST_WEST_SHAPE = Shapes.or(Block.box(6, 10, 6, 10, 15, 10), Block.box(5, 15, 5, 11, 16, 11));

    public SmallCentreBulb(Properties properties) {
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
        return "small_centre_bulb";
    }
}