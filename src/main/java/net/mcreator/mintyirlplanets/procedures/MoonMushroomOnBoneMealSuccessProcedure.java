package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class MoonMushroomOnBoneMealSuccessProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Mth.nextInt(RandomSource.create(), 1, 3) == 1) {
			if (world instanceof ServerLevel _level)
				_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("mintyirlplanets:moonshroomsmall"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
						BlockPos.containing(x, y, z));
			world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
		} else {
			if (Mth.nextInt(RandomSource.create(), 1, 3) == 2) {
				if (world instanceof ServerLevel _level)
					_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("mintyirlplanets:moonshroommed"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
							BlockPos.containing(x, y, z));
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			} else if (true) {
				if (world instanceof ServerLevel _level)
					_level.holderOrThrow(ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.parse("mintyirlplanets:moonshroomtreebig"))).value().place(_level, _level.getChunkSource().getGenerator(), _level.getRandom(),
							BlockPos.containing(x, y, z));
				world.setBlock(BlockPos.containing(x, y, z), Blocks.AIR.defaultBlockState(), 3);
			}
		}
	}
}