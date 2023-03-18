package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.*;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.copper.WaxedCopperBlocks;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.extra.blocks.serverspecific.ServerSpecificBlocks;
import net.origamiking.mcmods.oem.blocks.wood.acacia.AcaciaWoodBlocks;
import net.origamiking.mcmods.oem.blocks.wood.azalea.AzaleaWoodBlocks;
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
        blockStateModelGenerator.registerSimpleCubeAll(SpruceWoodBlocks.SPRUCE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(BirchWoodBlocks.BIRCH_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(JungleWoodBlocks.JUNGLE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(AcaciaWoodBlocks.ACACIA_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(DarkOakWoodBlocks.DARK_OAK_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(MangroveWoodBlocks.MANGROVE_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(CrimsonWoodBlocks.CRIMSON_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(WarpedWoodBlocks.WARPED_BOOKSHELF);
        blockStateModelGenerator.registerSimpleCubeAll(AzaleaWoodBlocks.AZALEA_BOOKSHELF);
        blockStateModelGenerator.registerRotatable(AzaleaWoodBlocks.AZALEA_WOOD);
        blockStateModelGenerator.registerRotatable(AzaleaWoodBlocks.STRIPPED_AZALEA_WOOD);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_ONE);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_TWO);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_THREE);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_FOUR);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_FIVE);
        blockStateModelGenerator.registerSimpleCubeAll(ServerSpecificBlocks.CAVERNS_BLOCK_SIX);
        blockStateModelGenerator.registerDoor(CopperBlocks.EXPOSED_COPPER_DOOR);
        blockStateModelGenerator.registerDoor(CopperBlocks.WEATHERED_COPPER_DOOR);
        blockStateModelGenerator.registerDoor(CopperBlocks.OXIDIZED_COPPER_DOOR);
        blockStateModelGenerator.registerDoor(WaxedCopperBlocks.WAXED_COPPER_DOOR);
        blockStateModelGenerator.registerDoor(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_DOOR);
        blockStateModelGenerator.registerDoor(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_DOOR);
        blockStateModelGenerator.registerDoor(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_DOOR);
        blockStateModelGenerator.registerDoor(AzaleaWoodBlocks.AZALEA_DOOR);
        blockStateModelGenerator.registerTrapdoor(CopperBlocks.COPPER_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(CopperBlocks.EXPOSED_COPPER_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(CopperBlocks.WEATHERED_COPPER_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(CopperBlocks.OXIDIZED_COPPER_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(WaxedCopperBlocks.WAXED_COPPER_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(WaxedCopperBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(WaxedCopperBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);
        blockStateModelGenerator.registerTrapdoor(AzaleaWoodBlocks.AZALEA_TRAPDOOR);
        blockStateModelGenerator.registerDoor(RandomBlocks.IRON_BAR_DOOR);
        blockStateModelGenerator.registerDoor(RandomBlocks.GOLD_BAR_DOOR);
        blockStateModelGenerator.registerDoor(RandomBlocks.COPPER_BAR_DOOR);
        blockStateModelGenerator.registerDoor(RandomBlocks.EXPOSED_COPPER_BAR_DOOR);
        blockStateModelGenerator.registerDoor(RandomBlocks.WEATHERED_COPPER_BAR_DOOR);
        blockStateModelGenerator.registerDoor(RandomBlocks.OXIDIZED_COPPER_BAR_DOOR);


    }
    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.COPPER_NUGGET, Models.GENERATED);
    }
}
