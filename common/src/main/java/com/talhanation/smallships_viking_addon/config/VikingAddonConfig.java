package com.talhanation.smallships_viking_addon.config;

import com.talhanation.smallships.config.SmallShipsConfig;
import com.talhanation.smallships.world.entity.ship.Ship;
import com.talhanation.smallships_viking_addon.SmallShipsVikingAddonMod;
import net.minecraftforge.common.ForgeConfigSpec;

/**
 * The addons' own server and client config.
 *
 * An addon can NOT write into the main mods' config spec, so it builds its own
 * and defines its ship attributes on it through
 * {@link SmallShipsConfig#defineAttributes}. That call is what puts the block
 * into the main mods' attribute registry, and from there into the snapshot the
 * server sends a joining client. Skip it and build a ShipAttributes by hand and
 * the ship would read the CLIENTS local file while connected to a server -
 * different numbers in the stat panel, different prediction in the renderer.
 *
 * The prefix carries the mod id so it can never collide with another mods' key.
 * Type SERVER, because ship attributes are world rules, not client taste.
 *
 * The client spec only holds what is the players' own choice: whether the
 * update check tells him in chat that a new version is out.
 */
public class VikingAddonConfig {

    public static final ForgeConfigSpec SERVER_SPEC;
    public static final ForgeConfigSpec CLIENT_SPEC;

    public static SmallShipsConfig.ShipAttributes knarrAttributes;
    public static ForgeConfigSpec.ConfigValue<Integer> knarrContainerSize;
    public static ForgeConfigSpec.EnumValue<Ship.BiomeModifierType> knarrBiome;

    public static SmallShipsConfig.ShipAttributes longshipAttributes;
    public static ForgeConfigSpec.ConfigValue<Integer> longshipContainerSize;
    public static ForgeConfigSpec.EnumValue<Ship.BiomeModifierType> longshipBiome;

    public static SmallShipsConfig.ShipAttributes transportDrakkarAttributes;
    public static ForgeConfigSpec.ConfigValue<Integer> transportDrakkarContainerSize;
    public static ForgeConfigSpec.EnumValue<Ship.BiomeModifierType> transportDrakkarBiome;

    public static ForgeConfigSpec.BooleanValue updateCheckerEnable;
    public static ForgeConfigSpec.BooleanValue clientUpdateCheckerEnable;

    static {
        ForgeConfigSpec.Builder serverConfigBuilder = new ForgeConfigSpec.Builder();
        ForgeConfigSpec.Builder clientConfigBuilder = new ForgeConfigSpec.Builder();
        setupServerConfig(serverConfigBuilder);
        setupClientConfig(clientConfigBuilder);
        SERVER_SPEC = serverConfigBuilder.build();
        CLIENT_SPEC = clientConfigBuilder.build();
    }

