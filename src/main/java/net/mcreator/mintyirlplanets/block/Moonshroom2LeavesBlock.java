package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class Moonshroom2LeavesBlock extends Block {
	public Moonshroom2LeavesBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.ROOTS).strength(0.2f).lightLevel(blockstate -> 7));
	}

	@Override
	public int getLightBlock(BlockState state) {
		return 1;
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 30;
	}
}