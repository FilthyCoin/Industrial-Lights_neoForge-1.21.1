package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.util.BlockUtil;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class VerticalBeam extends BlockUtil {

    public static final VoxelShape FLOOR_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(4.5, 0, 0, 11.5, 5, 16),
            Block.box(5, 5, 0, 11, 5.25, 16),
            Block.box(4.25, 0.5, 0, 4.5, 4.5, 16),
            Block.box(11.5, 0.5, 0, 11.75, 4.5, 16));
    public static final VoxelShape FLOOR_EAST_WEST_SHAPE = Shapes.or(Block.box(0, 0, 4.5, 16, 5, 11.5),
            Block.box(0, 5, 5, 16, 5.25, 11),
            Block.box(0, 0.5, 4.25, 16, 4.5, 4.5),
            Block.box(0, 0.5, 11.5, 16, 4.5, 11.75));
    public static final VoxelShape WALL_SOUTH_SHAPE = Shapes.or(Block.box(4.5, 0, 0, 11.5, 16, 5),
            Block.box(5, 0, 5, 11, 16, 5.25),
            Block.box(4.25, 0, 0.5, 4.5, 16, 4.5),
            Block.box(11.5, 0, 0.5, 11.75, 16, 4.5));
    public static final VoxelShape WALL_NORTH_SHAPE = Shapes.or(Block.box(4.5, 0, 11, 11.5, 16, 16),
            Block.box(5, 0, 10.75, 11, 16, 11),
            Block.box(11.5, 0, 11.5, 11.75, 16, 15.5),
            Block.box(4.25, 0, 11.5, 4.5, 16, 15.5));
    public static final VoxelShape WALL_WEST_SHAPE = Shapes.or(Block.box(11, 0, 4.5, 16, 16, 11.5),
            Block.box(10.75, 0, 5, 11, 16, 11),
            Block.box(11.5, 0, 4.25, 15.5, 16, 4.5),
            Block.box(11.5, 0, 11.5, 15.5, 16, 11.75));
    public static final VoxelShape WALL_EAST_SHAPE = Shapes.or(Block.box(0, 0, 4.5, 5, 16, 11.5),
            Block.box(5, 0, 5, 5.25, 16, 11),
            Block.box(0.5, 0, 11.5, 4.5, 16, 11.75),
            Block.box(0.5, 0, 4.25, 4.5, 16, 4.5));
    public static final VoxelShape CEILING_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(4.5, 11, 0, 11.5, 16, 16),
            Block.box(5, 10.75, 0, 11, 11, 16),
            Block.box(11.5, 11.5, 0, 11.75, 15.5, 16),
            Block.box(4.25, 11.5, 0, 4.5, 15.5, 16));
    public static final VoxelShape CEILING_EAST_WEST_SHAPE = Shapes.or(Block.box(0, 11, 4.5, 16, 16, 11.5),
            Block.box(0, 10.75, 5, 16, 11, 11),
            Block.box(0, 11.5, 11.5, 16, 15.5, 11.75),
            Block.box(0, 11.5, 4.25, 16, 15.5, 4.5));

    public VerticalBeam(Properties properties) {
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