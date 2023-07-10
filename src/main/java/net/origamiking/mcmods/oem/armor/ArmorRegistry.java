package net.origamiking.mcmods.oem.armor;

import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.materials.VikingArmorMaterial;

import static net.origamiking.mcmods.oapi.armor.ArmorUtils.registerArmor;

public class ArmorRegistry {
    public static final VikingArmorItem VIKING_ARMOR_HELMET = registerArmor(OemMain.MOD_ID, "viking_armor", new VikingArmorItem(VikingArmorMaterial.getVikingArmor.VIKING_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()));

    public static void getArmor() {
        OemMain.LOGGER.info("Registering Extra Armor for " + OemMain.VERSION);
    }
}
