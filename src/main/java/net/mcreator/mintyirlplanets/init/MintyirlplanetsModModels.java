/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mintyirlplanets.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.mcreator.mintyirlplanets.client.model.Modelstillslinger;
import net.mcreator.mintyirlplanets.client.model.Modelgnarpgnarp;
import net.mcreator.mintyirlplanets.client.model.Modelcustom_model;
import net.mcreator.mintyirlplanets.client.model.Modelcrusher;
import net.mcreator.mintyirlplanets.client.model.ModelLarry;

@EventBusSubscriber(Dist.CLIENT)
public class MintyirlplanetsModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelLarry.LAYER_LOCATION, ModelLarry::createBodyLayer);
		event.registerLayerDefinition(Modelcrusher.LAYER_LOCATION, Modelcrusher::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelgnarpgnarp.LAYER_LOCATION, Modelgnarpgnarp::createBodyLayer);
		event.registerLayerDefinition(Modelstillslinger.LAYER_LOCATION, Modelstillslinger::createBodyLayer);
	}
}