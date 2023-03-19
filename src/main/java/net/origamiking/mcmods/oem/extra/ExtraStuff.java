package net.origamiking.mcmods.oem.extra;

import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.ArmorRegistry;
import net.origamiking.mcmods.oem.extra.blocks.serverspecific.ServerSpecificBlocks;
import net.origamiking.mcmods.oem.extra.blocks.verticalstairs.ModVerticalStairs;
import net.origamiking.mcmods.oem.extra.commands.ModExtraCommands;
import net.origamiking.mcmods.oem.extra.groups.ModExtraGroups;
import net.origamiking.mcmods.oem.extra.items.ModExtraItems;
import net.origamiking.mcmods.oem.extra.painting.ModPaintings;

public class ExtraStuff {
    public static void registerExtraStuff() {
        OemMain.LOGGER.info("Registering Extra Stuff for " + OemMain.NAME);

        ServerSpecificBlocks.getServerSpecific();
        ModExtraGroups.register();
        ArmorRegistry.getArmor();
        ModVerticalStairs.registerVerticalStairs();
        ModExtraItems.register();
        ModPaintings.register();
        ModExtraCommands.register();
    }
}
