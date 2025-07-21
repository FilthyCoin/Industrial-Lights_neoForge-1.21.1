package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.util.BlockUtil;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class FullPanel extends BlockUtil {

    public static final VoxelShape FLOOR_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(0, 6, 0, 16, 10, 16));
    public static final VoxelShape FLOOR_EAST_WEST_SHAPE = Shapes.or(Block.box(0, 6, 0, 16, 10, 16));
    public static final VoxelShape WALL_SOUTH_SHAPE = Shapes.or(Block.box(0, 0, 6, 16, 16, 10));
    public static final VoxelShape WALL_NORTH_SHAPE = Shapes.or(Block.box(0, 0, 6, 16, 16, 10));
    public static final VoxelShape WALL_WEST_SHAPE = Shapes.or(Block.box(6, 0, 0, 10, 16, 16));
    public static final VoxelShape WALL_EAST_SHAPE = Shapes.or(Block.box(6, 0, 0, 10, 16, 16));
    public static final VoxelShape CEILING_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(0, 6, 0, 16, 10, 16));
    public static final VoxelShape CEILING_EAST_WEST_SHAPE = Shapes.or(Block.box(0, 6, 0, 16, 10, 16));

    public FullPanel(Properties properties) {
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
        return "full_panel";
    }
}