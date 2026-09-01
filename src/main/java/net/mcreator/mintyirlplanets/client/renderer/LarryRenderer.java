package net.mcreator.mintyirlplanets.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mintyirlplanets.entity.LarryEntity;
import net.mcreator.mintyirlplanets.client.model.ModelLarry;

public class LarryRenderer extends MobRenderer<LarryEntity, LivingEntityRenderState, ModelLarry> {
	private final Identifier entityTexture = Identifier.parse("mintyirlplanets:textures/entities/larry.png");

	public LarryRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelLarry(context.bakeLayer(ModelLarry.LAYER_LOCATION)), 1f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(LarryEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}