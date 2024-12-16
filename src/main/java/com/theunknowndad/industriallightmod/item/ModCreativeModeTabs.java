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
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_BLUE);
                            pOutput.accept(ModBlocks.INDUSTRIAL_LIGHT_WHITE);


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


                        }).build());


        public static void register(IEventBus eventBus) {
            CREATIVE_MODE_TABS.register(eventBus);
        }

}
