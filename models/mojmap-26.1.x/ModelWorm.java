// Made with Blockbench 5.0.5
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelWorm<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "worm"), "main");
	private final ModelPart FrontWorm;
	private final ModelPart MiddleWorm;
	private final ModelPart BackWorm;

	public ModelWorm(ModelPart root) {
		this.FrontWorm = root.getChild("FrontWorm");
		this.MiddleWorm = root.getChild("MiddleWorm");
		this.BackWorm = root.getChild("BackWorm");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition FrontWorm = partdefinition.addOrReplaceChild("FrontWorm", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-1.0F, -2.0F, -4.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition MiddleWorm = partdefinition.addOrReplaceChild("MiddleWorm", CubeListBuilder.create()
				.texOffs(0, 10).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition BackWorm = partdefinition.addOrReplaceChild("BackWorm", CubeListBuilder.create().texOffs(0, 5)
				.addBox(-1.0F, -2.0F, 1.0F, 2.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		FrontWorm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		MiddleWorm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		BackWorm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.FrontWorm.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.FrontWorm.xRot = headPitch / (180F / (float) Math.PI);
	}
}