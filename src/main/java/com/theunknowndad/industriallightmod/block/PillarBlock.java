package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.item.ModItems;
import net.minecraft.core.BlockPos;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.util.StringRepresentable;
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
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class PillarBlock extends Block {
    public static final BooleanProperty POWERED = BooleanProperty.create("powered");
    public static final EnumProperty<PillarPart> PART = EnumProperty.create("part", PillarPart.class);

    public PillarBlock(Properties properties) {
        super(properties.noOcclusion());
        this.registerDefaultState(this.defaultBlockState()
                .setValue(PART, PillarPart.SINGLE)
                .setValue(POWERED, false));

    }

    private static final VoxelShape VOXEL_SHAPE = Shapes.or(
            Block.box(6, 0, 6, 10, 16, 10),
            Block.box(6.5, 0, 5.5, 9.5, 16, 6),
            Block.box(6.5, 0, 10, 9.5, 16, 10.5),
            Block.box(5.5, 0, 6.5, 6, 16, 9.5),
            Block.box(10, 0, 6.5, 10.5, 16, 9.5)
    );

    @Override
    public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter level, @NotNull BlockPos pos, @NotNull CollisionContext context) {
        return VOXEL_SHAPE;
    }

    @Override
    public int getLightEmission(BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos) {
        return state.getValue(POWERED) ? 15 : 0;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(PART, POWERED);
    }

    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        return updateBlockState(level, pos).setValue(POWERED, false); // Initialize with default POWERED state
    }

    @Override
    public void neighborChanged(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Block block, @NotNull BlockPos neighborPos, boolean movedByPiston) {
        // Update the block state without modifying the POWERED state
        BlockState updatedState = updateBlockState(level, pos).setValue(POWERED, state.getValue(POWERED));
        if (!state.equals(updatedState)) {
            level.setBlock(pos, updatedState, 3);
        }
        super.neighborChanged(state, level, pos, block, neighborPos, movedByPiston);
    }

    private BlockState updateBlockState(Level level, BlockPos pos) {
        BlockState belowState = level.getBlockState(pos.below());
        BlockState aboveState = level.getBlockState(pos.above());

        boolean hasPillarBelow = belowState.getBlock() instanceof PillarBlock;
        boolean hasPillarAbove = aboveState.getBlock() instanceof PillarBlock;

        if (hasPillarBelow && hasPillarAbove) {
            return this.defaultBlockState().setValue(PART, PillarPart.MIDDLE);
        } else if (hasPillarBelow) {
            return this.defaultBlockState().setValue(PART, PillarPart.TOP);
        } else if (hasPillarAbove) {
            return this.defaultBlockState().setValue(PART, PillarPart.BOTTOM);
        } else {
            return this.defaultBlockState().setValue(PART, PillarPart.SINGLE);
        }
    }

    public enum PillarPart implements StringRepresentable {
        BOTTOM, MIDDLE, TOP, SINGLE;

        @Override
        public @NotNull String getSerializedName() {
            return this.name().toLowerCase();
        }
    }

    @Override
    protected @NotNull ItemInteractionResult useItemOn(@NotNull ItemStack stack, @NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {

        ItemStack heldItem = player.getItemInHand(hand);

        if (!level.isClientSide && heldItem.getItem() instanceof DyeItem dyeItem) {

            String colorName = dyeItem.getDyeColor().getName();
            String blockName = "industriallightmod:light_pillar_single_" + colorName;
            Block newBlock = BuiltInRegistries.BLOCK.getOptional(ResourceLocation.parse(blockName))
                    .orElse(null);

            if (newBlock == null || state.getBlock() == newBlock) {
                return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
            }

            BlockState newState = newBlock.defaultBlockState()
                    .setValue(POWERED, state.getValue(POWERED))
                    .setValue(PART, state.getValue(PART));

            level.setBlock(pos, newState, 3);
            level.playSound(null, pos, SoundEvents.WOOL_PLACE, SoundSource.BLOCKS, 1.0F, 1.0F);

            if (!player.isCreative()) {
                heldItem.shrink(1);
            }

            return ItemInteractionResult.SUCCESS;

        }
        else if (!level.isClientSide && heldItem.getItem() == ModItems.LIGHT_WRENCH.get()) {

            PillarPart currentPart = state.getValue(PART);

            PillarPart nextPart = switch (currentPart) {
                case SINGLE -> PillarPart.BOTTOM;
                case BOTTOM -> PillarPart.MIDDLE;
                case MIDDLE -> PillarPart.TOP;
                case TOP -> PillarPart.SINGLE;
            };

            level.setBlock(pos, state.setValue(PART, nextPart), 3);
            level.playSound(null, pos, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundSource.BLOCKS, 1f, 1.5f);
            return ItemInteractionResult.SUCCESS;
        }

        else  {
            boolean newPoweredState = !state.getValue(POWERED);
            propagatePoweredState(level, pos, newPoweredState);
            level.playSound(null, pos, SoundEvents.WOODEN_BUTTON_CLICK_OFF, SoundSource.BLOCKS, 1f, 1.5f);
            return ItemInteractionResult.SUCCESS;
        }

    }

    private void propagatePoweredState(Level level, BlockPos pos, boolean newPoweredState) {

        BlockState state = level.getBlockState(pos);
        if (state.getBlock() != this || state.getValue(POWERED) == newPoweredState) {
            return;
        }

        level.setBlock(pos, state.setValue(POWERED, newPoweredState), 3);

        propagatePoweredState(level, pos.above(), newPoweredState);
        propagatePoweredState(level, pos.below(), newPoweredState);
    }
}