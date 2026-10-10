package com.talhanation.smallships_viking_addon.world.item;

import com.talhanation.smallships.world.item.ShipItem;
import com.talhanation.smallships_viking_addon.world.entity.ship.LongshipEntity;
import net.minecraft.world.entity.vehicle.Boat;

/** The placeable item. ShipItem handles placing; only the ship factory is needed. */
public class LongshipItem extends ShipItem {
    public LongshipItem(Boat.Type type, Properties properties) {
        super(type, LongshipEntity::summon, properties);
    }
}
