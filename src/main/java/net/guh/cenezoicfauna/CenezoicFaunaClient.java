package net.guh.cenezoicfauna;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.guh.cenezoicfauna.entity.ModEntities;
import net.guh.cenezoicfauna.entity.client.MegalonyxModel;
import net.guh.cenezoicfauna.entity.client.MegalonyxRenderer;
import net.guh.cenezoicfauna.entity.client.ModModelLayers;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;

public class CenezoicFaunaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MEGALONYX, MegalonyxRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MEGALONYX, MegalonyxModel::getTexturedModelData);

    }
}