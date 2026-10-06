package com.talhanation.smallships_viking_addon;

import com.talhanation.smallships_viking_addon.config.AddonConfig;
import com.talhanation.smallships_viking_addon.world.entity.AddonEntityTypes;
import com.talhanation.smallships_viking_addon.world.entity.ship.AddonShipTypes;
import com.talhanation.smallships_viking_addon.world.item.AddonItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Viking addon for SmallShips: Knarr, Longship and Transport Drakkar, three
 * variants of the main mods' Drakkar, added purely through the SmallShips API
 * without a single change inside the main mod.
 */
public class SmallShipsAddonMod {
    public static final String MOD_ID = "smallships_viking_addon";
    public static final Logger LOGGER = LoggerFactory.getLogger(SmallShipsAddonMod.MOD_ID);
    public SmallShipsAddonMod() {
        // the config spec has to exist before anything reads a value from it
        AddonConfig.register();
    }

    /**
     * Shared init, called from both loader entry points once the configs are
     * loaded. Order matters: entity types, then items, then the ship types that
     * reference both.
     */
    public static void init() {
        AddonEntityTypes.init();
        AddonItems.init();
        AddonShipTypes.init();
    }
}
