package net.origamiking.mcmods.oem.blocks.sponge;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.origamiking.mcmods.oapi.blocks.BlocksUtils;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.custom.LavaSpongeBlock;
import net.origamiking.mcmods.oem.blocks.custom.LavaWetSpongeBlock;

public class ModSpongeBlocks extends BlocksUtils {
    public static Block LAVA_SPONGE = registerBlock(OemMain.MOD_ID, "lava_sponge", new LavaSpongeBlock(OrigamiBlockSettings.copy(Blocks.SPONGE), 7, 64));
    public static Block WET_LAVA_SPONGE = registerBlock(OemMain.MOD_ID, "wet_lava_sponge", new LavaWetSpongeBlock(OrigamiBlockSettings.copy(Blocks.SPONGE), LAVA_SPONGE.getDefaultState()));

    public static void get() {
        ((LavaSpongeBlock)LAVA_SPONGE).setWetSponge(WET_LAVA_SPONGE);
    }
}