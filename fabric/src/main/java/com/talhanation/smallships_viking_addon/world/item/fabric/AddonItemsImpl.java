package com.talhanation.smallships_viking_addon.world.item.fabric;

import com.talhanation.smallships_viking_addon.SmallShipsAddonMod;
import com.talhanation.smallships_viking_addon.world.entity.ship.KnarrEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.LongshipEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.TransportDrakkarEntity;
import com.talhanation.smallships_viking_addon.world.item.AddonItems;
import com.talhanation.smallships_viking_addon.world.item.KnarrItem;
import com.talhanation.smallships_viking_addon.world.item.LongshipItem;
import com.talhanation.smallships_viking_addon.world.item.TransportDrakkarItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ExpectPlatform target for AddonItems#getItem.
 *
 * The ship items are added to a VANILLA creative tab. An addon must not try to
 * write into the main mods' own tab - that tab is built from the smallships
 * namespace only.
 */
public class AddonItemsImpl {
    private static final Map<String, Item> entries = new HashMap<>();

    public static Item getItem(String id) {
        return entries.get(id);
    }

    static {
        for (Boat.Type type : Boat.Type.values()) {
            register(AddonItems.itemId(type, KnarrEntity.ID), new KnarrItem(type, new Item.Properties().stacksTo(1)));
            register(AddonItems.itemId(type, LongshipEntity.ID), new LongshipItem(type, new Item.Properties().stacksTo(1)));
            register(AddonItems.itemId(type, TransportDrakkarEntity.ID), new TransportDrakkarItem(type, new Item.Properties().stacksTo(1)));
        }

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.TOOLS_AND_UTILITIES).register(output -> {
            List<ItemStack> shipItems = new ArrayList<>();
            for (Boat.Type type : Boat.Type.values()) {
                shipItems.add(new ItemStack(getItem(AddonItems.itemId(type, KnarrEntity.ID))));
                shipItems.add(new ItemStack(getItem(AddonItems.itemId(type, LongshipEntity.ID))));
                shipItems.add(new ItemStack(getItem(AddonItems.itemId(type, TransportDrakkarEntity.ID))));
            }
            output.acceptAll(shipItems);
        });
    }

    private static void register(String id, Item item) {
        entries.put(id, Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(SmallShipsAddonMod.MOD_ID, id), item));
    }
}
