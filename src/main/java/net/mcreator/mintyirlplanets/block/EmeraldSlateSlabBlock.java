package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.SlabBlock;

public class EmeraldSlateSlabBlock extends SlabBlock {
	public EmeraldSlateSlabBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.METAL).strength(1.45f, 15f).requiresCorrectToolForDrops());
	}
}