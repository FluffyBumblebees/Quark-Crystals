package net.fluffybumblebee.quarkcrystals.block;

import net.fabricmc.fabric.api.registry.OxidizableBlocksRegistry;
import net.fluffybumblebee.quarkcrystals.block.custom.*;
import net.fluffybumblebee.quarkcrystals.util.QCUtil;
import net.minecraft.block.Block;

@SuppressWarnings("unused")
public class QCBlocks {
    public static  <B extends Block> void register(B block, String name) {
        QCUtil.registerBlock(block, name);
    }

    public static final CorundumCluster BLACK_CORUNDUM_CLUSTER = new CorundumCluster();
    public static final CorundumCluster BLUE_CORUNDUM_CLUSTER = new CorundumCluster();
    public static final CorundumCluster CYAN_CORUNDUM_CLUSTER = new CorundumCluster();
    public static final CorundumCluster GREEN_CORUNDUM_CLUSTER = new CorundumCluster();
    public static final CorundumCluster INDIGO_CORUNDUM_CLUSTER = new CorundumCluster();
    public static final CorundumCluster ORANGE_CORUNDUM_CLUSTER = new CorundumCluster();
    public static final CorundumCluster RED_CORUNDUM_CLUSTER = new CorundumCluster();
    public static final CorundumCluster PINK_CORUNDUM_CLUSTER = new CorundumCluster();
    public static final CorundumCluster WHITE_CORUNDUM_CLUSTER = new CorundumCluster();
    public static final CorundumCluster YELLOW_CORUNDUM_CLUSTER = new CorundumCluster();
    public static final CorundumCluster PURPLE_CORUNDUM_CLUSTER = new CorundumCluster();
    public static final CorundumCluster BROWN_CORUNDUM_CLUSTER = new CorundumCluster();
    public static final CorundumCluster RAINBOW_CORUNDUM_CLUSTER = new CorundumCluster();
    public static final CorundumCluster DARK_CORUNDUM_CLUSTER = new CorundumCluster();

    public static final CorundumBlock BLACK_CORUNDUM = new CorundumBlock(false, () -> BLACK_CORUNDUM_CLUSTER);
    public static final CorundumBlock BLUE_CORUNDUM = new CorundumBlock(false, () -> BLUE_CORUNDUM_CLUSTER);
    public static final CorundumBlock GREEN_CORUNDUM = new CorundumBlock(false, () -> GREEN_CORUNDUM_CLUSTER);
    public static final CorundumBlock INDIGO_CORUNDUM = new CorundumBlock(false, () -> INDIGO_CORUNDUM_CLUSTER);
    public static final CorundumBlock ORANGE_CORUNDUM = new CorundumBlock(false, () -> ORANGE_CORUNDUM_CLUSTER);
    public static final CorundumBlock RED_CORUNDUM = new CorundumBlock(false, () -> RED_CORUNDUM_CLUSTER);
    public static final CorundumBlock PINK_CORUNDUM = new CorundumBlock(false, () -> PINK_CORUNDUM_CLUSTER);
    public static final CorundumBlock WHITE_CORUNDUM = new CorundumBlock(false, () -> WHITE_CORUNDUM_CLUSTER);
    public static final CorundumBlock YELLOW_CORUNDUM = new CorundumBlock(false, () -> YELLOW_CORUNDUM_CLUSTER);
    public static final CorundumBlock CYAN_CORUNDUM = new CorundumBlock(false, () -> CYAN_CORUNDUM_CLUSTER);
    public static final CorundumBlock PURPLE_CORUNDUM = new CorundumBlock(false, () -> PURPLE_CORUNDUM_CLUSTER);
    public static final CorundumBlock BROWN_CORUNDUM = new CorundumBlock(false, () -> BROWN_CORUNDUM_CLUSTER);
    public static final CorundumBlock RAINBOW_CORUNDUM = new CorundumBlock(false, () -> RAINBOW_CORUNDUM_CLUSTER);
    public static final CorundumBlock DARK_CORUNDUM = new CorundumBlock(false, () -> DARK_CORUNDUM_CLUSTER);

