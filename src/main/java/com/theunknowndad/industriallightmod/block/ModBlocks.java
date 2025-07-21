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

    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_BLUE = registerBlock("centre_full_panel_blue",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_WHITE = registerBlock("centre_full_panel_white",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_BLACK = registerBlock("centre_full_panel_black",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_BROWN = registerBlock("centre_full_panel_brown",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_LIGHT_BLUE = registerBlock("centre_full_panel_light_blue",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_CYAN = registerBlock("centre_full_panel_cyan",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_GREEN = registerBlock("centre_full_panel_green",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_GREY = registerBlock("centre_full_panel_gray",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_LIME = registerBlock("centre_full_panel_lime",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_ORANGE = registerBlock("centre_full_panel_orange",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_LIGHT_GREY = registerBlock("centre_full_panel_light_gray",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_PINK = registerBlock("centre_full_panel_pink",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_PURPLE = registerBlock("centre_full_panel_purple",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_RED = registerBlock("centre_full_panel_red",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_YELLOW = registerBlock("centre_full_panel_yellow",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_FULL_PANEL_MAGENTA = registerBlock("centre_full_panel_magenta",
            () -> new CentreFullPanel(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));

    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_BLUE = registerBlock("chunky_full_panel_blue",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_WHITE = registerBlock("chunky_full_panel_white",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_BLACK = registerBlock("chunky_full_panel_black",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_BROWN = registerBlock("chunky_full_panel_brown",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_LIGHT_BLUE = registerBlock("chunky_full_panel_light_blue",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_CYAN = registerBlock("chunky_full_panel_cyan",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_GREEN = registerBlock("chunky_full_panel_green",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_GREY = registerBlock("chunky_full_panel_gray",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_LIME = registerBlock("chunky_full_panel_lime",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_ORANGE = registerBlock("chunky_full_panel_orange",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_LIGHT_GREY = registerBlock("chunky_full_panel_light_gray",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_PINK = registerBlock("chunky_full_panel_pink",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_PURPLE = registerBlock("chunky_full_panel_purple",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_RED = registerBlock("chunky_full_panel_red",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_YELLOW = registerBlock("chunky_full_panel_yellow",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CHUNKY_FULL_PANEL_MAGENTA = registerBlock("chunky_full_panel_magenta",
            () -> new ChunkyFullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));


    public static final DeferredBlock<Block> FULL_PANEL_BLUE = registerBlock("full_panel_blue",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_WHITE = registerBlock("full_panel_white",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_BLACK = registerBlock("full_panel_black",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_BROWN = registerBlock("full_panel_brown",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_LIGHT_BLUE = registerBlock("full_panel_light_blue",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_CYAN = registerBlock("full_panel_cyan",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_GREEN = registerBlock("full_panel_green",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_GREY = registerBlock("full_panel_gray",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_LIME = registerBlock("full_panel_lime",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_ORANGE = registerBlock("full_panel_orange",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_LIGHT_GREY = registerBlock("full_panel_light_gray",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_PINK = registerBlock("full_panel_pink",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_PURPLE = registerBlock("full_panel_purple",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_RED = registerBlock("full_panel_red",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_YELLOW = registerBlock("full_panel_yellow",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FULL_PANEL_MAGENTA = registerBlock("full_panel_magenta",
            () -> new FullPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));


    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_BLUE = registerBlock("centre_tri_panel_blue",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_WHITE = registerBlock("centre_tri_panel_white",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_BLACK = registerBlock("centre_tri_panel_black",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_BROWN = registerBlock("centre_tri_panel_brown",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_LIGHT_BLUE = registerBlock("centre_tri_panel_light_blue",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_CYAN = registerBlock("centre_tri_panel_cyan",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_GREEN = registerBlock("centre_tri_panel_green",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_GREY = registerBlock("centre_tri_panel_gray",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_LIME = registerBlock("centre_tri_panel_lime",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_ORANGE = registerBlock("centre_tri_panel_orange",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_LIGHT_GREY = registerBlock("centre_tri_panel_light_gray",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_PINK = registerBlock("centre_tri_panel_pink",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_PURPLE = registerBlock("centre_tri_panel_purple",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_RED = registerBlock("centre_tri_panel_red",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_YELLOW = registerBlock("centre_tri_panel_yellow",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> CENTRE_TRI_PANEL_MAGENTA = registerBlock("centre_tri_panel_magenta",
            () -> new CentreTriPanel (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));


    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_BLUE = registerBlock("small_centre_bulb_blue",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_WHITE = registerBlock("small_centre_bulb_white",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_BLACK = registerBlock("small_centre_bulb_black",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_BROWN = registerBlock("small_centre_bulb_brown",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_LIGHT_BLUE = registerBlock("small_centre_bulb_light_blue",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_CYAN = registerBlock("small_centre_bulb_cyan",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_GREEN = registerBlock("small_centre_bulb_green",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_GREY = registerBlock("small_centre_bulb_gray",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_LIME = registerBlock("small_centre_bulb_lime",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_ORANGE = registerBlock("small_centre_bulb_orange",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_LIGHT_GREY = registerBlock("small_centre_bulb_light_gray",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_PINK = registerBlock("small_centre_bulb_pink",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_PURPLE = registerBlock("small_centre_bulb_purple",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_RED = registerBlock("small_centre_bulb_red",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_YELLOW = registerBlock("small_centre_bulb_yellow",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> SMALL_CENTRE_BULB_MAGENTA = registerBlock("small_centre_bulb_magenta",
            () -> new SmallCentreBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));


    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_BLUE = registerBlock("industrial_light_blue",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_WHITE = registerBlock("industrial_light_white",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_LIGHT_BLUE = registerBlock("industrial_light_light_blue",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_BLACK = registerBlock("industrial_light_black",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_BROWN = registerBlock("industrial_light_brown",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_CYAN = registerBlock("industrial_light_cyan",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_LIGHT_GREY = registerBlock("industrial_light_light_gray",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_GREEN = registerBlock("industrial_light_green",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_GREY = registerBlock("industrial_light_gray",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_LIME = registerBlock("industrial_light_lime",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_MAGENTA = registerBlock("industrial_light_magenta",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_ORANGE = registerBlock("industrial_light_orange",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_PINK = registerBlock("industrial_light_pink",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_PURPLE = registerBlock("industrial_light_purple",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_RED = registerBlock("industrial_light_red",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> INDUSTRIAL_LIGHT_YELLOW = registerBlock("industrial_light_yellow",
            () -> new IndustrialLight (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));


    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_BLUE = registerBlock("vertical_beam_light_blue",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_WHITE = registerBlock("vertical_beam_light_white",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_LIGHT_BLUE = registerBlock("vertical_beam_light_light_blue",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_BLACK = registerBlock("vertical_beam_light_black",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_BROWN = registerBlock("vertical_beam_light_brown",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_CYAN = registerBlock("vertical_beam_light_cyan",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_LIGHT_GREY = registerBlock("vertical_beam_light_light_gray",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_GREEN = registerBlock("vertical_beam_light_green",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_GREY = registerBlock("vertical_beam_light_gray",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_LIME = registerBlock("vertical_beam_light_lime",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_MAGENTA = registerBlock("vertical_beam_light_magenta",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_ORANGE = registerBlock("vertical_beam_light_orange",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_PINK = registerBlock("vertical_beam_light_pink",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_PURPLE = registerBlock("vertical_beam_light_purple",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_RED = registerBlock("vertical_beam_light_red",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> VERTICAL_BEAM_LIGHT_YELLOW = registerBlock("vertical_beam_light_yellow",
            () -> new VerticalBeam(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(VerticalBeam.POWERED) ? 15 : 0)));

    public static final DeferredBlock<Block> HANGING_ROD_BLUE = registerBlock("hanging_rod_blue",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_WHITE = registerBlock("hanging_rod_white",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_LIGHT_BLUE = registerBlock("hanging_rod_light_blue",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_BLACK = registerBlock("hanging_rod_black",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_BROWN = registerBlock("hanging_rod_brown",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_CYAN = registerBlock("hanging_rod_cyan",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_LIGHT_GREY = registerBlock("hanging_rod_light_gray",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_GREEN = registerBlock("hanging_rod_green",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_GREY = registerBlock("hanging_rod_gray",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_LIME = registerBlock("hanging_rod_lime",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_MAGENTA = registerBlock("hanging_rod_magenta",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_ORANGE = registerBlock("hanging_rod_orange",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_PINK = registerBlock("hanging_rod_pink",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_PURPLE = registerBlock("hanging_rod_purple",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_RED = registerBlock("hanging_rod_red",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> HANGING_ROD_YELLOW = registerBlock("hanging_rod_yellow",
            () -> new HangingRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(HangingRod.POWERED) ? 15 : 0)));

    public static final DeferredBlock<Block> CHAINED_ROD_BLUE = registerBlock("chained_rod_blue",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_WHITE = registerBlock("chained_rod_white",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_LIGHT_BLUE = registerBlock("chained_rod_light_blue",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_BLACK = registerBlock("chained_rod_black",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_BROWN = registerBlock("chained_rod_brown",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_CYAN = registerBlock("chained_rod_cyan",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_LIGHT_GREY = registerBlock("chained_rod_light_gray",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_GREEN = registerBlock("chained_rod_green",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_GREY = registerBlock("chained_rod_gray",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_LIME = registerBlock("chained_rod_lime",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_MAGENTA = registerBlock("chained_rod_magenta",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_ORANGE = registerBlock("chained_rod_orange",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_PINK = registerBlock("chained_rod_pink",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_PURPLE = registerBlock("chained_rod_purple",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_RED = registerBlock("chained_rod_red",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> CHAINED_ROD_YELLOW = registerBlock("chained_rod_yellow",
            () -> new ChainedRod(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(ChainedRod.POWERED) ? 15 : 0)));


    public static final DeferredBlock<Block> BANNER_SIGN_BLUE = registerBlock("banner_sign_blue",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_WHITE = registerBlock("banner_sign_white",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_LIGHT_BLUE = registerBlock("banner_sign_light_blue",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_BLACK = registerBlock("banner_sign_black",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_BROWN = registerBlock("banner_sign_brown",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_CYAN = registerBlock("banner_sign_cyan",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_LIGHT_GREY = registerBlock("banner_sign_light_gray",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_GREEN = registerBlock("banner_sign_green",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_GREY = registerBlock("banner_sign_gray",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_LIME = registerBlock("banner_sign_lime",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_MAGENTA = registerBlock("banner_sign_magenta",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_ORANGE = registerBlock("banner_sign_orange",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_PINK = registerBlock("banner_sign_pink",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_PURPLE = registerBlock("banner_sign_purple",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_RED = registerBlock("banner_sign_red",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BANNER_SIGN_YELLOW = registerBlock("banner_sign_yellow",
            () -> new BannerSign(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BannerSign.POWERED) ? 15 : 0)));

    public static final DeferredBlock<Block> BLOCK_SHEET_BLUE = registerBlock("block_sheet_blue",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_WHITE = registerBlock("block_sheet_white",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_LIGHT_BLUE = registerBlock("block_sheet_light_blue",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_BLACK = registerBlock("block_sheet_black",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_BROWN = registerBlock("block_sheet_brown",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_CYAN = registerBlock("block_sheet_cyan",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_LIGHT_GREY = registerBlock("block_sheet_light_gray",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_GREEN = registerBlock("block_sheet_green",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_GREY = registerBlock("block_sheet_gray",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_LIME = registerBlock("block_sheet_lime",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_MAGENTA = registerBlock("block_sheet_magenta",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_ORANGE = registerBlock("block_sheet_orange",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_PINK = registerBlock("block_sheet_pink",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_PURPLE = registerBlock("block_sheet_purple",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_RED = registerBlock("block_sheet_red",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));
    public static final DeferredBlock<Block> BLOCK_SHEET_YELLOW = registerBlock("block_sheet_yellow",
            () -> new BlockSheet(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion().lightLevel(state -> state.getValue(BlockSheet.POWERED) ? 15 : 0)));


    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_WHITE = registerBlock("flat_centre_light_bulb_white",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_RED = registerBlock("flat_centre_light_bulb_red",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_BLUE = registerBlock("flat_centre_light_bulb_blue",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_BLACK = registerBlock("flat_centre_light_bulb_black",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_BROWN = registerBlock("flat_centre_light_bulb_brown",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_LIGHT_BLUE = registerBlock("flat_centre_light_bulb_light_blue",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_CYAN = registerBlock("flat_centre_light_bulb_cyan",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_YELLOW = registerBlock("flat_centre_light_bulb_yellow",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_PINK = registerBlock("flat_centre_light_bulb_pink",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_PURPLE = registerBlock("flat_centre_light_bulb_purple",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_ORANGE = registerBlock("flat_centre_light_bulb_orange",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_LIGHT_GREY = registerBlock("flat_centre_light_bulb_light_gray",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_GREEN = registerBlock("flat_centre_light_bulb_green",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_LIME = registerBlock("flat_centre_light_bulb_lime",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_GREY = registerBlock("flat_centre_light_bulb_gray",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> FLAT_CENTRE_LIGHT_BULB_MAGENTA = registerBlock("flat_centre_light_bulb_magenta",
            () -> new FlatCentreLightBulb (BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));


    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_BLACK = registerBlock("light_pillar_single_black",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_BLUE = registerBlock("light_pillar_single_blue",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_BROWN = registerBlock("light_pillar_single_brown",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_CYAN = registerBlock("light_pillar_single_cyan",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_GREEN = registerBlock("light_pillar_single_green",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_GRAY = registerBlock("light_pillar_single_gray",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_LIGHT_BLUE = registerBlock("light_pillar_single_light_blue",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_LIGHT_GRAY = registerBlock("light_pillar_single_light_gray",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_LIME = registerBlock("light_pillar_single_lime",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_MAGENTA = registerBlock("light_pillar_single_magenta",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_ORANGE = registerBlock("light_pillar_single_orange",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_PINK = registerBlock("light_pillar_single_pink",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_PURPLE = registerBlock("light_pillar_single_purple",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_RED = registerBlock("light_pillar_single_red",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_WHITE = registerBlock("light_pillar_single_white",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> LIGHT_PILLAR_SINGLE_YELLOW = registerBlock("light_pillar_single_yellow",
            () -> new PillarBlock(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));



    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_WHITE = registerBlock("thick_horizontal_light_white",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_RED = registerBlock("thick_horizontal_light_red",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_BLACK = registerBlock("thick_horizontal_light_black",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_BLUE = registerBlock("thick_horizontal_light_blue",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_BROWN = registerBlock("thick_horizontal_light_brown",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_CYAN = registerBlock("thick_horizontal_light_cyan",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_GREEN = registerBlock("thick_horizontal_light_green",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_GREY = registerBlock("thick_horizontal_light_gray",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_LIGHT_BLUE = registerBlock("thick_horizontal_light_light_blue",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_LIGHT_GREY = registerBlock("thick_horizontal_light_light_gray",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_LIME = registerBlock("thick_horizontal_light_lime",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_ORANGE = registerBlock("thick_horizontal_light_orange",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_PINK = registerBlock("thick_horizontal_light_pink",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_PURPLE = registerBlock("thick_horizontal_light_purple",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_YELLOW = registerBlock("thick_horizontal_light_yellow",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THICK_HORIZONTAL_LIGHT_MAGENTA = registerBlock("thick_horizontal_light_magenta",
            () -> new ThickHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));

    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_WHITE = registerBlock("thin_horizontal_light_white",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_RED = registerBlock("thin_horizontal_light_red",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_BLACK = registerBlock("thin_horizontal_light_black",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_BLUE = registerBlock("thin_horizontal_light_blue",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_BROWN = registerBlock("thin_horizontal_light_brown",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_CYAN = registerBlock("thin_horizontal_light_cyan",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_GREEN = registerBlock("thin_horizontal_light_green",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_GREY = registerBlock("thin_horizontal_light_gray",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_LIGHT_BLUE = registerBlock("thin_horizontal_light_light_blue",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_LIGHT_GREY = registerBlock("thin_horizontal_light_light_gray",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_LIME = registerBlock("thin_horizontal_light_lime",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_ORANGE = registerBlock("thin_horizontal_light_orange",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_PINK = registerBlock("thin_horizontal_light_pink",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_PURPLE = registerBlock("thin_horizontal_light_purple",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_YELLOW = registerBlock("thin_horizontal_light_yellow",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));
    public static final DeferredBlock<Block> THIN_HORIZONTAL_LIGHT_MAGENTA = registerBlock("thin_horizontal_light_magenta",
            () -> new ThinHorizontalLight(BlockBehaviour.Properties.of().strength(0.5f).noOcclusion()));


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