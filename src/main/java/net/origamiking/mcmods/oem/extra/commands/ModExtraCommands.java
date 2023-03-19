package net.origamiking.mcmods.oem.extra.commands;

import net.origamiking.mcmods.oapi.commands.CommandsUtil;
import net.origamiking.mcmods.oem.OemMain;

public class ModExtraCommands {
    public static void register() {
        OemMain.LOGGER.info("Registering Extra Commands to " + OemMain.NAME);
        CommandsUtil.simpleStringReturnCommand("Server-Rules", "1. No stealing\n2. No griefing\n3. Play nice\n4. No inappropriate stuff (ever)\n5. No chat reporting\n6. Have fun");
        CommandsUtil.makeVersionCommand("oem-extra", "1.0.0-1.19.4");
    }
}
