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
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class IndustrialLight extends GrindstoneBlock {

    public static final BooleanProperty POWERED = BooleanProperty.create("powered");

    public static final DirectionProperty FACING;
    public static final EnumProperty<AttachFace> FACE;
    public static final VoxelShape FLOOR_NORTH_SOUTH_GRINDSTONE = Block.box(5, 0, 5, 11, 8, 11);
    public static final VoxelShape FLOOR_EAST_WEST_GRINDSTONE = Block.box(5, 0, 5, 11, 8, 11);
    public static final VoxelShape WALL_SOUTH_GRINDSTONE = Block.box(5, 5, 0, 11, 11, 8);
    public static final VoxelShape WALL_NORTH_GRINDSTONE = Block.box(5, 5, 8, 11, 11, 16);
    public static final VoxelShape WALL_WEST_GRINDSTONE = Block.box(8, 5, 5, 16, 11, 11);
    public static final VoxelShape WALL_EAST_GRINDSTONE = Block.box(0, 5, 5, 8, 11, 11);
    public static final VoxelShape CEILING_NORTH_SOUTH_GRINDSTONE = Block.box(5, 8, 5, 11, 16, 11);
    public static final VoxelShape CEILING_EAST_WEST_GRINDSTONE = Block.box(5, 8, 5, 11, 16, 11);


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

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction[] var2 = context.getNearestLookingDirections();
        int var3 = var2.length;

        for (Direction direction : var2) {
            BlockState blockstate;
            if (direction.getAxis() == Direction.Axis.Y) {
                blockstate = this.defaultBlockState().setValue(FACE, direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR).setValue(FACING, context.getHorizontalDirection());
            } else {
                blockstate = this.defaultBlockState().setValue(FACE, AttachFace.WALL).setValue(FACING, direction.getOpposite());
            }

            if (blockstate.canSurvive(context.getLevel(), context.getClickedPos())) {
                return blockstate;
            }
        }

        return null;
    }

    public IndustrialLight(BlockBehaviour.Properties properties) {
        super(properties.noOcclusion());
        this.registerDefaultState(this.stateDefinition.any().setValue(POWERED, false).setValue(FACING, Direction.NORTH).setValue(FACE, AttachFace.WALL));
    }

    @NotNull
    protected VoxelShape getCollisionShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return this.getVoxelShape(state);
    }

    protected @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return this.getVoxelShape(state);
    }

    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, FACE, POWERED);
    }

    static {
        FACING = BlockStateProperties.HORIZONTAL_FACING;
        FACE = BlockStateProperties.ATTACH_FACE;
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


