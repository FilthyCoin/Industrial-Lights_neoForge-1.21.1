package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.util.BlockUtil;
import net.minecraft.core.Direction;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class BannerSign extends BlockUtil {

    public static final VoxelShape FLOOR_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(0, 4, 6, 16, 16, 10),
            Block.box(2.5, 1, 7, 4.5, 3, 9),
            Block.box(2.5, 0, 5, 4.5, 1, 11),
            Block.box(11.5, 1, 7, 13.5, 3, 9),
            Block.box(11.5, 0, 5, 13.5, 1, 11),
            Block.box(-1, 4, 7, 17, 16, 9),
            Block.box(0, 3, 7, 16, 17, 9));
    public static final VoxelShape FLOOR_EAST_WEST_SHAPE = Shapes.or(Block.box(6, 4, 0, 10, 16, 16),
            Block.box(7, 1, 2.5, 9, 3, 4.5),
            Block.box(5, 0, 2.5, 11, 1, 4.5),
            Block.box(7, 1, 11.5, 9, 3, 13.5),
            Block.box(5, 0, 11.5, 11, 1, 13.5),
            Block.box(7, 4, -1, 9, 16, 17),
            Block.box(7, 3, 0, 9, 17, 16));
    public static final VoxelShape WALL_NORTH_SHAPE = Shapes.or(Block.box(6, 0, 0, 10, 16, 12),
            Block.box(7, 11.5, 13, 9, 13.5, 15),
            Block.box(5, 11.5, 15, 11, 13.5, 16),
            Block.box(7, 2.5, 13, 9, 4.5, 15),
            Block.box(5, 2.5, 15, 11, 4.5, 16),
            Block.box(7, -1, 0, 9, 17, 12),
            Block.box(7, 0, -1, 9, 16, 13));
    public static final VoxelShape WALL_SOUTH_SHAPE = Shapes.or(Block.box(6, 0, 4, 10, 16, 16),
            Block.box(7, 11.5, 1, 9, 13.5, 3),
            Block.box(5, 11.5, 0, 11, 13.5, 1),
            Block.box(7, 2.5, 1, 9, 4.5, 3),
            Block.box(5, 2.5, 0, 11, 4.5, 1),
            Block.box(7, -1, 4, 9, 17, 16),
            Block.box(7, 0, 3, 9, 16, 17));
    public static final VoxelShape WALL_EAST_SHAPE = Shapes.or(Block.box(4, 0, 6, 16, 16, 10),
            Block.box(1, 11.5, 7, 3, 13.5, 9),
            Block.box(0, 11.5, 5, 1, 13.5, 11),
            Block.box(1, 2.5, 7, 3, 4.5, 9),
            Block.box(0, 2.5, 5, 1, 4.5, 11),
            Block.box(4, -1, 7, 16, 17, 9),
            Block.box(3, 0, 7, 17, 16, 9));
    public static final VoxelShape WALL_WEST_SHAPE = Shapes.or(Block.box(0, 0, 6, 12, 16, 10),
            Block.box(13, 11.5, 7, 15, 13.5, 9),
            Block.box(15, 11.5, 5, 16, 13.5, 11),
            Block.box(13, 2.5, 7, 15, 4.5, 9),
            Block.box(15, 2.5, 5, 16, 4.5, 11),
            Block.box(0, -1, 7, 12, 17, 9),
            Block.box(-1, 0, 7, 13, 16, 9));
    public static final VoxelShape CEILING_NORTH_SOUTH_SHAPE = Shapes.or(Block.box(0, 0, 6, 16, 12, 10),
            Block.box(11.5, 13, 7, 13.5, 15, 9),
            Block.box(11.5, 15, 5, 13.5, 16, 11),
            Block.box(2.5, 13, 7, 4.5, 15, 9),
            Block.box(2.5, 15, 5, 4.5, 16, 11),
            Block.box(-1, 0, 7, 17, 12, 9),
            Block.box(0, -1, 7, 16, 13, 9));
    public static final VoxelShape CEILING_EAST_WEST_SHAPE = Shapes.or(Block.box(6, 0, 0, 10, 12, 16),
            Block.box(7, 13, 2.5, 9, 15, 4.5),
            Block.box(5, 15, 2.5, 11, 16, 4.5),
            Block.box(7, 13, 11.5, 9, 15, 13.5),
            Block.box(5, 15, 11.5, 11, 16, 13.5),
            Block.box(7, 0, -1, 9, 12, 17),
            Block.box(7, -1, 0, 9, 13, 16));

    public BannerSign(Properties properties) {
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
        return "banner_sign";
    }
}
