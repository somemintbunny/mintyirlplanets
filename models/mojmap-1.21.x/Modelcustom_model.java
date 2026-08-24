// Made with Blockbench 4.6.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelcustom_model<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "custom_model"), "main");
	private final ModelPart bb_main;

	public Modelcustom_model(ModelPart root) {
		this.bb_main = root.getChild("bb_main");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bb_main = partdefinition.addOrReplaceChild("bb_main",
				CubeListBuilder.create().texOffs(0, 186)
						.addBox(-24.0F, -36.0F, -4.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(184, 178)
						.addBox(16.0F, -36.0F, -4.0F, 8.0F, 36.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-30.0F, -120.0F, -20.0F, 60.0F, 84.0F, 42.0F, new CubeDeformation(0.0F)).texOffs(162, 0)
						.addBox(-6.0F, -132.0F, -6.0F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Left_arm2_r1 = bb_main.addOrReplaceChild("Left_arm2_r1",
				CubeListBuilder.create().texOffs(0, 126).addBox(64.0F, -58.0F, -16.0F, 12.0F, 48.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-132.0F, -42.0F, 0.0F, -0.1745F, 0.0F, 0.3054F));

		PartDefinition Left_Arm_r1 = bb_main.addOrReplaceChild("Left_Arm_r1",
				CubeListBuilder.create().texOffs(48, 126).addBox(64.0F, -106.0F, -6.0F, 12.0F, 48.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-132.0F, -42.0F, 0.0F, 0.0F, 0.0F, 0.3054F));

		PartDefinition Right_arm2_r1 = bb_main.addOrReplaceChild("Right_arm2_r1",
				CubeListBuilder.create().texOffs(96, 126).addBox(64.0F, -58.0F, -16.0F, 12.0F, 48.0F, 12.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.1745F, 0.0F, -0.3054F));

		PartDefinition Right_arm_r1 = bb_main.addOrReplaceChild(
				"Right_arm_r1", CubeListBuilder.create().texOffs(144, 126).addBox(64.0F, -106.0F, -6.0F, 12.0F, 48.0F,
						12.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3054F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		bb_main.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}