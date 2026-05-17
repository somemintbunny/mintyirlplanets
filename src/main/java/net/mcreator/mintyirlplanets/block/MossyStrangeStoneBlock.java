package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class MossyStrangeStoneBlock extends Block {
	public MossyStrangeStoneBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.NETHER_ORE).strength(5f, 10f));
	}
}