package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.PressurePlateBlock;

public class SubconsiusPressurePlateBlock extends PressurePlateBlock {
	public SubconsiusPressurePlateBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, properties.sound(SoundType.WOOD).strength(1.5f).noCollision().pushReaction(PushReaction.DESTROY).ignitedByLava().instrument(NoteBlockInstrument.BASS).forceSolidOn());
	}
}