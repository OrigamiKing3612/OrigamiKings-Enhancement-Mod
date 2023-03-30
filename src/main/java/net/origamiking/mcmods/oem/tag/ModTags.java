package net.origamiking.mcmods.oem.tag;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.origamiking.mcmods.oem.OemMain;

public class ModTags {
    public static final TagKey<Block> AZALEA_LOGS = TagKey.of(Registry.BLOCK_KEY, new Identifier(OemMain.MOD_ID, "azalea_logs"));

    public static void register() {
        OemMain.LOGGER.info("Registering Tags for " + OemMain.NAME);
    }

}
