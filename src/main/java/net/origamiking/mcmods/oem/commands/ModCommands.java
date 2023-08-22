package net.origamiking.mcmods.oem.commands;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.server.command.ServerCommandSource;
import net.minecraft.text.ClickEvent;
import net.minecraft.text.HoverEvent;
import net.minecraft.text.Text;
import net.origamiking.mcmods.oem.OemMain;

import static net.minecraft.server.command.CommandManager.literal;

public class ModCommands {
    public static void register() {
        OemMain.LOGGER.info("Registering Commands for " + OemMain.VERSION);
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> {
            LiteralArgumentBuilder<ServerCommandSource> command = LiteralArgumentBuilder.literal("oem");

            versionCommand(command, OemMain.VERSION, OemMain.MOD_ID);

            linkReturnCommand(command, "modrinth", "https://modrinth.com/mod/origamikings-enhancement-mod", "To Modrinth Page");
            linkReturnCommand(command, "curseforge", "https://www.curseforge.com/minecraft/mc-mods/origamikings-enhancement-mod", "To Curseforge Page");
            linkReturnCommand(command, "issues", "https://github.com/OrigamiKing3612/OrigamiKings-Enhancement-Mod/issues", "To Issues Page");

            dispatcher.register(command);
        });
    }

    //todo oapi
    public static void linkReturnCommand(LiteralArgumentBuilder<ServerCommandSource> command, String commandName, String link, String hoverText) {
        command.then(literal(commandName).executes(context -> {
            context.getSource().sendMessage(Text.literal(link).styled(style -> style.withClickEvent(new ClickEvent(ClickEvent.Action.OPEN_URL, link))).styled(style -> style.withHoverEvent(new HoverEvent(HoverEvent.Action.SHOW_TEXT, Text.of(hoverText)))));
            return 1;
        }));
    }

    public static void versionCommand(LiteralArgumentBuilder<ServerCommandSource> command, String version, String modid) {
        command.then(literal("version").executes(context -> {
            context.getSource().sendMessage(Text.of("You are on " + version + " of " + modid));
            return 1;
        }));
    }
}
