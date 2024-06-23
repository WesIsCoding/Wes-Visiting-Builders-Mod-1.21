// Made with Blockbench 4.10.3
// Exported for Minecraft version 1.17+ for Yarn
// Paste this class into your mod and generate all required imports

package wesley.visitingbuildersmod.client.model;

import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import wesley.visitingbuildersmod.entity.BuilderEntity;

public class BuilderModel extends BipedEntityModel<BuilderEntity> {

	private final ModelPart builder;
	private final ModelPart head;

	public BuilderModel(ModelPart part) {
        super(part);
        this.builder = root.getChild("Builder");
		this.head = builder.getChild("head");
	}
	public static TexturedModelData getTexturedModelData() {
		ModelData modelData = new ModelData();
		ModelPartData modelPartData = modelData.getRoot();
		ModelPartData Builder = modelPartData.addChild("Builder", ModelPartBuilder.create(), ModelTransform.pivot(0.0F, 24.0F, 0.0F));

		ModelPartData Head = Builder.addChild("Head", ModelPartBuilder.create().uv(0, 0)
				.cuboid(-4.0F, -5.0F, -4.0F, 8.0F, 8.0F, 8.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -27.0F, 0.0F));

		ModelPartData Body = Builder.addChild("Body", ModelPartBuilder.create().uv(16, 16)
				.cuboid(-4.0F, -9.0F, -4.0F, 8.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, -15.0F, 2.0F));

		ModelPartData LeftArm = Builder.addChild("LeftArm", ModelPartBuilder.create().uv(32, 48)
				.cuboid(0.0F, -9.0F, -4.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(4.0F, -15.0F, 2.0F));

		ModelPartData RightArm = Builder.addChild("RightArm", ModelPartBuilder.create().uv(40, 16)
				.cuboid(0.0F, -9.0F, -4.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-8.0F, -15.0F, 2.0F));

		ModelPartData LeftLeg = RightArm.addChild("LeftLeg", ModelPartBuilder.create().uv(0, 16)
				.cuboid(8.0F, 3.0F, -4.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(0.0F, 0.0F, 0.0F));

		ModelPartData RightLeg = Builder.addChild("RightLeg", ModelPartBuilder.create().uv(16, 48)
				.cuboid(0.0F, -9.0F, -4.0F, 4.0F, 12.0F, 4.0F, new Dilation(0.0F)), ModelTransform.pivot(-4.0F, -3.0F, 2.0F));
		return TexturedModelData.of(modelData, 64, 64);
	}
	@Override
	public void setAngles(BuilderEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}
	@Override
	public void render(MatrixStack matrices, VertexConsumer vertexConsumer, int light, int overlay, float red, float green, float blue, float alpha) {
		builder.render(matrices, vertexConsumer, light, overlay);
	}
}