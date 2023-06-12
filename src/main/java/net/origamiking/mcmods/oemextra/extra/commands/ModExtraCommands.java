package net.origamiking.mcmods.oemextra.extra.commands;

import net.origamiking.mcmods.oapi.commands.CommandsUtil;
import net.origamiking.mcmods.oem.OemMain;

public class ModExtraCommands {
    public static void register() {
        OemMain.LOGGER.info("Registering Extra Commands to " + OemMain.VERSION);
        CommandsUtil.simpleStringReturnCommand("Server-Rules", "mc.origamiking.net Server Rules\n1. No stealing\n2. No griefing\n3. Play nice\n4. No inappropriate stuff (ever)\n5. No chat reporting\n6. Have fun");
        CommandsUtil.makeVersionCommand("oem-extra", "1.0.3-1.20.1");
    }
}
