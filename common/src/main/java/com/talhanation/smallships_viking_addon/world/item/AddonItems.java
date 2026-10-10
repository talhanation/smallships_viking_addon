package com.talhanation.smallships_viking_addon.world.item;

import com.talhanation.smallships.api.ShipItems;
import com.talhanation.smallships_viking_addon.SmallShipsVikingAddonMod;
import com.talhanation.smallships_viking_addon.world.entity.ship.KnarrEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.LongshipEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.TransportDrakkarEntity;

/**
 * The ship items of this addon - one line per ship. SmallShips registers one
 * item per wood type under this addons' mod id ({@code smallships_viking_addon:oak_knarr}
 * and so on), finds them again in Ship#getDropItem and puts them into its
 * creative tab. No item classes, no item register per loader.
 *
 * Has to be called EARLY: from the mod constructor on Forge, in onInitialize on
 * Fabric - see ShipItems. Not from SmallShipsVikingAddonMod#init, which runs on
 * Forge in FMLCommonSetupEvent, when Forge takes no more items.
 *
 * What stays with the addon are the resources: the item models in
 * assets/smallships_viking_addon/models/item and the item names in the lang files.
 */
public class AddonItems {

    public static void register() {
        ShipItems.register(SmallShipsVikingAddonMod.MOD_ID, KnarrEntity.ID, KnarrEntity::summon);
        ShipItems.register(SmallShipsVikingAddonMod.MOD_ID, LongshipEntity.ID, LongshipEntity::summon);
        ShipItems.register(SmallShipsVikingAddonMod.MOD_ID, TransportDrakkarEntity.ID, TransportDrakkarEntity::summon);
    }
}
