/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mintyirlplanets.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.core.registries.Registries;

import net.mcreator.mintyirlplanets.potion.ToxicGasMobEffect;
import net.mcreator.mintyirlplanets.potion.AntiToxinMobEffect;
import net.mcreator.mintyirlplanets.MintyirlplanetsMod;

public class MintyirlplanetsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(Registries.MOB_EFFECT, MintyirlplanetsMod.MODID);
	public static final DeferredHolder<MobEffect, MobEffect> ANTI_TOXIN = REGISTRY.register("anti_toxin", () -> new AntiToxinMobEffect());
	public static final DeferredHolder<MobEffect, MobEffect> TOXIC_GAS = REGISTRY.register("toxic_gas", () -> new ToxicGasMobEffect());
}