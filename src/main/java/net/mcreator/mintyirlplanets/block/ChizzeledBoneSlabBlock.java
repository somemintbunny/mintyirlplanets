package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class ChizzeledBoneSlabBlock extends SlabBlock {
	public ChizzeledBoneSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BONE_BLOCK).strength(1f, 10f));
	}
}