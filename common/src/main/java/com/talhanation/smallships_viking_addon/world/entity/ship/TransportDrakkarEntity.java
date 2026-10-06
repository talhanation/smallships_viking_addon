package com.talhanation.smallships_viking_addon.world.entity.ship;

import com.talhanation.smallships.config.SmallShipsConfig;
import com.talhanation.smallships.world.entity.ship.ContainerShip;
import com.talhanation.smallships.world.entity.ship.ShipUpgrade;
import com.talhanation.smallships.world.entity.ship.abilities.*;
import com.talhanation.smallships.world.entity.ship.hitbox.ShipPartEntity;
import com.talhanation.smallships.world.entity.ship.seat.ShipSeat;
import com.talhanation.smallships_viking_addon.config.AddonConfig;
import com.talhanation.smallships_viking_addon.world.entity.AddonEntityTypes;
import com.talhanation.smallships_viking_addon.world.item.AddonItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Transport Drakkar - the troop carrier of the Viking ships: 30 seats, and for
 * that the slowest ship with the worst rotation.
 *
 * Built after the main mods' DrakkarEntity. Hull parts, shield positions and
 * the render height are still the ones of the Drakkar and have to follow the
 * Transport Drakkar model.
 */
public class TransportDrakkarEntity extends ContainerShip implements Bannerable, Sailable, Shieldable, Paddleable, IceBreakable, Seatable, Leashable, Ability {
    // registry path of the entity, the items and the dockyard recipe
    public static final String ID = "transport_drakkar";

    // how many of each upgrade item this hull needs at the dockyard
    private static final Map<ShipUpgrade, Integer> UPGRADE_COSTS = Map.of(
            ShipUpgrade.IRON_SCANTLINGS, 7,
            ShipUpgrade.COTTON_SAILS, 1,
            ShipUpgrade.COPPER_PLATING, 7
    );

    private static final int ORIGINAL_CONTAINER_SIZE = AddonConfig.transportDrakkarContainerSize.get();

    public TransportDrakkarEntity(EntityType<? extends Boat> entityType, Level level) {
        super(entityType, level, ORIGINAL_CONTAINER_SIZE);
    }

    private TransportDrakkarEntity(Level level, double d, double e, double f) {
        this(AddonEntityTypes.TRANSPORT_DRAKKAR, level);
        this.setPos(d, e, f);
        this.xo = d;
        this.yo = e;
        this.zo = f;
    }

    // the factory ShipType is registered with - does NOT add the entity to the world
    public static TransportDrakkarEntity summon(Level level, double d, double e, double f) {
        return new TransportDrakkarEntity(level, d, e, f);
    }

    @Override
    public Map<ShipUpgrade, Integer> getUpgradeCosts() {
        return UPGRADE_COSTS;
    }

    // defined via SmallShipsConfig#defineAttributes, so the values are synced from the server
    @Override
    public SmallShipsConfig.ShipAttributes getConfiguredAttributes() {
        return AddonConfig.transportDrakkarAttributes;
    }

    @Override
    public @NotNull Item getDropItem() {
        // respect the main mods' item drop switch
        if (!SmallShipsConfig.Server.shipGeneralDoItemDrop.get()) return ItemStack.EMPTY.getItem();
        return AddonItems.TRANSPORT_DRAKKAR_ITEMS.get(this.getVariant());
    }

    @Override
    public BiomeModifierType getBiomeModifierType() {
        return AddonConfig.transportDrakkarBiome.get();
    }

    /* ---------------- collision parts ---------------- */
    // hitbox parts along the keel: hull(v, y, h, width, height), mast(v, h, thickness, height);
    // v = forward (positive = bow), h = sideways. Masts also define how many sails the ship has.
    private static final List<ShipPartEntity.Definition> PARTS = List.of(
            ShipPartEntity.Definition.hull(-2.3F, 0.0F, 0.0F, 2.8F, 1.6F),//back
            ShipPartEntity.Definition.hull(2.65F, 0.0F, 0.0F, 2.5F, 1.6F),//front
            ShipPartEntity.Definition.hull(0.0F, 0.0F, 0.0F, 3.00F, 1.6F),//center
            ShipPartEntity.Definition.hull(3.80F, 0.0F, 0.0F, 2.5F, 1.6F),//front ram

            ShipPartEntity.Definition.hull(4.75F, 1.5F, 0.0F, 0.75F, 3.0F),//dragon head
            ShipPartEntity.Definition.hull(-3.5F, 1.5F, 0.0F, 0.75F, 3.0F),//dragon tail

            ShipPartEntity.Definition.mast(-0.1F, 0.0F, 0.3F, 9.0F)//mast
    );

    @Override
    public List<ShipPartEntity.Definition> getParts() {
        return PARTS;
    }

    /* ---------------- seats ---------------- */

