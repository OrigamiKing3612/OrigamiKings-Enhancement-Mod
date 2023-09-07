package net.origamiking.mcmods.oem.compact.rei;

import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.plugins.REIClientPlugin;
import me.shedaniel.rei.api.client.registry.category.CategoryRegistry;
import me.shedaniel.rei.api.client.registry.display.DisplayRegistry;
import me.shedaniel.rei.api.client.registry.screen.ScreenRegistry;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.origamiking.mcmods.oem.blocks.woodcutter.ModWoodcutter;
import net.origamiking.mcmods.oem.compact.rei.woodcutter.WoodcutterCategory;
import net.origamiking.mcmods.oem.compact.rei.woodcutter.WoodcutterDisplay;
import net.origamiking.mcmods.oem.recipe.ModRecipeType;
import net.origamiking.mcmods.oem.recipe.WoodcutterRecipe;
import net.origamiking.mcmods.oem.screen.woodcutter.WoodcutterScreen;

public class OemREIClientPlugin implements REIClientPlugin {
    @Override
    public void registerCategories(CategoryRegistry registry) {
        registry.add(new WoodcutterCategory());

        registry.addWorkstations(WoodcutterCategory.WOODCUTTING, EntryStacks.of(ModWoodcutter.WOODCUTTER));
    }

    @Override
    public void registerDisplays(DisplayRegistry registry) {
        registry.registerRecipeFiller(WoodcutterRecipe.class, ModRecipeType.WOODCUTTER_RECIPE,
                WoodcutterDisplay::new);
    }

    @Override
    public void registerScreens(ScreenRegistry registry) {
        registry.registerClickArea(screen -> new Rectangle(((screen.width - 176) / 2) + 78,
                        ((screen.height - 166) / 2) + 30, 20, 25),
                WoodcutterScreen.class,
                WoodcutterCategory.WOODCUTTING);
    }
}
