package net.origamiking.mcmods.oem.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.ArmorRegistry;
import net.origamiking.mcmods.oem.armor.materials.CopperArmorMaterial;
import net.origamiking.mcmods.oem.armor.materials.VikingArmorMaterial;
import net.origamiking.mcmods.oem.items.custom.FutureGunArrowEntity;
import net.origamiking.mcmods.oem.items.custom.FutureGunItem;

public class ModItems {
    public static final Item COPPER_NUGGET = registerItem("copper_nugget", new Item(new FabricItemSettings()));
    public static final Item FUT_GUN = registerItem("fut_gun", new FutureGunItem());
    public static final Item FUTURE_GUN_ARROW = new FutureGunItem();

    public static final EntityType<FutureGunArrowEntity> FutureGunArrowEntityType = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(OemMain.MOD_ID, "fut_gun_arrow"),
            FabricEntityTypeBuilder.<FutureGunArrowEntity>create(SpawnGroup.MISC, FutureGunArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F)) // dimensions in Minecraft units of the projectile
                    .trackRangeBlocks(4).trackedUpdateRate(10) // necessary for all thrown projectiles
                    .build());

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, name), item);
    }
    public static void register() {
        Registry.register(Registries.ITEM, new Identifier(OemMain.MOD_ID, "packed_snowball"), FUTURE_GUN_ARROW);

        CopperArmorMaterial.getCopperArmor.register();
        VikingArmorMaterial.getVikingArmor.register();
        ArmorRegistry.getArmor();
    }
}
