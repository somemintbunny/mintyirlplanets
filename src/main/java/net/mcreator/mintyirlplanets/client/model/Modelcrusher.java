package net.mcreator.mintyirlplanets.client.model;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.state.LivingEntityRenderState;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

// Made with Blockbench 4.6.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcrusher extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "modelcrusher"), "main");
	public final ModelPart bb_main;

	public Modelcrusher(ModelPart root) {
		super(root);
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(46, 70).addBox(16.0F, -12.0F, -28.0F, 4.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 56).addBox(-20.0F, -12.0F, -28.0F, 4.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(92, 46)
						.addBox(-16.0F, -8.0F, -24.0F, 32.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 70).addBox(-14.0F, -8.0F, -20.0F, 4.0F, 4.0F, 38.0F, new CubeDeformation(0.0F)).texOffs(0, 56)
						.addBox(10.0F, -8.0F, -20.0F, 4.0F, 4.0F, 38.0F, new CubeDeformation(0.0F)).texOffs(46, 0).addBox(-16.0F, -8.0F, 18.0F, 32.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(46, 8)
						.addBox(-20.0F, -12.0F, 14.0F, 4.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(16.0F, -12.0F, 14.0F, 4.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)).texOffs(130, 0)
						.addBox(-14.0F, -20.0F, 20.0F, 28.0F, 12.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(46, 14).addBox(-14.0F, -22.0F, -22.0F, 2.0F, 14.0F, 42.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(12.0F, -22.0F, -22.0F, 2.0F, 14.0F, 42.0F, new CubeDeformation(0.0F)).texOffs(130, 14).addBox(-10.0F, -8.0F, -2.0F, 20.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(92, 38)
						.addBox(-22.0F, -24.0F, -2.0F, 44.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 98).addBox(-12.0F, -20.0F, -22.0F, 24.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(92, 70)
						.addBox(20.0F, -20.0F, -32.0F, 2.0F, 4.0F, 34.0F, new CubeDeformation(0.0F)).texOffs(92, 0).addBox(-22.0F, -20.0F, -32.0F, 2.0F, 4.0F, 34.0F, new CubeDeformation(0.0F)).texOffs(0, 24)
						.addBox(-2.0F, -20.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(84, 112).addBox(-8.0F, -40.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition cube_r1 = bb_main.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 112).addBox(-20.0F, -10.0F, -34.0F, 40.0F, 20.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.384F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

	}

}