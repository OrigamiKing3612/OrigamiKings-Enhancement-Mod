package net.origamiking.mcmods.oem;

import com.google.common.collect.Lists;
import net.fabricmc.api.ModInitializer;
import net.minecraft.item.ItemConvertible;
import net.minecraft.util.Util;
import net.origamiking.mcmods.oem.blocks.ModBlocks;
import net.origamiking.mcmods.oem.groups.ModGroups;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

public class OemMain implements ModInitializer {
	public static final String MOD_ID = "oem";
	public static final Logger LOGGER = LoggerFactory.getLogger("oem");
	@Override
	public void onInitialize() {
		ModBlocks.register();
		ModGroups.register();
	}
}
