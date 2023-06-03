package net.origamiking.mcmods.oem.items.custom;

import net.minecraft.client.render.item.BuiltinModelItemRenderer;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.PersistentProjectileEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;
import net.origamiking.mcmods.oem.items.custom.renderers.FutureGunRenderer;
import software.bernie.geckolib.animatable.GeoItem;
import software.bernie.geckolib.animatable.SingletonGeoAnimatable;
import software.bernie.geckolib.animatable.client.RenderProvider;
import software.bernie.geckolib.constant.DefaultAnimations;
import software.bernie.geckolib.core.animatable.instance.AnimatableInstanceCache;
import software.bernie.geckolib.core.animation.AnimatableManager;
import software.bernie.geckolib.core.animation.AnimationController;
import software.bernie.geckolib.core.object.PlayState;
import software.bernie.geckolib.util.GeckoLibUtil;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class FutureGunItem extends Item implements GeoItem {
    private final AnimatableInstanceCache cache = GeckoLibUtil.createInstanceCache(this);
    private final Supplier<Object> renderProvider = GeoItem.makeRenderer(this);

    public FutureGunItem() {
        super(new Settings().maxCount(1).maxDamage(201));

        // Register our item as server-side handled.
        // This enables both animation data syncing and server-side animation triggering
        SingletonGeoAnimatable.registerSyncedAnimatable(this);
    }

    // Utilise our own render hook to define our custom renderer
    @Override
    public void createRenderer(Consumer<Object> consumer) {
        consumer.accept(new RenderProvider() {
            private final FutureGunRenderer renderer = new FutureGunRenderer();

            @Override
            public BuiltinModelItemRenderer getCustomRenderer() {
                return this.renderer;
            }
        });
    }

    @Override
    public Supplier<Object> getRenderProvider() {
        return this.renderProvider;
    }

    // Register our animation controllers
    @Override
    public void registerControllers(AnimatableManager.ControllerRegistrar controllers) {
        controllers.add(new AnimationController<>(this, "shoot_controller", state -> PlayState.CONTINUE)
                .triggerableAnim("shoot", DefaultAnimations.ITEM_ON_USE));
        // We've marked the "shoot" animation as being triggerable from the server
    }

    // Start "using" the item once clicked
    @Override
    public TypedActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        player.setCurrentHand(hand);

        return TypedActionResult.consume(player.getStackInHand(hand));
    }

    // Fire an arrow and play the animation when releasing the mouse button
    @Override
    public void onStoppedUsing(ItemStack stack, World level, LivingEntity shooter, int ticksRemaining) {
        if (shooter instanceof PlayerEntity player) {
            if (stack.getDamage() >= stack.getMaxDamage() - 1)
                return;

            // Add a cooldown, so you can't fire rapidly
//            player.getItemCooldownManager().set(this, 5);

            if (!level.isClient) {
                FutureGunArrowEntity arrow = new FutureGunArrowEntity(level, player);
                arrow.age = 35;

                arrow.setVelocity(player, player.getPitch(), player.getYaw(), 0, 1, 1);
                arrow.setDamage(2.5);
                arrow.hasNoGravity();
                arrow.pickupType = PersistentProjectileEntity.PickupPermission.DISALLOWED;
                
                stack.damage(1, shooter, p -> p.sendToolBreakStatus(shooter.getActiveHand()));
                level.spawnEntity(arrow);

                // Trigger our animation
                // We could trigger this outside of the client-side check if only wanted the animation to play for the shooter
                // But we'll fire it on the server so all nearby players can see it
                triggerAnim(player, GeoItem.getOrAssignId(stack, (ServerWorld)level), "shoot_controller", "shoot");
            }
        }
    }

    // Use vanilla animation to 'pull back' the pistol while charging it
    @Override
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BOW;
    }

    @Override
    public boolean hasGlint(ItemStack stack) {
        return false;
    }

    @Override
    public int getMaxUseTime(ItemStack stack) {
        return 72000;
    }
    @Override
    public AnimatableInstanceCache getAnimatableInstanceCache() {
        return this.cache;
    }
}