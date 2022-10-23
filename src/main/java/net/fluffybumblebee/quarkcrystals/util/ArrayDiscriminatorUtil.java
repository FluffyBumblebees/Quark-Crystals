package net.fluffybumblebee.quarkcrystals.util;

import net.fluffybumblebee.quarkcrystals.block.QCBlocks;
import net.fluffybumblebee.quarkcrystals.block.custom.*;

public class ArrayDiscriminatorUtil {
    public static final String[] colourType = {
            null,
            "black",
            "blue",
            "green",
            "indigo",
            "orange",
            "red",
            "pink",
            "white",
            "yellow",
            "cyan",
            "purple",
            "brown",
            "rainbow",
            "dark"
    };

    public static String getCorundum(int i) {
       return colourType[i]+"_corundum";
    }
    public static String getWaxedCorundum(int i) {return "waxed_"+colourType[i]+"_corundum";}
    public static String getCorundumPane(int i) {
        return colourType[i]+"_corundum_pane";
    }
    public static String getCorundumCluster(int i) {
        return colourType[i]+"_corundum_cluster";
    }
    public static String getCorundumStairs(int i) {
        return colourType[i]+"_corundum_stairs";
    }
    public static String getCorundumSlab(int i) {
        return colourType[i]+"_corundum_slab";
    }
    public static String getCrystal(int i) {
        return colourType[i]+"_crystal";
    }
    public static String getCrystalPane(int i) {
        return colourType[i]+"_crystal_pane";
    }
    public static String getCrystalStairs(int i) {
        return colourType[i]+"_crystal_stairs";
    }
    public static String getCrystalSlab(int i) {
        return colourType[i]+"_crystal_slab";
    }

