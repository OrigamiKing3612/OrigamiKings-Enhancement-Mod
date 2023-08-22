package net.origamiking.mcmods.oem.items;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oapi.items.OrigamiItemSettings;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.materials.CopperArmorMaterial;
import net.origamiking.mcmods.oem.items.custom.FutureGunArrowEntity;

import static net.origamiking.mcmods.oapi.items.ItemsUtils.registerItem;

public class ModItems {
    public static final Item COPPER_NUGGET = registerItem(OemMain.MOD_ID, "copper_nugget", new Item(new OrigamiItemSettings()));
    public static final EntityType<FutureGunArrowEntity> FutureGunArrowEntityType = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier(OemMain.MOD_ID, "fut_gun_arrow"),
            FabricEntityTypeBuilder.<FutureGunArrowEntity>create(SpawnGroup.MISC, FutureGunArrowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.25F, 0.25F)) // dimensions in Minecraft units of the projectile
                    .trackRangeBlocks(4).trackedUpdateRate(10) // necessary for all thrown projectiles
                    .build());

    public static void register() {
        CopperArmorMaterial.getCopperArmor.register();
        OemMain.LOGGER.info("Registering Items for " + OemMain.VERSION);
    }
}
