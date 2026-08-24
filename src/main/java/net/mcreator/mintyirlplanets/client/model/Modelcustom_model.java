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

// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class Modelcustom_model extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "modelcustom_model"), "main");
	public final ModelPart bb_main;

	public Modelcustom_model(ModelPart root) {
		super(root);
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition bb_main = partdefinition
				.addOrReplaceChild(
						"bb_main", CubeListBuilder.create().texOffs(0, 186).addBox(-24.0F, -36.0F, -4.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(184, 178).addBox(16.0F, -36.0F, -4.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F))
								.texOffs(0, 0).addBox(-30.0F, -120.0F, -20.0F, 60.0F, 84.0F, 42.0F, new CubeDeformation(0.0F)).texOffs(162, 0).addBox(-6.0F, -132.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
						PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Left_arm2_r1 = bb_main.addOrReplaceChild("Left_arm2_r1", CubeListBuilder.create().texOffs(0, 126).addBox(64.0F, -58.0F, -16.0F, 12.0F, 48.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-132.0F, -42.0F, 0.0F, -0.1745F, 0.0F, 0.3054F));
		PartDefinition Left_Arm_r1 = bb_main.addOrReplaceChild("Left_Arm_r1", CubeListBuilder.create().texOffs(48, 126).addBox(64.0F, -106.0F, -6.0F, 12.0F, 48.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-132.0F, -42.0F, 0.0F, 0.0F, 0.0F, 0.3054F));
		PartDefinition Right_arm2_r1 = bb_main.addOrReplaceChild("Right_arm2_r1", CubeListBuilder.create().texOffs(96, 126).addBox(64.0F, -58.0F, -16.0F, 12.0F, 48.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, -0.3054F));
		PartDefinition Right_arm_r1 = bb_main.addOrReplaceChild("Right_arm_r1", CubeListBuilder.create().texOffs(144, 126).addBox(64.0F, -106.0F, -6.0F, 12.0F, 48.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));
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