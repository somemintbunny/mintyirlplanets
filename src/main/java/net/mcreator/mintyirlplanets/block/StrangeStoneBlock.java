package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.util.TriState;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.mintyirlplanets.procedures.StrangeStoneOnTickUpdateProcedure;

public class StrangeStoneBlock extends Block {
	public StrangeStoneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BASALT).strength(4.4f, 24.5f).randomTicks().instrument(NoteBlockInstrument.DIDGERIDOO));
	}

	@Override
	public TriState canSustainPlant(BlockState state, BlockGetter world, BlockPos pos, Direction direction, BlockState plant) {
		return TriState.TRUE;
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.randomTick(blockstate, world, pos, random);
		StrangeStoneOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}