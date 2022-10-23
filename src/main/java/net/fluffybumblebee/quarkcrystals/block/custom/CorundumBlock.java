package net.fluffybumblebee.quarkcrystals.block.custom;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AmethystClusterBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.BuddingAmethystBlock;
import net.minecraft.block.Material;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;

import java.util.function.Supplier;


@SuppressWarnings({"deprecation"})
public class CorundumBlock extends BuddingAmethystBlock {
    private final boolean waxed;
    private final Supplier<CorundumCluster> corundum;

    public CorundumBlock(boolean waxed, Supplier<CorundumCluster> corundum) {
        super   (
                FabricBlockSettings
                        .of(Material.AMETHYST)
                        .sounds(BlockSoundGroup.AMETHYST_BLOCK)
                        .nonOpaque()
                        .luminance(10)
                        .lightLevel(5)
                        .strength(1.2F)
                        .ticksRandomly()
                        .requiresTool()
        );
        this.waxed = waxed;
        this.corundum = corundum;

    }
    @Override
    public boolean isSideInvisible(BlockState state, BlockState stateFrom, Direction direction) {
        return stateFrom.isOf(this) || super.isSideInvisible(state, stateFrom, direction);
    }

    private static final Direction[] DIRECTIONS = Direction.values();

    @Override
    public void randomTick(BlockState state, ServerWorld world, BlockPos pos, Random random) {
        if (world.isAir(pos.up()) && !waxed && random.nextInt(8 * (pos.getY() + 65)) == 0) {
            Direction direction0 = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            Direction direction1 = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            Direction direction2 = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            Direction direction3 = DIRECTIONS[random.nextInt(DIRECTIONS.length)];
            int i;
            i = 1;
            while (world.getBlockState(pos.down(i)).isOf(this)) {
                ++i;
            }
            if (i < (384 - pos.getY() + 64) / 96 - 1) {
                world.setBlockState(pos.up(), this.getDefaultState());
                if (canGrow(world, direction0, pos)) {
                    world.setBlockState(pos.up().offset(direction0), corundum.get().getDefaultState().with(AmethystClusterBlock.FACING, direction0));
                }
                if (canGrow(world, direction1, pos)) {
                    world.setBlockState(pos.up().offset(direction1), corundum.get().getDefaultState().with(AmethystClusterBlock.FACING, direction1));
                }
                if (canGrow(world, direction2, pos)) {
                    world.setBlockState(pos.up().offset(direction2), corundum.get().getDefaultState().with(AmethystClusterBlock.FACING, direction2));
                }
                if (random.nextInt(5) == 0 && canGrow(world, direction3, pos)) {
                    world.setBlockState(pos.up().offset(direction3), corundum.get().getDefaultState().with(AmethystClusterBlock.FACING, direction3));
                }
                if (random.nextInt(5) == 0 && world.isAir(pos.up(2))) {
                    world.setBlockState(pos.up(2), corundum.get().getDefaultState());
                }
            }
        }
    }

    public static boolean canGrow(ServerWorld world, Direction direction, BlockPos pos) {
        return world.isAir(pos.offset(direction));
    }
}
