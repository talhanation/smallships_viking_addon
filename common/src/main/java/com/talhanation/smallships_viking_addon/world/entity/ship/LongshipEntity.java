package com.talhanation.smallships_viking_addon.world.entity.ship;

import com.talhanation.smallships.config.SmallShipsConfig;
import com.talhanation.smallships.world.entity.ship.ContainerShip;
import com.talhanation.smallships.world.entity.ship.ShipUpgrade;
import com.talhanation.smallships.world.entity.ship.abilities.*;
import com.talhanation.smallships.world.entity.ship.hitbox.ShipPartEntity;
import com.talhanation.smallships.world.entity.ship.seat.ShipSeat;
import com.talhanation.smallships_viking_addon.config.VikingAddonConfig;
import com.talhanation.smallships_viking_addon.world.entity.AddonEntityTypes;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.level.Level;
import net.minecraft.world.phys.Vec3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Longship - slightly better than the Drakkar: more health and 20 seats at
 * the same speed, paid for with a worse rotation.
 *
 * Built after the main mods' DrakkarEntity. Hull parts and the render height
 * are still the ones of the Drakkar and have to follow the Longship model.
 */
public class LongshipEntity extends ContainerShip implements Bannerable, Sailable, Shieldable, Paddleable, IceBreakable, Seatable, Ability {
    // registry path of the entity, the items and the dockyard recipe
    public static final String ID = "longship";

    // how many of each upgrade item this hull needs at the dockyard
    private static final Map<ShipUpgrade, Integer> UPGRADE_COSTS = Map.of(
            ShipUpgrade.IRON_SCANTLINGS, 6,
            ShipUpgrade.COTTON_SAILS, 1,
            ShipUpgrade.COPPER_PLATING, 6
    );

    private static final int ORIGINAL_CONTAINER_SIZE = VikingAddonConfig.longshipContainerSize.get();

    public LongshipEntity(EntityType<? extends Boat> entityType, Level level) {
        super(entityType, level, ORIGINAL_CONTAINER_SIZE);
    }

    private LongshipEntity(Level level, double d, double e, double f) {
        this(AddonEntityTypes.LONGSHIP, level);
        this.setPos(d, e, f);
        this.xo = d;
        this.yo = e;
        this.zo = f;
    }

    // the factory ShipType is registered with - does NOT add the entity to the world
    public static LongshipEntity summon(Level level, double d, double e, double f) {
        return new LongshipEntity(level, d, e, f);
    }

    @Override
    public Map<ShipUpgrade, Integer> getUpgradeCosts() {
        return UPGRADE_COSTS;
    }

    // defined via SmallShipsConfig#defineAttributes, so the values are synced from the server
    @Override
    public SmallShipsConfig.ShipAttributes getConfiguredAttributes() {
        return VikingAddonConfig.longshipAttributes;
    }

    @Override
    public BiomeModifierType getBiomeModifierType() {
        return VikingAddonConfig.longshipBiome.get();
    }
    private static final List<ShipPartEntity.Definition> PARTS = List.of(
            ShipPartEntity.Definition.hull(-4.0F, 0.0F, 0.0F, 2.0F, 1.25F),//back
            ShipPartEntity.Definition.hull(4.0F, 0.0F, 0.0F, 2.0F, 1.25F),//front

            ShipPartEntity.Definition.hull(-2.0F, 0.0F, 0.0F, 2.75F, 1.25F),//center back

            ShipPartEntity.Definition.hull(0.0F, 0.0F, 0.0F, 2.75F, 1.25F),//center

            ShipPartEntity.Definition.hull(2.0F, 0.0F, 0.0F, 2.75F, 1.25F),//center front

            ShipPartEntity.Definition.hull(5.3F, 0.5F, 0.0F, 0.75F, 4.0F),//dragon head
            ShipPartEntity.Definition.hull(-5.3F, 0.5F, 0.0F, 0.75F, 4.0F),//dragon tail

            ShipPartEntity.Definition.mast(0.0F, 0.0F, 0.3F, 9.0F)//mast
    );

