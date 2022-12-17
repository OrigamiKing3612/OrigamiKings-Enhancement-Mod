package net.origamiking.mcmods.oem.groups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.origamiking.mcmods.oem.OemMain;

public class ModGroups {
    ItemGroup ITEM_GROUP = FabricItemGroup.builder(new Identifier(OemMain.MOD_ID, "blocks"))
            .displayName(Text.literal("Blocks"))
            .icon(() -> new ItemStack(Items.DIAMOND))
            .entries((enabledFeatures, entries, operatorEnabled) -> {
                entries.add(Items.DIAMOND);
            })
            .build();
    public static void register() {
        OemMain.LOGGER.info("Registering Groups");
    }
}
