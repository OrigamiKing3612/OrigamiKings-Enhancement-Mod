package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

import java.util.function.Consumer;

public class ModRecpieGenerator extends FabricRecipeProvider {
    public ModRecpieGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        /*ShapedRecipeJsonBuilder.create(ModBlocks.GOLD_CHAIN)
                .pattern("   ")
                .pattern("###")
                .pattern("###")
                .input('#', Blocks.TINTED_GLASS)
                .criterion(RecipeProvider.hasItem(Blocks.TINTED_GLASS),
                        RecipeProvider.conditionsFromItem(Blocks.TINTED_GLASS))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModBlocks.GOLD_CHAIN)));*/
    }
}
