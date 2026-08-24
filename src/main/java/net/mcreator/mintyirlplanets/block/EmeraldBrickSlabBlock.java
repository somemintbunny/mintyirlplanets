package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class EmeraldBrickSlabBlock extends SlabBlock {
	public EmeraldBrickSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(1.4f, 15f).instrument(NoteBlockInstrument.HARP));
	}
}