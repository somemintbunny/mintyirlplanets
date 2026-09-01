package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BrimstoneBlockBlock extends Block {
	public BrimstoneBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(5f, 10f).requiresCorrectToolForDrops());
	}
}