package net.origamiking.mcmods.oem.extra.groups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;
import net.origamiking.mcmods.oem.blocks.server_specific.ServerSpecificBlocks;
import net.origamiking.mcmods.oem.blocks.wood.spruce.SpruceWoodBlocks;

public class ModExtraGroups {
    private static final ItemGroup OEM_EXTRA_GROUP = FabricItemGroup.builder(new Identifier(OemMain.MOD_ID, "oem_extra_group"))
            .displayName(Text.literal("OEM Extra"))
            .icon(() -> new ItemStack(SpruceWoodBlocks.SPRUCE_BARREL))
            .entries((context, entries) -> {
                entries.add(ServerSpecificBlocks.PRIM);
             }).build();

    public static void register() {
        OemMain.LOGGER.info("Registering Extra Group for OEM");
    }
}
