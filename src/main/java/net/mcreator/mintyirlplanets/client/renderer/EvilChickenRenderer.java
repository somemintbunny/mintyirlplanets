package net.mcreator.mintyirlplanets.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.ChickenRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.ChickenModel;

import net.mcreator.mintyirlplanets.entity.EvilChickenEntity;

public class EvilChickenRenderer extends MobRenderer<EvilChickenEntity, ChickenRenderState, ChickenModel> {
	private EvilChickenEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("mintyirlplanets:textures/entities/chicken_texture.png");

	public EvilChickenRenderer(EntityRendererProvider.Context context) {
		super(context, new ChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ChickenRenderState createRenderState() {
		return new ChickenRenderState();
	}

	@Override
	public void extractRenderState(EvilChickenEntity entity, ChickenRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(ChickenRenderState state) {
		return entityTexture;
	}
}