package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class FerrousSandBlock extends FallingBlock {
	public static final MapCodec<FerrousSandBlock> CODEC = simpleCodec(FerrousSandBlock::new);

	@Override
	public MapCodec<FerrousSandBlock> codec() {
		return CODEC;
	}

	@Override
	public int getDustColor(BlockState blockstate, BlockGetter world, BlockPos pos) {
		return blockstate.getMapColor(world, pos).col;
	}

	public FerrousSandBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.SAND).strength(6f, 10f));
	}
}