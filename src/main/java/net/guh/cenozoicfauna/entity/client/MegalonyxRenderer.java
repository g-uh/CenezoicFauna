package net.guh.cenozoicfauna.entity.client;

import net.guh.cenozoicfauna.CenozoicFauna;
import net.guh.cenozoicfauna.entity.custom.MegalonyxEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MegalonyxRenderer extends MobEntityRenderer<MegalonyxEntity, MegalonyxModel<MegalonyxEntity>> {
    private static final Identifier TEXTURE = new Identifier(CenozoicFauna.MOD_ID, "textures/entity/megalonyx.png");

    public MegalonyxRenderer(EntityRendererFactory.Context context) {
        super(context, new MegalonyxModel<>(context.getPart(ModModelLayers.MEGALONYX))  , 1.2f);
    }

    @Override
    public Identifier getTexture(MegalonyxEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(MegalonyxEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f,1f,1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
