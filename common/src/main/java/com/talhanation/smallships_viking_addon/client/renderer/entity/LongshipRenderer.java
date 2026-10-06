package com.talhanation.smallships_viking_addon.client.renderer.entity;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Axis;
import com.talhanation.smallships.SmallShipsMod;
import com.talhanation.smallships.client.renderer.entity.ShipRenderer;
import com.talhanation.smallships_viking_addon.client.model.LongshipModel;
import com.talhanation.smallships_viking_addon.world.entity.ship.LongshipEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.vehicle.Boat;
import org.jetbrains.annotations.NotNull;

/**
 * ShipRenderer does the heavy lifting (hull, sail, banners, damage, shields).
 * An addon renderer only supplies its model and its texture.
 */
public class LongshipRenderer extends ShipRenderer<LongshipEntity> {
    public LongshipRenderer(EntityRendererProvider.Context context) {
        super(context);
    }

    @Override
    protected LongshipModel createBoatModel(EntityRendererProvider.Context context, Boat.Type type) {
        // the layer must be registered in the loader module, otherwise the game crashes on startup
        return new LongshipModel(context.bakeLayer(LongshipModel.LAYER_LOCATION));
    }

    @Override
    protected ResourceLocation getTextureLocation(Boat.Type type) {
        // reuses the main mods' hull textures - use SmallShipsAddonMod.MOD_ID to ship your own
        return new ResourceLocation(SmallShipsMod.MOD_ID, "textures/entity/ship/" + ShipRenderer.getNameFromType(type) + ".png");
    }

    @Override
    public void render(@NotNull LongshipEntity longshipEntity, float entityYaw, float partialTicks, @NotNull PoseStack poseStack, @NotNull MultiBufferSource multiBufferSource, int packedLight) {
        // ShipRenderer#render pops this pose again
        poseStack.pushPose();
        poseStack.mulPose(Axis.YP.rotationDegrees(180.0F - entityYaw));
        // lifts the model onto the waterline, tune per ship in LongshipEntity#getRenderPoseHeight
        poseStack.translate(0.0D, longshipEntity.getRenderPoseHeight(), 0.0D);
        super.render(longshipEntity, entityYaw, partialTicks, poseStack, multiBufferSource, packedLight);
    }
}
