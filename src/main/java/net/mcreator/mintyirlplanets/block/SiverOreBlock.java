package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class SiverOreBlock extends Block {
	public SiverOreBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(3f, 5f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.BASEDRUM));
	}
}