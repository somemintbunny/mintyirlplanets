package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModBlocks;

public class UnlitFancyCandleBlockIsPlacedByProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (!world.getBlockState(BlockPos.containing(x, y - 1, z)).canOcclude()) {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
			if (world instanceof ServerLevel _level) {
				ItemEntity entityToSpawn = new ItemEntity(_level, x, y, z, new ItemStack(MintyirlplanetsModBlocks.UNLIT_FANCY_CANDLE.get()));
				entityToSpawn.setPickUpDelay(10);
				_level.addFreshEntity(entityToSpawn);
			}
		}
	}
}