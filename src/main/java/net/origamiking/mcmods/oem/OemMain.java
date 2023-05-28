package net.origamiking.mcmods.oem;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.origamiking.mcmods.oem.blocks.ModBlocks;
import net.origamiking.mcmods.oem.commands.ModCommands;
import net.origamiking.mcmods.oem.recipe.ModRecipeType;
import net.origamiking.mcmods.oem.screen.ModScreenHandlers;
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
	public static final String VERSION = "OEM-1.0.7-1.20";
	public static final Logger LOGGER = LoggerFactory.getLogger(OemMain.MOD_ID);
	@Override
	public void onInitialize() {
		Main();
	}
	//TODO terracotta slabs stairs walls
	public static void Main() {
		if (!FabricLoader.getInstance().isModLoaded("origamikings-api"))
			throw new RuntimeException("Please install OrigamiKings-API (https://modrinth.com/mod/origamikings-api)");
		ModBlocks.register();
		ModItems.register();
		ModGroups.register();
		ModCommands.register();
		Utils.register();
		ModTags.register();
		ModRecipeType.register();
        ModScreenHandlers.register();
//		ModRecipeType.register();

		if (FabricLoader.getInstance().isModLoaded("oem-extra")) OemExtraMain.registerExtraStuff();
	}
}
