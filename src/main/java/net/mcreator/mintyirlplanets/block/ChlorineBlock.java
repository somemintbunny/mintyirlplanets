package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class ChlorineBlock extends Block {
	public ChlorineBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.CALCITE).strength(1f, 10f));
	}
}