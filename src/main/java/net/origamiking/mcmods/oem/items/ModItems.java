package net.origamiking.mcmods.oem.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.entity.vehicle.BoatEntity;
import net.minecraft.item.BoatItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.ArmorRegistry;
import net.origamiking.mcmods.oem.armor.materials.CopperArmorMaterial;
import net.origamiking.mcmods.oem.armor.materials.VikingArmorMaterial;
//import net.origamiking.mcmods.oem.entity.ModBoatEntity;
import net.origamiking.mcmods.oem.items.custom.FutureGunArrowEntity;
import net.origamiking.mcmods.oem.items.custom.FutureGunArrowEntityItem;
import net.origamiking.mcmods.oem.items.custom.FutureGunItem;
//import net.origamiking.mcmods.oem.items.custom.ModBoatItem;

public class ModItems {
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));
    public static final Item FUT_GUN = registerItem("fut_gun", new FutureGunItem());
    public static final EntityType<FutureGunArrowEntity> FutureGunArrowEntityType = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(OemMain.MOD_ID, "fut_gun_arrow"),
            FabricEntityTypeBuilder.<FutureGunArrowEntity>create(SpawnGroup.MISC, FutureGunArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F)) // dimensions in Minecraft units of the projectile
                    .trackRangeBlocks(4).trackedUpdateRate(10) // necessary for all thrown projectiles
                    .build());


    public static final Item FUTURE_GUN_ARROW = registerItem("fut_gun_arrow", new FutureGunArrowEntityItem(new Item.Settings()));
//    public static final Item AZALEA_BOAT_ITEM = registerItem("azalea_boat", new ModBoatItem(false, ModBoatEntity.Type.AZALEA, new Item.Settings().maxCount(1)));
//    public static final Item AZALEA_CHEST_BOAT = registerItem("azalea_chest_boat", new ModBoatItem(true, ModBoatEntity.Type.AZALEA, new Item.Settings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), item);
    }
    public static void register() {
        CopperArmorMaterial.getCopperArmor.register();
        VikingArmorMaterial.getVikingArmor.register();
        ArmorRegistry.getArmor();
    }
}
