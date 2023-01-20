package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.BlockTags;
import net.origamiking.mcmods.oem.blocks.vercticalslabs.concrete.ConcreteVSlabs;


import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(
                        ConcreteVSlabs.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.GRAY_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.BLACK_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.BROWN_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.RED_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.ORANGE_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.YELLOW_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.LIME_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.GREEN_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.CYAN_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.BLUE_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.PURPLE_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.MAGENTA_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.PINK_CONCRETE_VERTICAL_SLAB);
        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
                .add(
                        ConcreteVSlabs.LIGHT_GRAY_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.GRAY_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.BLACK_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.BROWN_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.RED_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.ORANGE_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.YELLOW_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.LIME_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.GREEN_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.CYAN_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.LIGHT_BLUE_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.BLUE_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.PURPLE_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.MAGENTA_CONCRETE_VERTICAL_SLAB,
                        ConcreteVSlabs.PINK_CONCRETE_VERTICAL_SLAB);

//        getOrCreateTagBuilder(BlockTags.WALLS)
//        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
//        getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
//        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
//        getOrCreateTagBuilder(BlockTags.DOORS)
//        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)
//        getOrCreateTagBuilder(BlockTags.WOOL)
//        getOrCreateTagBuilder(BlockTags.OCCLUDES_VIBRATION_SIGNALS)

    }
}
