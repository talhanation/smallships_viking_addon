package com.talhanation.smallships_viking_addon.world.entity.neoforge;

import com.talhanation.smallships_viking_addon.SmallShipsVikingAddonMod;
import com.talhanation.smallships_viking_addon.world.entity.ship.KnarrEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.LongshipEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.TransportDrakkarEntity;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.HashMap;
import java.util.Map;

/**
 * @ExpectPlatform target for AddonEntityTypes#getEntityType. The class name and
 * the package suffix must match what Architectury expects:
 * <original package>.neoforge.<original class>Impl
 */
public class AddonEntityTypesImpl {
    private static final Map<Class<? extends Entity>, DeferredHolder<EntityType<?>, EntityType<?>>> entries = new HashMap<>();

    @SuppressWarnings("unchecked")
    public static <T extends Entity> EntityType<T> getEntityType(Class<T> entityClass) {
        return (EntityType<T>) entries.get(entityClass).get();
    }

    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES = DeferredRegister.create(Registries.ENTITY_TYPE, SmallShipsVikingAddonMod.MOD_ID);

    static {
        // sized like the main mods' Drakkar until the models are in
        entries.put(KnarrEntity.class, ENTITY_TYPES.register(KnarrEntity.ID,
                () -> EntityType.Builder.of(KnarrEntity::new, MobCategory.MISC)
                        .sized(1.25F, 1.25F)
                        .clientTrackingRange(20)
                        .setUpdateInterval(10)
                        .setShouldReceiveVelocityUpdates(true)
                        .build(KnarrEntity.ID)));

        entries.put(LongshipEntity.class, ENTITY_TYPES.register(LongshipEntity.ID,
                () -> EntityType.Builder.of(LongshipEntity::new, MobCategory.MISC)
                        .sized(1.25F, 1.25F)
                        .clientTrackingRange(20)
                        .setUpdateInterval(10)
                        .setShouldReceiveVelocityUpdates(true)
                        .build(LongshipEntity.ID)));

        entries.put(TransportDrakkarEntity.class, ENTITY_TYPES.register(TransportDrakkarEntity.ID,
                () -> EntityType.Builder.of(TransportDrakkarEntity::new, MobCategory.MISC)
                        .sized(1.25F, 1.25F)
                        .clientTrackingRange(20)
                        .setUpdateInterval(10)
                        .setShouldReceiveVelocityUpdates(true)
                        .build(TransportDrakkarEntity.ID)));
    }
}
