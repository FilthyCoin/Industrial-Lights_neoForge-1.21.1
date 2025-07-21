package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.util.BlockUtil;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FlatCentreLightBulb extends BlockUtil {


    public static final VoxelShape FLOOR_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(4, 1, 4, 12, 2, 12), Block.box(3, 0, 3, 13, 1, 13));
    public static final VoxelShape FLOOR_EAST_WEST_SHAPE = Shapes.or(Block.box(4, 1, 4, 12, 2, 12), Block.box(3, 0, 3, 13, 1, 13));
    public static final VoxelShape WALL_SOUTH_SHAPE = Shapes.or(Block.box(4, 4, 1, 12, 12, 2), Block.box(3, 3, 0, 13, 13, 1));
    public static final VoxelShape WALL_NORTH_SHAPE = Shapes.or(Block.box(4, 4, 14, 12, 12, 15), Block.box(3, 3, 15, 13, 13, 16));
    public static final VoxelShape WALL_WEST_SHAPE = Shapes.or(Block.box(14, 4, 4, 15, 12, 12), Block.box(15, 3, 3, 16, 13, 13));
    public static final VoxelShape WALL_EAST_SHAPE = Shapes.or(Block.box(1, 4, 4, 2, 12, 12), Block.box(0, 3, 3, 1, 13, 13));
    public static final VoxelShape CEILING_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(4, 15, 4, 12, 16, 12), Block.box(3, 14, 3, 13, 15, 13));
    public static final VoxelShape CEILING_EAST_WEST_SHAPE = Shapes.or(Block.box(4, 15, 4, 12, 16, 12), Block.box(3, 14, 3, 13, 15, 13));

    public FlatCentreLightBulb(Properties properties) {
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
        return "flat_centre_light_bulb";
    }
}