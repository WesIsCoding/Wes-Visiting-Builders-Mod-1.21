package wesley.visitingbuildersmod.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayers;
import net.minecraft.util.Identifier;
import wesley.visitingbuildersmod.VisitingBuilders;
import wesley.visitingbuildersmod.entity.ModEntities;
import wesley.visitingbuildersmod.entity.custom.BuilderEntity;

public class ModEntityRenderers implements ClientModInitializer {
    private static final Identifier BUILDER_TEXTURE = VisitingBuilders.id("textures/entity/steve.png");

    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.BUILDER, (EntityRendererFactory.Context context) ->
                new BuilderEntityRenderer<>(context, new BuilderEntityModel<>(context.getPart(EntityModelLayers.TODO)), 1f) {

                    @Override
                    public Identifier getTexture(BuilderEntity entity) {
                        return BUILDER_TEXTURE;
                    }
                });
    }
}
