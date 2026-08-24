package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Blocks;

public class EmeraldBrickStairsBlock extends StairBlock {
	public EmeraldBrickStairsBlock(BlockBehaviour.Properties properties) {
		super(Blocks.AIR.defaultBlockState(), properties.sound(SoundType.METAL).strength(1.45f, 10f).requiresCorrectToolForDrops().instrument(NoteBlockInstrument.HARP));
	}

	@Override
	public float getExplosionResistance() {
		return 10f;
	}
}