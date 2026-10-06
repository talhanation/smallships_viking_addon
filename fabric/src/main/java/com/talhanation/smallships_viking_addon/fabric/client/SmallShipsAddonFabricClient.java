package com.talhanation.smallships_viking_addon.fabric.client;

import com.talhanation.smallships_viking_addon.client.AddonClientInitializer;
import com.talhanation.smallships_viking_addon.client.UpdateNotifier;
import com.talhanation.smallships_viking_addon.client.model.KnarrModel;
import com.talhanation.smallships_viking_addon.client.model.LongshipModel;
import com.talhanation.smallships_viking_addon.client.model.TransportDrakkarModel;
import com.talhanation.smallships_viking_addon.client.renderer.entity.KnarrRenderer;
import com.talhanation.smallships_viking_addon.client.renderer.entity.LongshipRenderer;
import com.talhanation.smallships_viking_addon.client.renderer.entity.TransportDrakkarRenderer;
import com.talhanation.smallships_viking_addon.world.entity.AddonEntityTypes;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;

public class SmallShipsAddonFabricClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        EntityModelLayerRegistry.registerModelLayer(KnarrModel.LAYER_LOCATION, KnarrModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(LongshipModel.LAYER_LOCATION, LongshipModel::createBodyLayer);
        EntityModelLayerRegistry.registerModelLayer(TransportDrakkarModel.LAYER_LOCATION, TransportDrakkarModel::createBodyLayer);


        EntityRendererRegistry.register(AddonEntityTypes.KNARR, KnarrRenderer::new);
        EntityRendererRegistry.register(AddonEntityTypes.LONGSHIP, LongshipRenderer::new);
        EntityRendererRegistry.register(AddonEntityTypes.TRANSPORT_DRAKKAR, TransportDrakkarRenderer::new);

        AddonClientInitializer.init();

        ClientTickEvents.END_CLIENT_TICK.register(UpdateNotifier::tick);
    }
}
