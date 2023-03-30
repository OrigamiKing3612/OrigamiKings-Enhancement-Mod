package net.origamiking.mcmods.oem.items;

import net.minecraft.item.Item;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.materials.CopperArmorMaterial;

import static net.origamiking.mcmods.oapi.items.ItemsUtils.registerItem;

public class ModItems {
    public static final Item COPPER_NUGGET = registerItem(OemMain.MOD_ID,"copper_nugget", new Item(new OrigamiItemSettings()));
    public static void register() {
        CopperArmorMaterial.getCopperArmor.register();
        OemMain.LOGGER.info("Registering Items for " + OemMain.NAME );
    }
}
