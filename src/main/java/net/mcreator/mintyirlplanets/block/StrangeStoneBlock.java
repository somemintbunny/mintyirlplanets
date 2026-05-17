package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class StrangeStoneBlock extends Block {
	public StrangeStoneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BASALT).strength(4f, 24.5f));
	}
}