package net.mcreator.mintyirlplanets.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.FallingBlock;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import com.mojang.serialization.MapCodec;

public class FiberglassBlock extends FallingBlock {
	public static final MapCodec<FiberglassBlock> CODEC = simpleCodec(FiberglassBlock::new);

	@Override
	public MapCodec<FiberglassBlock> codec() {
		return CODEC;
	}

	@Override
	public int getDustColor(BlockState blockstate, BlockGetter world, BlockPos pos) {
		return blockstate.getMapColor(world, pos).col;
	}

	public FiberglassBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:fiberglassbreak")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:fiberglasswalk")), () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:fiberglasshit")),
				() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:fiberglasshit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:fiberglasshit")))).strength(1f, 10f));
	}
}