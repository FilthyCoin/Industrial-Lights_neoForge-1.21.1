package com.theunknowndad.industriallightmod.block;

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
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;

public class CentreFullPanel extends IndustrialLight{
    public CentreFullPanel(Properties properties) {
        super(properties);
    }

    public static final VoxelShape FLOOR_NORTH_SOUTH_GRINDSTONE = Shapes.or(Block.box(0, 2, 0, 16, 4, 16),
            Block.box(2, 0, 2, 14, 1, 14),
            Block.box(5, 1, 5, 11, 2, 11));
    public static final VoxelShape FLOOR_EAST_WEST_GRINDSTONE = Shapes.or(Block.box(0, 2, 0, 16, 4, 16),
            Block.box(2, 0, 2, 14, 1, 14),
            Block.box(5, 1, 5, 11, 2, 11));
    public static final VoxelShape WALL_SOUTH_GRINDSTONE = Shapes.or(Block.box(0, 0, 2, 16, 16, 4),
            Block.box(2, 2, 0, 14, 14, 1),
            Block.box(5, 5, 1, 11, 11, 2));
    public static final VoxelShape WALL_NORTH_GRINDSTONE = Shapes.or(Block.box(0, 0, 12, 16, 16, 14),
            Block.box(2, 2, 15, 14, 14, 16),
            Block.box(5, 5, 14, 11, 11, 15));
    public static final VoxelShape WALL_WEST_GRINDSTONE = Shapes.or(Block.box(12, 0, 0, 14, 16, 16),
            Block.box(15, 2, 2, 16, 14, 14),
            Block.box(14, 5, 5, 15, 11, 11));
    public static final VoxelShape WALL_EAST_GRINDSTONE = Shapes.or(Block.box(2, 0, 0, 4, 16, 16),
            Block.box(0, 2, 2, 1, 14, 14),
            Block.box(1, 5, 5, 2, 11, 11));
    public static final VoxelShape CEILING_NORTH_SOUTH_GRINDSTONE = Shapes.or(Block.box(0, 12, 0, 16, 14, 16),
            Block.box(2, 15, 2, 14, 16, 14),
            Block.box(5, 14, 5, 11, 15, 11));
    public static final VoxelShape CEILING_EAST_WEST_GRINDSTONE = Shapes.or(Block.box(0, 12, 0, 16, 14, 16),
            Block.box(2, 15, 2, 14, 16, 14),
            Block.box(5, 14, 5, 11, 15, 11));

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

    @Override
    protected @NotNull ItemInteractionResult useItemOn(@NotNull ItemStack stack, @NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {

        ItemStack heldItem = player.getItemInHand(hand);

        if (heldItem.getItem() instanceof DyeItem dyeItem) {

            String colorName = dyeItem.getDyeColor().getName();
            String blockName = "industriallightmod:centre_full_panel_" + colorName;
            Block newBlock = BuiltInRegistries.BLOCK.getOptional(ResourceLocation.parse(blockName))
                    .orElse(null);

            if (newBlock == null || state.getBlock() == newBlock) {
                return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
            }

            BlockState newState = newBlock.defaultBlockState()
                    .setValue(POWERED, state.getValue(POWERED))
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

        return ItemInteractionResult.PASS_TO_DEFAULT_BLOCK_INTERACTION;
    }
}

