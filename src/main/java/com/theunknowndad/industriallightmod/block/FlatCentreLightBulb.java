package com.theunknowndad.industriallightmod.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class FlatCentreLightBulb extends IndustrialLight{
    public FlatCentreLightBulb(Properties properties) {
        super(properties);
    }


    public static final VoxelShape FLOOR_NORTH_SOUTH_GRINDSTONE = Shapes.or(Block.box(4, 1, 4, 12, 2, 12), Block.box(3, 0, 3, 13, 1, 13));
    public static final VoxelShape FLOOR_EAST_WEST_GRINDSTONE = Shapes.or(Block.box(4, 1, 4, 12, 2, 12), Block.box(3, 0, 3, 13, 1, 13));
    public static final VoxelShape WALL_SOUTH_GRINDSTONE = Shapes.or(Block.box(4, 4, 1, 12, 12, 2), Block.box(3, 3, 0, 13, 13, 1));
    public static final VoxelShape WALL_NORTH_GRINDSTONE = Shapes.or(Block.box(4, 4, 14, 12, 12, 15), Block.box(3, 3, 15, 13, 13, 16));
    public static final VoxelShape WALL_WEST_GRINDSTONE = Shapes.or(Block.box(14, 4, 4, 15, 12, 12), Block.box(15, 3, 3, 16, 13, 13));
    public static final VoxelShape WALL_EAST_GRINDSTONE = Shapes.or(Block.box(1, 4, 4, 2, 12, 12), Block.box(0, 3, 3, 1, 13, 13));
    public static final VoxelShape CEILING_NORTH_SOUTH_GRINDSTONE = Shapes.or(Block.box(4, 15, 4, 12, 16, 12), Block.box(3, 14, 3, 13, 15, 13));
    public static final VoxelShape CEILING_EAST_WEST_GRINDSTONE = Shapes.or(Block.box(4, 15, 4, 12, 16, 12), Block.box(3, 14, 3, 13, 15, 13));

    private VoxelShape getVoxelShape(BlockState state) {
        Direction direction = state.getValue(FACING);
        switch (state.getValue(FACE)) {
            case FLOOR:
                if (direction != Direction.NORTH && direction != Direction.SOUTH) {
                    return FLOOR_EAST_WEST_GRINDSTONE;
                }

                return FLOOR_NORTH_SOUTH_GRINDSTONE;
            case WALL:
                if (direction == Direction.NORTH) {
                    return WALL_NORTH_GRINDSTONE;
                } else if (direction == Direction.SOUTH) {
                    return WALL_SOUTH_GRINDSTONE;
                } else {
                    if (direction == Direction.EAST) {
                        return WALL_EAST_GRINDSTONE;
                    }

                    return WALL_WEST_GRINDSTONE;
                }
            case CEILING:
                if (direction != Direction.NORTH && direction != Direction.SOUTH) {
                    return CEILING_EAST_WEST_GRINDSTONE;
                }

                return CEILING_NORTH_SOUTH_GRINDSTONE;
            default:
                return FLOOR_EAST_WEST_GRINDSTONE;
        }
    }

    @NotNull
    protected VoxelShape getCollisionShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return this.getVoxelShape(state);
    }

    protected @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return this.getVoxelShape(state);
    }
}