    public static final CrystalBlock BLACK_CRYSTAL = new CrystalBlock();
    public static final CrystalBlock BLUE_CRYSTAL = new CrystalBlock();
    public static final CrystalBlock CYAN_CRYSTAL = new CrystalBlock();
    public static final CrystalBlock GREEN_CRYSTAL = new CrystalBlock();
    public static final CrystalBlock INDIGO_CRYSTAL = new CrystalBlock();
    public static final CrystalBlock ORANGE_CRYSTAL = new CrystalBlock();
    public static final CrystalBlock RED_CRYSTAL = new CrystalBlock();
    public static final CrystalBlock PINK_CRYSTAL = new CrystalBlock();
    public static final CrystalBlock WHITE_CRYSTAL = new CrystalBlock();
    public static final CrystalBlock YELLOW_CRYSTAL = new CrystalBlock();
    public static final CrystalBlock PURPLE_CRYSTAL = new CrystalBlock();
    public static final CrystalBlock BROWN_CRYSTAL = new CrystalBlock();
    public static final CrystalBlock RAINBOW_CRYSTAL = new CrystalBlock();
    public static final CrystalBlock DARK_CRYSTAL = new CrystalBlock();

    public static final CorundumCrystalPane BLACK_CORUNDUM_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane BLUE_CORUNDUM_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane CYAN_CORUNDUM_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane GREEN_CORUNDUM_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane INDIGO_CORUNDUM_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane ORANGE_CORUNDUM_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane RED_CORUNDUM_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane PINK_CORUNDUM_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane WHITE_CORUNDUM_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane YELLOW_CORUNDUM_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane PURPLE_CORUNDUM_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane BROWN_CORUNDUM_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane RAINBOW_CORUNDUM_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane DARK_CORUNDUM_PANE = new CorundumCrystalPane();

    public static final CorundumCrystalPane BLACK_CRYSTAL_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane BLUE_CRYSTAL_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane CYAN_CRYSTAL_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane GREEN_CRYSTAL_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane INDIGO_CRYSTAL_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane ORANGE_CRYSTAL_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane RED_CRYSTAL_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane PINK_CRYSTAL_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane WHITE_CRYSTAL_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane YELLOW_CRYSTAL_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane PURPLE_CRYSTAL_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane BROWN_CRYSTAL_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane RAINBOW_CRYSTAL_PANE = new CorundumCrystalPane();
    public static final CorundumCrystalPane DARK_CRYSTAL_PANE = new CorundumCrystalPane();

    public static final CorundumBlock WAXED_BLACK_CORUNDUM = new CorundumBlock(true, () -> BLACK_CORUNDUM_CLUSTER);
    public static final CorundumBlock WAXED_BLUE_CORUNDUM = new CorundumBlock(true, () -> BLUE_CORUNDUM_CLUSTER);
    public static final CorundumBlock WAXED_CYAN_CORUNDUM = new CorundumBlock(true, () -> CYAN_CORUNDUM_CLUSTER);
    public static final CorundumBlock WAXED_GREEN_CORUNDUM = new CorundumBlock(true, () -> GREEN_CORUNDUM_CLUSTER);
    public static final CorundumBlock WAXED_INDIGO_CORUNDUM = new CorundumBlock(true, () -> INDIGO_CORUNDUM_CLUSTER);
    public static final CorundumBlock WAXED_ORANGE_CORUNDUM = new CorundumBlock(true, () -> ORANGE_CORUNDUM_CLUSTER);
    public static final CorundumBlock WAXED_RED_CORUNDUM = new CorundumBlock(true, () -> RED_CORUNDUM_CLUSTER);
    public static final CorundumBlock WAXED_PINK_CORUNDUM = new CorundumBlock(true, () -> PINK_CORUNDUM_CLUSTER);
    public static final CorundumBlock WAXED_WHITE_CORUNDUM = new CorundumBlock(true, () -> WHITE_CORUNDUM_CLUSTER);
    public static final CorundumBlock WAXED_YELLOW_CORUNDUM = new CorundumBlock(true, () -> YELLOW_CORUNDUM_CLUSTER);
    public static final CorundumBlock WAXED_PURPLE_CORUNDUM = new CorundumBlock(true, () -> PURPLE_CORUNDUM_CLUSTER);
    public static final CorundumBlock WAXED_BROWN_CORUNDUM = new CorundumBlock(true, () -> BROWN_CORUNDUM_CLUSTER);
    public static final CorundumBlock WAXED_RAINBOW_CORUNDUM = new CorundumBlock(true, () -> RAINBOW_CORUNDUM_CLUSTER);
    public static final CorundumBlock WAXED_DARK_CORUNDUM = new CorundumBlock(true, () -> DARK_CORUNDUM_CLUSTER);

