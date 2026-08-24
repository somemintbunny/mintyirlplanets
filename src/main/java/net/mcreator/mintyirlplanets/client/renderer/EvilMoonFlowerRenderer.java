package net.mcreator.mintyirlplanets.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mintyirlplanets.entity.EvilMoonFlowerEntity;
import net.mcreator.mintyirlplanets.client.model.ModelMoonFlower;

public class EvilMoonFlowerRenderer extends MobRenderer<EvilMoonFlowerEntity, LivingEntityRenderState, ModelMoonFlower> {
	private EvilMoonFlowerEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("mintyirlplanets:textures/entities/evilmoonflower.png");

	public EvilMoonFlowerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMoonFlower(context.bakeLayer(ModelMoonFlower.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(EvilMoonFlowerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}