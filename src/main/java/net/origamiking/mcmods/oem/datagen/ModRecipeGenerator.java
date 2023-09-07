package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.origamiking.mcmods.oem.datagen.recipes.*;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        BlockSetRecipes.get(exporter);
        WoodcuttingRecipes.get(exporter);
        StonecuttingRecipes.get(exporter);
        VerticalSlabRecipes.get(exporter);
        MetalRecipes.get(exporter);
        OtherRecipes.get(exporter);
    }
}
