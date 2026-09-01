package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.DoorBlock;

public class SubconsiusDoorBlock extends DoorBlock {
	public SubconsiusDoorBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, properties.sound(SoundType.WOOD).strength(9f).noOcclusion().isRedstoneConductor((bs, br, bp) -> false).ignitedByLava().instrument(NoteBlockInstrument.BASS));
	}
}