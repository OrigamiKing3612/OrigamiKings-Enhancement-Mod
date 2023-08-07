package net.origamiking.mcmods.oem.blocks.woodcutter;

import net.minecraft.block.Block;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.custom.WoodcutterBlock;

import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;

public class ModWoodcutter {
    public static Block WOODCUTTER;

    public static void registerWoodcutter() {
        if (!OemMain.getOemConfig().disableWoodcutter) {
            WOODCUTTER = registerBlock(OemMain.MOD_ID, "woodcutter", new WoodcutterBlock(OrigamiBlockSettings.create().requiresTool().strength(3.5f)));
        } else {
            WOODCUTTER = registerBlock(OemMain.MOD_ID, "oem_woodcutter", new WoodcutterBlock(OrigamiBlockSettings.create().requiresTool().strength(3.5f)));
        }
    }
}
