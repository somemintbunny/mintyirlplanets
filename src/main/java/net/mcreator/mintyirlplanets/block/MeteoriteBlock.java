package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class MeteoriteBlock extends Block {
	public MeteoriteBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.ANCIENT_DEBRIS).strength(10.25f, 26f).requiresCorrectToolForDrops());
	}
}