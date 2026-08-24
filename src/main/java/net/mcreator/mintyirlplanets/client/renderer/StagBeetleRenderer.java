package net.mcreator.mintyirlplanets.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mintyirlplanets.entity.StagBeetleEntity;
import net.mcreator.mintyirlplanets.client.model.ModelStagBeetle;

public class StagBeetleRenderer extends MobRenderer<StagBeetleEntity, LivingEntityRenderState, ModelStagBeetle> {
	private StagBeetleEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("mintyirlplanets:textures/entities/stagbeetle.png");

	public StagBeetleRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelStagBeetle(context.bakeLayer(ModelStagBeetle.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(StagBeetleEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}