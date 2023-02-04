package net.origamiking.mcmods.oem.items.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FutureGunArrowEntityItem extends Item {
    public FutureGunArrowEntityItem(Item.Settings settings) {
        super(settings);
    }

    public PersistentProjectileEntity createFutureGunArrow(World world, ItemStack stack, LivingEntity shooter) {
        FutureGunArrowEntity futureGunArrowEntity = new FutureGunArrowEntity(world, shooter);
//        futureGunArrowEntity.initFromStack(stack);
        return futureGunArrowEntity;
    }
}
