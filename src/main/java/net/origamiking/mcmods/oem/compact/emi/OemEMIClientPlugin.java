package net.origamiking.mcmods.oem.compact.emi;

import dev.emi.emi.api.EmiPlugin;
import dev.emi.emi.api.EmiRegistry;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.render.EmiTexture;
import dev.emi.emi.api.stack.EmiStack;
import net.minecraft.recipe.RecipeEntry;
import net.minecraft.recipe.RecipeManager;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.woodcutter.ModWoodcutter;
import net.origamiking.mcmods.oem.compact.emi.woodcutter.WoodcutterEmiRecipe;
import net.origamiking.mcmods.oem.recipe.ModRecipeType;
import net.origamiking.mcmods.oem.recipe.WoodcutterRecipe;

public class OemEMIClientPlugin implements EmiPlugin {
    public static final Identifier WOODCUTTER_SHEET = new Identifier("minecraft", "textures/gui/container/stonecutter.png");
    public static final EmiStack WOODCUTTER = EmiStack.of(ModWoodcutter.WOODCUTTER);
    public static final EmiRecipeCategory WOODCUTTER_CATEGORY = new EmiRecipeCategory(new Identifier(OemMain.MOD_ID, "woodcutter"), WOODCUTTER, new EmiTexture(WOODCUTTER_SHEET, 0, 0, 16, 16));

    @Override
    public void register(EmiRegistry registry) {
        registry.addCategory(WOODCUTTER_CATEGORY);
        registry.addWorkstation(WOODCUTTER_CATEGORY, WOODCUTTER);

        RecipeManager manager = registry.getRecipeManager();

        // Use vanilla's concept of your recipes and pass them to your EmiRecipe representation
        for (RecipeEntry<WoodcutterRecipe> recipe : manager.listAllOfType(ModRecipeType.WOODCUTTER_RECIPE)) {
            registry.addRecipe(new WoodcutterEmiRecipe(recipe.value()));
        }
    }
}
