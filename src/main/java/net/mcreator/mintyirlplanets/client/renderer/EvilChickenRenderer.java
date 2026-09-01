package net.mcreator.mintyirlplanets.client.renderer;

import net.minecraft.resources.Identifier;
import net.minecraft.client.renderer.entity.state.ChickenRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.animal.chicken.AdultChickenModel;

import net.mcreator.mintyirlplanets.entity.EvilChickenEntity;

public class EvilChickenRenderer extends MobRenderer<EvilChickenEntity, ChickenRenderState, AdultChickenModel> {
	private final Identifier entityTexture = Identifier.parse("mintyirlplanets:textures/entities/chicken_texture.png");

	public EvilChickenRenderer(EntityRendererProvider.Context context) {
		super(context, new AdultChickenModel(context.bakeLayer(ModelLayers.CHICKEN)), 0.5f);
	}

	@Override
	public ChickenRenderState createRenderState() {
		return new ChickenRenderState();
	}

	@Override
	public void extractRenderState(EvilChickenEntity entity, ChickenRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
	}

	@Override
	public Identifier getTextureLocation(ChickenRenderState state) {
		return entityTexture;
	}
}