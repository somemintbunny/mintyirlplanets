// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelHopperNymph<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "hoppernymph"), "main");
	private final ModelPart Body;
	private final ModelPart RightLeg;
	private final ModelPart LeftLeg;
	private final ModelPart RightArm;
	private final ModelPart LeftArm;

	public ModelHopperNymph(ModelPart root) {
		this.Body = root.getChild("Body");
		this.RightLeg = root.getChild("RightLeg");
		this.LeftLeg = root.getChild("LeftLeg");
		this.RightArm = root.getChild("RightArm");
		this.LeftArm = root.getChild("LeftArm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.0F, -5.0F, -3.0F, 6.0F, 4.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition RightLeg = partdefinition.addOrReplaceChild("RightLeg", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 21.0F, 3.0F));

		PartDefinition cube_r1 = RightLeg.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(4, 15).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 2.7F, -3.0F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r2 = RightLeg.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(0, 15).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-1.0F, 0.0F, 0.0F, -1.2654F, 0.0F, 0.0F));

		PartDefinition LeftLeg = partdefinition.addOrReplaceChild("LeftLeg", CubeListBuilder.create(),
				PartPose.offset(3.0F, 21.0F, 3.0F));

		PartDefinition cube_r3 = LeftLeg
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(12, 11).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 2.7F, -3.0F, 1.4399F, 0.0F, 0.0F));

		PartDefinition cube_r4 = LeftLeg
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(8, 11).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(1.0F, 0.0F, 0.0F, -1.2654F, 0.0F, 0.0F));

		PartDefinition RightArm = partdefinition.addOrReplaceChild("RightArm", CubeListBuilder.create(),
				PartPose.offset(-3.0F, 21.7F, -2.0F));

		PartDefinition cube_r5 = RightArm.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(0, 11).addBox(0.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-0.6F, -0.6F, 0.0F, -0.7256F, 0.3326F, 0.3527F));

		PartDefinition LeftArm = partdefinition.addOrReplaceChild("LeftArm", CubeListBuilder.create(),
				PartPose.offset(3.0F, 21.7F, -2.0F));

		PartDefinition cube_r6 = LeftArm.addOrReplaceChild("cube_r6",
				CubeListBuilder.create().texOffs(4, 11).addBox(-1.0F, 0.0F, 0.0F, 1.0F, 3.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.6F, -0.6F, 0.0F, -0.7256F, -0.3326F, -0.3527F));

		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftArm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RightArm.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.RightLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftArm.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}