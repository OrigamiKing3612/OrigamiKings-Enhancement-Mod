package net.origamiking.mcmods.oem.util;

import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.origamiking.mcmods.oem.blocks.wood.azalea.AzaleaWoodBlocks;

public class ModStrippableBlocks {
    public static void registerStrippables() {
        StrippableBlockRegistry.register(AzaleaWoodBlocks.AZALEA_LOG, AzaleaWoodBlocks.STRIPPED_AZALEA_LOG);
        StrippableBlockRegistry.register(AzaleaWoodBlocks.AZALEA_WOOD, AzaleaWoodBlocks.STRIPPED_AZALEA_WOOD);
    }
}
