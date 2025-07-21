package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.ItemInteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.ItemStack;
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
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class ThickHorizontalLight extends Block {

    public static final BooleanProperty POWERED = BooleanProperty.create("powered");
    public static final BooleanProperty REDSTONE_POWERED = BooleanProperty.create("redstone_powered");
    public static final DirectionProperty FACING;


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
                .setValue(REDSTONE_POWERED, false)
                .setValue(POWERED, false)
        );
    }
    @Override
    public int getLightEmission(BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos) {
        return state.getValue(POWERED) ? 15 : 0;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<net.minecraft.world.level.block.Block, BlockState> builder) {
        builder.add(BlockStateProperties.HORIZONTAL_FACING, BlockStateProperties.HALF, BlockStateProperties.STAIRS_SHAPE, POWERED, REDSTONE_POWERED);
    }

    static {
        FACING = BlockStateProperties.HORIZONTAL_FACING;
    }


    protected boolean useShapeForLightOcclusion(@NotNull BlockState state) {
        return true;
    }

    @Override
    public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos, @NotNull CollisionContext context) {
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

        return STRAIGHT_TOP_NORTH;
    }

    @Override
    protected @NotNull ItemInteractionResult useItemOn(@NotNull ItemStack stack, @NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {

        ItemStack heldItem = player.getItemInHand(hand);

        if (heldItem.getItem() instanceof DyeItem dyeItem && !level.isClientSide) {

            String colorName = dyeItem.getDyeColor().getName();
            String blockName = "industriallightmod:thick_horizontal_light_" + colorName;
            Block newBlock = BuiltInRegistries.BLOCK.getOptional(ResourceLocation.parse(blockName))
                    .orElse(null);

            if (newBlock == null || state.getBlock() == newBlock) {
                return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
            }

            BlockState newState = newBlock.defaultBlockState()
                    .setValue(POWERED, state.getValue(POWERED))
                    .setValue(REDSTONE_POWERED, state.getValue(REDSTONE_POWERED))
                    .setValue(FACING, state.getValue(FACING))
                    .setValue(BlockStateProperties.HALF, state.getValue(BlockStateProperties.HALF))
                    .setValue(BlockStateProperties.STAIRS_SHAPE, state.getValue(BlockStateProperties.STAIRS_SHAPE));

            level.setBlock(pos, newState, 3);
            level.playSound(null, pos, SoundEvents.WOOL_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);

            if (!player.isCreative()) {
                heldItem.shrink(1);
            }

            return ItemInteractionResult.SUCCESS;

        }
        else if (!level.isClientSide && heldItem.getItem() == ModItems.LIGHT_WRENCH.get()) {

            StairsShape currentShape = state.getValue(BlockStateProperties.STAIRS_SHAPE);

            StairsShape nextShape = switch (currentShape) {
                case STRAIGHT -> StairsShape.INNER_LEFT;
                case INNER_LEFT -> StairsShape.INNER_RIGHT;
                case INNER_RIGHT -> StairsShape.OUTER_LEFT;
                case OUTER_LEFT -> StairsShape.OUTER_RIGHT;
                case OUTER_RIGHT -> StairsShape.STRAIGHT;
            };

            level.setBlock(pos, state.setValue(BlockStateProperties.STAIRS_SHAPE, nextShape), 3);

            level.playSound(null, pos, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundSource.BLOCKS, 1f, 1.5f);

            return ItemInteractionResult.SUCCESS;
        }
        else {
            boolean currentState = state.getValue(POWERED);
            level.setBlock(pos, state.setValue(POWERED, !currentState), 3);
            level.playSound(null, player.blockPosition(), SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundSource.BLOCKS, 1f, 1.5f);

            return ItemInteractionResult.SUCCESS;
        }

    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction facing = context.getHorizontalDirection();
        BlockPos pos = context.getClickedPos();
        context.getLevel();
        Half half = context.getClickLocation().y - (double) pos.getY() > 0.5D ? Half.TOP : Half.BOTTOM;

        BlockState baseState = this.defaultBlockState()
                .setValue(BlockStateProperties.HORIZONTAL_FACING, facing)
                .setValue(BlockStateProperties.HALF, half)
                .setValue(BlockStateProperties.STAIRS_SHAPE, StairsShape.STRAIGHT);

        for (Direction direction : Direction.Plane.HORIZONTAL) {
            BlockPos neighborPos = pos.relative(direction);
            BlockState neighborState = context.getLevel().getBlockState(neighborPos);
            baseState = baseState.updateShape(direction, neighborState, context.getLevel(), pos, neighborPos);
        }

        return baseState;
    }

    @Override
    public @NotNull BlockState updateShape(@NotNull BlockState state, @NotNull Direction direction, @NotNull BlockState neighborState, @NotNull LevelAccessor level, @NotNull BlockPos pos, @NotNull BlockPos neighborPos) {

        StairsShape newShape = getStairsShape(state, level, pos);
        return state.setValue(BlockStateProperties.STAIRS_SHAPE, newShape);
    }

    private static StairsShape getStairsShape(BlockState state, BlockGetter level, BlockPos pos) {
        Direction direction = state.getValue(BlockStateProperties.HORIZONTAL_FACING);
        BlockState forwardState = level.getBlockState(pos.relative(direction));

        if (isStairs(forwardState) && state.getValue(BlockStateProperties.HALF) == forwardState.getValue(BlockStateProperties.HALF)) {
            Direction forwardFacing = forwardState.getValue(BlockStateProperties.HORIZONTAL_FACING);
            if (forwardFacing.getAxis() != direction.getAxis() && canTakeShape(state, level, pos, forwardFacing.getOpposite())) {
                if (forwardFacing == direction.getCounterClockWise()) {
                    return StairsShape.OUTER_LEFT;
                }
                return StairsShape.OUTER_RIGHT;
            }
        }

        BlockState backwardState = level.getBlockState(pos.relative(direction.getOpposite()));
        if (isStairs(backwardState) && state.getValue(BlockStateProperties.HALF) == backwardState.getValue(BlockStateProperties.HALF)) {
            Direction backwardFacing = backwardState.getValue(BlockStateProperties.HORIZONTAL_FACING);
            if (backwardFacing.getAxis() != direction.getAxis() && canTakeShape(state, level, pos, backwardFacing)) {
                if (backwardFacing == direction.getCounterClockWise()) {
                    return StairsShape.INNER_LEFT;
                }
                return StairsShape.INNER_RIGHT;
            }
        }

        return StairsShape.STRAIGHT;
    }

    private static boolean canTakeShape(BlockState state, BlockGetter level, BlockPos pos, Direction face) {
        BlockState neighborState = level.getBlockState(pos.relative(face));
        return !isStairs(neighborState)
                || neighborState.getValue(BlockStateProperties.HORIZONTAL_FACING) != state.getValue(BlockStateProperties.HORIZONTAL_FACING)
                || neighborState.getValue(BlockStateProperties.HALF) != state.getValue(BlockStateProperties.HALF);
    }

    private static boolean isStairs(BlockState state) {
        return state.getBlock() instanceof ThickHorizontalLight;
    }

    @Override
    protected void neighborChanged(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Block neighborBlock, @NotNull BlockPos neighborPos, boolean movedByPiston) {
        if (!level.isClientSide) {
            boolean hasRedstonePower = level.hasNeighborSignal(pos);
            boolean currentRedstonePowered = state.getValue(REDSTONE_POWERED);

            if (hasRedstonePower != currentRedstonePowered) {
                // Update both redstone_powered and powered states
                level.setBlock(pos, state
                        .setValue(REDSTONE_POWERED, hasRedstonePower)
                        .setValue(POWERED, hasRedstonePower), 3);
            }
        }
        super.neighborChanged(state, level, pos, neighborBlock, neighborPos, movedByPiston);
    }

    @Override
    public boolean isSignalSource(@NotNull BlockState state) {
        return false; // This block doesn't emit redstone signals
    }
}

