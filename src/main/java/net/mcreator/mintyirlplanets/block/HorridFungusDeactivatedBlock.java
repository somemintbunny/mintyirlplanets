package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.redstone.Orientation;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.Level;
import net.minecraft.core.BlockPos;

import net.mcreator.mintyirlplanets.procedures.TheGrassProcedure;

import javax.annotation.Nullable;

public class HorridFungusDeactivatedBlock extends Block {
	public HorridFungusDeactivatedBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NYLIUM).strength(4.5f, 20.5f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASS));
	}

	@Override
	public void neighborChanged(BlockState blockstate, Level world, BlockPos pos, Block neighborBlock, @Nullable Orientation orientation, boolean moving) {
		super.neighborChanged(blockstate, world, pos, neighborBlock, orientation, moving);
		TheGrassProcedure.execute(world, pos.getX(), pos.getY(), pos.getZ());
	}
}