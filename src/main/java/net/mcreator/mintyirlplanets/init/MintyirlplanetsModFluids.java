/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mintyirlplanets.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.chunk.ChunkSectionLayer;
import net.minecraft.client.renderer.ItemBlockRenderTypes;

import net.mcreator.mintyirlplanets.fluid.ToxicWasteFluid;
import net.mcreator.mintyirlplanets.fluid.GustaviumFluid;
import net.mcreator.mintyirlplanets.MintyirlplanetsMod;

public class MintyirlplanetsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, MintyirlplanetsMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> GUSTAVIUM = REGISTRY.register("gustavium", () -> new GustaviumFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_GUSTAVIUM = REGISTRY.register("flowing_gustavium", () -> new GustaviumFluid.Flowing());
	public static final DeferredHolder<Fluid, FlowingFluid> TOXIC_WASTE = REGISTRY.register("toxic_waste", () -> new ToxicWasteFluid.Source());
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_TOXIC_WASTE = REGISTRY.register("flowing_toxic_waste", () -> new ToxicWasteFluid.Flowing());

	@EventBusSubscriber(Dist.CLIENT)
	public static class FluidsClientSideHandler {
		@SubscribeEvent
		public static void clientSetup(FMLClientSetupEvent event) {
			ItemBlockRenderTypes.setRenderLayer(GUSTAVIUM.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(FLOWING_GUSTAVIUM.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(TOXIC_WASTE.get(), ChunkSectionLayer.TRANSLUCENT);
			ItemBlockRenderTypes.setRenderLayer(FLOWING_TOXIC_WASTE.get(), ChunkSectionLayer.TRANSLUCENT);
		}
	}
}