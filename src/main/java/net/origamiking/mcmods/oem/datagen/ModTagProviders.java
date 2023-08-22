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
