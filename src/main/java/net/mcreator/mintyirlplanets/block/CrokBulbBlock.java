package net.mcreator.mintyirlplanets.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;

public class CrokBulbBlock extends Block {
	public CrokBulbBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:plasticbreak")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:plasticwalk")), () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:holowplastichit")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:plastichit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:fiberglassbreak")))).strength(1f, 10f));
	}
}