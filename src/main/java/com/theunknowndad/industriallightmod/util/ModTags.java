package com.theunknowndad.industriallightmod.util;

import com.theunknowndad.industriallightmod.IndustrialLightMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {

        public static final TagKey<Block> BLACK_LIGHTS = createTag("black_lights");
        public static final TagKey<Block> BLUE_LIGHTS = createTag("blue_lights");
        public static final TagKey<Block> BROWN_LIGHTS = createTag("brown_lights");
        public static final TagKey<Block> CYAN_LIGHTS = createTag("cyan_lights");
        public static final TagKey<Block> GREEN_LIGHTS = createTag("green_lights");
        public static final TagKey<Block> GRAY_LIGHTS = createTag("gray_lights");
        public static final TagKey<Block> LIGHT_GRAY_LIGHTS = createTag("light_gray_lights");
        public static final TagKey<Block> LIGHT_BLUE_LIGHTS = createTag("light_blue_lights");
        public static final TagKey<Block> LIME_LIGHTS = createTag("lime_lights");
        public static final TagKey<Block> MAGENTA_LIGHTS = createTag("magenta_lights");
        public static final TagKey<Block> ORANGE_LIGHTS = createTag("orange_lights");
        public static final TagKey<Block> PINK_LIGHTS = createTag("pink_lights");
        public static final TagKey<Block> PURPLE_LIGHTS = createTag("purple_lights");
        public static final TagKey<Block> RED_LIGHTS = createTag("red_lights");
        public static final TagKey<Block> WHITE_LIGHTS = createTag("white_lights");
        public static final TagKey<Block> YELLOW_LIGHTS = createTag("yellow_lights");


        private static TagKey<Block> createTag (String name) {
            return BlockTags.create(ResourceLocation.fromNamespaceAndPath(IndustrialLightMod.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> BLACK_LIGHTS = createTag("black_lights");
        public static final TagKey<Item> BLUE_LIGHTS = createTag("blue_lights");
        public static final TagKey<Item> BROWN_LIGHTS = createTag("brown_lights");
        public static final TagKey<Item> CYAN_LIGHTS = createTag("cyan_lights");
        public static final TagKey<Item> GREEN_LIGHTS = createTag("green_lights");
        public static final TagKey<Item> GRAY_LIGHTS = createTag("gray_lights");
        public static final TagKey<Item> LIGHT_GRAY_LIGHTS = createTag("light_gray_lights");
        public static final TagKey<Item> LIGHT_BLUE_LIGHTS = createTag("light_blue_lights");
        public static final TagKey<Item> LIME_LIGHTS = createTag("lime_lights");
        public static final TagKey<Item> MAGENTA_LIGHTS = createTag("magenta_lights");
        public static final TagKey<Item> ORANGE_LIGHTS = createTag("orange_lights");
        public static final TagKey<Item> PINK_LIGHTS = createTag("pink_lights");
        public static final TagKey<Item> PURPLE_LIGHTS = createTag("purple_lights");
        public static final TagKey<Item> RED_LIGHTS = createTag("red_lights");
        public static final TagKey<Item> WHITE_LIGHTS = createTag("white_lights");
        public static final TagKey<Item> YELLOW_LIGHTS = createTag("yellow_lights");
        private static TagKey<Item> createTag (String name) {
            return ItemTags.create(ResourceLocation.fromNamespaceAndPath(IndustrialLightMod.MOD_ID, name));
        }
    }
}