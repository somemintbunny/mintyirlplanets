package net.mcreator.mintyirlplanets.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mintyirlplanets.entity.TheCrusherEntity;
import net.mcreator.mintyirlplanets.client.model.Modelcrusher;

public class TheCrusherRenderer extends MobRenderer<TheCrusherEntity, LivingEntityRenderState, Modelcrusher> {
	private final Identifier entityTexture = Identifier.parse("mintyirlplanets:textures/entities/texture.png");

	public TheCrusherRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelcrusher(context.bakeLayer(Modelcrusher.LAYER_LOCATION)), 2f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(TheCrusherEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}