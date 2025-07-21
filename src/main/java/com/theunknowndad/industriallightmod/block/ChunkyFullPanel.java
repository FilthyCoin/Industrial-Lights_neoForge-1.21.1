package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.util.BlockUtil;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class ChunkyFullPanel extends BlockUtil {

    public static final VoxelShape FLOOR_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(0, 0, 0, 2, 4, 16),
            Block.box(14, 0, 0, 16, 4, 16),
            Block.box(2, 0, 14, 14, 4, 16),
            Block.box(2, 0, 0, 14, 4, 2),
            Block.box(2, 0, 2, 14, 3, 14));
    public static final VoxelShape FLOOR_EAST_WEST_SHAPE = Shapes.or(Block.box(0, 0, 0, 2, 4, 16),
            Block.box(14, 0, 0, 16, 4, 16),
            Block.box(2, 0, 14, 14, 4, 16),
            Block.box(2, 0, 0, 14, 4, 2),
            Block.box(2, 0, 2, 14, 3, 14));
    public static final VoxelShape WALL_SOUTH_SHAPE = Shapes.or(Block.box(0, 0, 0, 16, 2, 4),
            Block.box(0, 14, 0, 16, 16, 4),
            Block.box(14, 2, 0, 16, 14, 4),
            Block.box(0, 2, 0, 2, 14, 4),
            Block.box(2, 2, 0, 14, 14, 3));
    public static final VoxelShape WALL_NORTH_SHAPE = Shapes.or(Block.box(0, 0, 12, 2, 16, 16),
            Block.box(14, 0, 12, 16, 16, 16),
            Block.box(2, 14, 12, 14, 16, 16),
            Block.box(2, 0, 12, 14, 2, 16),
            Block.box(2, 2, 13, 14, 14, 16));
    public static final VoxelShape WALL_WEST_SHAPE = Shapes.or(Block.box(12, 0, 0, 16, 2, 16),
            Block.box(12, 14, 0, 16, 16, 16),
            Block.box(12, 2, 14, 16, 14, 16),
            Block.box(12, 2, 0, 16, 14, 2),
            Block.box(13, 2, 2, 16, 14, 14));
    public static final VoxelShape WALL_EAST_SHAPE = Shapes.or(Block.box(0, 0, 0, 4, 2, 16),
            Block.box(0, 14, 0, 4, 16, 16),
            Block.box(0, 2, 0, 4, 14, 2),
            Block.box(0, 2, 14, 4, 14, 16),
            Block.box(0, 2, 2, 3, 14, 14));
    public static final VoxelShape CEILING_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(0, 12, 0, 2, 16, 16),
            Block.box(14, 12, 0, 16, 16, 16),
            Block.box(2, 12, 0, 14, 16, 2),
            Block.box(2, 12, 14, 14, 16, 16),
            Block.box(2, 13, 2, 14, 16, 14));
    public static final VoxelShape CEILING_EAST_WEST_SHAPE = Shapes.or(Block.box(0, 12, 0, 2, 16, 16),
            Block.box(14, 12, 0, 16, 16, 16),
            Block.box(2, 12, 0, 14, 16, 2),
            Block.box(2, 12, 14, 14, 16, 16),
            Block.box(2, 13, 2, 14, 16, 14));

    public ChunkyFullPanel(Properties properties) {
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
        return "chunky_full_panel";
    }
}

