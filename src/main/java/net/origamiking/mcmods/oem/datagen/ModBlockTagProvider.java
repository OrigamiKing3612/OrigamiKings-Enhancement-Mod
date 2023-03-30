package net.origamiking.mcmods.oem.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }
    @Override
    protected void generateTags() {
//        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
//        getOrCreateTagBuilder(BlockTags.NEEDS_STONE_TOOL)
//        getOrCreateTagBuilder(BlockTags.AXE_MINEABLE)
//        getOrCreateTagBuilder(BlockTags.WALLS)
//        getOrCreateTagBuilder(BlockTags.HOE_MINEABLE)
//        getOrCreateTagBuilder(BlockTags.DRAGON_IMMUNE)
//        getOrCreateTagBuilder(BlockTags.TRAPDOORS)
//        getOrCreateTagBuilder(BlockTags.DOORS)
//        getOrCreateTagBuilder(BlockTags.CRYSTAL_SOUND_BLOCKS)
//        getOrCreateTagBuilder(BlockTags.WOOL)
//        getOrCreateTagBuilder(BlockTags.OCCLUDES_VIBRATION_SIGNALS)
    }

    @Override
    public String getName() {
        return null;
    }
}
