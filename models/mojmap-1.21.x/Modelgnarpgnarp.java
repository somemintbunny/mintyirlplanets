// Made with Blockbench 4.12.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelgnarpgnarp<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "gnarpgnarp"), "main");
	private final ModelPart Body;
	private final ModelPart LeftFrontLeg;
	private final ModelPart RightFrontLeg;
	private final ModelPart LeftBackLeg;
	private final ModelPart RightBackLeg;
	private final ModelPart Head;

	public Modelgnarpgnarp(ModelPart root) {
		this.Body = root.getChild("Body");
		this.LeftFrontLeg = root.getChild("LeftFrontLeg");
		this.RightFrontLeg = root.getChild("RightFrontLeg");
		this.LeftBackLeg = root.getChild("LeftBackLeg");
		this.RightBackLeg = root.getChild("RightBackLeg");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body", CubeListBuilder.create().texOffs(0, 0).addBox(
				-3.0F, -2.0F, -5.0F, 6.0F, 4.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 19.0F, 0.0F));

		PartDefinition Tail_r1 = Body
				.addOrReplaceChild("Tail_r1",
						CubeListBuilder.create().texOffs(24, 14).addBox(-1.0F, -2.0F, -1.0F, 1.0F, 1.0F, 7.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.5F, 0.0F, 6.0F, 0.4363F, 0.0F, 0.0F));

		PartDefinition LeftFrontLeg = partdefinition.addOrReplaceChild("LeftFrontLeg", CubeListBuilder.create()
				.texOffs(0, 27).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 21.0F, -4.0F));

		PartDefinition RightFrontLeg = partdefinition.addOrReplaceChild("RightFrontLeg", CubeListBuilder.create()
				.texOffs(8, 27).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 21.0F, -4.0F));

		PartDefinition LeftBackLeg = partdefinition.addOrReplaceChild("LeftBackLeg", CubeListBuilder.create()
				.texOffs(24, 22).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(2.0F, 21.0F, 5.0F));

		PartDefinition RightBackLeg = partdefinition.addOrReplaceChild("RightBackLeg", CubeListBuilder.create()
				.texOffs(16, 27).addBox(-1.0F, 0.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-2.0F, 21.0F, 5.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 14)
						.addBox(-3.0F, -6.0F, -6.0F, 6.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 6)
						.addBox(-1.0F, -2.0F, -7.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 3)
						.addBox(3.0F, -2.0F, -5.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-6.0F, -2.0F, -5.0F, 3.0F, 3.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 17.0F, -5.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftFrontLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightFrontLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		LeftBackLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		RightBackLeg.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LeftBackLeg.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
		this.RightFrontLeg.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.RightBackLeg.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LeftFrontLeg.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
	}
}