package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class EmeraldSlatesBlock extends Block {
	public EmeraldSlatesBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(1.45f, 15f).requiresCorrectToolForDrops());
	}
}