package net.origamiking.mcmods.oemextra.extra.blocks.verticalstairs;

import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oemextra.extra.blocks.verticalstairs.stone.StoneVStairs;
import net.origamiking.mcmods.oemextra.extra.blocks.verticalstairs.wood.WoodVStairs;

public class ModVerticalStairs {
    public static void registerVerticalStairs() {
        OemMain.LOGGER.info("Registering Vertical Stairs for " + OemMain.NAME);
        StoneVStairs.get();
        WoodVStairs.get();
    }
}
