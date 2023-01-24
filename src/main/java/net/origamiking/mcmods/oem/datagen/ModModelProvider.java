package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.block.enums.BlockHalf;
import net.minecraft.data.client.*;
import net.minecraft.state.property.Properties;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.Direction;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.server_specific.ServerSpecificBlocks;
import net.origamiking.mcmods.oem.blocks.wood.acacia.AcaciaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.birch.BirchWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.crimson.CrimsonWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.darkoak.DarkOakWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.jungle.JungleWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.mangrove.MangroveWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.spruce.SpruceWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.warped.WarpedWoodBlocks;
import net.origamiking.mcmods.oem.items.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        // blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TEST);
        blockStateModelGenerator.registerSimpleCubeAll(SpruceWoodBlocks.SPRUCE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(BirchWoodBlocks.BIRCH_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(JungleWoodBlocks.JUNGLE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(AcaciaWoodBlocks.ACACIA_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(DarkOakWoodBlocks.DARK_OAK_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(MangroveWoodBlocks.MANGROVE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(CrimsonWoodBlocks.CRIMSON_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(WarpedWoodBlocks.WARPED_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_ONE);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_TWO);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_THREE);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_FOUR);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_FIVE);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_SIX);
        blockStateModelGenerator.registerDoor(CopperBlocks.EXPOSED_COPPER_DOOR);
        blockStateModelGenerator.registerDoor(CopperBlocks.WEATHERED_COPPER_DOOR);
        blockStateModelGenerator.registerDoor(CopperBlocks.OXIDIZED_COPPER_DOOR);
        blockStateModelGenerator.registerTrapdoor(CopperBlocks.EXPOSED_COPPER_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(CopperBlocks.WEATHERED_COPPER_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(CopperBlocks.OXIDIZED_COPPER_TRAPDOOR);
        //blockStateModelGenerator.registerWallPlant(AmethystBlocks.AMETHYST_WALL);



//        blockStateModelGenerator.blockStateCollector.accept(createStairsBlockState(block.getStairsBlock(), inner, stairs, outer, false));


    }


    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        //itemModelGenerator.register(ModItems.TEST, Models.GENERATED);
        itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.GENERATED);
    }
}
