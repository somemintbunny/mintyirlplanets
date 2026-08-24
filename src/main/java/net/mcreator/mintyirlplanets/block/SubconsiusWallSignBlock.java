package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModWoodTypes;
import net.mcreator.mintyirlplanets.init.MintyirlplanetsModBlocks;

public class SubconsiusWallSignBlock extends WallSignBlock {
	public SubconsiusWallSignBlock(BlockBehaviour.Properties properties) {
		super(MintyirlplanetsModWoodTypes.SUBCONSIUS_SIGN_WOOD_TYPE, properties.sound(SoundType.WOOD).strength(3f).noCollission().ignitedByLava().instrument(NoteBlockInstrument.HARP).forceSolidOn()
				.overrideLootTable(MintyirlplanetsModBlocks.SUBCONSIUS_SIGN.get().getLootTable()).overrideDescription(MintyirlplanetsModBlocks.SUBCONSIUS_SIGN.get().getDescriptionId()));
	}
}