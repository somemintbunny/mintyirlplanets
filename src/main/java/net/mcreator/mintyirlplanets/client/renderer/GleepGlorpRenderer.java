package net.mcreator.mintyirlplanets.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mintyirlplanets.entity.GleepGlorpEntity;
import net.mcreator.mintyirlplanets.client.model.Modelgnarpgnarp;

import com.mojang.blaze3d.vertex.PoseStack;

public class GleepGlorpRenderer extends MobRenderer<GleepGlorpEntity, LivingEntityRenderState, Modelgnarpgnarp> {
	private GleepGlorpEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("mintyirlplanets:textures/entities/gnarp_gnarp.png");

	public GleepGlorpRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelgnarpgnarp(context.bakeLayer(Modelgnarpgnarp.LAYER_LOCATION)), 0.7f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(GleepGlorpEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}

	@Override
	protected void scale(LivingEntityRenderState state, PoseStack poseStack) {
		poseStack.scale(entity.getAgeScale(), entity.getAgeScale(), entity.getAgeScale());
	}
}