    // seats: driver/passenger(id, v, y, h) - ids must be unique, y is on top of the deck
    // 30 seats: the helm, nine rows of three and two in the bow
    private static final float deck = 0.4F;
    private static final List<ShipSeat> SEATS = List.of(
            ShipSeat.driver(0, -2.8F, deck, 0.0F),

            ShipSeat.passenger(1, -2.2F, deck, 0.9F),
            ShipSeat.passenger(2, -2.2F, deck, 0.0F),
            ShipSeat.passenger(3, -2.2F, deck, -0.9F),

            ShipSeat.passenger(4, -1.4F, deck, 0.9F),
            ShipSeat.passenger(5, -1.4F, deck, 0.0F),
            ShipSeat.passenger(6, -1.4F, deck, -0.9F),

            ShipSeat.passenger(7, -0.6F, deck, 0.9F),
            ShipSeat.passenger(8, -0.6F, deck, 0.0F),
            ShipSeat.passenger(9, -0.6F, deck, -0.9F),

            ShipSeat.passenger(10, 0.2F, deck, 0.9F),
            ShipSeat.passenger(11, 0.2F, deck, 0.0F),
            ShipSeat.passenger(12, 0.2F, deck, -0.9F),

            ShipSeat.passenger(13, 1.0F, deck, 0.9F),
            ShipSeat.passenger(14, 1.0F, deck, 0.0F),
            ShipSeat.passenger(15, 1.0F, deck, -0.9F),

            ShipSeat.passenger(16, 1.8F, deck, 0.9F),
            ShipSeat.passenger(17, 1.8F, deck, 0.0F),
            ShipSeat.passenger(18, 1.8F, deck, -0.9F),

            ShipSeat.passenger(19, 2.6F, deck, 0.9F),
            ShipSeat.passenger(20, 2.6F, deck, 0.0F),
            ShipSeat.passenger(21, 2.6F, deck, -0.9F),

            ShipSeat.passenger(22, 3.4F, deck, 0.9F),
            ShipSeat.passenger(23, 3.4F, deck, 0.0F),
            ShipSeat.passenger(24, 3.4F, deck, -0.9F),

            ShipSeat.passenger(25, 4.2F, deck, 0.9F),
            ShipSeat.passenger(26, 4.2F, deck, 0.0F),
            ShipSeat.passenger(27, 4.2F, deck, -0.9F),

            ShipSeat.passenger(28, 4.9F, deck, 0.45F),
            ShipSeat.passenger(29, 4.9F, deck, -0.45F)
    );

    @Override
    public List<ShipSeat> getSeats() {
        return SEATS;
    }

    /* ---------------- Water Particles ---------------- */

    @Override
    public void waterSplash() {
        // bow wave and wake particles while the ship is moving
        Vec3 vector3d = this.getViewVector(0.0F);
        float f0 = Mth.cos(this.getYRot() * ((float) Math.PI / 180F)) * 1.2F;
        float f1 = Mth.sin(this.getYRot() * ((float) Math.PI / 180F)) * 1.2F;
        float f2 = 4F - this.random.nextFloat() * 0.7F;
        float f2_ = -2.3F - this.random.nextFloat() * 0.7F;
        float x = 0;
        for (int i = 0; i < 2; ++i) {
            this.level().addParticle(ParticleTypes.DOLPHIN, this.getX() - vector3d.x * (double) f2 + (double) f0, this.getY() - vector3d.y + 0.5D, this.getZ() - vector3d.z * (double) f2 + (double) f1, 0.0D, 0.0D, 0.0D);
            this.level().addParticle(ParticleTypes.DOLPHIN, this.getX() - vector3d.x * (double) f2 - (double) f0, this.getY() - vector3d.y + 0.5D, this.getZ() - vector3d.z * (double) f2 - (double) f1, 0.0D, 0.0D, 0.0D);
            this.level().addParticle(ParticleTypes.DOLPHIN, this.getX() - vector3d.x * (double) f2 + (double) f0, this.getY() - vector3d.y + 0.5D, this.getZ() - vector3d.z * (double) f2 + (double) f1 * 5.1, 0.0D, 0.0D, 0.0D);
            this.level().addParticle(ParticleTypes.DOLPHIN, this.getX() - vector3d.x * (double) f2 - (double) f0, this.getY() - vector3d.y + 0.5D, this.getZ() - vector3d.z * (double) f2 - (double) f1 * 5.1, 0.0D, 0.0D, 0.0D);

            this.level().addParticle(ParticleTypes.SPLASH, this.getX() - vector3d.x * (double) f2 + (double) f0, this.getY() - vector3d.y + 0.8D, this.getZ() - vector3d.z * (double) f2 + (double) f1, 0.0D, 0.0D, 0.0D);
            this.level().addParticle(ParticleTypes.SPLASH, this.getX() - vector3d.x * (double) f2 - (double) f0, this.getY() - vector3d.y + 0.8D, this.getZ() - vector3d.z * (double) f2 - (double) f1, 0.0D, 0.0D, 0.0D);
            this.level().addParticle(ParticleTypes.SPLASH, this.getX() - vector3d.x * (double) f2 + (double) f0, this.getY() - vector3d.y + 0.8D, this.getZ() - vector3d.z * (double) f2 + (double) f1 * 1.1, 0.0D, 0.0D, 0.0D);
            this.level().addParticle(ParticleTypes.SPLASH, this.getX() - vector3d.x * (double) f2 - (double) f0, this.getY() - vector3d.y + 0.8D, this.getZ() - vector3d.z * (double) f2 - (double) f1 * 1.1, 0.0D, 0.0D, 0.0D);

            this.level().addParticle(ParticleTypes.SPLASH, this.getX() - vector3d.x * (double) f2_ + (double) f0, this.getY() - vector3d.y + 0.8D, this.getZ() - vector3d.z * (double) (f2_ - x) + (double) f1, 0.0D, 0.0D, 0.0D);
            this.level().addParticle(ParticleTypes.SPLASH, this.getX() - vector3d.x * (double) f2_ - (double) f0, this.getY() - vector3d.y + 0.8D, this.getZ() - vector3d.z * (double) (f2_ - x) - (double) f1, 0.0D, 0.0D, 0.0D);
            this.level().addParticle(ParticleTypes.SPLASH, this.getX() - vector3d.x * (double) f2_ + (double) f0, this.getY() - vector3d.y + 0.8D, this.getZ() - vector3d.z * (double) (f2_ - x) + (double) f1 * 1.1, 0.0D, 0.0D, 0.0D);
            this.level().addParticle(ParticleTypes.SPLASH, this.getX() - vector3d.x * (double) f2_ - (double) f0, this.getY() - vector3d.y + 0.8D, this.getZ() - vector3d.z * (double) (f2_ - x) - (double) f1 * 1.1, 0.0D, 0.0D, 0.0D);

            this.level().addParticle(ParticleTypes.BUBBLE, this.getX() - vector3d.x * (double) f2_ + (double) f0, this.getY() - vector3d.y + 0.8D, this.getZ() - vector3d.z * (double) (f2_ - x) + (double) f1, 0.0D, 0.0D, 0.0D);
            this.level().addParticle(ParticleTypes.BUBBLE, this.getX() - vector3d.x * (double) f2_ - (double) f0, this.getY() - vector3d.y + 0.8D, this.getZ() - vector3d.z * (double) (f2_ - x) - (double) f1, 0.0D, 0.0D, 0.0D);
            this.level().addParticle(ParticleTypes.BUBBLE, this.getX() - vector3d.x * (double) f2_ + (double) f0, this.getY() - vector3d.y + 0.8D, this.getZ() - vector3d.z * (double) (f2_ - x) + (double) f1 * 1.1, 0.0D, 0.0D, 0.0D);
            this.level().addParticle(ParticleTypes.BUBBLE, this.getX() - vector3d.x * (double) f2_ - (double) f0, this.getY() - vector3d.y + 0.8D, this.getZ() - vector3d.z * (double) (f2_ - x) - (double) f1 * 1.1, 0.0D, 0.0D, 0.0D);
        }
    }

