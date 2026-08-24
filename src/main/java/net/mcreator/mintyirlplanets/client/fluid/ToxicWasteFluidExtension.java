package net.mcreator.mintyirlplanets.client.fluid;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.fog.environment.FogEnvironment;
import net.minecraft.client.renderer.fog.FogData;
import net.minecraft.client.Camera;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModFluidTypes;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class ToxicWasteFluidExtension {
	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("mintyirlplanets:block/theliquid");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("mintyirlplanets:block/theliquid");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}

			@Override
			public void modifyFogRender(Camera camera, @Nullable FogEnvironment environment, float renderDistance, float partialTick, FogData fogData) {
				float nearDistance = fogData.environmentalStart;
				float farDistance = fogData.environmentalEnd;
				Entity entity = camera.getEntity();
				Level world = entity.level();
				fogData.environmentalStart = 0.4f;
				fogData.environmentalEnd = Math.min(20f, renderDistance);
			}
		}, MintyirlplanetsModFluidTypes.TOXIC_WASTE_TYPE.get());
	}
}