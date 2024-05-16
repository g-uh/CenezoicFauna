package net.guh.cenezoicfauna.entity.client;

import net.guh.cenezoicfauna.CenezoicFauna;
import net.guh.cenezoicfauna.entity.custom.ThylacineEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class ThylacineRenderer extends MobEntityRenderer<ThylacineEntity, ThylacineModel<ThylacineEntity>> {
    private static final Identifier TEXTURE = new Identifier(CenezoicFauna.MOD_ID, "textures/entity/thylacine.png");

    public ThylacineRenderer(EntityRendererFactory.Context context) {
        super(context, new ThylacineModel(context.getPart(ModModelLayers.THYLACINE))  , 0.4f);
    }

    @Override
    public Identifier getTexture(ThylacineEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(ThylacineEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f,1f,1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
