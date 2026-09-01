package net.mcreator.mintyirlplanets.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.BuiltInRegistries;

public class CrokBulbBlock extends Block {
	public CrokBulbBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("mintyirlplanets:plasticbreak")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("mintyirlplanets:plasticwalk")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("mintyirlplanets:holowplastichit")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("mintyirlplanets:plastichit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(Identifier.parse("mintyirlplanets:fiberglassbreak")))).strength(1f, 10f)
				.lightLevel(blockstate -> 15));
	}
}