package net.mcreator.mintyirlplanets.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mintyirlplanets.entity.ShroompleEntity;
import net.mcreator.mintyirlplanets.client.model.Modelshroomple;

public class ShroompleRenderer extends MobRenderer<ShroompleEntity, LivingEntityRenderState, Modelshroomple> {
	private ShroompleEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("mintyirlplanets:textures/entities/muchroom.png");

	public ShroompleRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelshroomple(context.bakeLayer(Modelshroomple.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(ShroompleEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}