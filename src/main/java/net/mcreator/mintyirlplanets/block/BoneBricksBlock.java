package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;

public class BoneBricksBlock extends Block {
	public BoneBricksBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BONE_BLOCK).strength(1f, 10f));
	}
}