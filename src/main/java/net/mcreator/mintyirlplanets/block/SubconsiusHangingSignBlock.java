package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.CeilingHangingSignBlock;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModWoodTypes;

public class SubconsiusHangingSignBlock extends CeilingHangingSignBlock {
	public SubconsiusHangingSignBlock(BlockBehaviour.Properties properties) {
		super(MintyirlplanetsModWoodTypes.SUBCONSIUS_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.HANGING_SIGN).strength(3f).noCollission().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}
}