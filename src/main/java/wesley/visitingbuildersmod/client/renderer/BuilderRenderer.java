package wesley.visitingbuildersmod.client.renderer;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.BipedEntityRenderer;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.network.packet.CustomPayload;
import net.minecraft.util.Identifier;
import wesley.visitingbuildersmod.VisitingBuilders;
import wesley.visitingbuildersmod.entity.BuilderEntity;

public class BuilderRenderer extends BipedEntityRenderer<BuilderEntity, BipedEntityModel<BuilderEntity>> {
    public BuilderRenderer(EntityRendererFactory.Context ctx, BipedEntityModel<BuilderEntity> model, float shadowRadius) {
        super(ctx, model, shadowRadius);
    }

    private static final Identifier TEXTURE = VisitingBuilders.id("textures/entity/steve.png");

    @Override
    public Identifier getTexture(BuilderEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(BuilderEntity livingEntity, float f, float g, MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider, int i) {
        super.render(livingEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