    /* ---------------- wind profile ---------------- */
    // speed multipliers for head, side and tail wind
    @Override
    public float getHeadWindMultiplier() {
        return 0.30F;
    }

    @Override
    public float getSideWindMultiplier() {
        return 1.10F;
    }

    @Override
    public float getTailWindMultiplier() {
        return 1.40F;
    }

    /* ---------------- Oars ---------------- */
    // the fraction of max speed the ship still makes with furled sails
    @Override
    public float getOarFactor() {
        return 0.75F;
    }

    /* ---------------- Leash ---------------- */

    @Override
    public @Nullable Vec3 applyLeashOffset() {
        return new Vec3(0.0, this.getEyeHeight(), this.getBbWidth() * 0.1F);
    }

    /* ---------------- Shields ---------------- */
    // shield slots along the railing: (x, y, z, isRightSided)
    @Override
    public ShieldPosition getShieldPosition(int index) {
        return SHIELD_POSITIONS.get(index);
    }

    @Override
    public byte getMaxShieldsPerSide() {
        return 5;
    }

    private static final List<ShieldPosition> SHIELD_POSITIONS = new ArrayList<>();

    static {
        SHIELD_POSITIONS.add(new ShieldPosition(2.1, 0.8, -1.0, true));
        SHIELD_POSITIONS.add(new ShieldPosition(2.1, 0.8, 1.0, false));
        SHIELD_POSITIONS.add(new ShieldPosition(0.9, 0.8, -1.2, true));
        SHIELD_POSITIONS.add(new ShieldPosition(0.9, 0.8, 1.2, false));
        SHIELD_POSITIONS.add(new ShieldPosition(-0.3, 0.8, -1.2, true));
        SHIELD_POSITIONS.add(new ShieldPosition(-0.3, 0.8, 1.2, false));
        SHIELD_POSITIONS.add(new ShieldPosition(-1.5, 0.8, -1.2, true));
        SHIELD_POSITIONS.add(new ShieldPosition(-1.5, 0.8, 1.2, false));
        SHIELD_POSITIONS.add(new ShieldPosition(-3.0, 0.8, -1.0, true));
        SHIELD_POSITIONS.add(new ShieldPosition(-3.0, 0.8, 1.0, false));
    }

    /* ---------------- Render ---------------- */
    // height of the render pose above the ship position, the renderer translates by it
    @Override
    public float getRenderPoseHeight() {
        return 3.1F;
    }
}
