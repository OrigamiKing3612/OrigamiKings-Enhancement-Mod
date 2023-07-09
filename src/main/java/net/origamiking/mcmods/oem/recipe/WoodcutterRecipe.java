package net.origamiking.mcmods.oem.recipe;

import com.google.gson.JsonObject;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.ItemStack;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.recipe.CuttingRecipe;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.RecipeSerializer;
import net.minecraft.recipe.RecipeType;
import net.minecraft.util.Identifier;
import net.minecraft.util.JsonHelper;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.World;
import net.origamiking.mcmods.oem.blocks.woodcutter.ModWoodcutter;

public class WoodcutterRecipe extends CuttingRecipe {
    public WoodcutterRecipe(Identifier id, String group, Ingredient input, ItemStack output) {
        super(new Type(), new Serializer(), id, group, input, output);
    }

    public boolean matches(Inventory inventory, World world) {
        return this.input.test(inventory.getStack(0));
    }

    public ItemStack createIcon() {
        return new ItemStack(ModWoodcutter.WOODCUTTER);
    }

    @Override
    public RecipeSerializer<?> getSerializer() {
        return Serializer.INSTANCE;
    }

    @Override
    public RecipeType<?> getType() {
        return Type.INSTANCE;
    }

    public static class Type implements RecipeType<WoodcutterRecipe> {
        public Type() { }
        public static final Type INSTANCE = new Type();
        public static final String ID = "woodcutter";
    }

    public static class Serializer implements RecipeSerializer<WoodcutterRecipe> {
        public static final Serializer INSTANCE = new Serializer();
        public static final String ID = "woodcutter";

        @Override
        public WoodcutterRecipe read(Identifier id, JsonObject json){
            String string = JsonHelper.getString(json, "group", "");
            Ingredient ingredient;
            if (JsonHelper.hasArray(json, "ingredient")) {
                ingredient = Ingredient.fromJson(JsonHelper.getArray(json, "ingredient"));
            } else {
                ingredient = Ingredient.fromJson(JsonHelper.getObject(json, "ingredient"));
            }

            String string2 = JsonHelper.getString(json, "result");
            int i = JsonHelper.getInt(json, "count");
            ItemStack itemStack = new ItemStack((ItemConvertible) Registry.ITEM.get(new Identifier(string2)), i);
            return new WoodcutterRecipe(id, string, ingredient, itemStack);
        }

        @Override
        public WoodcutterRecipe read(Identifier id, PacketByteBuf buf){
            String string = buf.readString();
            Ingredient ingredient = Ingredient.fromPacket(buf);
            ItemStack itemStack = buf.readItemStack();
            return new WoodcutterRecipe(id, string, ingredient, itemStack);
        }

        @Override
        public void write(PacketByteBuf buf, WoodcutterRecipe recipe){
            buf.writeString(recipe.group);
            recipe.input.write(buf);
            buf.writeItemStack(recipe.output);
        }
    }
}