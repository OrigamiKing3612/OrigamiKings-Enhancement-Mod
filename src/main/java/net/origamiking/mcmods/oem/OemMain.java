package net.origamiking.mcmods.oem;

import net.fabricmc.api.ModInitializer;
import net.origamiking.mcmods.oem.blocks.ModBlocks;
import net.origamiking.mcmods.oem.commands.ModCommands;
import net.origamiking.mcmods.oem.groups.ModGroups;
import net.origamiking.mcmods.oem.items.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class OemMain implements ModInitializer {
	public static final String MOD_ID = "oem";
	public static final String VERSION = "Your version is: 0.1.3-1.19.3";
	public static final Logger LOGGER = LoggerFactory.getLogger("oem");
	@Override
	public void onInitialize() {
		ModBlocks.register();
		ModItems.register();
		ModGroups.register();
		ModCommands.register();
	}
}
