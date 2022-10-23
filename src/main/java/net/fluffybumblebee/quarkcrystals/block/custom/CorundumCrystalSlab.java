package net.fluffybumblebee.quarkcrystals.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.BlockState;
import net.minecraft.block.Material;
import net.minecraft.block.SlabBlock;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.Direction;

public class CorundumCrystalSlab extends SlabBlock {
    public CorundumCrystalSlab() {
        super   (
                FabricBlockSettings
                        .of(Material.AMETHYST)
                        .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                        .nonOpaque()
                        .luminance(10)
                        .luminance(5)
                        .strength(1.2F)
                        .ticksRandomly()
                        .requiresTool());
    }
    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        return stateFrom.isOf(this) || super.isSideInvisible(state, stateFrom, direction);
    }
}
