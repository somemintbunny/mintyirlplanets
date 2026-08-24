package net.mcreator.mintyirlplanets.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mintyirlplanets.entity.MoonFlowerEntity;
import net.mcreator.mintyirlplanets.client.model.ModelMoonFlower;

public class MoonFlowerRenderer extends MobRenderer<MoonFlowerEntity, LivingEntityRenderState, ModelMoonFlower> {
	private MoonFlowerEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("mintyirlplanets:textures/entities/moonflower.png");

	public MoonFlowerRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelMoonFlower(context.bakeLayer(ModelMoonFlower.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(MoonFlowerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}