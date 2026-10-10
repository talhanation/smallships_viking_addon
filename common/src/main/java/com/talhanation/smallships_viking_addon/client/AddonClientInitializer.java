package com.talhanation.smallships_viking_addon.client;

import com.talhanation.smallships.api.client.ShipRenderRegistry;
import com.talhanation.smallships_viking_addon.client.model.sail.*;
import com.talhanation.smallships_viking_addon.client.model.sail.banner.*;
import com.talhanation.smallships_viking_addon.world.entity.ship.KnarrEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.LongshipEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.TransportDrakkarEntity;

public class AddonClientInitializer {
    public static void init() {
        ShipRenderRegistry.registerSail(KnarrEntity.class, new KnarrSailModel());
        ShipRenderRegistry.registerSail(LongshipEntity.class, new LongshipSailModel());
        ShipRenderRegistry.registerSail(TransportDrakkarEntity.class, new TransportDrakkarSailModel());

        ShipRenderRegistry.registerSailBanner(KnarrEntity.class, new KnarrSailBannerModel());
        ShipRenderRegistry.registerMastBanner(KnarrEntity.class, new KnarrMastBannerModel());

        ShipRenderRegistry.registerSailBanner(LongshipEntity.class, new LongshipSailBannerModel());
        ShipRenderRegistry.registerMastBanner(LongshipEntity.class, new LongshipMastBannerModel());

        ShipRenderRegistry.registerSailBanner(TransportDrakkarEntity.class, new TransportDrakkarSailBannerModel());
        ShipRenderRegistry.registerMastBanner(TransportDrakkarEntity.class, new TransportDrakkarMastBannerModel());
    }
}
