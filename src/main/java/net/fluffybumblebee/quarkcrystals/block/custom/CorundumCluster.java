package net.fluffybumblebee.quarkcrystals.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fluffybumblebee.quarkcrystals.block.QCBlocks;
import net.minecraft.block.AmethystClusterBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.world.WorldView;

public class CorundumCluster extends AmethystClusterBlock {
    public CorundumCluster() {
        super   (
                7,
                3,
                FabricBlockSettings
                        .copy(Blocks.AMETHYST_CLUSTER)
                        .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                        .nonOpaque()
                        .strength(1.2F)
                        .requiresTool()
        );
    }
    @Override
    public boolean canPlaceAt(BlockState state, WorldView world, BlockPos pos) {
        Direction direction = state.get(FACING);
        BlockPos blockPos = pos.offset(direction.getOpposite());
        if  (   world.getBlockState(blockPos) == QCBlocks.BLACK_CORUNDUM.getDefaultState() ||
                world.getBlockState(blockPos) == QCBlocks.BLUE_CORUNDUM.getDefaultState() ||
                world.getBlockState(blockPos) == QCBlocks.GREEN_CORUNDUM.getDefaultState() ||
                world.getBlockState(blockPos) == QCBlocks.INDIGO_CORUNDUM.getDefaultState() ||
                world.getBlockState(blockPos) == QCBlocks.ORANGE_CORUNDUM.getDefaultState() ||
                world.getBlockState(blockPos) == QCBlocks.RED_CORUNDUM.getDefaultState() ||
                world.getBlockState(blockPos) == QCBlocks.PINK_CORUNDUM.getDefaultState() ||
                world.getBlockState(blockPos) == QCBlocks.WHITE_CORUNDUM.getDefaultState() ||
                world.getBlockState(blockPos) == QCBlocks.YELLOW_CORUNDUM.getDefaultState() ||
                world.getBlockState(blockPos) == QCBlocks.CYAN_CORUNDUM.getDefaultState() ||
                world.getBlockState(blockPos) == QCBlocks.PURPLE_CORUNDUM.getDefaultState() ||
                world.getBlockState(blockPos) == QCBlocks.BROWN_CORUNDUM.getDefaultState() ||
                world.getBlockState(blockPos) == QCBlocks.RAINBOW_CORUNDUM.getDefaultState() ||
                world.getBlockState(blockPos) == QCBlocks.DARK_CORUNDUM.getDefaultState()

        ) {
            return true;
        }
        return world.getBlockState(blockPos).isSideSolidFullSquare(world, blockPos, direction);
    }

}