    private static void setupServerConfig(ForgeConfigSpec.Builder builder) {
        builder.push("Ship");

        //////////////////////////////////////KNARR///////////////////////////////////////////
        builder.push("Knarr");

        builder.comment("Default attributes for the Knarr. Speed in km/h, Health in default mc health points");
        builder.push("Attributes");

        // maxHealth, maxSpeed, maxReverseSpeed, maxRotationSpeed, acceleration, rotationAcceleration
        // for comparison, the main mods' Drakkar: 200.0D, 28.0D, 0.1D, 5.0D, 0.010D, 0.750D
        knarrAttributes = SmallShipsConfig.defineAttributes(builder, SmallShipsVikingAddonMod.MOD_ID + "ShipAttributeKnarr",
                100.0D, 24.0D, 0.1D, 4.5D, 0.008D, 0.650D);

        builder.pop();

        builder.comment("Default configs for the container of the Knarr.");
        builder.push("Container");

        builder.comment("Set container size for the Knarr (value must be divisible by 9 and bigger than 0).");
        knarrContainerSize = builder
                .define("knarrContainerSize", 54, e -> e instanceof Integer i && i % 9 == 0 && i > 0);

        builder.pop();

        builder.comment("Knarr specific speed modifiers.");
        builder.push("Modifier");

        builder.comment("Specify biome type for the Knarr. Can be NONE, COLD, NEUTRAL, or WARM");
        knarrBiome = builder
                .defineEnum("knarrBiome", Ship.BiomeModifierType.COLD);

        builder.pop();
        builder.pop();

        //////////////////////////////////////LONGSHIP///////////////////////////////////////////
        builder.push("Longship");

        builder.comment("Default attributes for the Longship. Speed in km/h, Health in default mc health points");
        builder.push("Attributes");

        longshipAttributes = SmallShipsConfig.defineAttributes(builder, SmallShipsVikingAddonMod.MOD_ID + "ShipAttributeLongship",
                260.0D, 28.0D, 0.1D, 4.0D, 0.010D, 0.650D);

        builder.pop();

        builder.comment("Default configs for the container of the Longship.");
        builder.push("Container");

        builder.comment("Set container size for the Longship (value must be divisible by 9 and bigger than 0).");
        longshipContainerSize = builder
                .define("longshipContainerSize", 27*3, e -> e instanceof Integer i && i % 9 == 0 && i > 0);

        builder.pop();

        builder.comment("Longship specific speed modifiers.");
        builder.push("Modifier");

        builder.comment("Specify biome type for the Longship. Can be NONE, COLD, NEUTRAL, or WARM");
        longshipBiome = builder
                .defineEnum("longshipBiome", Ship.BiomeModifierType.COLD);

        builder.pop();
        builder.pop();

        //////////////////////////////////////TRANSPORT_DRAKKAR///////////////////////////////////////////
        builder.push("TransportDrakkar");

        builder.comment("Default attributes for the Transport Drakkar. Speed in km/h, Health in default mc health points");
        builder.push("Attributes");

        transportDrakkarAttributes = SmallShipsConfig.defineAttributes(builder, SmallShipsVikingAddonMod.MOD_ID + "ShipAttributeTransportDrakkar",
                240.0D, 20.0D, 0.1D, 3.0D, 0.007D, 0.500D);

        builder.pop();

        builder.comment("Default configs for the container of the Transport Drakkar.");
        builder.push("Container");

        builder.comment("Set container size for the Transport Drakkar (value must be divisible by 9 and bigger than 0).");
        transportDrakkarContainerSize = builder
                .define("transportDrakkarContainerSize", 54*3, e -> e instanceof Integer i && i % 9 == 0 && i > 0);

        builder.pop();

        builder.comment("Transport Drakkar specific speed modifiers.");
        builder.push("Modifier");

        builder.comment("Specify biome type for the Transport Drakkar. Can be NONE, COLD, NEUTRAL, or WARM");
        transportDrakkarBiome = builder
                .defineEnum("transportDrakkarBiome", Ship.BiomeModifierType.COLD);

        builder.pop();
        builder.pop();

        ////

        builder.pop();

        builder.comment(" This category holds configs that define general mod settings.");
        builder.push("General");

        builder.comment("Check for a new version of the addon when the server starts and write the result to the server log.");
        updateCheckerEnable = builder
                .define("updateCheckerEnable", true);

        builder.pop();
    }

    private static void setupClientConfig(ForgeConfigSpec.Builder builder) {
        builder.comment(" This category holds configs that define general mod settings.");
        builder.push("General");

        builder.comment("Check for a new version of the addon and show a chat message when joining a world while an update is available.");
        clientUpdateCheckerEnable = builder
                .define("updateCheckerEnable", true);

        builder.pop();
    }

    /** Registers the specs. Must run before anything reads a value from them. */
    public static void register() {
        SmallShipsConfig.registerConfigs(SmallShipsVikingAddonMod.MOD_ID, SmallShipsConfig.ModConfigWrapper.Type.SERVER, SERVER_SPEC);
        SmallShipsConfig.registerConfigs(SmallShipsVikingAddonMod.MOD_ID, SmallShipsConfig.ModConfigWrapper.Type.CLIENT, CLIENT_SPEC);
    }
}
