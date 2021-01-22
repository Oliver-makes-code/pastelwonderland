// 🦀 CRAB IN THE CODE 🦀

package dev.hiitsdevin.pastelwonderland;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.GrassBlock;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import static dev.hiitsdevin.pastelwonderland.PastelWonderland.MOD_ID;
import static net.minecraft.block.Blocks.*;

public class Blocks {

    // registering blocks into the game as if they actually existed [spoiler alert: they do ✨]
    public static final Block RED = register("red", new Block(FabricBlockSettings.copy(RED_CONCRETE)));
    public static final Block ORANGE = register("orange", new Block(FabricBlockSettings.copy(ORANGE_CONCRETE)));
    public static final Block YELLOW = register("yellow", new Block(FabricBlockSettings.copy(YELLOW_CONCRETE)));
    public static final Block GREEN = register("green", new Block(FabricBlockSettings.copy(GREEN_CONCRETE)));
    public static final Block BLUE = register("blue", new Block(FabricBlockSettings.copy(BLUE_CONCRETE)));
    public static final Block PURPLE = register("purple", new Block(FabricBlockSettings.copy(PURPLE_CONCRETE)));
    public static final Block MAGENTA = register("magenta", new Block(FabricBlockSettings.copy(MAGENTA_CONCRETE)));
    public static final Block GRAY = register("gray", new Block(FabricBlockSettings.copy(GRAY_CONCRETE)));
    public static final Block BLACK = register("black", new Block(FabricBlockSettings.copy(BLACK_CONCRETE)));
    public static final Block BROWN = register("brown", new Block(FabricBlockSettings.copy(BROWN_CONCRETE)));
    public static final Block DIRT = register("dirt", new Block(FabricBlockSettings.copy(COARSE_DIRT)));
    public static final Block GRASS = register("grass", new GrassBlock(FabricBlockSettings.copy(GRASS_BLOCK)));
    public static final Block STONE = register("stone", new Block(FabricBlockSettings.copy(net.minecraft.block.Blocks.STONE)));
    public static final Block PASTEL = register("pastel", new Block(FabricBlockSettings.copy(IRON_ORE)));


    private static Block register(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(MOD_ID, name), block);
    }

    public static void init() {

    }

}
