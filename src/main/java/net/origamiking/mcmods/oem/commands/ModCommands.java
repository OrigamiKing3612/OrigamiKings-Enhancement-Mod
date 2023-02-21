package net.origamiking.mcmods.oem.commands;


import net.origamiking.mcmods.oem.commands.serverrulescommand.ModServerRulesCommand;
import net.origamiking.mcmods.oem.commands.versioncommand.ModVersionCommand;
public class ModCommands {
    public static void register() {
        ModVersionCommand.getcommand();
        ModServerRulesCommand.getCommand();
    }
}
