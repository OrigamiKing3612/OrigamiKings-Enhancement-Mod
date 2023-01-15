package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.BlockTags;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.leaves.LeafSlabs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafStairs;
import net.origamiking.mcmods.oem.blocks.leaves.LeafWalls;
import net.origamiking.mcmods.oem.blocks.wool.black.BlackWool;
import net.origamiking.mcmods.oem.blocks.wool.blue.BlueWool;
import net.origamiking.mcmods.oem.blocks.wool.brown.BrownWool;
import net.origamiking.mcmods.oem.blocks.wool.cyan.CyanWool;
import net.origamiking.mcmods.oem.blocks.wool.gray.GrayWool;
import net.origamiking.mcmods.oem.blocks.wool.green.GreenWool;
import net.origamiking.mcmods.oem.blocks.wool.light_gray.LightGrayWool;
import net.origamiking.mcmods.oem.blocks.wool.lightblue.LightBlueWool;
import net.origamiking.mcmods.oem.blocks.wool.lime.LimeWool;
import net.origamiking.mcmods.oem.blocks.wool.magenta.MagentaWool;
import net.origamiking.mcmods.oem.blocks.wool.orange.OrangeWool;
import net.origamiking.mcmods.oem.blocks.wool.purple.PurpleWool;
import net.origamiking.mcmods.oem.blocks.wool.red.RedWool;
import net.origamiking.mcmods.oem.blocks.wool.white.WhiteWool;
import net.origamiking.mcmods.oem.blocks.wool.yellow.YellowWool;

import java.util.concurrent.CompletableFuture;

public class ModTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
//        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
//           .add(CopperBlocks.COPPER_BARS,
//                CopperBlocks.EXPOSED_COPPER_BARS,
//                CopperBlocks.WEATHERED_COPPER_BARS,
//                CopperBlocks.OXIDIZED_COPPER_BARS,
//                CopperBlocks.COPPER_CHAIN,
//                CopperBlocks.EXPOSED_COPPER_CHAIN,
//                CopperBlocks.WEATHERED_COPPER_CHAIN,
//                CopperBlocks.OXIDIZED_COPPER_CHAIN,
//                CopperBlocks.COPPER_LANTERN,
//                CopperBlocks.COPPER_PRESSURE_PLATE,
//                CopperBlocks.EXPOSED_COPPER_PRESSURE_PLATE,
//                CopperBlocks.WEATHERED_COPPER_PRESSURE_PLATE,
//                CopperBlocks.OXIDIZED_COPPER_PRESSURE_PLATE,
//                CopperBlocks.COPPER_BUTTON,
//                CopperBlocks.EXPOSED_COPPER_BUTTON,
//                CopperBlocks.WEATHERED_COPPER_BUTTON,
//                CopperBlocks.OXIDIZED_COPPER_BUTTON,
//                CopperBlocks.COPPER_DOOR,
//                CopperBlocks.COPPER_TRAPDOOR);
//
//
//        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
//                .add(CopperBlocks.COPPER_BARS,
//                        CopperBlocks.EXPOSED_COPPER_BARS,
//                        CopperBlocks.WEATHERED_COPPER_BARS,
//                        CopperBlocks.OXIDIZED_COPPER_BARS,
//                        CopperBlocks.COPPER_CHAIN,
//                        CopperBlocks.EXPOSED_COPPER_CHAIN,
//                        CopperBlocks.WEATHERED_COPPER_CHAIN,
//                        CopperBlocks.OXIDIZED_COPPER_CHAIN,
//                        CopperBlocks.COPPER_LANTERN,
//                        CopperBlocks.COPPER_PRESSURE_PLATE,
//                        CopperBlocks.EXPOSED_COPPER_PRESSURE_PLATE,
//                        CopperBlocks.WEATHERED_COPPER_PRESSURE_PLATE,
//                        CopperBlocks.OXIDIZED_COPPER_PRESSURE_PLATE,
//                        CopperBlocks.COPPER_BUTTON,
//                        CopperBlocks.EXPOSED_COPPER_BUTTON,
//                        CopperBlocks.WEATHERED_COPPER_BUTTON,
//                        CopperBlocks.OXIDIZED_COPPER_BUTTON,
//                        CopperBlocks.COPPER_DOOR,
//                        CopperBlocks.COPPER_TRAPDOOR);

