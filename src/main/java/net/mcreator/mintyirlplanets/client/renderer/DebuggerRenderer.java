package net.mcreator.mintyirlplanets.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.HumanoidRenderState;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.ArmorModelSet;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;

import net.mcreator.mintyirlplanets.entity.DebuggerEntity;

public class DebuggerRenderer extends HumanoidMobRenderer<DebuggerEntity, HumanoidRenderState, HumanoidModel<HumanoidRenderState>> {
	private final Identifier entityTexture = Identifier.parse("mintyirlplanets:textures/entities/e.png");

	public DebuggerRenderer(EntityRendererProvider.Context context) {
		super(context, new HumanoidModel<HumanoidRenderState>(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, ArmorModelSet.bake(ModelLayers.PLAYER_ARMOR, context.getModelSet(), HumanoidModel::new), context.getEquipmentRenderer()));
	}

	@Override
	public HumanoidRenderState createRenderState() {
		return new HumanoidRenderState();
	}

	@Override
	public void extractRenderState(DebuggerEntity entity, HumanoidRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(HumanoidRenderState state) {
		return entityTexture;
	}
}