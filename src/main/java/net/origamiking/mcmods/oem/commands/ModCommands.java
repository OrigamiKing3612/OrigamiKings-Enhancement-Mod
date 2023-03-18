package net.origamiking.mcmods.oem.commands;

import net.origamiking.mcmods.oem.commands.versioncommand.ModVersionCommand;
public class ModCommands {
    public static void register() {
        ModVersionCommand.getVersionCommand();
    }
}
