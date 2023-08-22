package net.origamiking.mcmods.oem.blocks.vercticalslabs.copper;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Oxidizable;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.custom.VerticalSlabBlock;
import net.origamiking.mcmods.oem.blocks.custom.copper.oxidiziable.OxidizableCopperVerticalSlab;

public class CopperVSlabs extends BlocksUtils {
    public static final Block VERTICAL_CUT_COPPER_SLAB = registerBlock(OemMain.MOD_ID, "vertical_cut_copper_slab", new OxidizableCopperVerticalSlab(Oxidizable.OxidationLevel.UNAFFECTED, OrigamiBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block VERTICAL_EXPOSED_CUT_COPPER_SLAB = registerBlock(OemMain.MOD_ID, "vertical_exposed_cut_copper_slab", new OxidizableCopperVerticalSlab(Oxidizable.OxidationLevel.EXPOSED, OrigamiBlockSettings.copyOf(Blocks.EXPOSED_COPPER)));
    public static final Block VERTICAL_WEATHERED_CUT_COPPER_SLAB = registerBlock(OemMain.MOD_ID, "vertical_weathered_cut_copper_slab", new OxidizableCopperVerticalSlab(Oxidizable.OxidationLevel.WEATHERED, OrigamiBlockSettings.copyOf(Blocks.WEATHERED_COPPER)));
    public static final Block VERTICAL_OXIDIZED_CUT_COPPER_SLAB = registerBlock(OemMain.MOD_ID, "vertical_oxidized_cut_copper_slab", new OxidizableCopperVerticalSlab(Oxidizable.OxidationLevel.OXIDIZED, OrigamiBlockSettings.copyOf(Blocks.OXIDIZED_COPPER)));

    public static final Block VERTICAL_WAXED_CUT_COPPER_SLAB = registerBlock(OemMain.MOD_ID, "vertical_waxed_cut_copper_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.COPPER_BLOCK)));
    public static final Block VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB = registerBlock(OemMain.MOD_ID, "vertical_waxed_exposed_cut_copper_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.EXPOSED_COPPER)));
    public static final Block VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB = registerBlock(OemMain.MOD_ID, "vertical_waxed_weathered_cut_copper_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.WEATHERED_COPPER)));
    public static final Block VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB = registerBlock(OemMain.MOD_ID, "vertical_waxed_oxidized_cut_copper_slab", new VerticalSlabBlock(OrigamiBlockSettings.copyOf(Blocks.OXIDIZED_COPPER)));

    static {
        OxidizableBlocksRegistry.registerWaxableBlockPair(VERTICAL_CUT_COPPER_SLAB, VERTICAL_WAXED_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(VERTICAL_EXPOSED_CUT_COPPER_SLAB, VERTICAL_WAXED_EXPOSED_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(VERTICAL_WEATHERED_CUT_COPPER_SLAB, VERTICAL_WAXED_WEATHERED_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerWaxableBlockPair(VERTICAL_OXIDIZED_CUT_COPPER_SLAB, VERTICAL_WAXED_OXIDIZED_CUT_COPPER_SLAB);

        OxidizableBlocksRegistry.registerOxidizableBlockPair(VERTICAL_CUT_COPPER_SLAB, VERTICAL_EXPOSED_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(VERTICAL_EXPOSED_CUT_COPPER_SLAB, VERTICAL_WEATHERED_CUT_COPPER_SLAB);
        OxidizableBlocksRegistry.registerOxidizableBlockPair(VERTICAL_WEATHERED_CUT_COPPER_SLAB, VERTICAL_OXIDIZED_CUT_COPPER_SLAB);
    }


    public static void get() {
    }
}
