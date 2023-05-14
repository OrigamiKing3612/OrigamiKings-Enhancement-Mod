package net.origamiking.mcmods.oem.blocks.leaves;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarpetBlock;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;

public class LeafCarpets extends BlocksUtils {
    public static final Block OAK_LEAVES_CARPET = registerBlock(OemMain.MOD_ID, "oak_leaves_carpet", new CarpetBlock(OrigamiBlockSettings.copyOf(Blocks.OAK_LEAVES)));
    public static final Block SPRUCE_LEAVES_CARPET = registerBlock(OemMain.MOD_ID, "spruce_leaves_carpet", new CarpetBlock(OrigamiBlockSettings.copyOf(Blocks.SPRUCE_LEAVES)));
    public static final Block BIRCH_LEAVES_CARPET = registerBlock(OemMain.MOD_ID, "birch_leaves_carpet", new CarpetBlock(OrigamiBlockSettings.copyOf(Blocks.BIRCH_LEAVES)));
    public static final Block JUNGLE_LEAVES_CARPET = registerBlock(OemMain.MOD_ID, "jungle_leaves_carpet", new CarpetBlock(OrigamiBlockSettings.copyOf(Blocks.JUNGLE_LEAVES)));
    public static final Block ACACIA_LEAVES_CARPET = registerBlock(OemMain.MOD_ID, "acacia_leaves_carpet", new CarpetBlock(OrigamiBlockSettings.copyOf(Blocks.ACACIA_LEAVES)));
    public static final Block DARK_OAK_LEAVES_CARPET = registerBlock(OemMain.MOD_ID, "dark_oak_leaves_carpet", new CarpetBlock(OrigamiBlockSettings.copyOf(Blocks.DARK_OAK_LEAVES)));
    public static final Block MANGROVE_LEAVES_CARPET = registerBlock(OemMain.MOD_ID, "mangrove_leaves_carpet", new CarpetBlock(OrigamiBlockSettings.copyOf(Blocks.MANGROVE_LEAVES)));



    public static void getLeafCarpets() {}

}
