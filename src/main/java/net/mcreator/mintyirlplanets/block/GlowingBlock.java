package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;

public class GlowingBlock extends Block {
	public GlowingBlock(BlockBehaviour.Properties properties) {
		super(properties.strength(1f, 10f).lightLevel(blockstate -> 15));
	}
}