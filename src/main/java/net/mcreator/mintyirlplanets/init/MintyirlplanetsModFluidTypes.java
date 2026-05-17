/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mintyirlplanets.init;

import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.fluids.FluidType;

import net.mcreator.mintyirlplanets.fluid.types.ToxicWasteFluidType;
import net.mcreator.mintyirlplanets.fluid.types.GustaviumFluidType;
import net.mcreator.mintyirlplanets.MintyirlplanetsMod;

public class MintyirlplanetsModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(NeoForgeRegistries.FLUID_TYPES, MintyirlplanetsMod.MODID);
	public static final DeferredHolder<FluidType, FluidType> GUSTAVIUM_TYPE = REGISTRY.register("gustavium", () -> new GustaviumFluidType());
	public static final DeferredHolder<FluidType, FluidType> TOXIC_WASTE_TYPE = REGISTRY.register("toxic_waste", () -> new ToxicWasteFluidType());
}