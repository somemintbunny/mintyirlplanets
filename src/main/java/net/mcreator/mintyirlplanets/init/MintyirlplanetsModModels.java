/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mintyirlplanets.init;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.BoatModel;

import net.mcreator.mintyirlplanets.client.model.*;

@EventBusSubscriber(Dist.CLIENT)
public class MintyirlplanetsModModels {
	public static final ModelLayerLocation SUBCONSIUS_BOAT_LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.parse("mintyirlplanets:boat/subconsius_boat"), "main");
	public static final ModelLayerLocation SUBCONSIUS_CHEST_BOAT_LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.parse("mintyirlplanets:chest_boat/subconsius_chest_boat"), "main");

	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(ModelLarry.LAYER_LOCATION, ModelLarry::createBodyLayer);
		event.registerLayerDefinition(ModelMoonFlower.LAYER_LOCATION, ModelMoonFlower::createBodyLayer);
		event.registerLayerDefinition(ModelHopperNymph.LAYER_LOCATION, ModelHopperNymph::createBodyLayer);
		event.registerLayerDefinition(Modelcrusher.LAYER_LOCATION, Modelcrusher::createBodyLayer);
		event.registerLayerDefinition(Modelcustom_model.LAYER_LOCATION, Modelcustom_model::createBodyLayer);
		event.registerLayerDefinition(Modelshroomple.LAYER_LOCATION, Modelshroomple::createBodyLayer);
		event.registerLayerDefinition(Modelgnarpgnarp.LAYER_LOCATION, Modelgnarpgnarp::createBodyLayer);
		event.registerLayerDefinition(ModelStagBeetle.LAYER_LOCATION, ModelStagBeetle::createBodyLayer);
		event.registerLayerDefinition(ModelMuchroomBoi.LAYER_LOCATION, ModelMuchroomBoi::createBodyLayer);
		event.registerLayerDefinition(Modelstillslinger.LAYER_LOCATION, Modelstillslinger::createBodyLayer);
		event.registerLayerDefinition(SUBCONSIUS_BOAT_LAYER_LOCATION, BoatModel::createBoatModel);
		event.registerLayerDefinition(SUBCONSIUS_CHEST_BOAT_LAYER_LOCATION, BoatModel::createChestBoatModel);
	}
}