package com.talhanation.smallships_viking_addon.client;

import com.talhanation.smallships.api.client.ShipRenderRegistry;
import com.talhanation.smallships.client.model.sail.DrakkarSailModel;
import com.talhanation.smallships.client.model.sail.banner.DrakkarMastBannerModel;
import com.talhanation.smallships.client.model.sail.banner.DrakkarSailBannerModel;
import com.talhanation.smallships_viking_addon.world.entity.ship.KnarrEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.LongshipEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.TransportDrakkarEntity;

/**
 * Client side hooks into the main mod. The shared ShipRenderer looks these up by
 * ship class; every layer is optional, a ship without one simply renders
 * without it.
 *
 * Entity renderers and model layers are registered in the loader modules
 * (forge ClientModBus / fabric client entry point), not here.
 */
public class AddonClientInitializer {
    public static void init() {
        // the sail, sail banner and mast banner of the main mods' Drakkar, until the ships get their own
        ShipRenderRegistry.registerSail(KnarrEntity.class, new DrakkarSailModel());
        ShipRenderRegistry.registerSail(LongshipEntity.class, new DrakkarSailModel());
        ShipRenderRegistry.registerSail(TransportDrakkarEntity.class, new DrakkarSailModel());

        ShipRenderRegistry.registerSailBanner(KnarrEntity.class, new DrakkarSailBannerModel());
        ShipRenderRegistry.registerMastBanner(KnarrEntity.class, new DrakkarMastBannerModel());

        ShipRenderRegistry.registerSailBanner(LongshipEntity.class, new DrakkarSailBannerModel());
        ShipRenderRegistry.registerMastBanner(LongshipEntity.class, new DrakkarMastBannerModel());

        ShipRenderRegistry.registerSailBanner(TransportDrakkarEntity.class, new DrakkarSailBannerModel());
        ShipRenderRegistry.registerMastBanner(TransportDrakkarEntity.class, new DrakkarMastBannerModel());
    }
}
