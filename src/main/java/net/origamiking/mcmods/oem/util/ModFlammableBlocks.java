package net.origamiking.mcmods.oem.util;

import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.origamiking.mcmods.oem.blocks.wood.azalea.AzaleaWoodBlocks;

public class ModFlammableBlocks {
    public static void registerFlammableBlocks() {
        FlammableBlockRegistry registry = FlammableBlockRegistry.getDefaultInstance();
        registry.add(AzaleaWoodBlocks.AZALEA_LADDER,5, 5);
        registry.add(AzaleaWoodBlocks.AZALEA_BARREL,5, 5);
        registry.add(AzaleaWoodBlocks.AZALEA_BOOKSHELF,5, 5);
        registry.add(AzaleaWoodBlocks.AZALEA_LOG,5, 5);
        registry.add(AzaleaWoodBlocks.STRIPPED_AZALEA_LOG,5, 5);
        registry.add(AzaleaWoodBlocks.AZALEA_WOOD,5, 5);
        registry.add(AzaleaWoodBlocks.STRIPPED_AZALEA_WOOD,5, 5);
        registry.add(AzaleaWoodBlocks.AZALEA_PLANKS,5, 5);
        registry.add(AzaleaWoodBlocks.AZALEA_STAIR,5, 5);
        registry.add(AzaleaWoodBlocks.AZALEA_SLAB,5, 5);
        registry.add(AzaleaWoodBlocks.AZALEA_FENCE,5, 5);
        registry.add(AzaleaWoodBlocks.AZALEA_FENCE_GATE,5, 5);
        registry.add(AzaleaWoodBlocks.AZALEA_DOOR,5, 5);
        registry.add(AzaleaWoodBlocks.AZALEA_TRAPDOOR,5, 5);
        registry.add(AzaleaWoodBlocks.AZALEA_PRESSURE_PLATE,5, 5);
        registry.add(AzaleaWoodBlocks.AZALEA_BUTTON,5, 5);
    }
}
