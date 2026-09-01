package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class EndothermiaBlock extends Block {
	public EndothermiaBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.AMETHYST_CLUSTER).strength(1f, 30f));
	}
}