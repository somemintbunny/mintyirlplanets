package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModBlocks;

public class StrangeFungusOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xcheck = 0;
		double ycheck = 0;
		double zcheck = 0;
		xcheck = x + Mth.nextInt(RandomSource.create(), -3, 3);
		ycheck = y + Mth.nextInt(RandomSource.create(), -3, 3);
		zcheck = z + Mth.nextInt(RandomSource.create(), -3, 3);
		if ((world.getBlockState(BlockPos.containing(xcheck, ycheck, zcheck))).getBlock() == MintyirlplanetsModBlocks.HORRID_FUNGUS_DEACTIVATED.get()) {
			{
				BlockPos _bp = BlockPos.containing(xcheck, ycheck, zcheck);
				BlockState _bs = MintyirlplanetsModBlocks.MOSSY_STRANGE_STONE.get().defaultBlockState();
				BlockState _bso = world.getBlockState(_bp);
				for (Property<?> _propertyOld : _bso.getProperties()) {
					Property _propertyNew = _bs.getBlock().getStateDefinition().getProperty(_propertyOld.getName());
					if (_propertyNew != null && _bs.getValue(_propertyNew) != null)
						try {
							_bs = _bs.setValue(_propertyNew, _bso.getValue(_propertyOld));
						} catch (Exception e) {
						}
				}
				world.setBlock(_bp, _bs, 3);
			}
		}
	}
}