package net.origamiking.mcmods.oem.tag;

import net.minecraft.item.Item;
import net.minecraft.registry.tag.TagKey;
import net.origamiking.mcmods.oapi.tag.TagUtils;
import net.origamiking.mcmods.oem.OemMain;

public class ModItemTags {
    public static final TagKey<Item> SPAWN_EGGS = TagUtils.itemTagKey(OemMain.MOD_ID, "spawn_eggs");

    public static void register() {
        OemMain.LOGGER.info("Registering Item Tags for " + OemMain.VERSION);
    }
}
