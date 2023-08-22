package net.origamiking.mcmods.oem.compact.rei.woodcutter;

import me.shedaniel.math.Point;
import me.shedaniel.math.Rectangle;
import me.shedaniel.rei.api.client.gui.Renderer;
import me.shedaniel.rei.api.client.gui.widgets.Widget;
import me.shedaniel.rei.api.client.gui.widgets.Widgets;
import me.shedaniel.rei.api.client.registry.display.DisplayCategory;
import me.shedaniel.rei.api.common.category.CategoryIdentifier;
import me.shedaniel.rei.api.common.display.basic.BasicDisplay;
import me.shedaniel.rei.api.common.util.EntryStacks;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.woodcutter.ModWoodcutter;

import java.util.LinkedList;
import java.util.List;

public class WoodcutterCategory implements DisplayCategory<BasicDisplay> {
    private static final Identifier TEXTURE = new Identifier("textures/gui/container/stonecutter.png");
    public static final CategoryIdentifier<WoodcutterDisplay> WOODCUTTING = CategoryIdentifier.of(OemMain.MOD_ID, "woodcutting");

    @Override
    public CategoryIdentifier<? extends BasicDisplay> getCategoryIdentifier() {
        return WOODCUTTING;
    }

    @Override
    public Text getTitle() {
        return Text.translatable("container.oem.woodcutter");
    }

    @Override
    public Renderer getIcon() {
        return EntryStacks.of(ModWoodcutter.WOODCUTTER.asItem().getDefaultStack());
    }

    @Override
    public List<Widget> setupDisplay(BasicDisplay display, Rectangle bounds) {
        Point startPoint = new Point(bounds.getCenterX() - 87, bounds.getCenterY() - 65);
        List<Widget> widgets = new LinkedList<>();
        widgets.add(Widgets.createTexturedWidget(TEXTURE, new Rectangle(startPoint.x, startPoint.y, 175, 72)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 20, startPoint.y + 33)).entries(display.getInputEntries().get(0)));

        widgets.add(Widgets.createSlot(new Point(startPoint.x + 143, startPoint.y + 33)).markOutput().entries(display.getOutputEntries().get(0)));

        return widgets;
    }

    @Override
    public int getDisplayHeight() {
        return 90;
    }
}
