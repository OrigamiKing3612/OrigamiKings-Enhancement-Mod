package net.origamiking.mcmods.oem.extra.items;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.items.custom.FutureGunItem;

import static net.origamiking.mcmods.oapi.items.ItemsUtils.registerItem;

public class ModExtraItems {
    public static final Item FUT_GUN = registerItem(OemMain.MOD_ID,"fut_gun", new FutureGunItem());

    public static void register() {
        OemMain.LOGGER.info("Registering Extra Items for " + OemMain.NAME);
    }
}
