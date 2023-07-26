package net.origamiking.mcmods.oem.datagen.advancement;

import net.minecraft.advancement.Advancement;
import net.minecraft.advancement.AdvancementFrame;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oapi.advancement.WelcomeCriteria;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.wood.spruce.SpruceWoodBlocks;

import java.util.function.Consumer;

public class OemAdvancements implements Consumer<Consumer<Advancement>> {
    @Override
    public void accept(Consumer<Advancement> advancementConsumer) {
        Advancement welcome = Advancement.Builder.create().display(SpruceWoodBlocks.SPRUCE_BARREL, Text.translatable(translatableTitle("welcome")), Text.translatable(translatableDescription("welcome")), new Identifier(OemMain.MOD_ID, "textures/block/azalea_planks.png"), AdvancementFrame.TASK, true, true, false).criterion("welcome", new WelcomeCriteria.Condition()).build(advancementConsumer, OemMain.MOD_ID + "/welcome");
    }

    public static String translatableTitle(String advancementName) {
        return "advancement." + OemMain.MOD_ID + "." + advancementName.toLowerCase() + ".title";
    }

    public static String translatableDescription(String advancementName) {
        return "advancement." + OemMain.MOD_ID + "." + advancementName.toLowerCase() + ".description";
    }
}
