package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.player.Player;
import net.minecraft.core.BlockPos;

import net.mcreator.mintyirlplanets.procedures.DemonicOreAdditionalHarvestConditionProcedure;

public class DemonicOreBlock extends Block {
	public DemonicOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(12f, 15.1571656651f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}

	@Override
	public boolean canHarvestBlock(BlockState state, BlockGetter world, BlockPos pos, Player player) {
		return super.canHarvestBlock(state, world, pos, player) && DemonicOreAdditionalHarvestConditionProcedure.execute(player);
	}
}