    public static String getGeode(int i) {
        return colourType[i]+"_geode";
    }
    public static final CorundumBlock[] getCorundum = {
            null,
            QCBlocks.BLACK_CORUNDUM,
            QCBlocks.BLUE_CORUNDUM,
            QCBlocks.GREEN_CORUNDUM,
            QCBlocks.INDIGO_CORUNDUM,
            QCBlocks.ORANGE_CORUNDUM,
            QCBlocks.RED_CORUNDUM,
            QCBlocks.PINK_CORUNDUM,
            QCBlocks.WHITE_CORUNDUM,
            QCBlocks.YELLOW_CORUNDUM,
            QCBlocks.CYAN_CORUNDUM,
            QCBlocks.PURPLE_CORUNDUM,
            QCBlocks.BROWN_CORUNDUM,
            QCBlocks.RAINBOW_CORUNDUM,
            QCBlocks.DARK_CORUNDUM
    };
    public static final CorundumBlock[] getWaxedCorundum = {
            null,
            QCBlocks.WAXED_BLACK_CORUNDUM,
            QCBlocks.WAXED_BLUE_CORUNDUM,
            QCBlocks.WAXED_GREEN_CORUNDUM,
            QCBlocks.WAXED_INDIGO_CORUNDUM,
            QCBlocks.WAXED_ORANGE_CORUNDUM,
            QCBlocks.WAXED_RED_CORUNDUM,
            QCBlocks.WAXED_PINK_CORUNDUM,
            QCBlocks.WAXED_WHITE_CORUNDUM,
            QCBlocks.WAXED_YELLOW_CORUNDUM,
            QCBlocks.WAXED_CYAN_CORUNDUM,
            QCBlocks.WAXED_PURPLE_CORUNDUM,
            QCBlocks.WAXED_BROWN_CORUNDUM,
            QCBlocks.WAXED_RAINBOW_CORUNDUM,
            QCBlocks.WAXED_DARK_CORUNDUM
    };
    public static final CorundumCrystalPane[] getCorundumPane = {
            null,
            QCBlocks.BLACK_CORUNDUM_PANE,
            QCBlocks.BLUE_CORUNDUM_PANE,
            QCBlocks.GREEN_CORUNDUM_PANE,
            QCBlocks.INDIGO_CORUNDUM_PANE,
            QCBlocks.ORANGE_CORUNDUM_PANE,
            QCBlocks.RED_CORUNDUM_PANE,
            QCBlocks.PINK_CORUNDUM_PANE,
            QCBlocks.WHITE_CORUNDUM_PANE,
            QCBlocks.YELLOW_CORUNDUM_PANE,
            QCBlocks.CYAN_CORUNDUM_PANE,
            QCBlocks.PURPLE_CORUNDUM_PANE,
            QCBlocks.BROWN_CORUNDUM_PANE,
            QCBlocks.RAINBOW_CORUNDUM_PANE,
            QCBlocks.DARK_CORUNDUM_PANE
    };
    public static final CorundumCluster[] getCorundumCluster = {
            null,
            QCBlocks.BLACK_CLUSTER,
            QCBlocks.BLUE_CLUSTER,
            QCBlocks.GREEN_CLUSTER,
            QCBlocks.INDIGO_CLUSTER,
            QCBlocks.ORANGE_CLUSTER,
            QCBlocks.RED_CLUSTER,
            QCBlocks.PINK_CLUSTER,
            QCBlocks.WHITE_CLUSTER,
            QCBlocks.YELLOW_CLUSTER,
            QCBlocks.CYAN_CLUSTER,
            QCBlocks.PURPLE_CLUSTER,
            QCBlocks.BROWN_CLUSTER,
            QCBlocks.RAINBOW_CORUNDUM_CLUSTER,
            QCBlocks.DARK_CORUNDUM_CLUSTER
    };
    public static final CrystalBlock[] getCrystal = {
            null,
            QCBlocks.BLACK_CRYSTAL,
            QCBlocks.BLUE_CRYSTAL,
            QCBlocks.GREEN_CRYSTAL,
            QCBlocks.INDIGO_CRYSTAL,
            QCBlocks.ORANGE_CRYSTAL,
            QCBlocks.RED_CRYSTAL,
            QCBlocks.PINK_CRYSTAL,
            QCBlocks.WHITE_CRYSTAL,
            QCBlocks.YELLOW_CRYSTAL,
            QCBlocks.CYAN_CRYSTAL,
            QCBlocks.PURPLE_CRYSTAL,
            QCBlocks.BROWN_CRYSTAL,
            QCBlocks.RAINBOW_CRYSTAL,
            QCBlocks.DARK_CRYSTAL
    };
    public static final CorundumCrystalPane[] getCrystalPane = {
            null,
            QCBlocks.BLACK_CRYSTAL_PANE,
            QCBlocks.BLUE_CRYSTAL_PANE,
            QCBlocks.GREEN_CRYSTAL_PANE,
            QCBlocks.INDIGO_CRYSTAL_PANE,
            QCBlocks.ORANGE_CRYSTAL_PANE,
            QCBlocks.RED_CRYSTAL_PANE,
            QCBlocks.PINK_CRYSTAL_PANE,
            QCBlocks.WHITE_CRYSTAL_PANE,
            QCBlocks.YELLOW_CRYSTAL_PANE,
            QCBlocks.CYAN_CRYSTAL_PANE,
            QCBlocks.PURPLE_CRYSTAL_PANE,
            QCBlocks.BROWN_CRYSTAL_PANE,
            QCBlocks.RAINBOW_CRYSTAL_PANE,
            QCBlocks.DARK_CRYSTAL_PANE
    };
    public static final CorundumCrystalSlab[] getCrystalSlab = {
            null,
            QCBlocks.BLACK_CRYSTAL_SLAB,
            QCBlocks.BLUE_CRYSTAL_SLAB,
            QCBlocks.GREEN_CRYSTAL_SLAB,
            QCBlocks.INDIGO_CRYSTAL_SLAB,
            QCBlocks.ORANGE_CRYSTAL_SLAB,
            QCBlocks.RED_CRYSTAL_SLAB,
            QCBlocks.PINK_CRYSTAL_SLAB,
            QCBlocks.WHITE_CRYSTAL_SLAB,
            QCBlocks.YELLOW_CRYSTAL_SLAB,
            QCBlocks.CYAN_CRYSTAL_SLAB,
            QCBlocks.PURPLE_CRYSTAL_SLAB,
            QCBlocks.BROWN_CRYSTAL_SLAB,
            QCBlocks.RAINBOW_CRYSTAL_SLAB,
            QCBlocks.DARK_CRYSTAL_SLAB
    };
    public static final CorundumCrystalStairs[] getCrystalStairs = {
            null,
            QCBlocks.BLACK_CRYSTAL_STAIRS,
            QCBlocks.BLUE_CRYSTAL_STAIRS,
            QCBlocks.GREEN_CRYSTAL_STAIRS,
            QCBlocks.INDIGO_CRYSTAL_STAIRS,
            QCBlocks.ORANGE_CRYSTAL_STAIRS,
            QCBlocks.RED_CRYSTAL_STAIRS,
            QCBlocks.PINK_CRYSTAL_STAIRS,
            QCBlocks.WHITE_CRYSTAL_STAIRS,
            QCBlocks.YELLOW_CRYSTAL_STAIRS,
            QCBlocks.CYAN_CRYSTAL_STAIRS,
            QCBlocks.PURPLE_CRYSTAL_STAIRS,
            QCBlocks.BROWN_CRYSTAL_STAIRS,
            QCBlocks.RAINBOW_CRYSTAL_STAIRS,
            QCBlocks.DARK_CRYSTAL_STAIRS
    };
    public static final CorundumCrystalSlab[] getCorundumSlab = {
            null,
            QCBlocks.BLACK_CORUNDUM_SLAB,
            QCBlocks.BLUE_CORUNDUM_SLAB,
            QCBlocks.GREEN_CORUNDUM_SLAB,
            QCBlocks.INDIGO_CORUNDUM_SLAB,
            QCBlocks.ORANGE_CORUNDUM_SLAB,
            QCBlocks.RED_CORUNDUM_SLAB,
            QCBlocks.PINK_CORUNDUM_SLAB,
            QCBlocks.WHITE_CORUNDUM_SLAB,
            QCBlocks.YELLOW_CORUNDUM_SLAB,
            QCBlocks.CYAN_CORUNDUM_SLAB,
            QCBlocks.PURPLE_CORUNDUM_SLAB,
            QCBlocks.BROWN_CORUNDUM_SLAB,
            QCBlocks.RAINBOW_CORUNDUM_SLAB,
            QCBlocks.DARK_CORUNDUM_SLAB
    };
    public static final CorundumCrystalStairs[] getCorundumStairs = {
            null,
            QCBlocks.BLACK_CORUNDUM_STAIRS,
            QCBlocks.BLUE_CORUNDUM_STAIRS,
            QCBlocks.GREEN_CORUNDUM_STAIRS,
            QCBlocks.INDIGO_CORUNDUM_STAIRS,
            QCBlocks.ORANGE_CORUNDUM_STAIRS,
            QCBlocks.RED_CORUNDUM_STAIRS,
            QCBlocks.PINK_CORUNDUM_STAIRS,
            QCBlocks.WHITE_CORUNDUM_STAIRS,
            QCBlocks.YELLOW_CORUNDUM_STAIRS,
            QCBlocks.CYAN_CORUNDUM_STAIRS,
            QCBlocks.PURPLE_CORUNDUM_STAIRS,
            QCBlocks.BROWN_CORUNDUM_STAIRS,
            QCBlocks.RAINBOW_CORUNDUM_STAIRS,
            QCBlocks.DARK_CORUNDUM_STAIRS
    };
}
