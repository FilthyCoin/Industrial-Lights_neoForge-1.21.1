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

                            pOutput.accept(ModBlocks.THICK_HORIZONTAL_LIGHT_WHITE);

                        }).build());


        public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
        }

}
