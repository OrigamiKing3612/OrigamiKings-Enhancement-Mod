package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.tag.ModItemTags;

import java.util.concurrent.CompletableFuture;

public class ModTagProviders {
    public static void getTags(FabricDataGenerator.Pack pack) {
        pack.addProvider(Block::new);
        pack.addProvider(Item::new);
        pack.addProvider(EntityType::new);
        pack.addProvider(Fluid::new);
    }

    static class Block extends FabricTagProvider.BlockTagProvider {
        public Block(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup registries) {
            getOrCreateTagBuilder(BlockTags.STAIRS);
            getOrCreateTagBuilder(BlockTags.SLABS);
            getOrCreateTagBuilder(BlockTags.WALLS);
        }
    }

    static class Item extends FabricTagProvider.ItemTagProvider {
        public Item(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
            super(output, registriesFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup registries) {
            getOrCreateTagBuilder(ModItemTags.SPAWN_EGGS)
                    .forceAddTag(TagKey.of(RegistryKeys.ITEM, new Identifier("c:spawn_eggs")));
//                    .add(Items.ALLAY_SPAWN_EGG)
//                    .add(Items.AXOLOTL_SPAWN_EGG)
//                    .add(Items.BAT_SPAWN_EGG)
//                    .add(Items.BEE_SPAWN_EGG)
//                    .add(Items.BLAZE_SPAWN_EGG)
//                    .add(Items.CAT_SPAWN_EGG)
//                    .add(Items.CAMEL_SPAWN_EGG)
//                    .add(Items.CAVE_SPIDER_SPAWN_EGG)
//                    .add(Items.CHICKEN_SPAWN_EGG)
//                    .add(Items.COD_SPAWN_EGG)
//                    .add(Items.COW_SPAWN_EGG)
//                    .add(Items.CREEPER_SPAWN_EGG)
//                    .add(Items.DOLPHIN_SPAWN_EGG)
//                    .add(Items.DONKEY_SPAWN_EGG)
//                    .add(Items.DROWNED_SPAWN_EGG)
//                    .add(Items.ELDER_GUARDIAN_SPAWN_EGG)
//                    .add(Items.ENDER_DRAGON_SPAWN_EGG)
//                    .add(Items.ENDERMAN_SPAWN_EGG)
//                    .add(Items.ENDERMITE_SPAWN_EGG)
//                    .add(Items.EVOKER_SPAWN_EGG)
//                    .add(Items.FOX_SPAWN_EGG)
//                    .add(Items.FROG_SPAWN_EGG)
//                    .add(Items.GHAST_SPAWN_EGG)
//                    .add(Items.GLOW_SQUID_SPAWN_EGG)
//                    .add(Items.GOAT_SPAWN_EGG)
//                    .add(Items.GUARDIAN_SPAWN_EGG)
//                    .add(Items.HOGLIN_SPAWN_EGG)
//                    .add(Items.HORSE_SPAWN_EGG)
//                    .add(Items.HUSK_SPAWN_EGG)
//                    .add(Items.IRON_GOLEM_SPAWN_EGG)
//                    .add(Items.LLAMA_SPAWN_EGG)
//                    .add(Items.MAGMA_CUBE_SPAWN_EGG)
//                    .add(Items.MOOSHROOM_SPAWN_EGG)
//                    .add(Items.MULE_SPAWN_EGG)
//                    .add(Items.OCELOT_SPAWN_EGG)
//                    .add(Items.PANDA_SPAWN_EGG)
//                    .add(Items.PARROT_SPAWN_EGG)
//                    .add(Items.PHANTOM_SPAWN_EGG)
//                    .add(Items.PIG_SPAWN_EGG)
//                    .add(Items.PIGLIN_SPAWN_EGG)
//                    .add(Items.PIGLIN_BRUTE_SPAWN_EGG)
//                    .add(Items.PILLAGER_SPAWN_EGG)
//                    .add(Items.POLAR_BEAR_SPAWN_EGG)
//                    .add(Items.PUFFERFISH_SPAWN_EGG)
//                    .add(Items.RABBIT_SPAWN_EGG)
//                    .add(Items.RAVAGER_SPAWN_EGG)
//                    .add(Items.SALMON_SPAWN_EGG)
//                    .add(Items.SHEEP_SPAWN_EGG)
//                    .add(Items.SHULKER_SPAWN_EGG)
//                    .add(Items.SILVERFISH_SPAWN_EGG)
//                    .add(Items.SKELETON_SPAWN_EGG)
//                    .add(Items.SKELETON_HORSE_SPAWN_EGG)
//                    .add(Items.SLIME_SPAWN_EGG)
//                    .add(Items.SNIFFER_SPAWN_EGG)
//                    .add(Items.SNOW_GOLEM_SPAWN_EGG)
//                    .add(Items.SPIDER_SPAWN_EGG)
//                    .add(Items.SQUID_SPAWN_EGG)
//                    .add(Items.STRAY_SPAWN_EGG)
//                    .add(Items.STRIDER_SPAWN_EGG)
//                    .add(Items.TADPOLE_SPAWN_EGG)
//                    .add(Items.TRADER_LLAMA_SPAWN_EGG)
//                    .add(Items.TROPICAL_FISH_SPAWN_EGG)
//                    .add(Items.TURTLE_SPAWN_EGG)
//                    .add(Items.VEX_SPAWN_EGG)
//                    .add(Items.VILLAGER_SPAWN_EGG)
//                    .add(Items.VINDICATOR_SPAWN_EGG)
//                    .add(Items.WANDERING_TRADER_SPAWN_EGG)
//                    .add(Items.WARDEN_SPAWN_EGG)
//                    .add(Items.WITCH_SPAWN_EGG)
//                    .add(Items.WITHER_SPAWN_EGG)
//                    .add(Items.WITHER_SKELETON_SPAWN_EGG)
//                    .add(Items.WOLF_SPAWN_EGG)
//                    .add(Items.ZOGLIN_SPAWN_EGG)
//                    .add(Items.ZOMBIE_SPAWN_EGG)
//                    .add(Items.ZOMBIE_HORSE_SPAWN_EGG)
//                    .add(Items.ZOMBIE_VILLAGER_SPAWN_EGG)
//                    .add(Items.ZOMBIFIED_PIGLIN_SPAWN_EGG);
        }
    }

    static class EntityType extends FabricTagProvider.EntityTypeTagProvider {
        public EntityType(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup arg) {

        }
    }

    static class Fluid extends FabricTagProvider.FluidTagProvider {

        public Fluid(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
            super(output, completableFuture);
        }

        @Override
        protected void configure(RegistryWrapper.WrapperLookup arg) {

        }
    }
}
