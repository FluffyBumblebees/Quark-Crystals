package net.fluffybumblebee.quarkcrystals.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fluffybumblebee.quarkcrystals.block.QCBlocks;
import net.fluffybumblebee.quarkcrystals.util.IdentifierUtil;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class QCItemGroup {
    public static void registerItemgroup() {}
    public static final ItemGroup QUARK_CRYSTALS;

    static {
        QUARK_CRYSTALS = FabricItemGroupBuilder.create(
                        new Identifier(IdentifierUtil.ID, IdentifierUtil.ID))
                .icon(() -> new ItemStack(QCBlocks.PURPLE_CORUNDUM))
                .appendItems(stacks -> {
                    stacks.add(new ItemStack(QCBlocks.BLACK_CORUNDUM_CLUSTER));
                    stacks.add(new ItemStack(QCBlocks.BLUE_CORUNDUM_CLUSTER));
                    stacks.add(new ItemStack(QCBlocks.GREEN_CORUNDUM_CLUSTER));
                    stacks.add(new ItemStack(QCBlocks.INDIGO_CORUNDUM_CLUSTER));
                    stacks.add(new ItemStack(QCBlocks.ORANGE_CORUNDUM_CLUSTER));
                    stacks.add(new ItemStack(QCBlocks.RED_CORUNDUM_CLUSTER));
                    stacks.add(new ItemStack(QCBlocks.PINK_CORUNDUM_CLUSTER));
                    stacks.add(new ItemStack(QCBlocks.WHITE_CORUNDUM_CLUSTER));
                    stacks.add(new ItemStack(QCBlocks.YELLOW_CORUNDUM_CLUSTER));
                    stacks.add(new ItemStack(QCBlocks.CYAN_CORUNDUM_CLUSTER));
                    stacks.add(new ItemStack(QCBlocks.PURPLE_CORUNDUM_CLUSTER));
                    stacks.add(new ItemStack(QCBlocks.BROWN_CORUNDUM_CLUSTER));
                    stacks.add(new ItemStack(QCBlocks.RAINBOW_CORUNDUM_CLUSTER));
                    stacks.add(new ItemStack(QCBlocks.DARK_CORUNDUM_CLUSTER));

                    stacks.add(new ItemStack(QCBlocks.BLACK_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.BLUE_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.GREEN_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.INDIGO_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.ORANGE_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.RED_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.PINK_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.WHITE_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.YELLOW_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.CYAN_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.PURPLE_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.BROWN_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.RAINBOW_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.DARK_CORUNDUM));

                    stacks.add(new ItemStack(QCBlocks.BLACK_CORUNDUM_PANE));
                    stacks.add(new ItemStack(QCBlocks.BLUE_CORUNDUM_PANE));
                    stacks.add(new ItemStack(QCBlocks.GREEN_CORUNDUM_PANE));
                    stacks.add(new ItemStack(QCBlocks.INDIGO_CORUNDUM_PANE));
                    stacks.add(new ItemStack(QCBlocks.ORANGE_CORUNDUM_PANE));
                    stacks.add(new ItemStack(QCBlocks.RED_CORUNDUM_PANE));
                    stacks.add(new ItemStack(QCBlocks.PINK_CORUNDUM_PANE));
                    stacks.add(new ItemStack(QCBlocks.WHITE_CORUNDUM_PANE));
                    stacks.add(new ItemStack(QCBlocks.YELLOW_CORUNDUM_PANE));
                    stacks.add(new ItemStack(QCBlocks.CYAN_CORUNDUM_PANE));
                    stacks.add(new ItemStack(QCBlocks.PURPLE_CORUNDUM_PANE));
                    stacks.add(new ItemStack(QCBlocks.BROWN_CORUNDUM_PANE));
                    stacks.add(new ItemStack(QCBlocks.RAINBOW_CORUNDUM_PANE));
                    stacks.add(new ItemStack(QCBlocks.DARK_CORUNDUM_PANE));

                    stacks.add(new ItemStack(QCBlocks.BLACK_CRYSTAL));
                    stacks.add(new ItemStack(QCBlocks.BLUE_CRYSTAL));
                    stacks.add(new ItemStack(QCBlocks.GREEN_CRYSTAL));
                    stacks.add(new ItemStack(QCBlocks.INDIGO_CRYSTAL));
                    stacks.add(new ItemStack(QCBlocks.ORANGE_CRYSTAL));
                    stacks.add(new ItemStack(QCBlocks.RED_CRYSTAL));
                    stacks.add(new ItemStack(QCBlocks.PINK_CRYSTAL));
                    stacks.add(new ItemStack(QCBlocks.WHITE_CRYSTAL));
                    stacks.add(new ItemStack(QCBlocks.YELLOW_CRYSTAL));
                    stacks.add(new ItemStack(QCBlocks.CYAN_CRYSTAL));
                    stacks.add(new ItemStack(QCBlocks.PURPLE_CRYSTAL));
                    stacks.add(new ItemStack(QCBlocks.BROWN_CRYSTAL));
                    stacks.add(new ItemStack(QCBlocks.RAINBOW_CRYSTAL));
                    stacks.add(new ItemStack(QCBlocks.DARK_CRYSTAL));

                    stacks.add(new ItemStack(QCBlocks.BLACK_CRYSTAL_PANE));
                    stacks.add(new ItemStack(QCBlocks.BLUE_CRYSTAL_PANE));
                    stacks.add(new ItemStack(QCBlocks.GREEN_CRYSTAL_PANE));
                    stacks.add(new ItemStack(QCBlocks.INDIGO_CRYSTAL_PANE));
                    stacks.add(new ItemStack(QCBlocks.ORANGE_CRYSTAL_PANE));
                    stacks.add(new ItemStack(QCBlocks.RED_CRYSTAL_PANE));
                    stacks.add(new ItemStack(QCBlocks.PINK_CRYSTAL_PANE));
                    stacks.add(new ItemStack(QCBlocks.WHITE_CRYSTAL_PANE));
                    stacks.add(new ItemStack(QCBlocks.YELLOW_CRYSTAL_PANE));
                    stacks.add(new ItemStack(QCBlocks.CYAN_CRYSTAL_PANE));
                    stacks.add(new ItemStack(QCBlocks.PURPLE_CRYSTAL_PANE));
                    stacks.add(new ItemStack(QCBlocks.BROWN_CRYSTAL_PANE));
                    stacks.add(new ItemStack(QCBlocks.RAINBOW_CRYSTAL_PANE));
                    stacks.add(new ItemStack(QCBlocks.DARK_CRYSTAL_PANE));

                    stacks.add(new ItemStack(QCBlocks.WAXED_BLACK_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.WAXED_BLUE_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.WAXED_GREEN_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.WAXED_INDIGO_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.WAXED_ORANGE_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.WAXED_RED_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.WAXED_PINK_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.WAXED_WHITE_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.WAXED_YELLOW_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.WAXED_CYAN_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.WAXED_PURPLE_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.WAXED_BROWN_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.WAXED_RAINBOW_CORUNDUM));
                    stacks.add(new ItemStack(QCBlocks.WAXED_DARK_CORUNDUM));

                    stacks.add(new ItemStack(QCBlocks.BLACK_CORUNDUM_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.BLUE_CORUNDUM_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.GREEN_CORUNDUM_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.INDIGO_CORUNDUM_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.ORANGE_CORUNDUM_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.RED_CORUNDUM_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.PINK_CORUNDUM_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.WHITE_CORUNDUM_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.YELLOW_CORUNDUM_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.CYAN_CORUNDUM_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.PURPLE_CORUNDUM_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.BROWN_CORUNDUM_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.RAINBOW_CORUNDUM_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.DARK_CORUNDUM_STAIRS));

                    stacks.add(new ItemStack(QCBlocks.BLACK_CORUNDUM_SLAB));
                    stacks.add(new ItemStack(QCBlocks.BLUE_CORUNDUM_SLAB));
                    stacks.add(new ItemStack(QCBlocks.GREEN_CORUNDUM_SLAB));
                    stacks.add(new ItemStack(QCBlocks.INDIGO_CORUNDUM_SLAB));
                    stacks.add(new ItemStack(QCBlocks.ORANGE_CORUNDUM_SLAB));
                    stacks.add(new ItemStack(QCBlocks.RED_CORUNDUM_SLAB));
                    stacks.add(new ItemStack(QCBlocks.PINK_CORUNDUM_SLAB));
                    stacks.add(new ItemStack(QCBlocks.WHITE_CORUNDUM_SLAB));
                    stacks.add(new ItemStack(QCBlocks.YELLOW_CORUNDUM_SLAB));
                    stacks.add(new ItemStack(QCBlocks.CYAN_CORUNDUM_SLAB));
                    stacks.add(new ItemStack(QCBlocks.PURPLE_CORUNDUM_SLAB));
                    stacks.add(new ItemStack(QCBlocks.BROWN_CORUNDUM_SLAB));
                    stacks.add(new ItemStack(QCBlocks.RAINBOW_CORUNDUM_SLAB));
                    stacks.add(new ItemStack(QCBlocks.DARK_CORUNDUM_SLAB));

                    stacks.add(new ItemStack(QCBlocks.BLACK_CRYSTAL_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.BLUE_CRYSTAL_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.GREEN_CRYSTAL_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.INDIGO_CRYSTAL_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.ORANGE_CRYSTAL_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.RED_CRYSTAL_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.PINK_CRYSTAL_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.WHITE_CRYSTAL_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.YELLOW_CRYSTAL_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.CYAN_CRYSTAL_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.PURPLE_CRYSTAL_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.BROWN_CRYSTAL_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.RAINBOW_CRYSTAL_STAIRS));
                    stacks.add(new ItemStack(QCBlocks.DARK_CRYSTAL_STAIRS));

                    stacks.add(new ItemStack(QCBlocks.BLACK_CRYSTAL_SLAB));
                    stacks.add(new ItemStack(QCBlocks.BLUE_CRYSTAL_SLAB));
                    stacks.add(new ItemStack(QCBlocks.CYAN_CRYSTAL_SLAB));
                    stacks.add(new ItemStack(QCBlocks.GREEN_CRYSTAL_SLAB));
                    stacks.add(new ItemStack(QCBlocks.INDIGO_CRYSTAL_SLAB));
                    stacks.add(new ItemStack(QCBlocks.ORANGE_CRYSTAL_SLAB));
                    stacks.add(new ItemStack(QCBlocks.RED_CRYSTAL_SLAB));
                    stacks.add(new ItemStack(QCBlocks.PINK_CRYSTAL_SLAB));
                    stacks.add(new ItemStack(QCBlocks.WHITE_CRYSTAL_SLAB));
                    stacks.add(new ItemStack(QCBlocks.YELLOW_CRYSTAL_SLAB));
                    stacks.add(new ItemStack(QCBlocks.PURPLE_CRYSTAL_SLAB));
                    stacks.add(new ItemStack(QCBlocks.BROWN_CRYSTAL_SLAB));
                    stacks.add(new ItemStack(QCBlocks.RAINBOW_CRYSTAL_SLAB));
                    stacks.add(new ItemStack(QCBlocks.DARK_CRYSTAL_SLAB));
                })
                .build();
    }
}
