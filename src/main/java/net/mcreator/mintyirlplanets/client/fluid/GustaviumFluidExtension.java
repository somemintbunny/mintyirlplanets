package net.mcreator.mintyirlplanets.client.fluid;

import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.neoforge.client.event.RegisterFluidModelsEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.Identifier;
import net.minecraft.client.resources.model.sprite.Material;
import net.minecraft.client.renderer.block.FluidModel;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModFluids;
import net.mcreator.mintyirlplanets.init.MintyirlplanetsModFluidTypes;

@EventBusSubscriber(Dist.CLIENT)
public class GustaviumFluidExtension {
	@SubscribeEvent
	public static void registerRegisterFluidModels(RegisterFluidModelsEvent event) {
		event.register(new FluidModel.Unbaked(new Material(Identifier.parse("mintyirlplanets:block/terecelium")), new Material(Identifier.parse("mintyirlplanets:block/terecelium")), null, null), MintyirlplanetsModFluids.GUSTAVIUM,
				MintyirlplanetsModFluids.FLOWING_GUSTAVIUM);
	}

	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
		}, MintyirlplanetsModFluidTypes.GUSTAVIUM_TYPE);
	}
}