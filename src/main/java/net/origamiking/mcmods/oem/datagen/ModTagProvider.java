package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModTagProvider extends FabricTagProvider.BlockTagProvider {


    public ModTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
//        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)

//        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)

//        getOrCreateTagBuilder(BlockTags.WALLS)

//        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)

        
    }
}
