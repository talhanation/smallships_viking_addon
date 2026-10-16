package com.talhanation.smallships_viking_addon.world.entity.ship;

import com.talhanation.smallships.api.ShipRegistry;
import com.talhanation.smallships.api.ShipType;
import com.talhanation.smallships_viking_addon.SmallShipsVikingAddonMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;

/**
 * The contact point with the main mod: one ShipRegistry.register call per ship
 * and it shows up in the dockyard.
 *
 * The recipes below are only fallbacks. What players actually pay comes from
 * data/smallships_viking_addon/dockyard_recipes/<ship>.json, which data packs can
 * override. Keep both in sync.
 */
public class AddonShipTypes {

    public static final ShipType KNARR = ShipRegistry.register(ShipType.builder(id(KnarrEntity.ID), KnarrEntity::summon)
            .buildTime(70 * 20)
            .ingredient(ItemTags.PLANKS, 66)
            .ingredient(Items.WHITE_WOOL, 16)
            .ingredient(Items.STRING, 10)
            .ingredient(Items.IRON_NUGGET, 9)
            .build());

    public static final ShipType LONGSHIP = ShipRegistry.register(ShipType.builder(id(LongshipEntity.ID), LongshipEntity::summon)
            .buildTime(150 * 20)
            .ingredient(ItemTags.PLANKS, 132)
            .ingredient(Items.WHITE_WOOL, 28)
            .ingredient(Items.STRING, 22)
            .ingredient(Items.IRON_NUGGET, 24)
            .build());

    public static final ShipType TRANSPORT_DRAKKAR = ShipRegistry.register(ShipType.builder(id(TransportDrakkarEntity.ID), TransportDrakkarEntity::summon)
            .buildTime(200 * 20)
            .ingredient(ItemTags.PLANKS, 180)
            .ingredient(Items.WHITE_WOOL, 42)
            .ingredient(Items.STRING, 34)
            .ingredient(Items.IRON_NUGGET, 27)
            .build());

    // loads this class and with it registers the ship types - call after the configs are loaded
    public static void init() {
    }

    private static ResourceLocation id(String path) {
        return ResourceLocation.fromNamespaceAndPath(SmallShipsVikingAddonMod.MOD_ID, path);
    }
}
