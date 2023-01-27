package net.origamiking.mcmods.oem.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.ArmorRegistry;
import net.origamiking.mcmods.oem.armor.materials.CopperArmorMaterial;
import net.origamiking.mcmods.oem.armor.materials.VikingArmorMaterial;
import net.origamiking.mcmods.oem.blocks.custom.FutureGunItem;

public class ModItems {
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));
    public static final Item FUT_GUN = registerItem("fut_gun", new FutureGunItem());


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), item);
    }
    public static void register() {
        CopperArmorMaterial.getCopperArmor.register();
        VikingArmorMaterial.getVikingArmor.register();
        ArmorRegistry.getArmor();
    }
}
