package com.talhanation.smallships_viking_addon.neoforge.client;

import com.talhanation.smallships_viking_addon.SmallShipsVikingAddonMod;
import com.talhanation.smallships_viking_addon.client.UpdateNotifier;
import net.minecraft.client.Minecraft;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.client.event.ClientTickEvent;

@SuppressWarnings("unused")
@EventBusSubscriber(modid = SmallShipsVikingAddonMod.MOD_ID, bus = EventBusSubscriber.Bus.GAME, value = Dist.CLIENT)
public class ClientGameBus {
    @SubscribeEvent
    static void onClientTick(ClientTickEvent.Post event) {
        UpdateNotifier.tick(Minecraft.getInstance());
    }
}
