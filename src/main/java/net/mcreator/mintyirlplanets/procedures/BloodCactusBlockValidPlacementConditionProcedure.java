package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModBlocks;

public class BloodCactusBlockValidPlacementConditionProcedure {
	public static boolean execute(LevelAccessor world, double x, double y, double z) {
		return (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == MintyirlplanetsModBlocks.BLOOD_CACTUS.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == Blocks.SAND
				|| (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == MintyirlplanetsModBlocks.FERROUS_SAND.get() || (world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == MintyirlplanetsModBlocks.FIBERGLASS.get();
	}
}