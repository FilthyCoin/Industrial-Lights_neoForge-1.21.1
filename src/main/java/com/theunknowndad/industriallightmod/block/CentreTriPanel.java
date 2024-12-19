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

public class CentreTriPanel extends IndustrialLight{
    public CentreTriPanel(Properties properties) {
        super(properties.noOcclusion());
    }

    public static final VoxelShape FLOOR_NORTH_SOUTH_GRINDSTONE = Shapes.or(Block.box(13, 2, 3, 15, 5.5, 4),
            Block.box(2, 4, 2.5, 14, 6, 4.5),
            Block.box(2, 4, 11.5, 14, 6, 13.5),
            Block.box(2, 4, 7, 14, 6, 9),
            Block.box(0, 0, 0, 16, 2, 16),
            Block.box(1, 2, 7.5, 3, 5.5, 8.5),
            Block.box(13, 2, 7.5, 15, 5.5, 8.5),
            Block.box(1, 2, 12, 3, 5.5, 13),
            Block.box(13, 2, 12, 15, 5.5, 13),
            Block.box(1, 2, 3, 3, 5.5, 4));
    public static final VoxelShape FLOOR_EAST_WEST_GRINDSTONE = Shapes.or(Block.box(12, 2, 13, 13, 5.5, 15),
            Block.box(11.5, 4, 2, 13.5, 6, 14),
            Block.box(2.5, 4, 2, 4.5, 6, 14),
            Block.box(7, 4, 2, 9, 6, 14),
            Block.box(0, 0, 0, 16, 2, 16),
            Block.box(7.5, 2, 1, 8.5, 5.5, 3),
            Block.box(7.5, 2, 13, 8.5, 5.5, 15),
            Block.box(3, 2, 1, 4, 5.5, 3),
            Block.box(3, 2, 13, 4, 5.5, 15),
            Block.box(12, 2, 1, 13, 5.5, 3));
    public static final VoxelShape WALL_SOUTH_GRINDSTONE = Shapes.or(Block.box(1, 3, 2, 3, 4, 5.5),
            Block.box(2, 2.5, 4, 14, 4.5, 6),
            Block.box(2, 11.5, 4, 14, 13.5, 6),
            Block.box(2, 7, 4, 14, 9, 6),
            Block.box(0, 0, 0, 16, 16, 2),
            Block.box(13, 7.5, 2, 15, 8.5, 5.5),
            Block.box(1, 7.5, 2, 3, 8.5, 5.5),
            Block.box(13, 12, 2, 15, 13, 5.5),
            Block.box(1, 12, 2, 3, 13, 5.5),
            Block.box(13, 3, 2, 15, 4, 5.5));
    public static final VoxelShape WALL_NORTH_GRINDSTONE = Shapes.or(Block.box(13, 3, 10.5, 15, 4, 14),
            Block.box(2, 2.5, 10, 14, 4.5, 12),
            Block.box(2, 11.5, 10, 14, 13.5, 12),
            Block.box(2, 7, 10, 14, 9, 12),
            Block.box(0, 0, 14, 16, 16, 16),
            Block.box(1, 7.5, 10.5, 3, 8.5, 14),
            Block.box(13, 7.5, 10.5, 15, 8.5, 14),
            Block.box(1, 12, 10.5, 3, 13, 14),
            Block.box(13, 12, 10.5, 15, 13, 14),
            Block.box(1, 3, 10.5, 3, 4, 14));
    public static final VoxelShape WALL_WEST_GRINDSTONE = Shapes.or(Block.box(10.5, 3, 1, 14, 4, 3),
            Block.box(10, 2.5, 2, 12, 4.5, 14),
            Block.box(10, 11.5, 2, 12, 13.5, 14),
            Block.box(10, 7, 2, 12, 9, 14),
            Block.box(14, 0, 0, 16, 16, 16),
            Block.box(10.5, 7.5, 13, 14, 8.5, 15),
            Block.box(10.5, 7.5, 1, 14, 8.5, 3),
            Block.box(10.5, 12, 13, 14, 13, 15),
            Block.box(10.5, 12, 1, 14, 13, 3),
            Block.box(10.5, 3, 13, 14, 4, 15));
    public static final VoxelShape WALL_EAST_GRINDSTONE = Shapes.or(Block.box(2, 3, 13, 5.5, 4, 15),
            Block.box(4, 2.5, 2, 6, 4.5, 14),
            Block.box(4, 11.5, 2, 6, 13.5, 14),
            Block.box(4, 7, 2, 6, 9, 14),
            Block.box(0, 0, 0, 2, 16, 16),
            Block.box(2, 7.5, 1, 5.5, 8.5, 3),
            Block.box(2, 7.5, 13, 5.5, 8.5, 15),
            Block.box(2, 12, 1, 5.5, 13, 3),
            Block.box(2, 12, 13, 5.5, 13, 15),
            Block.box(2, 3, 1, 5.5, 4, 3));
    public static final VoxelShape CEILING_NORTH_SOUTH_GRINDSTONE = Shapes.or(Block.box(1, 10.5, 3, 3, 14, 4),
            Block.box(2, 10, 2.5, 14, 12, 4.5),
            Block.box(2, 10, 11.5, 14, 12, 13.5),
            Block.box(2, 10, 7, 14, 12, 9),
            Block.box(0, 14, 0, 16, 16, 16),
            Block.box(13, 10.5, 7.5, 15, 14, 8.5),
            Block.box(1, 10.5, 7.5, 3, 14, 8.5),
            Block.box(13, 10.5, 12, 15, 14, 13),
            Block.box(1, 10.5, 12, 3, 14, 13),
            Block.box(13, 10.5, 3, 15, 14, 4));
    public static final VoxelShape CEILING_EAST_WEST_GRINDSTONE = Shapes.or(Block.box(12, 10.5, 1, 13, 14, 3),
            Block.box(11.5, 10, 2, 13.5, 12, 14),
            Block.box(2.5, 10, 2, 4.5, 12, 14),
            Block.box(7, 10, 2, 9, 12, 14),
            Block.box(0, 14, 0, 16, 16, 16),
            Block.box(7.5, 10.5, 13, 8.5, 14, 15),
            Block.box(7.5, 10.5, 1, 8.5, 14, 3),
            Block.box(3, 10.5, 13, 4, 14, 15),
            Block.box(3, 10.5, 1, 4, 14, 3),
            Block.box(12, 10.5, 13, 13, 14, 15));

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
            String blockName = "industriallightmod:centre_tri_panel_" + colorName;
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

