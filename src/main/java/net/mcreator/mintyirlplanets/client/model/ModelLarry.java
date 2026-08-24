package net.mcreator.mintyirlplanets.client.model;

import net.minecraft.util.Mth;
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

// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelLarry extends EntityModel<LivingEntityRenderState> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("mintyirlplanets", "model_larry"), "main");
	public final ModelPart LeftArm;
	public final ModelPart RightArm;
	public final ModelPart Head;
	public final ModelPart Body;
	public final ModelPart LeftLeg;
	public final ModelPart RightLeg;

	public ModelLarry(ModelPart root) {
		super(root);
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.Head = root.getChild("Head");
		this.Body = root.getChild("Body");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightLeg = root.getChild("RightLeg");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create().texOffs(0, 90).addBox(0.0F, 0.0F, -3.0F, 6.0F, 65.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(11.0F, -78.0F, 0.0F));
		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create().texOffs(24, 90).addBox(-6.0F, 0.0F, -3.0F, 6.0F, 65.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.0F, -78.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 50).addBox(-8.0F, -22.0F, -9.0F, 16.0F, 22.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(92, 0).addBox(-4.0F, -9.0F, -14.0F, 8.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -81.0F, 0.0F));
		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(-2.0F, -105.0F, -3.0F, 22.0F, 40.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, 24.0F, -2.0F));
		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create().texOffs(68, 71).addBox(-2.0F, 0.0F, -1.0F, 6.0F, 65.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -41.0F, -2.0F));
		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create().texOffs(68, 0).addBox(0.0F, 0.0F, -1.0F, 6.0F, 65.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-9.0F, -41.0F, -2.0F));
		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	public void setupAnim(LivingEntityRenderState state) {
		float limbSwing = state.walkAnimationPos;
		float limbSwingAmount = state.walkAnimationSpeed;
		float ageInTicks = state.ageInTicks;
		float netHeadYaw = state.yRot;
		float headPitch = state.xRot;

		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}