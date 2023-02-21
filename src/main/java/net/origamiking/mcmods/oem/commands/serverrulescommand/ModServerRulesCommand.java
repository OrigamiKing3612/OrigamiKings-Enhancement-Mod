package net.origamiking.mcmods.oem.commands.serverrulescommand;

import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.text.Text;

import static net.minecraft.server.command.CommandManager.literal;

public class ModServerRulesCommand {
    public static void getCommand() {
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("rules")
                .executes(context -> {
                    ClientPlayConnectionEvents.JOIN.register((handler, sender, client) -> {
                        if (handler.getConnection().toString().equals("mc.origamiking.net") || handler.getConnection().toString().equals("192.168.1.234:25500") ) {
                            // The client is connected to the specified server.
                            context.getSource().sendMessage(Text.literal("rules go here"));
//                            return 1;
                        } else {
                            // The client is not connected to the specified server.
                            context.getSource().sendMessage(Text.literal("Please join the correct server to use this command"));
//                            return 0;
                        }
                    });
                    return 1;
                })));
    }
}
