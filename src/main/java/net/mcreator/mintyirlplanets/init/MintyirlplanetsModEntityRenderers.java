/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mintyirlplanets.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.client.renderer.entity.ThrownItemRenderer;
import net.minecraft.client.renderer.entity.BoatRenderer;

import net.mcreator.mintyirlplanets.client.renderer.*;

@EventBusSubscriber(Dist.CLIENT)
public class MintyirlplanetsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MintyirlplanetsModEntities.DEBUGGER.get(), DebuggerRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.TOSSER_GRENADE.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.LAZER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.EYEZOR.get(), EyezorRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.THE_CRUSHER.get(), TheCrusherRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.MARTIAN.get(), MartianRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.SHRUMPHER.get(), ShrumpherRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.BIBER.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.STILL_SLINGER.get(), StillSlingerRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.CHOKED_ZOMBIE.get(), ChokedZombieRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.TOSSER_GRENADE_ENEMY.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.NIGHTMARE.get(), NightmareRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.SBLT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.DDBLT.get(), ThrownItemRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.LARRY.get(), LarryRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.GLEEP_GLORP.get(), GleepGlorpRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.SUBCONSIUS_BOAT.get(), context -> new BoatRenderer(context, MintyirlplanetsModModels.SUBCONSIUS_BOAT_LAYER_LOCATION));
		event.registerEntityRenderer(MintyirlplanetsModEntities.SUBCONSIUS_CHEST_BOAT.get(), context -> new BoatRenderer(context, MintyirlplanetsModModels.SUBCONSIUS_CHEST_BOAT_LAYER_LOCATION));
		event.registerEntityRenderer(MintyirlplanetsModEntities.STAG_BEETLE.get(), StagBeetleRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.HOPPER_NYMPH.get(), HopperNymphRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.EVIL_CHICKEN.get(), EvilChickenRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.SHROOMPLE.get(), ShroompleRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.MOON_FLOWER.get(), MoonFlowerRenderer::new);
		event.registerEntityRenderer(MintyirlplanetsModEntities.EVIL_MOON_FLOWER.get(), EvilMoonFlowerRenderer::new);
	}
}