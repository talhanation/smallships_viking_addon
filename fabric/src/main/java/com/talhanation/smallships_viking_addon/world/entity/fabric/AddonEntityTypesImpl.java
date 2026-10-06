package com.talhanation.smallships_viking_addon.world.entity.fabric;

import com.talhanation.smallships_viking_addon.SmallShipsAddonMod;
import com.talhanation.smallships_viking_addon.world.entity.ship.KnarrEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.LongshipEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.TransportDrakkarEntity;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;

import java.util.HashMap;
import java.util.Map;

/**
 * @ExpectPlatform target for AddonEntityTypes#getEntityType. The class name and
 * the package suffix must match what Architectury expects:
 * <original package>.fabric.<original class>Impl
 */
public class AddonEntityTypesImpl {
    private static final Map<Class<? extends Entity>, EntityType<? extends Entity>> entries = new HashMap<>();

    @SuppressWarnings("unchecked")
    public static <T extends Entity> EntityType<T> getEntityType(Class<T> entityClass) {
        return (EntityType<T>) entries.get(entityClass);
    }

    private static <T extends Entity> EntityType<T> register(String id, EntityType<T> type) {
        return Registry.register(BuiltInRegistries.ENTITY_TYPE, new ResourceLocation(SmallShipsAddonMod.MOD_ID, id), type);
    }

    static {
        // sized like the main mods' Drakkar until the models are in
        entries.put(KnarrEntity.class, register(KnarrEntity.ID, EntityType.Builder.of(KnarrEntity::new, MobCategory.MISC)
                .sized(3.5F, 1.25F)
                .clientTrackingRange(20)
                .updateInterval(10)
                .build(KnarrEntity.ID)));

        entries.put(LongshipEntity.class, register(LongshipEntity.ID, EntityType.Builder.of(LongshipEntity::new, MobCategory.MISC)
                .sized(3.5F, 1.25F)
                .clientTrackingRange(20)
                .updateInterval(10)
                .build(LongshipEntity.ID)));

        entries.put(TransportDrakkarEntity.class, register(TransportDrakkarEntity.ID, EntityType.Builder.of(TransportDrakkarEntity::new, MobCategory.MISC)
                .sized(3.5F, 1.25F)
                .clientTrackingRange(20)
                .updateInterval(10)
                .build(TransportDrakkarEntity.ID)));
    }
}
