package net.origamiking.mcmods.oem.blocks.woodcutter;

import net.minecraft.block.*;
import net.origamiking.mcmods.oapi.blocks.OrigamiBlockSettings;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.custom.WoodcutterBlock;
import static net.origamiking.mcmods.oapi.blocks.BlocksUtils.registerBlock;

public class ModWoodcutter {
    public static final Block WOODCUTTER = registerBlock(OemMain.MOD_ID,"woodcutter", new WoodcutterBlock(OrigamiBlockSettings.of(Material.WOOD).requiresTool().strength(3.5f)));
    public static void registerWoodcutter() {}
}
