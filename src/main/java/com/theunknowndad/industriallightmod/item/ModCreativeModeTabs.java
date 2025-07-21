package com.theunknowndad.industriallightmod.item;

import com.theunknowndad.industriallightmod.IndustrialLightMod;
import com.theunknowndad.industriallightmod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class ModCreativeModeTabs {

        public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
                DeferredRegister.create(Registries.CREATIVE_MODE_TAB, IndustrialLightMod.MOD_ID);

        public static final Supplier<CreativeModeTab> LIGHT_WRENCH_ITEMS_TAB =
                CREATIVE_MODE_TABS.register("light_wrench_tab", () -> CreativeModeTab.builder()
                        .title(Component.translatable("itemGroup.industriallightmod.light_wrench_tab"))
                        .icon(() -> new ItemStack(ModItems.LIGHT_WRENCH.get()))
                        .displayItems((pParameters, pOutput) -> {
                            pOutput.accept(ModItems.LIGHT_WRENCH);

                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_BLACK);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_BLUE);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_BROWN);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_CYAN);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_GREEN);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_GREY);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_LIGHT_GREY);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_LIME);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_MAGENTA);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_ORANGE);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_PINK);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_PURPLE);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_RED);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_WHITE);
                            pOutput.accept(ModBlocks.CENTRE_FULL_PANEL_YELLOW);

                            pOutput.accept(ModBlocks.BANNER_SIGN_BLACK);
                            pOutput.accept(ModBlocks.BANNER_SIGN_BLUE);
                            pOutput.accept(ModBlocks.BANNER_SIGN_BROWN);
                            pOutput.accept(ModBlocks.BANNER_SIGN_CYAN);
                            pOutput.accept(ModBlocks.BANNER_SIGN_GREEN);
                            pOutput.accept(ModBlocks.BANNER_SIGN_GREY);
                            pOutput.accept(ModBlocks.BANNER_SIGN_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.BANNER_SIGN_LIGHT_GREY);
                            pOutput.accept(ModBlocks.BANNER_SIGN_LIME);
                            pOutput.accept(ModBlocks.BANNER_SIGN_MAGENTA);
                            pOutput.accept(ModBlocks.BANNER_SIGN_ORANGE);
                            pOutput.accept(ModBlocks.BANNER_SIGN_PINK);
                            pOutput.accept(ModBlocks.BANNER_SIGN_PURPLE);
                            pOutput.accept(ModBlocks.BANNER_SIGN_RED);
                            pOutput.accept(ModBlocks.BANNER_SIGN_WHITE);
                            pOutput.accept(ModBlocks.BANNER_SIGN_YELLOW);

                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_BLACK);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_BLUE);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_BROWN);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_CYAN);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_GREEN);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_GREY);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_LIGHT_GREY);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_LIME);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_MAGENTA);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_ORANGE);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_PINK);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_PURPLE);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_RED);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_WHITE);
                            pOutput.accept(ModBlocks.CHUNKY_FULL_PANEL_YELLOW);

                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_BLACK);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_BLUE);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_BROWN);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_CYAN);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_GREEN);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_GRAY);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_LIGHT_GRAY);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_LIME);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_MAGENTA);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_ORANGE);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_PINK);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_PURPLE);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_RED);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_WHITE);
                            pOutput.accept(ModBlocks.LIGHT_PILLAR_SINGLE_YELLOW);

                            pOutput.accept(ModBlocks.HANGING_ROD_BLACK);
                            pOutput.accept(ModBlocks.HANGING_ROD_BLUE);
                            pOutput.accept(ModBlocks.HANGING_ROD_BROWN);
                            pOutput.accept(ModBlocks.HANGING_ROD_CYAN);
                            pOutput.accept(ModBlocks.HANGING_ROD_GREEN);
                            pOutput.accept(ModBlocks.HANGING_ROD_GREY);
                            pOutput.accept(ModBlocks.HANGING_ROD_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.HANGING_ROD_LIGHT_GREY);
                            pOutput.accept(ModBlocks.HANGING_ROD_LIME);
                            pOutput.accept(ModBlocks.HANGING_ROD_MAGENTA);
                            pOutput.accept(ModBlocks.HANGING_ROD_ORANGE);
                            pOutput.accept(ModBlocks.HANGING_ROD_PINK);
                            pOutput.accept(ModBlocks.HANGING_ROD_PURPLE);
                            pOutput.accept(ModBlocks.HANGING_ROD_RED);
                            pOutput.accept(ModBlocks.HANGING_ROD_WHITE);
                            pOutput.accept(ModBlocks.HANGING_ROD_YELLOW);

                            pOutput.accept(ModBlocks.CHAINED_ROD_BLACK);
                            pOutput.accept(ModBlocks.CHAINED_ROD_BLUE);
                            pOutput.accept(ModBlocks.CHAINED_ROD_BROWN);
                            pOutput.accept(ModBlocks.CHAINED_ROD_CYAN);
                            pOutput.accept(ModBlocks.CHAINED_ROD_GREEN);
                            pOutput.accept(ModBlocks.CHAINED_ROD_GREY);
                            pOutput.accept(ModBlocks.CHAINED_ROD_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.CHAINED_ROD_LIGHT_GREY);
                            pOutput.accept(ModBlocks.CHAINED_ROD_LIME);
                            pOutput.accept(ModBlocks.CHAINED_ROD_MAGENTA);
                            pOutput.accept(ModBlocks.CHAINED_ROD_ORANGE);
                            pOutput.accept(ModBlocks.CHAINED_ROD_PINK);
                            pOutput.accept(ModBlocks.CHAINED_ROD_PURPLE);
                            pOutput.accept(ModBlocks.CHAINED_ROD_RED);
                            pOutput.accept(ModBlocks.CHAINED_ROD_WHITE);
                            pOutput.accept(ModBlocks.CHAINED_ROD_YELLOW);

                            pOutput.accept(ModBlocks.FULL_PANEL_BLACK);
                            pOutput.accept(ModBlocks.FULL_PANEL_BLUE);
                            pOutput.accept(ModBlocks.FULL_PANEL_BROWN);
                            pOutput.accept(ModBlocks.FULL_PANEL_CYAN);
                            pOutput.accept(ModBlocks.FULL_PANEL_GREEN);
                            pOutput.accept(ModBlocks.FULL_PANEL_GREY);
                            pOutput.accept(ModBlocks.FULL_PANEL_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.FULL_PANEL_LIGHT_GREY);
                            pOutput.accept(ModBlocks.FULL_PANEL_LIME);
                            pOutput.accept(ModBlocks.FULL_PANEL_MAGENTA);
                            pOutput.accept(ModBlocks.FULL_PANEL_ORANGE);
                            pOutput.accept(ModBlocks.FULL_PANEL_PINK);
                            pOutput.accept(ModBlocks.FULL_PANEL_PURPLE);
                            pOutput.accept(ModBlocks.FULL_PANEL_RED);
                            pOutput.accept(ModBlocks.FULL_PANEL_WHITE);
                            pOutput.accept(ModBlocks.FULL_PANEL_YELLOW);

                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_BLACK);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_BLUE);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_BROWN);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_CYAN);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_GREEN);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_GREY);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_LIGHT_GREY);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_LIME);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_MAGENTA);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_ORANGE);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_PINK);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_PURPLE);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_RED);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_WHITE);
                            pOutput.accept(ModBlocks.CENTRE_TRI_PANEL_YELLOW);

                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_BLACK);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_BROWN);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_CYAN);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_GREEN);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_GREY);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_LIGHT_GREY);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_LIME);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_MAGENTA);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_ORANGE);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_PINK);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_PURPLE);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_RED);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_WHITE);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_YELLOW);

                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_BLACK);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_BROWN);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_CYAN);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_GREEN);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_GREY);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_LIGHT_GREY);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_LIME);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_MAGENTA);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_ORANGE);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_PINK);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_PURPLE);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_RED);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_WHITE);
                            pOutput.accept(ModBlocks.VERTICAL_BEAM_LIGHT_YELLOW);

                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_BLACK);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_BLUE);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_BROWN);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_CYAN);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_GREEN);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_GREY);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_LIGHT_GREY);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_LIME);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_MAGENTA);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_ORANGE);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_PINK);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_PURPLE);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_RED);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_WHITE);
                            pOutput.accept(ModBlocks.FLAT_CENTRE_LIGHT_BULB_YELLOW);

                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_BLACK);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_BLUE);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_BROWN);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_CYAN);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_GREEN);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_GREY);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_LIGHT_GREY);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_LIME);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_MAGENTA);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_ORANGE);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_PINK);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_PURPLE);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_RED);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_WHITE);
                            pOutput.accept(ModBlocks.SMALL_CENTRE_BULB_YELLOW);

                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_BLACK);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_BROWN);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_CYAN);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_GREEN);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_GREY);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_LIGHT_GREY);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_LIME);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_MAGENTA);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_ORANGE);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_PINK);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_PURPLE);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_RED);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_WHITE);
                            pOutput.accept(ModBlocks.THIN_HORIZONTAL_LIGHT_YELLOW);

                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_BLACK);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_BROWN);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_CYAN);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_GREEN);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_GREY);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_LIGHT_GREY);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_LIME);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_MAGENTA);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_ORANGE);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_PINK);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_PURPLE);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_RED);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_WHITE);
                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_YELLOW);

                            pOutput.accept(ModBlocks.BLOCK_SHEET_BLACK);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_BLUE);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_BROWN);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_CYAN);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_GREEN);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_GREY);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_LIGHT_GREY);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_LIME);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_MAGENTA);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_ORANGE);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_PINK);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_PURPLE);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_RED);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_WHITE);
                            pOutput.accept(ModBlocks.BLOCK_SHEET_YELLOW);


                        }).build());


        public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
        }

}
