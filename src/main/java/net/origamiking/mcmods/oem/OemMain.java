package net.origamiking.mcmods.oem;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.origamiking.mcmods.oem.blocks.ModBlocks;
import net.origamiking.mcmods.oem.commands.ModCommands;
import net.origamiking.mcmods.oem.screen.ModScreenHandlerType;
import net.origamiking.mcmods.oem.tag.ModTags;
import net.origamiking.mcmods.oemextra.extra.OemExtraMain;
import net.origamiking.mcmods.oem.groups.ModGroups;
import net.origamiking.mcmods.oem.items.ModItems;
import net.origamiking.mcmods.oem.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import software.bernie.example.GeckoLibMod;

public class OemMain implements ModInitializer {
	public static final String MOD_ID = "oem";
	public static final String NAME = "OEM-1.0.6-1.19.4";
	public static final String VERSION = "Your version is: " + NAME;
	public static final Logger LOGGER = LoggerFactory.getLogger("oem");
	@Override
	public void onInitialize() {
		Main();
	}
	//TODO add woodcutter recipe type/recipes, terracotta slabs stairs walls, map color for everything
	public static void Main() {
		ModBlocks.register();
		ModItems.register();
		ModGroups.register();
		ModCommands.register();
		Utils.register();
		ModTags.register();
		ModScreenHandlerType.get();
		if (FabricLoader.getInstance().isModLoaded("oem-extra")) {
			OemExtraMain.registerExtraStuff();
		}
	}
}
