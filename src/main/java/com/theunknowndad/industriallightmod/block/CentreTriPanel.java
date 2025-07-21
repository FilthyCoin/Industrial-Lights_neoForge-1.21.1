package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.util.BlockUtil;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class CentreTriPanel extends BlockUtil {

    public static final VoxelShape FLOOR_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(13, 2, 3, 15, 5.5, 4),
            Block.box(2, 4, 2.5, 14, 6, 4.5),
            Block.box(2, 4, 11.5, 14, 6, 13.5),
            Block.box(2, 4, 7, 14, 6, 9),
            Block.box(0, 0, 0, 16, 2, 16),
            Block.box(1, 2, 7.5, 3, 5.5, 8.5),
            Block.box(13, 2, 7.5, 15, 5.5, 8.5),
            Block.box(1, 2, 12, 3, 5.5, 13),
            Block.box(13, 2, 12, 15, 5.5, 13),
            Block.box(1, 2, 3, 3, 5.5, 4));
    public static final VoxelShape FLOOR_EAST_WEST_SHAPE = Shapes.or(Block.box(12, 2, 13, 13, 5.5, 15),
            Block.box(11.5, 4, 2, 13.5, 6, 14),
            Block.box(2.5, 4, 2, 4.5, 6, 14),
            Block.box(7, 4, 2, 9, 6, 14),
            Block.box(0, 0, 0, 16, 2, 16),
            Block.box(7.5, 2, 1, 8.5, 5.5, 3),
            Block.box(7.5, 2, 13, 8.5, 5.5, 15),
            Block.box(3, 2, 1, 4, 5.5, 3),
            Block.box(3, 2, 13, 4, 5.5, 15),
            Block.box(12, 2, 1, 13, 5.5, 3));
    public static final VoxelShape WALL_SOUTH_SHAPE = Shapes.or(Block.box(1, 3, 2, 3, 4, 5.5),
            Block.box(2, 2.5, 4, 14, 4.5, 6),
            Block.box(2, 11.5, 4, 14, 13.5, 6),
            Block.box(2, 7, 4, 14, 9, 6),
            Block.box(0, 0, 0, 16, 16, 2),
            Block.box(13, 7.5, 2, 15, 8.5, 5.5),
            Block.box(1, 7.5, 2, 3, 8.5, 5.5),
            Block.box(13, 12, 2, 15, 13, 5.5),
            Block.box(1, 12, 2, 3, 13, 5.5),
            Block.box(13, 3, 2, 15, 4, 5.5));
    public static final VoxelShape WALL_NORTH_SHAPE = Shapes.or(Block.box(13, 3, 10.5, 15, 4, 14),
            Block.box(2, 2.5, 10, 14, 4.5, 12),
            Block.box(2, 11.5, 10, 14, 13.5, 12),
            Block.box(2, 7, 10, 14, 9, 12),
            Block.box(0, 0, 14, 16, 16, 16),
            Block.box(1, 7.5, 10.5, 3, 8.5, 14),
            Block.box(13, 7.5, 10.5, 15, 8.5, 14),
            Block.box(1, 12, 10.5, 3, 13, 14),
            Block.box(13, 12, 10.5, 15, 13, 14),
            Block.box(1, 3, 10.5, 3, 4, 14));
    public static final VoxelShape WALL_WEST_SHAPE = Shapes.or(Block.box(10.5, 3, 1, 14, 4, 3),
            Block.box(10, 2.5, 2, 12, 4.5, 14),
            Block.box(10, 11.5, 2, 12, 13.5, 14),
            Block.box(10, 7, 2, 12, 9, 14),
            Block.box(14, 0, 0, 16, 16, 16),
            Block.box(10.5, 7.5, 13, 14, 8.5, 15),
            Block.box(10.5, 7.5, 1, 14, 8.5, 3),
            Block.box(10.5, 12, 13, 14, 13, 15),
            Block.box(10.5, 12, 1, 14, 13, 3),
            Block.box(10.5, 3, 13, 14, 4, 15));
    public static final VoxelShape WALL_EAST_SHAPE = Shapes.or(Block.box(2, 3, 13, 5.5, 4, 15),
            Block.box(4, 2.5, 2, 6, 4.5, 14),
            Block.box(4, 11.5, 2, 6, 13.5, 14),
            Block.box(4, 7, 2, 6, 9, 14),
            Block.box(0, 0, 0, 2, 16, 16),
            Block.box(2, 7.5, 1, 5.5, 8.5, 3),
            Block.box(2, 7.5, 13, 5.5, 8.5, 15),
            Block.box(2, 12, 1, 5.5, 13, 3),
            Block.box(2, 12, 13, 5.5, 13, 15),
            Block.box(2, 3, 1, 5.5, 4, 3));
    public static final VoxelShape CEILING_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(1, 10.5, 3, 3, 14, 4),
            Block.box(2, 10, 2.5, 14, 12, 4.5),
            Block.box(2, 10, 11.5, 14, 12, 13.5),
            Block.box(2, 10, 7, 14, 12, 9),
            Block.box(0, 14, 0, 16, 16, 16),
            Block.box(13, 10.5, 7.5, 15, 14, 8.5),
            Block.box(1, 10.5, 7.5, 3, 14, 8.5),
            Block.box(13, 10.5, 12, 15, 14, 13),
            Block.box(1, 10.5, 12, 3, 14, 13),
            Block.box(13, 10.5, 3, 15, 14, 4));
    public static final VoxelShape CEILING_EAST_WEST_SHAPE = Shapes.or(Block.box(12, 10.5, 1, 13, 14, 3),
            Block.box(11.5, 10, 2, 13.5, 12, 14),
            Block.box(2.5, 10, 2, 4.5, 12, 14),
            Block.box(7, 10, 2, 9, 12, 14),
            Block.box(0, 14, 0, 16, 16, 16),
            Block.box(7.5, 10.5, 13, 8.5, 14, 15),
            Block.box(7.5, 10.5, 1, 8.5, 14, 3),
            Block.box(3, 10.5, 13, 4, 14, 15),
            Block.box(3, 10.5, 1, 4, 14, 3),
            Block.box(12, 10.5, 13, 13, 14, 15));

    public CentreTriPanel(Properties properties) {
        super(properties.noOcclusion());
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
        return "centre_tri_panel";
    }
}