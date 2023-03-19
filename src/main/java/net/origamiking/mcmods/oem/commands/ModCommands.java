package net.origamiking.mcmods.oem.commands;

import net.origamiking.mcmods.oapi.commands.CommandsUtil;
import net.origamiking.mcmods.oem.OemMain;
public class ModCommands {
    public static void register() {
        OemMain.LOGGER.info("Registering Commands for " + OemMain.NAME);
        CommandsUtil.makeVersionCommand(OemMain.MOD_ID, OemMain.VERSION);
    }
}
