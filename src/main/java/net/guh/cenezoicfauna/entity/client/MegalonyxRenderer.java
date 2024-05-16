package net.guh.cenezoicfauna.entity.client;

import net.guh.cenezoicfauna.CenezoicFauna;
import net.guh.cenezoicfauna.entity.custom.MegalonyxEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class MegalonyxRenderer extends MobEntityRenderer<MegalonyxEntity, MegalonyxModel<MegalonyxEntity>> {
    private static final Identifier TEXTURE = new Identifier(CenezoicFauna.MOD_ID, "textures/entity/megalonyx.png");

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
            matrixStack.scale(10f,1f,10f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
