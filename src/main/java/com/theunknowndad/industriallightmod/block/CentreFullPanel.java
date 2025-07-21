package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.util.BlockUtil;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CentreFullPanel extends BlockUtil {

    // Only define the unique VoxelShapes for this block
    private static final VoxelShape FLOOR_NORTH_SOUTH_SHAPE = Shapes.or(
            Block.box(0, 2, 0, 16, 4, 16),
            Block.box(2, 0, 2, 14, 1, 14),
            Block.box(5, 1, 5, 11, 2, 11));

    private static final VoxelShape FLOOR_EAST_WEST_SHAPE = Shapes.or(
            Block.box(0, 2, 0, 16, 4, 16),
            Block.box(2, 0, 2, 14, 1, 14),
            Block.box(5, 1, 5, 11, 2, 11));

    private static final VoxelShape WALL_SOUTH_SHAPE = Shapes.or(
            Block.box(0, 0, 2, 16, 16, 4),
            Block.box(2, 2, 0, 14, 14, 1),
            Block.box(5, 5, 1, 11, 11, 2));

    private static final VoxelShape WALL_NORTH_SHAPE = Shapes.or(
            Block.box(0, 0, 12, 16, 16, 14),
            Block.box(2, 2, 15, 14, 14, 16),
            Block.box(5, 5, 14, 11, 11, 15));

    private static final VoxelShape WALL_WEST_SHAPE = Shapes.or(
            Block.box(12, 0, 0, 14, 16, 16),
            Block.box(15, 2, 2, 16, 14, 14),
            Block.box(14, 5, 5, 15, 11, 11));

    private static final VoxelShape WALL_EAST_SHAPE = Shapes.or(
            Block.box(2, 0, 0, 4, 16, 16),
            Block.box(0, 2, 2, 1, 14, 14),
            Block.box(1, 5, 5, 2, 11, 11));

    private static final VoxelShape CEILING_NORTH_SOUTH_SHAPE = Shapes.or(
            Block.box(0, 12, 0, 16, 14, 16),
            Block.box(2, 15, 2, 14, 16, 14),
            Block.box(5, 14, 5, 11, 15, 11));

    private static final VoxelShape CEILING_EAST_WEST_SHAPE = Shapes.or(
            Block.box(0, 12, 0, 16, 14, 16),
            Block.box(2, 15, 2, 14, 16, 14),
            Block.box(5, 14, 5, 11, 15, 11));

    public CentreFullPanel(Properties properties) {
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