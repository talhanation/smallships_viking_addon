package com.talhanation.smallships_viking_addon.forge.client;

import com.talhanation.smallships_viking_addon.SmallShipsAddonMod;
import com.talhanation.smallships_viking_addon.client.UpdateNotifier;
import net.minecraft.client.Minecraft;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@SuppressWarnings("unused")
@Mod.EventBusSubscriber(modid = SmallShipsAddonMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.FORGE, value = Dist.CLIENT)
public class ClientForgeBus {
    @SubscribeEvent
    static void onClientTick(TickEvent.ClientTickEvent event) {
        if (event.phase != TickEvent.Phase.END) return;
        UpdateNotifier.tick(Minecraft.getInstance());
    }
}