    public static final CorundumCrystalSlab BLACK_CORUNDUM_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab BLUE_CORUNDUM_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab CYAN_CORUNDUM_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab GREEN_CORUNDUM_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab INDIGO_CORUNDUM_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab ORANGE_CORUNDUM_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab RED_CORUNDUM_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab PINK_CORUNDUM_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab WHITE_CORUNDUM_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab YELLOW_CORUNDUM_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab PURPLE_CORUNDUM_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab BROWN_CORUNDUM_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab RAINBOW_CORUNDUM_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab DARK_CORUNDUM_SLAB = new CorundumCrystalSlab();

    public static final CorundumCrystalStairs BLACK_CORUNDUM_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs BLUE_CORUNDUM_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs CYAN_CORUNDUM_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs GREEN_CORUNDUM_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs INDIGO_CORUNDUM_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs ORANGE_CORUNDUM_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs RED_CORUNDUM_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs PINK_CORUNDUM_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs WHITE_CORUNDUM_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs YELLOW_CORUNDUM_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs PURPLE_CORUNDUM_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs BROWN_CORUNDUM_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs RAINBOW_CORUNDUM_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs DARK_CORUNDUM_STAIRS = new CorundumCrystalStairs();

    public static final CorundumCrystalSlab BLACK_CRYSTAL_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab BLUE_CRYSTAL_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab CYAN_CRYSTAL_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab GREEN_CRYSTAL_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab INDIGO_CRYSTAL_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab ORANGE_CRYSTAL_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab RED_CRYSTAL_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab PINK_CRYSTAL_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab WHITE_CRYSTAL_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab YELLOW_CRYSTAL_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab PURPLE_CRYSTAL_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab BROWN_CRYSTAL_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab RAINBOW_CRYSTAL_SLAB = new CorundumCrystalSlab();
    public static final CorundumCrystalSlab DARK_CRYSTAL_SLAB = new CorundumCrystalSlab();

    public static final CorundumCrystalStairs BLACK_CRYSTAL_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs BLUE_CRYSTAL_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs CYAN_CRYSTAL_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs GREEN_CRYSTAL_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs INDIGO_CRYSTAL_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs ORANGE_CRYSTAL_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs RED_CRYSTAL_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs PINK_CRYSTAL_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs WHITE_CRYSTAL_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs YELLOW_CRYSTAL_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs PURPLE_CRYSTAL_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs BROWN_CRYSTAL_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs RAINBOW_CRYSTAL_STAIRS = new CorundumCrystalStairs();
    public static final CorundumCrystalStairs DARK_CRYSTAL_STAIRS = new CorundumCrystalStairs();


