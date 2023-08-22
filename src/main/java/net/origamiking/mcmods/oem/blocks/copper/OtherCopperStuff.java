package net.origamiking.mcmods.oem.blocks.copper;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;

public class OtherCopperStuff {
    public static void pairWaxedAndNotWaxed() {
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.COPPER_BARS, WaxedCopperBlocks.WAXED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.EXPOSED_COPPER_BARS, WaxedCopperBlocks.WAXED_EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.WEATHERED_COPPER_BARS, WaxedCopperBlocks.WAXED_WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.OXIDIZED_COPPER_BARS, WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_BARS);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.COPPER_CHAIN, WaxedCopperBlocks.WAXED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.EXPOSED_COPPER_CHAIN, WaxedCopperBlocks.WAXED_EXPOSED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.WEATHERED_COPPER_CHAIN, WaxedCopperBlocks.WAXED_WEATHERED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.OXIDIZED_COPPER_CHAIN, WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.COPPER_LANTERN, WaxedCopperBlocks.WAXED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.EXPOSED_COPPER_LANTERN, WaxedCopperBlocks.WAXED_EXPOSED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.WEATHERED_COPPER_LANTERN, WaxedCopperBlocks.WAXED_WEATHERED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.OXIDIZED_COPPER_LANTERN, WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.COPPER_PRESSURE_PLATE, WaxedCopperBlocks.WAXED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.EXPOSED_COPPER_PRESSURE_PLATE, WaxedCopperBlocks.WAXED_EXPOSED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.WEATHERED_COPPER_PRESSURE_PLATE, WaxedCopperBlocks.WAXED_WEATHERED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.OXIDIZED_COPPER_PRESSURE_PLATE, WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.COPPER_BUTTON, WaxedCopperBlocks.WAXED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.EXPOSED_COPPER_BUTTON, WaxedCopperBlocks.WAXED_EXPOSED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.WEATHERED_COPPER_BUTTON, WaxedCopperBlocks.WAXED_WEATHERED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.OXIDIZED_COPPER_BUTTON, WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.COPPER_DOOR, WaxedCopperBlocks.WAXED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.COPPER_TRAPDOOR, WaxedCopperBlocks.WAXED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.EXPOSED_COPPER_DOOR, WaxedCopperBlocks.WAXED_EXPOSED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.EXPOSED_COPPER_TRAPDOOR, WaxedCopperBlocks.WAXED_EXPOSED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.WEATHERED_COPPER_DOOR, WaxedCopperBlocks.WAXED_WEATHERED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.WEATHERED_COPPER_TRAPDOOR, WaxedCopperBlocks.WAXED_WEATHERED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.OXIDIZED_COPPER_DOOR, WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CopperBlocks.OXIDIZED_COPPER_TRAPDOOR, WaxedCopperBlocks.WAXED_OXIDIZED_COPPER_TRAPDOOR);
    }

    public static void pairTypesofCopper() {
        //bars
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.COPPER_BARS, CopperBlocks.EXPOSED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.EXPOSED_COPPER_BARS, CopperBlocks.WEATHERED_COPPER_BARS);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.WEATHERED_COPPER_BARS, CopperBlocks.OXIDIZED_COPPER_BARS);
        //chain
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.COPPER_CHAIN, CopperBlocks.EXPOSED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.EXPOSED_COPPER_CHAIN, CopperBlocks.WEATHERED_COPPER_CHAIN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.WEATHERED_COPPER_CHAIN, CopperBlocks.OXIDIZED_COPPER_CHAIN);
        //lantern
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.COPPER_LANTERN, CopperBlocks.EXPOSED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.EXPOSED_COPPER_LANTERN, CopperBlocks.WEATHERED_COPPER_LANTERN);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.WEATHERED_COPPER_LANTERN, CopperBlocks.OXIDIZED_COPPER_LANTERN);
        //plate
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.COPPER_PRESSURE_PLATE, CopperBlocks.EXPOSED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.EXPOSED_COPPER_PRESSURE_PLATE, CopperBlocks.WEATHERED_COPPER_PRESSURE_PLATE);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.WEATHERED_COPPER_PRESSURE_PLATE, CopperBlocks.OXIDIZED_COPPER_PRESSURE_PLATE);
        //button
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.COPPER_BUTTON, CopperBlocks.EXPOSED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.EXPOSED_COPPER_BUTTON, CopperBlocks.WEATHERED_COPPER_BUTTON);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.WEATHERED_COPPER_BUTTON, CopperBlocks.OXIDIZED_COPPER_BUTTON);
        //door
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.COPPER_DOOR, CopperBlocks.EXPOSED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.EXPOSED_COPPER_DOOR, CopperBlocks.WEATHERED_COPPER_DOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.WEATHERED_COPPER_DOOR, CopperBlocks.OXIDIZED_COPPER_DOOR);
        //trapdoor
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.COPPER_TRAPDOOR, CopperBlocks.EXPOSED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.EXPOSED_COPPER_TRAPDOOR, CopperBlocks.WEATHERED_COPPER_TRAPDOOR);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(CopperBlocks.WEATHERED_COPPER_TRAPDOOR, CopperBlocks.OXIDIZED_COPPER_TRAPDOOR);
    }
}
