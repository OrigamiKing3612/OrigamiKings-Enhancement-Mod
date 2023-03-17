package net.origamiking.mcmods.oem.blocks.vercticalslabs.copper;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.origamiking.mcmods.oem.blocks.custom.VerticalSlabBlock;
import net.origamiking.mcmods.oem.blocks.custom.copper.oxidiziable.OxidizableCopperVerticalSlab;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.ModVericalSlabs;

public class CopperVSlabs extends ModVericalSlabs {
    public static final Block VERTICAL_CUT_COPPER_SLAB = registerBlock("vertical_cut_copper_slab", new OxidizableCopperVerticalSlab(Oxidizable.OxidationLevel.UNAFFECTED, FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block VERTICAL_EXPOSED_CUT_COPPER_SLAB = registerBlock("vertical_exposed_cut_copper_slab", new OxidizableCopperVerticalSlab(Oxidizable.OxidationLevel.EXPOSED, FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER)));
    public static final Block VERTICAL_WEATHERED_CUT_COPPER_SLAB = registerBlock("vertical_weathered_cut_copper_slab",  new OxidizableCopperVerticalSlab(Oxidizable.OxidationLevel.WEATHERED, FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER)));
    public static final Block VERTICAL_OXIDIZED_CUT_COPPER_SLAB = registerBlock("vertical_oxidized_cut_copper_slab",  new OxidizableCopperVerticalSlab(Oxidizable.OxidationLevel.OXIDIZED, FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER)));

    public static final Block VERTICAL_WAXED_CUT_COPPER_SLAB = registerBlock("vertical_waxed_cut_copper_slab",  new VerticalSlabBlock(FabricBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB = registerBlock("vertical_waxed_exposed_cut_copper_slab",  new VerticalSlabBlock(FabricBlockSettings.copyOf(Blocks.EXPOSED_COPPER)));
    public static final Block VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB = registerBlock("vertical_waxed_weathered_cut_copper_slab",  new VerticalSlabBlock(FabricBlockSettings.copyOf(Blocks.WEATHERED_COPPER)));
    public static final Block VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB = registerBlock("vertical_waxed_oxidized_cut_copper_slab",  new VerticalSlabBlock(FabricBlockSettings.copyOf(Blocks.OXIDIZED_COPPER)));

    static {
        OxidizableBlocksRegistry.registerWaxableBlockPair(VERTICAL_CUT_COPPER_SLAB, VERTICAL_WAXED_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(VERTICAL_EXPOSED_CUT_COPPER_SLAB, VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(VERTICAL_WEATHERED_CUT_COPPER_SLAB, VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(VERTICAL_OXIDIZED_CUT_COPPER_SLAB, VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(VERTICAL_CUT_COPPER_SLAB, VERTICAL_EXPOSED_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(VERTICAL_EXPOSED_CUT_COPPER_SLAB, VERTICAL_WEATHERED_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(VERTICAL_WEATHERED_CUT_COPPER_SLAB, VERTICAL_OXIDIZED_CUT_COPPER_SLAB);
    }


    public static void get() {}
}
