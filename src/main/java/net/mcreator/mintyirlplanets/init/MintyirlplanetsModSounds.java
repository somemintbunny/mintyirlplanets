/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mintyirlplanets.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;

import net.mcreator.mintyirlplanets.MintyirlplanetsMod;

public class MintyirlplanetsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(Registries.SOUND_EVENT, MintyirlplanetsMod.MODID);
	public static final DeferredHolder<SoundEvent, SoundEvent> DISC1 = REGISTRY.register("disc1", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "disc1")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DISC2 = REGISTRY.register("disc2", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "disc2")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DISC3 = REGISTRY.register("disc3", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "disc3")));
	public static final DeferredHolder<SoundEvent, SoundEvent> DARKMOON = REGISTRY.register("darkmoon", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "darkmoon")));
	public static final DeferredHolder<SoundEvent, SoundEvent> MARS = REGISTRY.register("mars", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "mars")));
	public static final DeferredHolder<SoundEvent, SoundEvent> SATURNOST = REGISTRY.register("saturnost", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "saturnost")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PLASTICHIT = REGISTRY.register("plastichit", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "plastichit")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PLASTICWALK = REGISTRY.register("plasticwalk", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "plasticwalk")));
	public static final DeferredHolder<SoundEvent, SoundEvent> HOLOWPLASTICHIT = REGISTRY.register("holowplastichit", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "holowplastichit")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FIBERGLASSHIT = REGISTRY.register("fiberglasshit", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "fiberglasshit")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FIBERGLASSWALK = REGISTRY.register("fiberglasswalk", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "fiberglasswalk")));
	public static final DeferredHolder<SoundEvent, SoundEvent> PLASTICBREAK = REGISTRY.register("plasticbreak", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "plasticbreak")));
	public static final DeferredHolder<SoundEvent, SoundEvent> FIBERGLASSBREAK = REGISTRY.register("fiberglassbreak", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "fiberglassbreak")));
	public static final DeferredHolder<SoundEvent, SoundEvent> TORNFIBERS = REGISTRY.register("tornfibers", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "tornfibers")));
	public static final DeferredHolder<SoundEvent, SoundEvent> GLEEP_HURT = REGISTRY.register("gleep_hurt", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "gleep_hurt")));
	public static final DeferredHolder<SoundEvent, SoundEvent> GLEEB_IDLE = REGISTRY.register("gleeb_idle", () -> SoundEvent.createVariableRangeEvent(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "gleeb_idle")));
}