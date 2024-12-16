package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.IndustrialLightMod;
import com.theunknowndad.industriallightmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(IndustrialLightMod.MOD_ID);

    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_BLUE = registerBlock("industrial_light_blue",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_WHITE = registerBlock("industrial_light_white",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_WHITE = registerBlock("flat_centre_light_bulb_white",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_RED = registerBlock("flat_centre_light_bulb_red",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_BLUE = registerBlock("flat_centre_light_bulb_blue",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_BLACK = registerBlock("flat_centre_light_bulb_black",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_BROWN = registerBlock("flat_centre_light_bulb_brown",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_LIGHT_BLUE = registerBlock("flat_centre_light_bulb_light_blue",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_CYAN = registerBlock("flat_centre_light_bulb_cyan",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_YELLOW = registerBlock("flat_centre_light_bulb_yellow",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_PINK = registerBlock("flat_centre_light_bulb_pink",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_PURPLE = registerBlock("flat_centre_light_bulb_purple",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_ORANGE = registerBlock("flat_centre_light_bulb_orange",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_LIGHT_GREY = registerBlock("flat_centre_light_bulb_light_grey",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_GREEN = registerBlock("flat_centre_light_bulb_green",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_LIME = registerBlock("flat_centre_light_bulb_lime",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_GREY = registerBlock("flat_centre_light_bulb_grey",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_MAGENTA = registerBlock("flat_centre_light_bulb_magenta",
            () -> new FlatCentreLightBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));


    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}