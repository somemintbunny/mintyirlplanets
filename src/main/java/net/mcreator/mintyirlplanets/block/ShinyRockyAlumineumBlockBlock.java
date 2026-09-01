package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class ShinyRockyAlumineumBlockBlock extends Block {
	public ShinyRockyAlumineumBlockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(9.3f, 10f).lightLevel(blockstate -> 1).requiresCorrectToolForDrops());
	}
}