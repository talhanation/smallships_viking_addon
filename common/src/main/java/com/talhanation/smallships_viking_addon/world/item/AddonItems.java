package com.talhanation.smallships_viking_addon.world.item;

import com.talhanation.smallships_viking_addon.world.entity.ship.KnarrEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.LongshipEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.TransportDrakkarEntity;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;

import java.util.HashMap;
import java.util.Map;

/**
 * One ship item per wood type and ship, like the main mods' ModItems.
 * The maps are what the ships hand back in getDropItem.
 */
public class AddonItems {

    public static final Map<Boat.Type, Item> KNARR_ITEMS = new HashMap<>(Boat.Type.values().length);
    public static final Map<Boat.Type, Item> LONGSHIP_ITEMS = new HashMap<>(Boat.Type.values().length);
    public static final Map<Boat.Type, Item> TRANSPORT_DRAKKAR_ITEMS = new HashMap<>(Boat.Type.values().length);

    // filled here and not in a static block: the items do not exist yet when this class loads
    public static void init() {
        for (Boat.Type type : Boat.Type.values()) {
            KNARR_ITEMS.put(type, getItem(itemId(type, KnarrEntity.ID)));
            LONGSHIP_ITEMS.put(type, getItem(itemId(type, LongshipEntity.ID)));
            TRANSPORT_DRAKKAR_ITEMS.put(type, getItem(itemId(type, TransportDrakkarEntity.ID)));
        }
    }

    /** Registry name of a ship item, e.g. {@code dark_oak_knarr}. */
    public static String itemId(Boat.Type type, String shipId) {
        return type.getName().replaceAll("[^a-z0-9_.-]", "_") + "_" + shipId;
    }

    // implemented per loader in world/item/forge and world/item/fabric
    @ExpectPlatform
    public static Item getItem(String id) {
        throw new AssertionError();
    }
}
