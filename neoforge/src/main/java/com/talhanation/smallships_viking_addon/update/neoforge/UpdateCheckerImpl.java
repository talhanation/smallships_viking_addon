package com.talhanation.smallships_viking_addon.update.neoforge;

import com.talhanation.smallships_viking_addon.SmallShipsVikingAddonMod;
import net.neoforged.fml.ModList;

public class UpdateCheckerImpl {
    public static String getModVersion() {
        return ModList.get().getModContainerById(SmallShipsVikingAddonMod.MOD_ID)
                .map(container -> container.getModInfo().getVersion().toString())
                .orElse("0");
    }
}
