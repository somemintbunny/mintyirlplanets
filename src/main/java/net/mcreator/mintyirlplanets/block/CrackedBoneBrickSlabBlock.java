package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class CrackedBoneBrickSlabBlock extends SlabBlock {
	public CrackedBoneBrickSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BONE_BLOCK).strength(1f, 10f));
	}
}