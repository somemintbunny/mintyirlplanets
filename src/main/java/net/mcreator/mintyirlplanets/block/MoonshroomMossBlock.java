package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class MoonshroomMossBlock extends Block {
	public MoonshroomMossBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.GRAVEL).strength(4f, 10f).lightLevel(blockstate -> 10).speedFactor(1.4f));
	}
}