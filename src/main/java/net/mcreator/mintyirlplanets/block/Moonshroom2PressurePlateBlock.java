package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

public class Moonshroom2PressurePlateBlock extends PressurePlateBlock {
	public Moonshroom2PressurePlateBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, properties.sound(SoundType.WOOD).strength(2f, 3f).lightLevel(blockstate -> 5).ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 5;
	}
}