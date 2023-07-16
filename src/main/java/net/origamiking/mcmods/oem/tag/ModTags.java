package net.origamiking.mcmods.oem.tag;

import net.minecraft.block.Block;
import net.minecraft.registry.tag.TagKey;
import net.origamiking.mcmods.oapi.tag.TagUtils;
import net.origamiking.mcmods.oem.OemMain;

public class ModTags {
    public static final TagKey<Block> AZALEA_LOGS = TagUtils.blockTagKey(OemMain.MOD_ID, "azalea_logs");

    public static void register() {
        OemMain.LOGGER.info("Registering Tags for " + OemMain.VERSION);
    }

}
