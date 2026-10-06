package com.talhanation.smallships_viking_addon.forge.client;

import com.talhanation.smallships_viking_addon.client.AddonClientInitializer;
import com.talhanation.smallships_viking_addon.client.model.KnarrModel;
import com.talhanation.smallships_viking_addon.client.model.LongshipModel;
import com.talhanation.smallships_viking_addon.client.model.TransportDrakkarModel;
import com.talhanation.smallships_viking_addon.client.renderer.entity.KnarrRenderer;
import com.talhanation.smallships_viking_addon.client.renderer.entity.LongshipRenderer;
import com.talhanation.smallships_viking_addon.client.renderer.entity.TransportDrakkarRenderer;
import com.talhanation.smallships_viking_addon.world.entity.AddonEntityTypes;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;

public class ClientModBus {

    @SubscribeEvent
    public void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(KnarrModel.LAYER_LOCATION, KnarrModel::createBodyLayer);
        event.registerLayerDefinition(LongshipModel.LAYER_LOCATION, LongshipModel::createBodyLayer);
        event.registerLayerDefinition(TransportDrakkarModel.LAYER_LOCATION, TransportDrakkarModel::createBodyLayer);
    }

    @SubscribeEvent
    public void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(AddonEntityTypes.KNARR, KnarrRenderer::new);
        event.registerEntityRenderer(AddonEntityTypes.LONGSHIP, LongshipRenderer::new);
        event.registerEntityRenderer(AddonEntityTypes.TRANSPORT_DRAKKAR, TransportDrakkarRenderer::new);
    }

    @SubscribeEvent
    public void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(AddonClientInitializer::init);
    }
}
