package net.origamiking.mcmods.oem.commands;

import net.origamiking.mcmods.oapi.commands.CommandsUtil;
import net.origamiking.mcmods.oem.OemMain;
public class ModCommands {
    public static void register() {
        OemMain.LOGGER.info("Registering Commands for " + OemMain.VERSION);
        CommandsUtil.makeVersionCommand(OemMain.MOD_ID, "Your version is: " + OemMain.VERSION);
        CommandsUtil.linkReturnCommand(OemMain.MOD_ID + "-modrinth", "https://modrinth.com/mod/origamikings-enhancement-mod", "To Modrinth Website");
        CommandsUtil.linkReturnCommand(OemMain.MOD_ID + "-curseforge", "https://www.curseforge.com/minecraft/mc-mods/origamikings-enhancement-mod", "To Curseforge Website");
        CommandsUtil.linkReturnCommand(OemMain.MOD_ID + "-issues", "https://github.com/OrigamiKing3612/OrigamiKings-Enhancement-Mod/issues", "To Issues Page");
    }
}
