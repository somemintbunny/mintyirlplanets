package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class EmeraldBricksBlock extends Block {
	public EmeraldBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(1.4f, 15f));
	}
}