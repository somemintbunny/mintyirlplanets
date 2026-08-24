// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelStagBeetle<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "stagbeetle"), "main");
	private final ModelPart Head;
	private final ModelPart LeftArm;
	private final ModelPart RightArm;
	private final ModelPart RightLeg;
	private final ModelPart Leftleg;
	private final ModelPart Body;

	public ModelStagBeetle(ModelPart root) {
		this.Head = root.getChild("Head");
		this.LeftArm = root.getChild("LeftArm");
		this.RightArm = root.getChild("RightArm");
		this.RightLeg = root.getChild("RightLeg");
		this.Leftleg = root.getChild("Leftleg");
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 13)
						.addBox(-3.0F, -3.0F, -13.0F, 6.0F, 0.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-2.0F, -5.0F, -7.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 2.0F));

		PartDefinition cube_r1 = LeftArm.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(28, 19).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -1.0F, 0.0F, 0.0786F, -0.3556F, 0.309F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 2.0F));

		PartDefinition cube_r2 = RightArm.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(17, 26).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -1.0F, 0.0F, 0.0786F, 0.3556F, -0.309F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 2.0F));

		PartDefinition cube_r3 = RightLeg.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(25, 13).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, -1.0F, -4.0F, 0.081F, -0.4275F, -0.37F));

		PartDefinition cube_r4 = RightLeg.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(25, 16).addBox(-3.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-3.0F, -1.0F, 4.0F, 0.1294F, 0.9636F, -0.2299F));

		PartDefinition Leftleg = partdefinition.addOrReplaceChild("Leftleg", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 2.0F));

		PartDefinition cube_r5 = Leftleg.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(17, 23).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, -1.0F, 4.0F, 0.1294F, -0.9636F, 0.2299F));

		PartDefinition cube_r6 = Leftleg.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(17, 20).addBox(-1.0F, -1.0F, -1.0F, 4.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, -1.0F, -4.0F, 0.081F, 0.4275F, 0.37F));

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.0F, -4.0F, -5.0F, 6.0F, 3.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 2.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Leftleg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.RightArm.yRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.Leftleg.yRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.LeftArm.yRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RightLeg.yRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}