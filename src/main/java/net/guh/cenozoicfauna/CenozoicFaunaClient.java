package net.guh.cenozoicfauna;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.guh.cenozoicfauna.entity.ModEntities;
import net.guh.cenozoicfauna.entity.client.*;


public class CenozoicFaunaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MEGALONYX, MegalonyxRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MEGALONYX, MegalonyxModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.THYLACINE, ThylacineRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.THYLACINE, ThylacineModel::getTexturedModelData);
        EntityRendererRegistry.register(ModEntities.SMILODON, SmilodonRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.SMILODON, SmilodonModel::getTexturedModelData);

    }
}