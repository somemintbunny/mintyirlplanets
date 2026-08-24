package net.mcreator.mintyirlplanets.client.fluid;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModFluidTypes;

@EventBusSubscriber(Dist.CLIENT)
public class GustaviumFluidExtension {
	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("mintyirlplanets:block/terecelium");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("mintyirlplanets:block/terecelium");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}
		}, MintyirlplanetsModFluidTypes.GUSTAVIUM_TYPE.get());
	}
}