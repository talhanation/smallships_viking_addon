package com.talhanation.smallships_viking_addon.client.model.sail.banner;

import com.talhanation.smallships.client.model.sail.banner.MastBannerModel;
import com.talhanation.smallships_viking_addon.SmallShipsVikingAddonMod;
import com.talhanation.smallships_viking_addon.world.entity.ship.KnarrEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;

public class KnarrMastBannerModel extends MastBannerModel {
    @SuppressWarnings("unused")
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(SmallShipsVikingAddonMod.MOD_ID, KnarrEntity.ID + "_mast_banner_model"), "main");

    public KnarrMastBannerModel() {
        super(createBodyLayer());
    }

    @SuppressWarnings("unused")
    public static LayerDefinition createBodyLayer() {
        MeshDefinition meshdefinition = new MeshDefinition();
        PartDefinition partdefinition = meshdefinition.getRoot();

        PartDefinition KnarrMastBanner = partdefinition.addOrReplaceChild("KnarrMastBanner", CubeListBuilder.create(), PartPose.offset(0.5F, -69.0F, 0.0F));

        PartDefinition cloth = KnarrMastBanner.addOrReplaceChild("cloth", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5708F));

        PartDefinition segment_8 = cloth.addOrReplaceChild("segment_8", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 0.0F, 0.0F, 20.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

        PartDefinition segment_9 = segment_8.addOrReplaceChild("segment_9", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 0.0F, 0.0F, 20.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

        PartDefinition segment_10 = segment_9.addOrReplaceChild("segment_10", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 0.0F, 0.0F, 20.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

        PartDefinition segment_11 = segment_10.addOrReplaceChild("segment_11", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 0.0F, 0.0F, 20.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

        PartDefinition segment_12 = segment_11.addOrReplaceChild("segment_12", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 0.0F, 0.0F, 20.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

        PartDefinition segment_13 = segment_12.addOrReplaceChild("segment_13", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 0.0F, 0.0F, 20.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

        PartDefinition segment_14 = segment_13.addOrReplaceChild("segment_14", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 0.0F, 0.0F, 20.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

        PartDefinition segment_15 = segment_14.addOrReplaceChild("segment_15", CubeListBuilder.create().texOffs(0, 0).addBox(-10.0F, 0.0F, 0.0F, 20.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 5.0F, 0.0F));

        return LayerDefinition.create(meshdefinition, 128, 64);
    }
}