package net.mcreator.mintyirlplanets.world.dimension;

import net.neoforged.neoforge.event.entity.player.PlayerEvent;
import net.neoforged.neoforge.client.event.RegisterDimensionSpecialEffectsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;
import net.minecraft.client.renderer.DimensionSpecialEffects;

import net.mcreator.mintyirlplanets.procedures.SaturnPlayerLeavesDimensionProcedure;
import net.mcreator.mintyirlplanets.procedures.SaturnPlayerEntersDimensionProcedure;

@EventBusSubscriber
public class SaturnDimension {
	@EventBusSubscriber(Dist.CLIENT)
	public static class SaturnSpecialEffectsHandler {
		@SubscribeEvent
		public static void registerDimensionSpecialEffects(RegisterDimensionSpecialEffectsEvent event) {
			DimensionSpecialEffects customEffect = new DimensionSpecialEffects(DimensionSpecialEffects.SkyType.NONE, false, false) {
				@Override
				public Vec3 getBrightnessDependentFogColor(Vec3 color, float sunHeight) {
					return new Vec3(0.337254902, 0.2117647059, 0);
				}

				@Override
				public boolean isFoggyAt(int x, int y) {
					return true;
				}
			};
			event.register(ResourceLocation.parse("mintyirlplanets:saturn"), customEffect);
		}
	}

	@SubscribeEvent
	public static void onPlayerChangedDimensionEvent(PlayerEvent.PlayerChangedDimensionEvent event) {
		Entity entity = event.getEntity();
		Level world = entity.level();
		double x = entity.getX();
		double y = entity.getY();
		double z = entity.getZ();
		if (event.getFrom() == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("mintyirlplanets:saturn"))) {
			SaturnPlayerLeavesDimensionProcedure.execute(entity);
		}
		if (event.getTo() == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("mintyirlplanets:saturn"))) {
			SaturnPlayerEntersDimensionProcedure.execute(entity);
		}
	}
}