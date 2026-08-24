package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModWoodTypes;

public class SubconsiusSignBlock extends StandingSignBlock {
	public SubconsiusSignBlock(BlockBehaviour.Properties properties) {
		super(MintyirlplanetsModWoodTypes.SUBCONSIUS_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(3f).noCollission().ignitedByLava().instrument(NoteBlockInstrument.HARP).forceSolidOn());
	}
}