package com.talhanation.smallships_viking_addon.neoforge.client;

import com.talhanation.smallships_viking_addon.SmallShipsVikingAddonMod;
import com.talhanation.smallships_viking_addon.client.AddonClientInitializer;
import com.talhanation.smallships_viking_addon.client.model.KnarrModel;
import com.talhanation.smallships_viking_addon.client.model.LongshipModel;
import com.talhanation.smallships_viking_addon.client.model.TransportDrakkarModel;
import com.talhanation.smallships_viking_addon.client.renderer.entity.KnarrRenderer;
import com.talhanation.smallships_viking_addon.client.renderer.entity.LongshipRenderer;
import com.talhanation.smallships_viking_addon.client.renderer.entity.TransportDrakkarRenderer;
import com.talhanation.smallships_viking_addon.world.entity.AddonEntityTypes;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.event.lifecycle.FMLClientSetupEvent;
import net.neoforged.neoforge.client.event.EntityRenderersEvent;

@SuppressWarnings("unused")
@EventBusSubscriber(modid = SmallShipsVikingAddonMod.MOD_ID, bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ClientModBus {

    @SubscribeEvent
    static void onRegisterLayers(EntityRenderersEvent.RegisterLayerDefinitions event) {
        event.registerLayerDefinition(KnarrModel.LAYER_LOCATION, KnarrModel::createBodyLayer);
        event.registerLayerDefinition(LongshipModel.LAYER_LOCATION, LongshipModel::createBodyLayer);
        event.registerLayerDefinition(TransportDrakkarModel.LAYER_LOCATION, TransportDrakkarModel::createBodyLayer);
    }

    @SubscribeEvent
    static void onRegisterRenderers(EntityRenderersEvent.RegisterRenderers event) {
        event.registerEntityRenderer(AddonEntityTypes.KNARR, KnarrRenderer::new);
        event.registerEntityRenderer(AddonEntityTypes.LONGSHIP, LongshipRenderer::new);
        event.registerEntityRenderer(AddonEntityTypes.TRANSPORT_DRAKKAR, TransportDrakkarRenderer::new);
    }

    @SubscribeEvent
    static void onClientSetup(FMLClientSetupEvent event) {
        event.enqueueWork(AddonClientInitializer::init);
    }
}