    @Override
    public List<ShipPartEntity.Definition> getParts() {
        return PARTS;
    }

    private static final float deck = 0.1F;
    private static final List<ShipSeat> SEATS = List.of(
            ShipSeat.driver(0, -4.0F, deck, 0.0F),

            ShipSeat.passenger(1, -3.25F, deck, 0.75F),
            ShipSeat.passenger(2, -3.25F, deck, -0.75F),

            ShipSeat.passenger(3, -2.5F, deck, 0.75F),
            ShipSeat.passenger(4, -2.5F, deck, -0.75F),

            ShipSeat.passenger(5, -1.75F, deck, 0.75F),
            ShipSeat.passenger(6, -1.75F, deck, -0.75F),

            ShipSeat.passenger(7, -1.0F, deck, 0.75F),
            ShipSeat.passenger(8, -1.0F, deck, -0.75F),

            ShipSeat.passenger(9, -0.25F, deck, 0.75F),
            ShipSeat.passenger(10, -0.25F, deck, -0.75F),

            ShipSeat.passenger(11, 0.5F, deck, 0.75F),
            ShipSeat.passenger(12, 0.5F, deck, -0.75F),

            ShipSeat.passenger(13, 1.25F, deck, 0.75F),
            ShipSeat.passenger(14, 1.25F, deck, -0.75F),

            ShipSeat.passenger(15, 2.0F, deck, 0.75F),
            ShipSeat.passenger(16, 2.0F, deck, -0.75F),

            ShipSeat.passenger(17, 2.75F, deck, 0.75F),
            ShipSeat.passenger(18, 2.75F, deck, -0.75F),

            ShipSeat.passenger(19, 3.5F, deck, 0.0F)
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

    /* ---------------- Shields ---------------- */
    // shield slots along the railing: (x, y, z, isRightSided)
    @Override
    public ShieldPosition getShieldPosition(int index) {
        return SHIELD_POSITIONS.get(index);
    }

    @Override
    public byte getMaxShieldsPerSide() {
        return 7;
    }

    private static final List<ShieldPosition> SHIELD_POSITIONS = new ArrayList<>();

    // 6 oars = 5 gaps: the first five pairs hang halfway between two oars (oar x of the model / 16),
    // the last two pairs hang behind the outermost oars at the tail and at the bow
    static {
        SHIELD_POSITIONS.add(new ShieldPosition(2.06, 0.8, -1.2, true));
        SHIELD_POSITIONS.add(new ShieldPosition(2.06, 0.8, 1.2, false));
        SHIELD_POSITIONS.add(new ShieldPosition(0.88, 0.8, -1.2, true));
        SHIELD_POSITIONS.add(new ShieldPosition(0.88, 0.8, 1.2, false));
        SHIELD_POSITIONS.add(new ShieldPosition(-0.28, 0.8, -1.2, true));
        SHIELD_POSITIONS.add(new ShieldPosition(-0.28, 0.8, 1.2, false));
        SHIELD_POSITIONS.add(new ShieldPosition(-1.41, 0.8, -1.2, true));
        SHIELD_POSITIONS.add(new ShieldPosition(-1.41, 0.8, 1.2, false));
        SHIELD_POSITIONS.add(new ShieldPosition(-2.53, 0.8, -1.2, true));
        SHIELD_POSITIONS.add(new ShieldPosition(-2.53, 0.8, 1.2, false));

        SHIELD_POSITIONS.add(new ShieldPosition(3.2, 0.8, -0.8, true));
        SHIELD_POSITIONS.add(new ShieldPosition(3.2, 0.8, 0.8, false));
        SHIELD_POSITIONS.add(new ShieldPosition(-3.4, 0.8, -0.8, true));
        SHIELD_POSITIONS.add(new ShieldPosition(-3.4, 0.8, 0.8, false));
    }

    /* ---------------- Render ---------------- */
    // height of the render pose above the ship position, the renderer translates by it
    @Override
    public float getRenderPoseHeight() {
        return 2.75F;
    }
}
