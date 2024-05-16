package net.guh.cenezoicfauna;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.guh.cenezoicfauna.entity.ModEntities;
import net.guh.cenezoicfauna.entity.client.*;


public class CenezoicFaunaClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MEGALONYX, MegalonyxRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.MEGALONYX, MegalonyxModel::getTexturedModelData);



        EntityRendererRegistry.register(ModEntities.THYLACINE, ThylacineRenderer::new);
        EntityModelLayerRegistry.registerModelLayer(ModModelLayers.THYLACINE, ThylacineModel::getTexturedModelData);

    }
}