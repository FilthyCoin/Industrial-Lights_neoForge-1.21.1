package com.theunknowndad.industriallightmod.block;


import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class ThickHorizontalLight extends Block {

    public static final BooleanProperty POWERED = BooleanProperty.create("powered");
    public static final DirectionProperty FACING;

    // NORTH (Default)
    private static final VoxelShape STRAIGHT_TOP_SOUTH = box(0, 12, 12, 16, 16, 16);
    private static final VoxelShape STRAIGHT_BOTTOM_SOUTH = box(0, 0, 12, 16, 4, 16);

    private static final VoxelShape INNER_TOP_SOUTH = Shapes.or(
            box(0, 12, 0, 4, 16, 16),
            box(4, 12, 12, 16, 16, 16)
    );

    private static final VoxelShape INNER_BOTTOM_SOUTH = Shapes.or(
            box(0, 0, 0, 4, 4, 16),
            box(4, 0, 12, 16, 4, 16)
    );

    private static final VoxelShape OUTER_TOP_SOUTH = box(12, 12, 0, 16, 16, 4);
    private static final VoxelShape OUTER_BOTTOM_SOUTH = box(12, 0, 0, 16, 4, 4);

    private static final VoxelShape STRAIGHT_TOP_NORTH = box(0, 12, 0, 16, 16, 4);
    private static final VoxelShape STRAIGHT_BOTTOM_NORTH = box(0, 0, 0, 16, 4, 4);

    private static final VoxelShape INNER_TOP_NORTH = Shapes.or(
            box(12, 12, 0, 16, 16, 16),
            box(0, 12, 0, 12, 16, 4)
    );

    private static final VoxelShape INNER_BOTTOM_NORTH = Shapes.or(
            box(12, 0, 0, 16, 4, 16),
            box(0, 0, 0, 12, 4, 4)
    );

    private static final VoxelShape OUTER_TOP_NORTH = box(0, 12, 12, 4, 16, 16);
    private static final VoxelShape OUTER_BOTTOM_NORTH = box(0, 0, 12, 4, 4, 16);

    private static final VoxelShape STRAIGHT_TOP_EAST = box(12, 12, 0, 16, 16, 16);
    private static final VoxelShape STRAIGHT_BOTTOM_EAST = box(12, 0, 0, 16, 4, 16);

    private static final VoxelShape INNER_TOP_EAST = Shapes.or(
            box(0, 12, 12, 16, 16, 16),
            box(12, 12, 0, 16, 16, 12)
    );

    private static final VoxelShape INNER_BOTTOM_EAST = Shapes.or(
            box(0, 0, 12, 16, 4, 16),
            box(12, 0, 0, 16, 4, 12)
    );

    private static final VoxelShape OUTER_TOP_EAST = box(12, 12, 12, 16, 16, 16);
    private static final VoxelShape OUTER_BOTTOM_EAST = box(12, 0, 12, 16, 4, 16);

    private static final VoxelShape STRAIGHT_TOP_WEST = box(0, 12, 0, 4, 16, 16);
    private static final VoxelShape STRAIGHT_BOTTOM_WEST = box(0, 0, 0, 4, 4, 16);

    private static final VoxelShape INNER_TOP_WEST = Shapes.or(
            box(0, 12, 0, 16, 16, 4),
            box(0, 12, 4, 4, 16, 16)
    );

    private static final VoxelShape INNER_BOTTOM_WEST = Shapes.or(
            box(0, 0, 0, 16, 4, 4),
            box(0, 0, 4, 4, 4, 16)
    );

    private static final VoxelShape OUTER_TOP_WEST = box(0, 12, 0, 4, 16, 4);
    private static final VoxelShape OUTER_BOTTOM_WEST = box(0, 0, 0, 4, 4, 4);

    public ThickHorizontalLight(BlockBehaviour.Properties properties) {
        super(properties);
        this.registerDefaultState(this.defaultBlockState()
                .setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH)
                .setValue(BlockStateProperties.HALF, Half.BOTTOM)
                .setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT)
                .setValue(POWERED, false)

        );
    }
    @Override
    public int getLightEmission(BlockState state, BlockGetter world, BlockPos pos) {
        return state.getValue(POWERED) ? 15 : 0;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<net.minecraft.world.level.block.Block, BlockState> builder) {
        builder.add(BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.HALF, BlockStateProperties.STAIRS_SHAPE, POWERED);
    }

    static {
        FACING = BlockStateProperties.HORIZONTAL_FACING;
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction facing = context.getHorizontalDirection();
        BlockPos pos = context.getClickedPos();
        BlockGetter level = context.getLevel();
        Half half = context.getClickLocation().y - (double) pos.getY() > 0.5D ? Half.TOP : Half.BOTTOM;

        BlockState state = this.defaultBlockState().setValue(BlockStateProperties.HORIZONTAL_FACING, facing).setValue(BlockStateProperties.HALF, half);

        return state.setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT);
    }

    protected boolean useShapeForLightOcclusion(BlockState state) {
        return true;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
        Direction facing = state.getValue(HorizontalDirectionalBlock.FACING);
        Half half = state.getValue(StairBlock.HALF);
        StairsShape shape = state.getValue(StairBlock.SHAPE);

        boolean isTop = half == Half.TOP;

        switch (shape) {
            case STRAIGHT:
                switch (facing) {
                    case NORTH:
                        return isTop ? STRAIGHT_TOP_NORTH : STRAIGHT_BOTTOM_NORTH;
                    case SOUTH:
                        return isTop ? STRAIGHT_TOP_SOUTH : STRAIGHT_BOTTOM_SOUTH;
                    case WEST:
                        return isTop ? STRAIGHT_TOP_WEST : STRAIGHT_BOTTOM_WEST;
                    case EAST:
                        return isTop ? STRAIGHT_TOP_EAST : STRAIGHT_BOTTOM_EAST;
                }
                break;

            case INNER_LEFT:
                switch (facing) {
                    case NORTH:
                        return isTop ? INNER_TOP_WEST : INNER_BOTTOM_WEST;
                    case SOUTH:
                        return isTop ? INNER_TOP_EAST : INNER_BOTTOM_EAST;
                    case WEST:
                        return isTop ? INNER_TOP_SOUTH : INNER_BOTTOM_SOUTH;
                    case EAST:
                        return isTop ? INNER_TOP_NORTH : INNER_BOTTOM_NORTH;
                }
                break;

            case INNER_RIGHT:
                switch (facing) {
                    case NORTH:
                        return isTop ? INNER_TOP_NORTH : INNER_BOTTOM_NORTH;
                    case SOUTH:
                        return isTop ? INNER_TOP_SOUTH : INNER_BOTTOM_SOUTH;
                    case WEST:
                        return isTop ? INNER_TOP_WEST : INNER_BOTTOM_WEST;
                    case EAST:
                        return isTop ? INNER_TOP_EAST : INNER_BOTTOM_EAST;
                }
                break;

            case OUTER_LEFT:
                switch (facing) {
                    case NORTH:
                        return isTop ? OUTER_TOP_WEST : OUTER_BOTTOM_WEST;
                    case SOUTH:
                        return isTop ? OUTER_TOP_EAST : OUTER_BOTTOM_EAST;
                    case WEST:
                        return isTop ? OUTER_TOP_NORTH : OUTER_BOTTOM_NORTH;
                    case EAST:
                        return isTop ? OUTER_TOP_SOUTH : OUTER_BOTTOM_SOUTH;
                }
                break;

            case OUTER_RIGHT:
                switch (facing) {
                    case NORTH:
                        return isTop ? OUTER_TOP_SOUTH : OUTER_BOTTOM_SOUTH;
                    case SOUTH:
                        return isTop ? OUTER_TOP_NORTH : OUTER_BOTTOM_NORTH;
                    case WEST:
                        return isTop ? OUTER_TOP_WEST : OUTER_BOTTOM_WEST;
                    case EAST:
                        return isTop ? OUTER_TOP_EAST : OUTER_BOTTOM_EAST;
                }
                break;
        }

        // Fallback shape
        return STRAIGHT_TOP_NORTH;
    }

    protected @NotNull InteractionResult useWithoutItem(@NotNull BlockState state, Level level, @NotNull BlockPos pos, @NotNull Player player, @NotNull BlockHitResult hitResult) {
        if (!level.isClientSide) {
            boolean currentState = state.getValue(POWERED);
            level.setBlock(pos, state.setValue(POWERED, !currentState), 3);
            level.playSound(null, player.blockPosition(), SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundSource.BLOCKS, 1f, 1.5f);


            return InteractionResult.SUCCESS;
        }
        return InteractionResult.SUCCESS;
    }



}

