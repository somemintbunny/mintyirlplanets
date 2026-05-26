package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.util.RandomSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.mintyirlplanets.procedures.StrangeFungusOnTickUpdateProcedure;

public class MossyStrangeStoneBlock extends Block {
	public MossyStrangeStoneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NETHER_ORE).strength(5f, 10f).randomTicks());
	}

	@Override
	public void randomTick(BlockState blockstate, ServerLevel world, BlockPos pos, RandomSource random) {
		super.randomTick(blockstate, world, pos, random);
		StrangeFungusOnTickUpdateProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}