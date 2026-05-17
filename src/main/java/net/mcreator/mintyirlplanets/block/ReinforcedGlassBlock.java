package net.mcreator.mintyirlplanets.block;

import net.neoforged.neoforge.common.util.DeferredSoundType;

import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class ReinforcedGlassBlock extends Block {
	public ReinforcedGlassBlock(BlockBehaviour.Properties properties) {
		super(properties
				.sound(new DeferredSoundType(1.0f, 1.0f, () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:plasticbreak")),
						() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:plasticwalk")), () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:plasticwalk")),
						() -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:holowplastichit")), () -> BuiltInRegistries.SOUND_EVENT.getValue(ResourceLocation.parse("mintyirlplanets:plasticbreak"))))
				.strength(-1, 3600000).requiresCorrectToolForDrops().noOcclusion().isRedstoneConductor((bs, br, bp) -> false));
	}

	@Override
	public VoxelShape getVisualShape(BlockState state, BlockGetter world, BlockPos pos, CollisionContext context) {
		return Shapes.empty();
	}
}