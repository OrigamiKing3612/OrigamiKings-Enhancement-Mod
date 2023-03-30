package net.origamiking.mcmods.oemextra.extra.groups;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
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
    private static final ItemGroup OEM_EXTRA_GROUP = FabricItemGroupBuilder.create(new Identifier(OemMain.MOD_ID, "oem_extra_group"))
            .icon(() -> new ItemStack(ServerSpecificBlocks.PRIM))
            .appendItems((stacks) -> {
                stacks.add(new ItemStack(ServerSpecificBlocks.CAVERNS_BLOCK_ONE));
                stacks.add(new ItemStack(ServerSpecificBlocks.CAVERNS_BLOCK_TWO));
                stacks.add(new ItemStack(ServerSpecificBlocks.CAVERNS_BLOCK_THREE));
                stacks.add(new ItemStack(ServerSpecificBlocks.CAVERNS_BLOCK_FOUR));
                stacks.add(new ItemStack(ServerSpecificBlocks.CAVERNS_BLOCK_FIVE));
                stacks.add(new ItemStack(ServerSpecificBlocks.CAVERNS_BLOCK_SIX));
                stacks.add(new ItemStack(ServerSpecificBlocks.PRIM));
                stacks.add(new ItemStack(StoneVStairs.STONE_BRICK_VERTICAL_STAIRS));
                stacks.add(new ItemStack(WoodVStairs.OAK_VERTICAL_STAIRS));
             }).build();

    public static void register() {
        OemMain.LOGGER.info("Registering Extra Group for " + OemMain.NAME);
    }
}