    public static void initClass() {
        OxidizableBlocksRegistry.registerWaxableBlockPair(BLACK_CORUNDUM, WAXED_BLACK_CORUNDUM);
        OxidizableBlocksRegistry.registerWaxableBlockPair(BLUE_CORUNDUM, WAXED_BLUE_CORUNDUM);
        OxidizableBlocksRegistry.registerWaxableBlockPair(CYAN_CORUNDUM, WAXED_CYAN_CORUNDUM);
        OxidizableBlocksRegistry.registerWaxableBlockPair(GREEN_CORUNDUM, WAXED_GREEN_CORUNDUM);
        OxidizableBlocksRegistry.registerWaxableBlockPair(INDIGO_CORUNDUM, WAXED_INDIGO_CORUNDUM);
        OxidizableBlocksRegistry.registerWaxableBlockPair(ORANGE_CORUNDUM, WAXED_ORANGE_CORUNDUM);
        OxidizableBlocksRegistry.registerWaxableBlockPair(RED_CORUNDUM, WAXED_RED_CORUNDUM);
        OxidizableBlocksRegistry.registerWaxableBlockPair(PINK_CORUNDUM, WAXED_PINK_CORUNDUM);
        OxidizableBlocksRegistry.registerWaxableBlockPair(WHITE_CORUNDUM, WAXED_WHITE_CORUNDUM);
        OxidizableBlocksRegistry.registerWaxableBlockPair(YELLOW_CORUNDUM, WAXED_YELLOW_CORUNDUM);
        OxidizableBlocksRegistry.registerWaxableBlockPair(PURPLE_CORUNDUM, WAXED_PURPLE_CORUNDUM);
        OxidizableBlocksRegistry.registerWaxableBlockPair(BROWN_CORUNDUM, WAXED_BROWN_CORUNDUM);
        OxidizableBlocksRegistry.registerWaxableBlockPair(RAINBOW_CORUNDUM, WAXED_RAINBOW_CORUNDUM);
        OxidizableBlocksRegistry.registerWaxableBlockPair(DARK_CORUNDUM, WAXED_DARK_CORUNDUM);

        register(BLACK_CORUNDUM_CLUSTER, "black_corundum_cluster");
        register(BLUE_CORUNDUM_CLUSTER, "blue_corundum_cluster");
        register(CYAN_CORUNDUM_CLUSTER, "cyan_corundum_cluster");
        register(GREEN_CORUNDUM_CLUSTER, "green_corundum_cluster");
        register(INDIGO_CORUNDUM_CLUSTER, "indigo_corundum_cluster");
        register(ORANGE_CORUNDUM_CLUSTER, "orange_corundum_cluster");
        register(RED_CORUNDUM_CLUSTER, "red_corundum_cluster");
        register(PINK_CORUNDUM_CLUSTER, "pink_corundum_cluster");
        register(WHITE_CORUNDUM_CLUSTER, "white_corundum_cluster");
        register(YELLOW_CORUNDUM_CLUSTER, "yellow_corundum_cluster");
        register(PURPLE_CORUNDUM_CLUSTER, "purple_corundum_cluster");
        register(BROWN_CORUNDUM_CLUSTER, "brown_corundum_cluster");
        register(RAINBOW_CORUNDUM_CLUSTER, "rainbow_corundum_cluster");
        register(DARK_CORUNDUM_CLUSTER, "dark_corundum_cluster");

        register(BLACK_CORUNDUM, "black_corundum");
        register(BLUE_CORUNDUM, "blue_corundum");
        register(CYAN_CORUNDUM, "cyan_corundum");
        register(GREEN_CORUNDUM, "green_corundum");
        register(INDIGO_CORUNDUM, "indigo_corundum");
        register(ORANGE_CORUNDUM, "orange_corundum");
        register(RED_CORUNDUM, "red_corundum");
        register(PINK_CORUNDUM, "pink_corundum");
        register(WHITE_CORUNDUM, "white_corundum");
        register(YELLOW_CORUNDUM, "yellow_corundum");
        register(PURPLE_CORUNDUM, "purple_corundum");
        register(BROWN_CORUNDUM, "brown_corundum");
        register(RAINBOW_CORUNDUM, "rainbow_corundum");
        register(DARK_CORUNDUM, "dark_corundum");

        register(BLACK_CRYSTAL, "black_crystal");
        register(BLUE_CRYSTAL, "blue_crystal");
        register(CYAN_CRYSTAL, "cyan_crystal");
        register(GREEN_CRYSTAL, "green_crystal");
        register(INDIGO_CRYSTAL, "indigo_crystal");
        register(ORANGE_CRYSTAL, "orange_crystal");
        register(RED_CRYSTAL, "red_crystal");
        register(PINK_CRYSTAL, "pink_crystal");
        register(WHITE_CRYSTAL, "white_crystal");
        register(YELLOW_CRYSTAL, "yellow_crystal");
        register(PURPLE_CRYSTAL, "purple_crystal");
        register(BROWN_CRYSTAL, "brown_crystal");
        register(RAINBOW_CRYSTAL, "rainbow_crystal");
        register(DARK_CRYSTAL, "dark_crystal");

        register(BLACK_CORUNDUM_PANE, "black_corundum_pane");
        register(BLUE_CORUNDUM_PANE, "blue_corundum_pane");
        register(CYAN_CORUNDUM_PANE, "cyan_corundum_pane");
        register(GREEN_CORUNDUM_PANE, "green_corundum_pane");
        register(INDIGO_CORUNDUM_PANE, "indigo_corundum_pane");
        register(ORANGE_CORUNDUM_PANE, "orange_corundum_pane");
        register(RED_CORUNDUM_PANE, "red_corundum_pane");
        register(PINK_CORUNDUM_PANE, "pink_corundum_pane");
        register(WHITE_CORUNDUM_PANE, "white_corundum_pane");
        register(YELLOW_CORUNDUM_PANE, "yellow_corundum_pane");
        register(PURPLE_CORUNDUM_PANE, "purple_corundum_pane");
        register(BROWN_CORUNDUM_PANE, "brown_corundum_pane");
        register(RAINBOW_CORUNDUM_PANE, "rainbow_corundum_pane");
        register(DARK_CORUNDUM_PANE, "dark_corundum_pane");

        register(BLACK_CRYSTAL_PANE, "black_crystal_pane");
        register(BLUE_CRYSTAL_PANE, "blue_crystal_pane");
        register(CYAN_CRYSTAL_PANE, "cyan_crystal_pane");
        register(GREEN_CRYSTAL_PANE, "green_crystal_pane");
        register(INDIGO_CRYSTAL_PANE, "indigo_crystal_pane");
        register(ORANGE_CRYSTAL_PANE, "orange_crystal_pane");
        register(RED_CRYSTAL_PANE, "red_crystal_pane");
        register(PINK_CRYSTAL_PANE, "pink_crystal_pane");
        register(WHITE_CRYSTAL_PANE, "white_crystal_pane");
        register(YELLOW_CRYSTAL_PANE, "yellow_crystal_pane");
        register(PURPLE_CRYSTAL_PANE, "purple_crystal_pane");
        register(BROWN_CRYSTAL_PANE, "brown_crystal_pane");
        register(RAINBOW_CRYSTAL_PANE, "rainbow_crystal_pane");
        register(DARK_CRYSTAL_PANE, "dark_crystal_pane");

        register(WAXED_BLACK_CORUNDUM, "waxed_black_corundum");
        register(WAXED_BLUE_CORUNDUM, "waxed_blue_corundum");
        register(WAXED_CYAN_CORUNDUM, "waxed_cyan_corundum");
        register(WAXED_GREEN_CORUNDUM, "waxed_green_corundum");
        register(WAXED_INDIGO_CORUNDUM, "waxed_indigo_corundum");
        register(WAXED_ORANGE_CORUNDUM, "waxed_orange_corundum");
        register(WAXED_RED_CORUNDUM, "waxed_red_corundum");
        register(WAXED_PINK_CORUNDUM, "waxed_pink_corundum");
        register(WAXED_WHITE_CORUNDUM, "waxed_white_corundum");
        register(WAXED_YELLOW_CORUNDUM, "waxed_yellow_corundum");
        register(WAXED_PURPLE_CORUNDUM, "waxed_purple_corundum");
        register(WAXED_BROWN_CORUNDUM, "waxed_brown_corundum");
        register(WAXED_RAINBOW_CORUNDUM, "waxed_rainbow_corundum");
        register(WAXED_DARK_CORUNDUM, "waxed_dark_corundum");

        register(BLACK_CORUNDUM_SLAB, "black_corundum_slab");
        register(BLUE_CORUNDUM_SLAB, "blue_corundum_slab");
        register(CYAN_CORUNDUM_SLAB, "cyan_corundum_slab");
        register(GREEN_CORUNDUM_SLAB, "green_corundum_slab");
        register(INDIGO_CORUNDUM_SLAB, "indigo_corundum_slab");
        register(ORANGE_CORUNDUM_SLAB, "orange_corundum_slab");
        register(RED_CORUNDUM_SLAB, "red_corundum_slab");
        register(PINK_CORUNDUM_SLAB, "pink_corundum_slab");
        register(WHITE_CORUNDUM_SLAB, "white_corundum_slab");
        register(YELLOW_CORUNDUM_SLAB, "yellow_corundum_slab");
        register(PURPLE_CORUNDUM_SLAB, "purple_corundum_slab");
        register(BROWN_CORUNDUM_SLAB, "brown_corundum_slab");
        register(RAINBOW_CORUNDUM_SLAB, "rainbow_corundum_slab");
        register(DARK_CORUNDUM_SLAB, "dark_corundum_slab");

        register(BLACK_CORUNDUM_STAIRS, "black_corundum_stairs");
        register(BLUE_CORUNDUM_STAIRS, "blue_corundum_stairs");
        register(CYAN_CORUNDUM_STAIRS, "cyan_corundum_stairs");
        register(GREEN_CORUNDUM_STAIRS, "green_corundum_stairs");
        register(INDIGO_CORUNDUM_STAIRS, "indigo_corundum_stairs");
        register(ORANGE_CORUNDUM_STAIRS, "orange_corundum_stairs");
        register(RED_CORUNDUM_STAIRS, "red_corundum_stairs");
        register(PINK_CORUNDUM_STAIRS, "pink_corundum_stairs");
        register(WHITE_CORUNDUM_STAIRS, "white_corundum_stairs");
        register(YELLOW_CORUNDUM_STAIRS, "yellow_corundum_stairs");
        register(PURPLE_CORUNDUM_STAIRS, "purple_corundum_stairs");
        register(BROWN_CORUNDUM_STAIRS, "brown_corundum_stairs");
        register(RAINBOW_CORUNDUM_STAIRS, "rainbow_corundum_stairs");
        register(DARK_CORUNDUM_STAIRS, "dark_corundum_stairs");

        register(BLACK_CRYSTAL_SLAB, "black_crystal_slab");
        register(BLUE_CRYSTAL_SLAB, "blue_crystal_slab");
        register(CYAN_CRYSTAL_SLAB, "cyan_crystal_slab");
        register(GREEN_CRYSTAL_SLAB, "green_crystal_slab");
        register(INDIGO_CRYSTAL_SLAB, "indigo_crystal_slab");
        register(ORANGE_CRYSTAL_SLAB, "orange_crystal_slab");
        register(RED_CRYSTAL_SLAB, "red_crystal_slab");
        register(PINK_CRYSTAL_SLAB, "pink_crystal_slab");
        register(WHITE_CRYSTAL_SLAB, "white_crystal_slab");
        register(YELLOW_CRYSTAL_SLAB, "yellow_crystal_slab");
        register(PURPLE_CRYSTAL_SLAB, "purple_crystal_slab");
        register(BROWN_CRYSTAL_SLAB, "brown_crystal_slab");
        register(RAINBOW_CRYSTAL_SLAB, "rainbow_crystal_slab");
        register(DARK_CRYSTAL_SLAB, "dark_crystal_slab");

        register(BLACK_CRYSTAL_STAIRS, "black_crystal_stairs");
        register(BLUE_CRYSTAL_STAIRS, "blue_crystal_stairs");
        register(CYAN_CRYSTAL_STAIRS, "cyan_crystal_stairs");
        register(GREEN_CRYSTAL_STAIRS, "green_crystal_stairs");
        register(INDIGO_CRYSTAL_STAIRS, "indigo_crystal_stairs");
        register(ORANGE_CRYSTAL_STAIRS, "orange_crystal_stairs");
        register(RED_CRYSTAL_STAIRS, "red_crystal_stairs");
        register(PINK_CRYSTAL_STAIRS, "pink_crystal_stairs");
        register(WHITE_CRYSTAL_STAIRS, "white_crystal_stairs");
        register(YELLOW_CRYSTAL_STAIRS, "yellow_crystal_stairs");
        register(PURPLE_CRYSTAL_STAIRS, "purple_crystal_stairs");
        register(BROWN_CRYSTAL_STAIRS, "brown_crystal_stairs");
        register(RAINBOW_CRYSTAL_STAIRS, "rainbow_crystal_stairs");
        register(DARK_CRYSTAL_STAIRS, "dark_crystal_stairs");
    }
}
