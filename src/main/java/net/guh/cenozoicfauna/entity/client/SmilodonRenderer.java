package net.guh.cenozoicfauna.entity.client;

import net.guh.cenozoicfauna.CenozoicFauna;
import net.guh.cenozoicfauna.entity.custom.SmilodonEntity;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MobEntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;

public class SmilodonRenderer extends MobEntityRenderer<SmilodonEntity, SmilodonModel<SmilodonEntity>> {
    private static final Identifier TEXTURE = new Identifier(CenozoicFauna.MOD_ID, "textures/entity/smilodon.png");

    public SmilodonRenderer(EntityRendererFactory.Context context) {
        super(context, new SmilodonModel<>(context.getPart(ModModelLayers.SMILODON)), 0.4f);
    }

    @Override
    public Identifier getTexture(SmilodonEntity entity) {
        return TEXTURE;
    }

    @Override
    public void render(SmilodonEntity mobEntity, float f, float g, MatrixStack matrixStack,
                       VertexConsumerProvider vertexConsumerProvider, int i) {
        if(mobEntity.isBaby()) {
            matrixStack.scale(0.5f, 0.5f, 0.5f);
        } else {
            matrixStack.scale(1f,1f,1f);
        }

        super.render(mobEntity, f, g, matrixStack, vertexConsumerProvider, i);
    }
}
