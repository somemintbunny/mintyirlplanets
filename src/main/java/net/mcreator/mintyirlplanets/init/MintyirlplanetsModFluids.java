/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mintyirlplanets.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FlowingFluid;
import net.minecraft.core.registries.BuiltInRegistries;

import net.mcreator.mintyirlplanets.fluid.ToxicWasteFluid;
import net.mcreator.mintyirlplanets.fluid.GustaviumFluid;
import net.mcreator.mintyirlplanets.MintyirlplanetsMod;

public class MintyirlplanetsModFluids {
	public static final DeferredRegister<Fluid> REGISTRY = DeferredRegister.create(BuiltInRegistries.FLUID, MintyirlplanetsMod.MODID);
	public static final DeferredHolder<Fluid, FlowingFluid> GUSTAVIUM = REGISTRY.register("gustavium", GustaviumFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_GUSTAVIUM = REGISTRY.register("flowing_gustavium", GustaviumFluid.Flowing::new);
	public static final DeferredHolder<Fluid, FlowingFluid> TOXIC_WASTE = REGISTRY.register("toxic_waste", ToxicWasteFluid.Source::new);
	public static final DeferredHolder<Fluid, FlowingFluid> FLOWING_TOXIC_WASTE = REGISTRY.register("flowing_toxic_waste", ToxicWasteFluid.Flowing::new);
}