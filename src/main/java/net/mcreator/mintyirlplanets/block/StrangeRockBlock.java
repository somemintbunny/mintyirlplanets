package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class StrangeRockBlock extends Block {
	public StrangeRockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BASALT).strength(5f, 10f).requiresCorrectToolForDrops());
	}
}