package net.origamiking.mcmods.oem;

import net.fabricmc.api.ModInitializer;
import net.origamiking.mcmods.oem.blocks.ModBlocks;
import net.origamiking.mcmods.oem.commands.ModCommands;
import net.origamiking.mcmods.oem.groups.ModGroups;
import net.origamiking.mcmods.oem.items.ModItems;
import net.origamiking.mcmods.oem.painting.ModPaintings;
import net.origamiking.mcmods.oem.sounds.ModSounds;
import net.origamiking.mcmods.oem.util.Utils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
//import software.bernie.example.GeckoLibMod;

public class OemMain implements ModInitializer {
	public static final String MOD_ID = "oem";
	public static final String VERSION = "Your version is: 0.6.0-1.19.3";
	public static final Logger LOGGER = LoggerFactory.getLogger("oem");

	/** Before 0.6.0 comes out
	 * 1. Test everything
	 * 2. clean up code
	 * 3. add oapi to jars
	 * 4. update to 1.19.4
	 */
	@Override
	public void onInitialize() {
		ModBlocks.register();
		ModItems.register();
		ModGroups.register();
		ModCommands.register();
		ModSounds.register();
		ModPaintings.register();
		Utils.register();
	}
}
