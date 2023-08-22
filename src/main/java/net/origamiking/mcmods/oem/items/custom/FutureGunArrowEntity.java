package net.origamiking.mcmods.oem.items.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.world.World;

public class FutureGunArrowEntity extends PersistentProjectileEntity {
    public FutureGunArrowEntity(EntityType<? extends FutureGunArrowEntity> entityType, World world) {
        super(entityType, world);
    }
//    public FutureGunArrowEntity(World world, double x, double y, double z) {
//        super(EntityType.ARROW, x, y, z, world);
//    }

    public FutureGunArrowEntity(World world, LivingEntity owner) {
        super(EntityType.ARROW, owner, world);
    }

    @Override
    protected ItemStack asItemStack() {
        return Items.ARROW.getDefaultStack();
    }

    public void onEntityHit(EntityHitResult entityHitResult) { // called on entity hit.
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity(); // sets a new Entity instance as the EntityHitResult (victim)
        int i = entity instanceof BlazeEntity ? 3 : 0; // sets i to 3 if the Entity instance is an instance of BlazeEntity
        entity.damage(getWorld().getDamageSources().arrow(this, this.getOwner()), (float) i); // deals damage

        if (entity instanceof LivingEntity livingEntity) { // checks if entity is an instance of LivingEntity (meaning it is not a boat or minecart)
            livingEntity.addStatusEffect((new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 255))); // applies a status effect
        }
    }
}
