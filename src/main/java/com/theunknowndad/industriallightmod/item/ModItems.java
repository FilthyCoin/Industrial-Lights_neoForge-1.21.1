package com.theunknowndad.industriallightmod.item;

import com.theunknowndad.industriallightmod.IndustrialLightMod;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(IndustrialLightMod.MOD_ID);

    public static final DeferredItem<Item> LIGHT_WRENCH = ITEMS.registerItem("light_wrench",
            Item::new, new Item.Properties().stacksTo(1));

    public static void register (IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
