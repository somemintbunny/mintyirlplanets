package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.WallHangingSignBlock;
import net.minecraft.world.level.block.SoundType;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModWoodTypes;
import net.mcreator.mintyirlplanets.init.MintyirlplanetsModBlocks;

public class SubconsiusWallHangingSignBlock extends WallHangingSignBlock {
	public SubconsiusWallHangingSignBlock(BlockBehaviour.Properties properties) {
		super(MintyirlplanetsModWoodTypes.SUBCONSIUS_HANGING_SIGN_WOOD_TYPE, properties.sound(SoundType.HANGING_SIGN).strength(3f).noCollission().ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn()
				.overrideLootTable(MintyirlplanetsModBlocks.SUBCONSIUS_HANGING_SIGN.get().getLootTable()).overrideDescription(MintyirlplanetsModBlocks.SUBCONSIUS_HANGING_SIGN.get().getDescriptionId()));
	}
}