package net.origamiking.mcmods.oem.groups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.ModBlocks;

public class ModGroups {
    private static final ItemGroup OEM_GROUP = FabricItemGroup.builder(new Identifier(OemMain.MOD_ID, "oem_group"))
            .displayName(Text.literal("OrigamiKing's Enchancement Mod"))
            .icon(() -> new ItemStack(ModBlocks.SPRUCE_BARREL))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(ModBlocks.OAK_BARREL);
                entries.add(Blocks.BOOKSHELF);
                entries.add(ModBlocks.OAK_LADDER);
                entries.add(ModBlocks.SPRUCE_BARREL);
                entries.add(ModBlocks.SPRUCE_BOOKSHELF);
                entries.add(ModBlocks.SPRUCE_LADDER);
                entries.add(ModBlocks.BIRCH_BARREL);
                entries.add(ModBlocks.BIRCH_BOOKSHELF);
                entries.add(ModBlocks.BIRCH_LADDER);
                entries.add(ModBlocks.JUNGLE_BARREL);
                entries.add(ModBlocks.JUNGLE_BOOKSHELF);
                entries.add(ModBlocks.JUNGLE_LADDER);
                entries.add(ModBlocks.ACACIA_BARREL);
                entries.add(ModBlocks.ACACIA_BOOKSHELF);
                entries.add(ModBlocks.ACACIA_LADDER);
                entries.add(ModBlocks.DARK_OAK_BARREL);
                entries.add(ModBlocks.DARK_OAK_BOOKSHELF);
                entries.add(ModBlocks.DARK_OAK_LADDER);
                entries.add(ModBlocks.MANGROVE_BARREL);
                entries.add(ModBlocks.MANGROVE_BOOKSHELF);
                entries.add(ModBlocks.MANGROVE_LADDER);
                entries.add(ModBlocks.CRIMSON_BARREL);
                entries.add(ModBlocks.CRIMSON_BOOKSHELF);
                entries.add(ModBlocks.CRIMSON_LADDER);
                entries.add(ModBlocks.WARPED_BARREL);
                entries.add(ModBlocks.WARPED_BOOKSHELF);
                entries.add(ModBlocks.WARPED_LADDER);
            })
            .build();
    public static void register() {
        OemMain.LOGGER.info("Registering Groups");
    }
}