//        getOrCreateTagBuilder(BlockTags.WOOL)
//            .add(WhiteWool.WHITE_WOOL_STAIRS)
//            .add(WhiteWool.WHITE_WOOL_WALL)
//            .add(WhiteWool.WHITE_WOOL_SLAB)
//            .add(LightGrayWool.LIGHT_GRAY_WOOL_STAIRS)
//            .add(LightGrayWool.LIGHT_GRAY_WOOL_WALL)
//            .add(LightGrayWool.LIGHT_GRAY_WOOL_SLAB)
//            .add(GrayWool.GRAY_WOOL_STAIRS)
//            .add(GrayWool.GRAY_WOOL_WALL)
//            .add(GrayWool.GRAY_WOOL_SLAB)
//            .add(BlackWool.BLACK_WOOL_STAIRS)
//            .add(BlackWool.BLACK_WOOL_WALL)
//            .add(BlackWool.BLACK_WOOL_SLAB)
//            .add(BrownWool.BROWN_WOOL_STAIRS)
//            .add(BrownWool.BROWN_WOOL_WALL)
//            .add(BrownWool.BROWN_WOOL_SLAB)
//            .add(RedWool.RED_WOOL_STAIRS)
//            .add(RedWool.RED_WOOL_WALL)
//            .add(RedWool.RED_WOOL_SLAB)
//            .add(OrangeWool.ORANGE_WOOL_STAIRS)
//            .add(OrangeWool.ORANGE_WOOL_WALL)
//            .add(OrangeWool.ORANGE_WOOL_SLAB)
//            .add(YellowWool.YELLOW_WOOL_STAIRS)
//            .add(YellowWool.YELLOW_WOOL_WALL)
//            .add(YellowWool.YELLOW_WOOL_SLAB)
//            .add(LimeWool.LIME_WOOL_STAIRS)
//            .add(LimeWool.LIME_WOOL_WALL)
//            .add(LimeWool.LIME_WOOL_SLAB)
//            .add(GreenWool.GREEN_WOOL_STAIRS)
//            .add(GreenWool.GREEN_WOOL_WALL)
//            .add(GreenWool.GREEN_WOOL_SLAB)
//            .add(CyanWool.CYAN_WOOL_STAIRS)
//            .add(CyanWool.CYAN_WOOL_WALL)
//            .add(CyanWool.CYAN_WOOL_SLAB)
//            .add(LightBlueWool.LIGHT_BLUE_WOOL_STAIRS)
//            .add(LightBlueWool.LIGHT_BLUE_WOOL_WALL)
//            .add(LightBlueWool.LIGHT_BLUE_WOOL_SLAB)
//            .add(BlueWool.BLUE_WOOL_STAIRS)
//            .add(BlueWool.BLUE_WOOL_WALL)
//            .add(BlueWool.BLUE_WOOL_SLAB)
//            .add(PurpleWool.PURPLE_WOOL_STAIRS)
//            .add(PurpleWool.PURPLE_WOOL_WALL)
//            .add(PurpleWool.PURPLE_WOOL_SLAB)
//            .add(MagentaWool.MAGENTA_WOOL_STAIRS)
//            .add(MagentaWool.MAGENTA_WOOL_WALL)
//            .add(MagentaWool.MAGENTA_WOOL_SLAB);
//
//        getOrCreateTagBuilder(BlockTags.LEAVES)
//                .add(LeafStairs.OAK_LEAVES_STAIRS,
//                     LeafStairs.SPRUCE_LEAVES_STAIRS,
//                     LeafStairs.BIRCH_LEAVES_STAIRS,
//                     LeafStairs.ACACIA_LEAVES_STAIRS,
//                     LeafStairs.JUNGLE_LEAVES_STAIRS,
//                     LeafStairs.MANGROVE_LEAVES_STAIRS,
//                     LeafSlabs.OAK_LEAVES_SLAB,
//                     LeafSlabs.SPRUCE_LEAVES_SLAB,
//                     LeafSlabs.BIRCH_LEAVES_SLAB,
//                     LeafSlabs.ACACIA_LEAVES_SLAB,
//                     LeafSlabs.JUNGLE_LEAVES_SLAB,
//                     LeafSlabs.MANGROVE_LEAVES_SLAB);
//        getOrCreateTagBuilder(BlockTags.WALLS).add(
//                LeafWalls.OAK_LEAVES_WALL,
//                LeafWalls.SPRUCE_LEAVES_WALL,
//                LeafWalls.BIRCH_LEAVES_WALL,
//                LeafWalls.ACACIA_LEAVES_WALL,
//                LeafWalls.JUNGLE_LEAVES_WALL,
//                LeafWalls.DARK_OAK_LEAVES_WALL,
//                LeafWalls.MANGROVE_LEAVES_WALL
//        );


    }
}
