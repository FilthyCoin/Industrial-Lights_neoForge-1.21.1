package com.theunknowndad.industriallightmod.block;

import com.theunknowndad.industriallightmod.IndustrialLightMod;
import com.theunknowndad.industriallightmod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(IndustrialLightMod.MOD_ID);

    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_BLUE = registerBlock("centre_full_panel_blue",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_WHITE = registerBlock("centre_full_panel_white",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_BLACK = registerBlock("centre_full_panel_black",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_BROWN = registerBlock("centre_full_panel_brown",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_LIGHT_BLUE = registerBlock("centre_full_panel_light_blue",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_CYAN = registerBlock("centre_full_panel_cyan",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_GREEN = registerBlock("centre_full_panel_green",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_GREY = registerBlock("centre_full_panel_grey",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_LIME = registerBlock("centre_full_panel_lime",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_ORANGE = registerBlock("centre_full_panel_orange",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_LIGHT_GREY = registerBlock("centre_full_panel_light_grey",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_PINK = registerBlock("centre_full_panel_pink",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_PURPLE = registerBlock("centre_full_panel_purple",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_RED = registerBlock("centre_full_panel_red",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_YELLOW = registerBlock("centre_full_panel_yellow",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_MAGENTA = registerBlock("centre_full_panel_magenta",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));

    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_BLUE = registerBlock("centre_tri_panel_blue",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_WHITE = registerBlock("centre_tri_panel_white",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_BLACK = registerBlock("centre_tri_panel_black",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_BROWN = registerBlock("centre_tri_panel_brown",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_LIGHT_BLUE = registerBlock("centre_tri_panel_light_blue",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_CYAN = registerBlock("centre_tri_panel_cyan",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_GREEN = registerBlock("centre_tri_panel_green",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_GREY = registerBlock("centre_tri_panel_grey",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_LIME = registerBlock("centre_tri_panel_lime",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_ORANGE = registerBlock("centre_tri_panel_orange",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_LIGHT_GREY = registerBlock("centre_tri_panel_light_grey",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_PINK = registerBlock("centre_tri_panel_pink",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_PURPLE = registerBlock("centre_tri_panel_purple",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_RED = registerBlock("centre_tri_panel_red",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_YELLOW = registerBlock("centre_tri_panel_yellow",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_MAGENTA = registerBlock("centre_tri_panel_magenta",
            () -> new CentreTriPanel(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_BLUE = registerBlock("small_centre_bulb_blue",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_WHITE = registerBlock("small_centre_bulb_white",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_BLACK = registerBlock("small_centre_bulb_black",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_BROWN = registerBlock("small_centre_bulb_brown",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_LIGHT_BLUE = registerBlock("small_centre_bulb_light_blue",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_CYAN = registerBlock("small_centre_bulb_cyan",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_GREEN = registerBlock("small_centre_bulb_green",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_GREY = registerBlock("small_centre_bulb_grey",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_LIME = registerBlock("small_centre_bulb_lime",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_ORANGE = registerBlock("small_centre_bulb_orange",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_LIGHT_GREY = registerBlock("small_centre_bulb_light_grey",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_PINK = registerBlock("small_centre_bulb_pink",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_PURPLE = registerBlock("small_centre_bulb_purple",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_RED = registerBlock("small_centre_bulb_red",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_YELLOW = registerBlock("small_centre_bulb_yellow",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_MAGENTA = registerBlock("small_centre_bulb_magenta",
            () -> new SmallCentreBulb(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));


    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_BLUE = registerBlock("industrial_light_blue",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_WHITE = registerBlock("industrial_light_white",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_LIGHT_BLUE = registerBlock("industrial_light_light_blue",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_BLACK = registerBlock("industrial_light_black",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_BROWN = registerBlock("industrial_light_brown",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_CYAN = registerBlock("industrial_light_cyan",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_LIGHT_GREY = registerBlock("industrial_light_light_grey",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_GREEN = registerBlock("industrial_light_green",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_GREY = registerBlock("industrial_light_grey",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_LIME = registerBlock("industrial_light_lime",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_MAGENTA = registerBlock("industrial_light_magenta",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_ORANGE = registerBlock("industrial_light_orange",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_PINK = registerBlock("industrial_light_pink",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_PURPLE = registerBlock("industrial_light_purple",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_RED = registerBlock("industrial_light_red",
            () -> new IndustrialLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion().lightLevel(state -> state.getValue(IndustrialLight.POWERED) ? 15 : 0).requiresCorrectToolForDrops()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_YELLOW = registerBlock("industrial_light_yellow",
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

    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_WHITE = registerBlock("thick_horizontal_light_white",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(2.0f).noOcclusion()));


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