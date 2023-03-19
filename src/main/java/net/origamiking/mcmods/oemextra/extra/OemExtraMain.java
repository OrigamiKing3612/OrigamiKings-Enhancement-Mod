package net.origamiking.mcmods.oemextra.extra;

import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.ArmorRegistry;
import net.origamiking.mcmods.oemextra.extra.blocks.serverspecific.ServerSpecificBlocks;
import net.origamiking.mcmods.oemextra.extra.blocks.verticalstairs.ModVerticalStairs;
import net.origamiking.mcmods.oemextra.extra.commands.ModExtraCommands;
import net.origamiking.mcmods.oemextra.extra.groups.ModExtraGroups;
import net.origamiking.mcmods.oemextra.extra.items.ModExtraItems;
import net.origamiking.mcmods.oemextra.extra.painting.ModPaintings;

public class OemExtraMain {
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
