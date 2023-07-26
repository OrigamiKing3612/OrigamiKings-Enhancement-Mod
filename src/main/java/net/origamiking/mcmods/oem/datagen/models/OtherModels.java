package net.origamiking.mcmods.oem.datagen.models;

import net.minecraft.data.client.BlockStateModelGenerator;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;
import net.origamiking.mcmods.oem.blocks.copper.WaxedCopperBlocks;
import net.origamiking.mcmods.oem.blocks.randomblocks.RandomBlocks;
import net.origamiking.mcmods.oem.blocks.wood.azalea.AzaleaWoodBlocks;

public class OtherModels {
    public static void get(BlockStateModelGenerator blockStateModelGenerator) {
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
        blockStateModelGenerator.registerRotatable(AzaleaWoodBlocks.AZALEA_WOOD);
        blockStateModelGenerator.registerRotatable(AzaleaWoodBlocks.STRIPPED_AZALEA_WOOD);
    }
}
