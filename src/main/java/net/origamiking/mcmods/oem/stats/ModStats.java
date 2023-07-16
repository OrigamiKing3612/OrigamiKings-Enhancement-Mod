package net.origamiking.mcmods.oem.stats;

import net.minecraft.stat.StatFormatter;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oapi.stats.StatUtils;
import net.origamiking.mcmods.oem.OemMain;

public class ModStats extends StatUtils {
    public static final Identifier INTERACT_WITH_WOODCUTTER = registerStat(OemMain.MOD_ID, "interact_with_woodcutter", StatFormatter.DEFAULT);
    public static void register() {

    }
}
