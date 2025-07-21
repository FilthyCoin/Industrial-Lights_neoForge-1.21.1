package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.util.BlockUtil;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BlockSheet extends BlockUtil {


    public static final VoxelShape FLOOR_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(0, 13.5, 0, 16, 15.5, 16),
            Block.box(0, 10.25, 0, 16, 12.25, 16),
            Block.box(0, 7, 0, 16, 9, 16),
            Block.box(0, 3.75, 0, 16, 5.75, 16),
            Block.box(0, 0.5, 0, 16, 2.5, 16));
    public static final VoxelShape FLOOR_EAST_WEST_SHAPE = Shapes.or(Block.box(0, 13.5, 0, 16, 15.5, 16),
            Block.box(0, 10.25, 0, 16, 12.25, 16),
            Block.box(0, 7, 0, 16, 9, 16),
            Block.box(0, 3.75, 0, 16, 5.75, 16),
            Block.box(0, 0.5, 0, 16, 2.5, 16));
    public static final VoxelShape WALL_NORTH_SHAPE = Shapes.or(Block.box(13.5, 0, 0, 15.5, 16, 16),
            Block.box(10.25, 0, 0, 12.25, 16, 16),
            Block.box(0.5, 0, 0, 2.5, 16, 16),
            Block.box(3.75, 0, 0, 5.75, 16, 16),
            Block.box(7, 0, 0, 9, 16, 16));
    public static final VoxelShape WALL_SOUTH_SHAPE = Shapes.or(Block.box(13.5, 0, 0, 15.5, 16, 16),
            Block.box(10.25, 0, 0, 12.25, 16, 16),
            Block.box(0.5, 0, 0, 2.5, 16, 16),
            Block.box(3.75, 0, 0, 5.75, 16, 16),
            Block.box(7, 0, 0, 9, 16, 16));
    public static final VoxelShape WALL_EAST_SHAPE = Shapes.or(Block.box(0, 0, 13.5, 16, 16, 15.5),
            Block.box(0, 0, 10.25, 16, 16, 12.25),
            Block.box(0, 0, 0.5, 16, 16, 2.5),
            Block.box(0, 0, 3.75, 16, 16, 5.75),
            Block.box(0, 0, 7, 16, 16, 9));
    public static final VoxelShape WALL_WEST_SHAPE = Shapes.or(Block.box(0, 0, 13.5, 16, 16, 15.5),
            Block.box(0, 0, 10.25, 16, 16, 12.25),
            Block.box(0, 0, 0.5, 16, 16, 2.5),
            Block.box(0, 0, 3.75, 16, 16, 5.75),
            Block.box(0, 0, 7, 16, 16, 9));
    public static final VoxelShape CEILING_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(0, 13.5, 0, 16, 15.5, 16),
            Block.box(0, 10.25, 0, 16, 12.25, 16),
            Block.box(0, 7, 0, 16, 9, 16),
            Block.box(0, 3.75, 0, 16, 5.75, 16),
            Block.box(0, 0.5, 0, 16, 2.5, 16));
    public static final VoxelShape CEILING_EAST_WEST_SHAPE = Shapes.or(Block.box(0, 13.5, 0, 16, 15.5, 16),
            Block.box(0, 10.25, 0, 16, 12.25, 16),
            Block.box(0, 7, 0, 16, 9, 16),
            Block.box(0, 3.75, 0, 16, 5.75, 16),
            Block.box(0, 0.5, 0, 16, 2.5, 16));

    public BlockSheet(Properties properties) {
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
        return "block_sheet";
    }
}
