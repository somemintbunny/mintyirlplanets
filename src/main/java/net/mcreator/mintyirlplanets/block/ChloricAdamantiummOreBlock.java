package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.core.BlockPos;

import net.mcreator.mintyirlplanets.procedures.DemonicOreAdditionalHarvestConditionProcedure;

import com.mojang.serialization.MapCodec;

public class ChloricAdamantiummOreBlock extends FallingBlock {
	public static final MapCodec<ChloricAdamantiummOreBlock> CODEC = simpleCodec(ChloricAdamantiummOreBlock::new);

	@Override
	public MapCodec<ChloricAdamantiummOreBlock> codec() {
		return CODEC;
	}

	@Override
	public int getDustColor(BlockState blockstate, BlockGetter world, BlockPos pos) {
		return blockstate.getMapColor(world, pos).col;
	}

	public ChloricAdamantiummOreBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.TUFF_BRICKS).strength(10.5f, 13.6214844771f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public int getExpDrop(BlockState state, LevelAccessor level, BlockPos pos, BlockEntity blockEntity, Entity breaker, ItemStack tool) {
		return Mth.randomBetweenInclusive(level.getRandom(), 1, 14);
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		return super.canHarvestBlock(state, world, pos, player) && DemonicOreAdditionalHarvestConditionProcedure.execute(player);
	}
}