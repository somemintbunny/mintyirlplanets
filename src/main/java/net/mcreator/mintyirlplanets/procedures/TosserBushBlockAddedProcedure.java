package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModBlocks;

public class TosserBushBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == MintyirlplanetsModBlocks.MOON_ROCK.get())
				&& !((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == MintyirlplanetsModBlocks.MOONSHROOM_MOSS.get())) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		}
	}
}