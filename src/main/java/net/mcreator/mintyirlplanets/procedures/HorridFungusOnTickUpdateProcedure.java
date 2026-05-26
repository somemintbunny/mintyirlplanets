package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.level.block.state.properties.Property;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModBlocks;

public class HorridFungusOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double xcheck = 0;
		double ycheck = 0;
		double zcheck = 0;
		xcheck = x + Mth.nextInt(RandomSource.create(), -3, 3);
		ycheck = y + Mth.nextInt(RandomSource.create(), -3, 3);
		zcheck = z + Mth.nextInt(RandomSource.create(), -3, 3);
		if ((world.getBlockState(BlockPos.containing(xcheck, ycheck, zcheck))).getBlock() == MintyirlplanetsModBlocks.STRANGE_STONE.get()) {
			{
				BlockPos _bp = BlockPos.containing(xcheck, ycheck, zcheck);
				BlockState _bs = MintyirlplanetsModBlocks.HORRID_FUNGUS.get().defaultBlockState();
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
		} else if ((world.getBlockState(BlockPos.containing(xcheck, ycheck, zcheck))).getBlock() == MintyirlplanetsModBlocks.MOSSY_STRANGE_STONE.get()) {
			{
				BlockPos _bp = BlockPos.containing(xcheck, ycheck, zcheck);
				BlockState _bs = MintyirlplanetsModBlocks.HORRID_FUNGUS.get().defaultBlockState();
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
		if ((world.getBlockState(BlockPos.containing(x + 1, y, z + 1))).getBlock() == MintyirlplanetsModBlocks.HORRID_FUNGUS.get()
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z - 1))).getBlock() == MintyirlplanetsModBlocks.HORRID_FUNGUS.get()
				&& (world.getBlockState(BlockPos.containing(x - 1, y, z + 1))).getBlock() == MintyirlplanetsModBlocks.HORRID_FUNGUS.get()
				&& (world.getBlockState(BlockPos.containing(x + 1, y, z - 1))).getBlock() == MintyirlplanetsModBlocks.HORRID_FUNGUS.get()) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = MintyirlplanetsModBlocks.HORRID_FUNGUS_DEACTIVATED.get().defaultBlockState();
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
		if (Mth.nextInt(RandomSource.create(), 1, 15) == 7) {
			{
				BlockPos _bp = BlockPos.containing(x, y, z);
				BlockState _bs = MintyirlplanetsModBlocks.HORRID_FUNGUS_DEACTIVATED.get().defaultBlockState();
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