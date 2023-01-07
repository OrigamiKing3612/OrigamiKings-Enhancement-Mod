package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.*;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.blocks.copper.CopperBlocks;

import java.io.DataOutput;
import java.nio.file.Path;
import java.util.concurrent.CompletableFuture;

public class ModTagProvider extends FabricTagProvider<Block> {
    public ModTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.BLOCK, registriesFuture);
    }
    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(CopperBlocks.COPPER_BARS)
                .add(CopperBlocks.COPPER_BUTTON)
                .add(CopperBlocks.COPPER_CHAIN);
                //.add(CopperBlocks.)


    ;}
}
