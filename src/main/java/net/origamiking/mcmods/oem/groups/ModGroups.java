package net.origamiking.mcmods.oem.groups;

import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.ModBlocks;
import net.origamiking.mcmods.oem.blocks.concrete.ModBlocksConcreteSlabs;
import net.origamiking.mcmods.oem.blocks.concrete.ModBlocksConcreteStairs;
import net.origamiking.mcmods.oem.blocks.glass.ModBlocksGlass;
import net.origamiking.mcmods.oem.blocks.sculk.ModBlocksSculk;
import net.origamiking.mcmods.oem.blocks.server_specific.ModBlocksServerSpecific;
import net.origamiking.mcmods.oem.blocks.wood.barrel.ModBlocksBarrels;
import net.origamiking.mcmods.oem.blocks.wood.bookshelf.ModBlocksBookshelf;
import net.origamiking.mcmods.oem.blocks.wood.ladder.ModBlocksLadder;

public class ModGroups {
    private static final ItemGroup OEM_GROUP = FabricItemGroup.builder(new Identifier(OemMain.MOD_ID, "oem_group"))
            .displayName(Text.literal("OrigamiKing's Enchancement Mod"))
            .icon(() -> new ItemStack(ModBlocksBarrels.SPRUCE_BARREL))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(ModBlocksBarrels.OAK_BARREL);
                entries.add(Blocks.BOOKSHELF);
                entries.add(ModBlocksLadder.OAK_LADDER);
                entries.add(ModBlocksBarrels.SPRUCE_BARREL);
                entries.add(ModBlocksBookshelf.SPRUCE_BOOKSHELF);
                entries.add(ModBlocksLadder.SPRUCE_LADDER);
                entries.add(ModBlocksBarrels.BIRCH_BARREL);
                entries.add(ModBlocksBookshelf.BIRCH_BOOKSHELF);
                entries.add(ModBlocksLadder.BIRCH_LADDER);
                entries.add(ModBlocksBarrels.JUNGLE_BARREL);
                entries.add(ModBlocksBookshelf.JUNGLE_BOOKSHELF);
                entries.add(ModBlocksLadder.JUNGLE_LADDER);
                entries.add(ModBlocksBarrels.ACACIA_BARREL);
                entries.add(ModBlocksBookshelf.ACACIA_BOOKSHELF);
                entries.add(ModBlocksLadder.ACACIA_LADDER);
                entries.add(ModBlocksBarrels.DARK_OAK_BARREL);
                entries.add(ModBlocksBookshelf.DARK_OAK_BOOKSHELF);
                entries.add(ModBlocksLadder.DARK_OAK_LADDER);
                entries.add(ModBlocksBarrels.MANGROVE_BARREL);
                entries.add(ModBlocksBookshelf.MANGROVE_BOOKSHELF);
                entries.add(ModBlocksLadder.MANGROVE_LADDER);
                entries.add(ModBlocksBarrels.CRIMSON_BARREL);
                entries.add(ModBlocksBookshelf.CRIMSON_BOOKSHELF);
                entries.add(ModBlocksLadder.CRIMSON_LADDER);
                entries.add(ModBlocksBarrels.WARPED_BARREL);
                entries.add(ModBlocksBookshelf.WARPED_BOOKSHELF);
                entries.add(ModBlocksLadder.WARPED_LADDER);
                //entries.add(ModBlocks.GOLD_LANTERN);
                //entries.add(ModBlocks.GOLD_BAR);
                entries.add(ModBlocksConcreteStairs.WHITE_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.WHITE_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.LIGHT_GRAY_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.LIGHT_GRAY_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.GRAY_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.GRAY_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.BLACK_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.BLACK_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.BROWN_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.BROWN_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.RED_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.RED_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.ORANGE_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.ORANGE_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.YELLOW_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.YELLOW_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.LIME_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.LIME_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.GREEN_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.GREEN_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.CYAN_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.CYAN_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.LIGHT_BLUE_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.LIGHT_BLUE_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.BLUE_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.BLUE_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.PURPLE_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.PURPLE_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.MAGENTA_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.MAGENTA_CONCRETE_SLAB);
                entries.add(ModBlocksConcreteStairs.PINK_CONCRETE_STAIR);
                entries.add(ModBlocksConcreteSlabs.PINK_CONCRETE_SLAB);
                entries.add(ModBlocksSculk.SCULK_STAIR);
                entries.add(ModBlocksSculk.SCULK_SLAB);
                //entries.add(ModBlocks.TINTED_GLASS_PANE);
                entries.add(ModBlocksServerSpecific.GOLD_CHAIN);
                entries.add(ModBlocksServerSpecific.GOLD_LANTERN);
                entries.add(ModBlocksGlass.GLASS_STAIR);
                entries.add(ModBlocksGlass.GLASS_SLAB);
                entries.add(ModBlocksGlass.WHITE_GLASS_STAIR);
                entries.add(ModBlocksGlass.WHITE_GLASS_SLAB);
                entries.add(ModBlocksGlass.LIGHT_GRAY_GLASS_SLAB);
                entries.add(ModBlocksGlass.LIGHT_GRAY_GLASS_STAIR);
                entries.add(ModBlocksGlass.GRAY_GLASS_SLAB);
                entries.add(ModBlocksGlass.GRAY_GLASS_STAIR);
                entries.add(ModBlocksGlass.BLACK_GLASS_SLAB);
                entries.add(ModBlocksGlass.BLACK_GLASS_STAIR);
                entries.add(ModBlocksGlass.BROWN_GLASS_SLAB);
                entries.add(ModBlocksGlass.BROWN_GLASS_STAIR);
                entries.add(ModBlocksGlass.RED_GLASS_SLAB);
                entries.add(ModBlocksGlass.RED_GLASS_STAIR);
                entries.add(ModBlocksGlass.ORANGE_GLASS_SLAB);
                entries.add(ModBlocksGlass.ORANGE_GLASS_STAIR);
                entries.add(ModBlocksGlass.YELLOW_GLASS_SLAB);
                entries.add(ModBlocksGlass.YELLOW_GLASS_STAIR);
                entries.add(ModBlocksGlass.LIME_GLASS_SLAB);
                entries.add(ModBlocksGlass.LIME_GLASS_STAIR);
                entries.add(ModBlocksGlass.GREEN_GLASS_SLAB);
                entries.add(ModBlocksGlass.GREEN_GLASS_STAIR);
                entries.add(ModBlocksGlass.CYAN_GLASS_SLAB);
                entries.add(ModBlocksGlass.CYAN_GLASS_STAIR);
                entries.add(ModBlocksGlass.LIGHT_BLUE_GLASS_SLAB);
                entries.add(ModBlocksGlass.LIGHT_BLUE_GLASS_STAIR);
                entries.add(ModBlocksGlass.BLUE_GLASS_SLAB);
                entries.add(ModBlocksGlass.BLUE_GLASS_STAIR);
                entries.add(ModBlocksGlass.PURPLE_GLASS_SLAB);
                entries.add(ModBlocksGlass.PURPLE_GLASS_STAIR);
                entries.add(ModBlocksGlass.MAGENTA_GLASS_SLAB);
                entries.add(ModBlocksGlass.MAGENTA_GLASS_STAIR);
                entries.add(ModBlocksGlass.PINK_GLASS_SLAB);
                entries.add(ModBlocksGlass.PINK_GLASS_STAIR);
            })
            .build();
    private static final ItemGroup OEM_GROUP2 = FabricItemGroup.builder(new Identifier(OemMain.MOD_ID, "oem_group2"))
            .displayName(Text.literal("mc.origamiking.net specific"))
            .icon(() -> new ItemStack(ModBlocksServerSpecific.CAVERNS_BLOCK_ONE))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(ModBlocksServerSpecific.CAVERNS_BLOCK_ONE);
                entries.add(ModBlocksServerSpecific.CAVERNS_BLOCK_TWO);
                entries.add(ModBlocksServerSpecific.CAVERNS_BLOCK_THREE);
                entries.add(ModBlocksServerSpecific.CAVERNS_BLOCK_FOUR);
                entries.add(ModBlocksServerSpecific.CAVERNS_BLOCK_FIVE);
                entries.add(ModBlocksServerSpecific.CAVERNS_BLOCK_SIX);
            }).build();
    public static void register() {
        OemMain.LOGGER.info("Registering Groups");
    }
}
