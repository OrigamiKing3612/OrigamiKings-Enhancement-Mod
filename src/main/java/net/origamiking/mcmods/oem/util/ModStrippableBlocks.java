package net.origamiking.mcmods.oem.util;

import net.origamiking.mcmods.oapi.registry.OrigamiBlockRegistries;
import net.origamiking.mcmods.oem.blocks.wood.azalea.AzaleaWoodBlocks;

public class ModStrippableBlocks {
    public static void registerStrippables() {
        OrigamiBlockRegistries.registerStrippable(AzaleaWoodBlocks.AZALEA_LOG, AzaleaWoodBlocks.STRIPPED_AZALEA_LOG);
        OrigamiBlockRegistries.registerStrippable(AzaleaWoodBlocks.AZALEA_WOOD, AzaleaWoodBlocks.STRIPPED_AZALEA_WOOD);
    }
}
