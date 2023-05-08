package net.origamiking.mcmods.oemextra.extra.groups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.armor.ArmorRegistry;
import net.origamiking.mcmods.oemextra.extra.blocks.serverspecific.ServerSpecificBlocks;
import net.origamiking.mcmods.oemextra.extra.blocks.verticalstairs.stone.StoneVStairs;
import net.origamiking.mcmods.oemextra.extra.blocks.verticalstairs.wood.WoodVStairs;
import net.origamiking.mcmods.oemextra.extra.items.ModExtraItems;

public class ModExtraGroups {
    private static final ItemGroup OEM_EXTRA_GROUP = FabricItemGroup.builder(new Identifier(OemMain.MOD_ID, "oem_extra_group"))
            .displayName(Text.literal("OEM Extra"))
            .icon(() -> new ItemStack(ArmorRegistry.VIKING_ARMOR_HELMET))
            .entries((context, entries) -> {
                entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_ONE);
                entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_TWO);
                entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_THREE);
                entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_FOUR);
                entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_FIVE);
                entries.add(ServerSpecificBlocks.CAVERNS_BLOCK_SIX);
                entries.add(ArmorRegistry.VIKING_ARMOR_HELMET);
                //entries.add(ServerSpecificBlocks.BOOMBOX);
                entries.add(ServerSpecificBlocks.PRIM);
                entries.add(StoneVStairs.STONE_BRICK_VERTICAL_STAIRS);
                entries.add(WoodVStairs.OAK_VERTICAL_STAIRS);
                entries.add(ModExtraItems.FUT_GUN);
             }).build();

    public static void register() {
        OemMain.LOGGER.info("Registering Extra Group for " + OemMain.VERSION);
    }
}
