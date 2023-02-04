package net.origamiking.mcmods.oem.items.custom;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.mob.BlazeEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.hit.EntityHitResult;
import net.minecraft.util.hit.HitResult;
import net.minecraft.world.World;
import net.origamiking.mcmods.oem.items.ModItems;

public class FutureGunArrowEntity extends PersistentProjectileEntity {
    public FutureGunArrowEntity(EntityType<? extends FutureGunArrowEntity> entityType, World world) {super(entityType, world);}
    public FutureGunArrowEntity(World world, LivingEntity owner) {
        super(ModItems.FutureGunArrowEntityType, owner, world);
    }



    protected void onEntityHit(EntityHitResult entityHitResult) { // called on entity hit.
        super.onEntityHit(entityHitResult);
        Entity entity = entityHitResult.getEntity(); // sets a new Entity instance as the EntityHitResult (victim)
        int i = entity instanceof BlazeEntity ? 3 : 0; // sets i to 3 if the Entity instance is an instance of BlazeEntity
        entity.damage(DamageSource.thrownProjectile(this, this.getOwner()), (float) i); // deals damage

        if (entity instanceof LivingEntity livingEntity) { // checks if entity is an instance of LivingEntity (meaning it is not a boat or minecart)
            livingEntity.addStatusEffect((new StatusEffectInstance(StatusEffects.SLOWNESS, 200 * 3, 255))); // applies a status effect
        }
    }

    @Override
    protected ItemStack asItemStack() {
        return new ItemStack(ModItems.FUTURE_GUN_ARROW);
    }

    protected void onCollision(HitResult hitResult) { // called on collision with a block
        super.onCollision(hitResult);
        if (!this.world.isClient) { // checks if the world is client
            this.world.sendEntityStatus(this, (byte) 3); // particle?
            this.kill(); // kills the projectile
        }
    }
}
