package com.talhanation.smallships_viking_addon.world.entity;

import com.talhanation.smallships_viking_addon.world.entity.ship.KnarrEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.LongshipEntity;
import com.talhanation.smallships_viking_addon.world.entity.ship.TransportDrakkarEntity;
import dev.architectury.injectables.annotations.ExpectPlatform;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EntityType;

/**
 * Entity types of this addon. The addon registers its own entities under its
 * own mod id - nothing is added to the main mods' registers.
 */
public class AddonEntityTypes {
    public static final EntityType<KnarrEntity> KNARR = getEntityType(KnarrEntity.class);
    public static final EntityType<LongshipEntity> LONGSHIP = getEntityType(LongshipEntity.class);
    public static final EntityType<TransportDrakkarEntity> TRANSPORT_DRAKKAR = getEntityType(TransportDrakkarEntity.class);
    public static void init() {
    }

    // implemented per loader in world/entity/neoforge and world/entity/fabric
    @ExpectPlatform
    public static <T extends Entity> EntityType<T> getEntityType(Class<T> entityClass) {
        throw new AssertionError();
    }
}
