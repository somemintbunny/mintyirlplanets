package net.mcreator.mintyirlplanets.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mintyirlplanets.entity.WormEntity;
import net.mcreator.mintyirlplanets.client.model.ModelWorm;

public class WormRenderer extends MobRenderer<WormEntity, LivingEntityRenderState, ModelWorm> {
	private final Identifier entityTexture = Identifier.parse("mintyirlplanets:textures/entities/doesit.png");

	public WormRenderer(EntityRendererProvider.Context context) {
		super(context, new ModelWorm(context.bakeLayer(ModelWorm.LAYER_LOCATION)), 0.4f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(WormEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}