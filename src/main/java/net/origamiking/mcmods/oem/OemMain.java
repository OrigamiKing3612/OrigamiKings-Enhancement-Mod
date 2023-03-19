package net.origamiking.mcmods.oem;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.origamiking.mcmods.oem.blocks.ModBlocks;
import net.origamiking.mcmods.oem.commands.ModCommands;
import net.origamiking.mcmods.oem.extra.ExtraStuff;
import net.origamiking.mcmods.oem.groups.ModGroups;
import net.origamiking.mcmods.oem.items.ModItems;
import net.origamiking.mcmods.oem.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import software.bernie.example.GeckoLibMod;

public class OemMain implements ModInitializer {
	public static final String MOD_ID = "oem";
	public static final String VERSION = "Your version is: 1.0.0-1.19.4";
	public static final String NAME = "OEM-1.0.0-1.19.4";
	public static final Logger LOGGER = LoggerFactory.getLogger("oem");

	/** Before 1.0.0 comes out
	 * <p>1. Clean up everything</p>
	 * <p>2. Get textures for things that don't have them</p>
	 */
	@Override
	public void onInitialize() {
		ModBlocks.register();
		ModItems.register();
		ModGroups.register();
		ModCommands.register();
		Utils.register();
		if (FabricLoader.getInstance().isModLoaded("oem-extra")) {
			ExtraStuff.registerExtraStuff();
		}
	}
}
