package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.util.BlockUtil;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ChainedRod extends BlockUtil {

    public static final VoxelShape FLOOR_EAST_WEST_SHAPE = Shapes.or(Block.box(6.5, 0, 8, 9.5, 11, 8),
            Block.box(8, 0, 6.5, 8, 11, 9.5),
            Block.box(7, 13, 0, 9, 15, 16),
            Block.box(6, 11, 0, 7, 16, 16),
            Block.box(9, 11, 0, 10, 16, 16),
            Block.box(7, 11, 0, 9, 13, 16));
    public static final VoxelShape FLOOR_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(8, 0, 6.5, 8, 11, 9.5),
            Block.box(6.5, 0, 8, 9.5, 11, 8),
            Block.box(0, 13, 7, 16, 15, 9),
            Block.box(0, 11, 9, 16, 16, 10),
            Block.box(0, 11, 6, 16, 16, 7),
            Block.box(0, 11, 7, 16, 13, 9));
    public static final VoxelShape WALL_NORTH_SHAPE = Shapes.or(Block.box(8, 6.5, 5, 8, 9.5, 16),
            Block.box(6.5, 8, 5, 9.5, 8, 16),
            Block.box(0, 7, 1, 16, 9, 3),
            Block.box(0, 9, 0, 16, 10, 5),
            Block.box(0, 6, 0, 16, 7, 5),
            Block.box(0, 7, 3, 16, 9, 5));
    public static final VoxelShape WALL_SOUTH_SHAPE = Shapes.or(Block.box(8, 6.5, 0, 8, 9.5, 11),
            Block.box(6.5, 8, 0, 9.5, 8, 11),
            Block.box(0, 7, 13, 16, 9, 15),
            Block.box(0, 9, 11, 16, 10, 16),
            Block.box(0, 6, 11, 16, 7, 16),
            Block.box(0, 7, 11, 16, 9, 13));
    public static final VoxelShape WALL_EAST_SHAPE = Shapes.or(Block.box(0, 6.5, 8, 11, 9.5, 8),
            Block.box(0, 8, 6.5, 11, 8, 9.5),
            Block.box(13, 7, 0, 15, 9, 16),
            Block.box(11, 9, 0, 16, 10, 16),
            Block.box(11, 6, 0, 16, 7, 16),
            Block.box(11, 7, 0, 13, 9, 16));
    public static final VoxelShape WALL_WEST_SHAPE = Shapes.or(Block.box(5, 6.5, 8, 16, 9.5, 8),
            Block.box(5, 8, 6.5, 16, 8, 9.5),
            Block.box(1, 7, 0, 3, 9, 16),
            Block.box(0, 9, 0, 5, 10, 16),
            Block.box(0, 6, 0, 5, 7, 16),
            Block.box(3, 7, 0, 5, 9, 16));
    public static final VoxelShape CEILING_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(8, 5, 6.5, 8, 16, 9.5),
            Block.box(6.5, 5, 8, 9.5, 16, 8),
            Block.box(0, 1, 7, 16, 3, 9),
            Block.box(0, 0, 6, 16, 5, 7),
            Block.box(0, 0, 9, 16, 5, 10),
            Block.box(0, 3, 7, 16, 5, 9));
    public static final VoxelShape CEILING_EAST_WEST_SHAPE = Shapes.or(Block.box(6.5, 5, 8, 9.5, 16, 8),
            Block.box(8, 5, 6.5, 8, 16, 9.5),
            Block.box(7, 1, 0, 9, 3, 16),
            Block.box(9, 0, 0, 10, 5, 16),
            Block.box(6, 0, 0, 7, 5, 16),
            Block.box(7, 3, 0, 9, 5, 16));

    public ChainedRod(Properties properties) {
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
        return "chained_rod";
    }
}