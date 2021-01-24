// 🦀 CRAB IN THE CODE 🦀

package dev.hiitsdevin.pastelwonderland.Base;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static dev.hiitsdevin.pastelwonderland.PastelWonderland.MOD_ID;


public class Items {
    // todo: add an item texture that corresponds to pastelwonderland:icon
    private static final Item ICON = Registry.register(Registry.ITEM, new Identifier(MOD_ID, "icon"), new Item(new Item.Settings()));
    // imagine needing a dedicated icon pffffffffft
    // i am horrible

    // creating that new ✨ item group ✨ and that new tab
    private static final ItemGroup DEVIN_GROUP = FabricItemGroupBuilder.build(new Identifier(MOD_ID, "group"), () -> new ItemStack(Blocks.RED));

    private static Item.Settings itemSettings() {
        return new Item.Settings().group(DEVIN_GROUP);
    }

    // all the blocks that are being added
    public static final Item RED = register("red", Blocks.RED);
    public static final Item ORANGE = register("orange", Blocks.ORANGE);
    public static final Item YELLOW = register("yellow", Blocks.YELLOW);
    public static final Item GREEN = register("green", Blocks.GREEN);
    public static final Item BLUE = register("blue", Blocks.BLUE);
    public static final Item PURPLE = register("purple", Blocks.PURPLE);
    public static final Item MAGENTA = register("magenta", Blocks.MAGENTA);
    public static final Item BLACK = register("black", Blocks.BLACK);
    public static final Item GRAY = register("gray", Blocks.GRAY);
    public static final Item BROWN = register("brown", Blocks.BROWN);
    public static final Item WHITE = register("white", Blocks.WHITE);

    //Terrain
    public static final Item DIRT = register("dirt", Blocks.DIRT);
    public static final Item GRASS = register("grass", Blocks.GRASS);
    public static final Item STONE = register("stone", Blocks.STONE);
    public static final Item PASTEL_ORE = register("pastel_ore", Blocks.PASTEL_ORE);
    public static final Item SAND = register("sand", Blocks.SAND);

    //Trees
    public static final Item BLUE_LEAF = register("blue_leaves", Blocks.BLUE_LEAF);
    public static final Item RED_LEAF = register("red_leaves", Blocks.RED_LEAF);
    public static final Item GREEN_LEAF = register("green_leaves", Blocks.GREEN_LEAF);
    public static final Item YELLOW_LEAF = register("yellow_leaves", Blocks.YELLOW_LEAF);
    public static final Item LOG = register("log", Blocks.LOG);

    //glowy mcfuck
    public static final Item RED_PASTEL_GLOWSTONE = register("red_pastel_glowstone", Blocks.RED_PASTEL_GLOWSTONE);

    //registered so i guess i can do /give @p pastelwonderland:colorhere bc fuck you too ig
    private static Item register(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), item);
    }
    private static Item register(String name, Block block) {
        return Registry.register(Registry.ITEM, new Identifier(MOD_ID, name), new BlockItem(block, itemSettings()));
    }

    public static void init() {


    }

}
