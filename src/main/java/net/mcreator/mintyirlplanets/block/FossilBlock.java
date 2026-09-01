package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class FossilBlock extends Block {
	public FossilBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.DEEPSLATE_TILES).strength(5f, 10f));
	}
}