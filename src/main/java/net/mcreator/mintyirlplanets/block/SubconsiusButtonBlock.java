package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.ButtonBlock;

public class SubconsiusButtonBlock extends ButtonBlock {
	public SubconsiusButtonBlock(BlockBehaviour.Properties properties) {
		super(BlockSetType.OAK, 30, properties.sound(SoundType.WOOD).strength(1.5f).noCollision().pushReaction(PushReaction.DESTROY));
	}
}