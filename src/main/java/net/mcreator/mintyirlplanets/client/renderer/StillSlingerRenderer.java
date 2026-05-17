package net.mcreator.mintyirlplanets.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;

import net.mcreator.mintyirlplanets.entity.StillSlingerEntity;
import net.mcreator.mintyirlplanets.client.model.Modelstillslinger;

public class StillSlingerRenderer extends MobRenderer<StillSlingerEntity, LivingEntityRenderState, Modelstillslinger> {
	private StillSlingerEntity entity = null;
	private final ResourceLocation entityTexture = ResourceLocation.parse("mintyirlplanets:textures/entities/gretw.png");

	public StillSlingerRenderer(EntityRendererProvider.Context context) {
		super(context, new Modelstillslinger(context.bakeLayer(Modelstillslinger.LAYER_LOCATION)), 0.5f);
	}

	@Override
	public LivingEntityRenderState createRenderState() {
		return new LivingEntityRenderState();
	}

	@Override
	public void extractRenderState(StillSlingerEntity entity, LivingEntityRenderState state, float partialTicks) {
		super.extractRenderState(entity, state, partialTicks);
		this.entity = entity;
	}

	@Override
	public ResourceLocation getTextureLocation(LivingEntityRenderState state) {
		return entityTexture;
	}
}