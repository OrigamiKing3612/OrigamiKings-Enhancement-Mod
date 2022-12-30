package net.origamiking.mcmods.oem.commands.versioncommand;

import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.text.Text;
import net.origamiking.mcmods.oem.OemMain;

import static net.minecraft.server.command.CommandManager.*;

public class ModVersionCommand {
    public static void getVersionCommand() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("oem-version")
                .executes(context -> {
                    context.getSource().sendMessage(Text.of(OemMain.VERSION)/*Text.literal("Called /oem with no arguments")*/);
                    return 1;
                })));
    }
}
