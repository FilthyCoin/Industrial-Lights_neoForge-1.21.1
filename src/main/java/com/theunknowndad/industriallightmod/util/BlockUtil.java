package com.theunknowndad.industriallightmod.util;

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
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.*;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public abstract class BlockUtil extends Block {

    public static final BooleanProperty POWERED = BooleanProperty.create("powered");
    public static final BooleanProperty REDSTONE_POWERED = BooleanProperty.create("redstone_powered");
    public static final DirectionProperty FACING;
    public static final EnumProperty<AttachFace> FACE;

    public BlockUtil(Properties properties) {
        super(properties);
        this.registerDefaultState(this.stateDefinition.any()
                .setValue(POWERED, false)
                .setValue(REDSTONE_POWERED, false)
                .setValue(FACING, Direction.NORTH)
                .setValue(FACE, AttachFace.WALL));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        // Add all the properties this block uses
        builder.add(POWERED, REDSTONE_POWERED, FACING, FACE);
    }

    static {
        FACING = BlockStateProperties.HORIZONTAL_FACING;
        FACE = BlockStateProperties.ATTACH_FACE;
    }

    @Override
    public int getLightEmission(BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos) {
        // Light is on when POWERED is true (either manually or by redstone)
        return state.getValue(POWERED) ? 15 : 0;
    }

    // Abstract method that subclasses must implement for their specific shapes
    protected abstract VoxelShape getVoxelShape(BlockState state);

    // Abstract method for getting the block name prefix for dyeing
    protected abstract String getBlockNamePrefix();

    @NotNull
    protected VoxelShape getCollisionShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return this.getVoxelShape(state);
    }

    protected @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return this.getVoxelShape(state);
    }

    @Nullable
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Direction[] var2 = context.getNearestLookingDirections();

        for (Direction direction : var2) {
            BlockState blockstate;
            if (direction.getAxis() == Direction.Axis.Y) {
                blockstate = this.defaultBlockState().setValue(FACE, direction == Direction.UP ? AttachFace.CEILING : AttachFace.FLOOR).setValue(FACING, context.getHorizontalDirection());
            } else {
                blockstate = this.defaultBlockState().setValue(FACE, AttachFace.WALL).setValue(FACING, direction.getOpposite());
            }

            if (blockstate.canSurvive(context.getLevel(), context.getClickedPos())) {
                // Check for redstone power when placing
                boolean hasRedstonePower = context.getLevel().hasNeighborSignal(context.getClickedPos());
                return blockstate
                        .setValue(REDSTONE_POWERED, hasRedstonePower)
                        .setValue(POWERED, hasRedstonePower);
            }
        }

        return null;
    }

    @Override
    protected @NotNull ItemInteractionResult useItemOn(@NotNull ItemStack stack, @NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {

        ItemStack heldItem = player.getItemInHand(hand);

        if (heldItem.getItem() instanceof DyeItem dyeItem) {

            String colorName = dyeItem.getDyeColor().getName();
            String blockName = "industriallightmod:" + getBlockNamePrefix() + "_" + colorName;
            Block newBlock = BuiltInRegistries.BLOCK.getOptional(ResourceLocation.parse(blockName))
                    .orElse(null);

            if (newBlock == null || state.getBlock() == newBlock) {
                return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
            }

            BlockState newState = newBlock.defaultBlockState()
                    .setValue(POWERED, state.getValue(POWERED))
                    .setValue(REDSTONE_POWERED, state.getValue(REDSTONE_POWERED))
                    .setValue(FACE, state.getValue(FACE))
                    .setValue(FACING, state.getValue(FACING));

            level.setBlock(pos, newState, 3);
            level.playSound(null, pos, SoundEvents.WOOL_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);

            if (!player.isCreative()) {
                heldItem.shrink(1);
            }

            return ItemInteractionResult.SUCCESS;

        }
        else if (!level.isClientSide) {
            boolean currentState = state.getValue(POWERED);
            level.setBlock(pos, state.setValue(POWERED, !currentState), 3);
            level.playSound(null, player.blockPosition(), SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundSource.BLOCKS, 1f, 1.5f);

            return ItemInteractionResult.SUCCESS;
        }

        return ItemInteractionResult.SUCCESS;
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