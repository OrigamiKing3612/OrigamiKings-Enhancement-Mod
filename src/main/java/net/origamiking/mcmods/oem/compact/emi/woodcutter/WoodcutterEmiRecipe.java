package net.origamiking.mcmods.oem.compact.emi.woodcutter;

import dev.emi.emi.api.recipe.EmiRecipe;
import dev.emi.emi.api.recipe.EmiRecipeCategory;
import dev.emi.emi.api.render.EmiTexture;
import dev.emi.emi.api.stack.EmiIngredient;
import dev.emi.emi.api.stack.EmiStack;
import dev.emi.emi.api.widget.WidgetHolder;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.compact.emi.OemEMIClientPlugin;
import net.origamiking.mcmods.oem.recipe.WoodcutterRecipe;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class WoodcutterEmiRecipe implements EmiRecipe {
//    private final Identifier id;
    private final List<EmiIngredient> input;
    private final List<EmiStack> output;

    public WoodcutterEmiRecipe(WoodcutterRecipe recipe) {
//        this.id = recipe.getId();
        this.input = List.of(EmiIngredient.of(recipe.getIngredients().get(0)));
        this.output = List.of(EmiStack.of(recipe.getResult(null)));
    }

    @Override
    public EmiRecipeCategory getCategory() {
        return OemEMIClientPlugin.WOODCUTTER_CATEGORY;
    }

    //todo
    @Override
    public @Nullable Identifier getId() {
        return null;
    }

    @Override
    public List<EmiIngredient> getInputs() {
        return input;
    }

    @Override
    public List<EmiStack> getOutputs() {
        return output;
    }

    @Override
    public int getDisplayWidth() {
        return 76;
    }

    @Override
    public int getDisplayHeight() {
        return 18;
    }

    @Override
    public void addWidgets(WidgetHolder widgets) {
        widgets.addTexture(EmiTexture.EMPTY_ARROW, 26, 1);

        widgets.addSlot(input.get(0), 0, 0);
        widgets.addSlot(output.get(0), 58, 0).recipeContext(this);
    }
}
