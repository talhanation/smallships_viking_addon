package com.talhanation.smallships_viking_addon.client.model;


import com.talhanation.smallships.client.model.ShipModel;
import com.talhanation.smallships_viking_addon.SmallShipsVikingAddonMod;
import com.talhanation.smallships_viking_addon.world.entity.ship.KnarrEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class KnarrModel extends ShipModel<KnarrEntity> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(SmallShipsVikingAddonMod.MOD_ID, KnarrEntity.ID + "_model"), "main");
	private final ModelPart Knarr;
	private final ModelPart deck;
	private final ModelPart cube_r1;
	private final ModelPart bottom;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart sides;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart steer;
	private final ModelPart row;
	private final ModelPart mast_1;
	private final ModelPart cube_r6;
	private final ModelPart BannerStick;
	private final ModelPart mast_oben;
	private final ModelPart chest_1;
	private final ModelPart sack0;
	private final ModelPart chest_4;
	private final ModelPart sack5;
	private final ModelPart chest_2;
	private final ModelPart sack1;
	private final ModelPart sack2;
	private final ModelPart chest_3;
	private final ModelPart sack3;
	private final ModelPart sack4;

	public KnarrModel(ModelPart root) {
		this.Knarr = root.getChild("Knarr");
		this.deck = this.Knarr.getChild("deck");
		this.cube_r1 = this.deck.getChild("cube_r1");
		this.bottom = this.Knarr.getChild("bottom");
		this.cube_r2 = this.bottom.getChild("cube_r2");
		this.cube_r3 = this.bottom.getChild("cube_r3");
		this.sides = this.Knarr.getChild("sides");
		this.cube_r4 = this.sides.getChild("cube_r4");
		this.cube_r5 = this.sides.getChild("cube_r5");
		this.steer = this.Knarr.getChild("steer");
		this.row = this.steer.getChild("row");
		this.mast_1 = this.Knarr.getChild("mast_1");
		this.cube_r6 = this.mast_1.getChild("cube_r6");
		this.BannerStick = this.Knarr.getChild("BannerStick");
		this.mast_oben = this.Knarr.getChild("mast_oben");
		this.chest_1 = this.Knarr.getChild("chest_1");
		this.sack0 = this.chest_1.getChild("sack0");
		this.chest_4 = this.Knarr.getChild("chest_4");
		this.sack5 = this.chest_4.getChild("sack5");
		this.chest_2 = this.Knarr.getChild("chest_2");
		this.sack1 = this.chest_2.getChild("sack1");
		this.sack2 = this.chest_2.getChild("sack2");
		this.chest_3 = this.Knarr.getChild("chest_3");
		this.sack3 = this.chest_3.getChild("sack3");
		this.sack4 = this.chest_3.getChild("sack4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Knarr = partdefinition.addOrReplaceChild("Knarr", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition deck = Knarr.addOrReplaceChild("deck", CubeListBuilder.create(), PartPose.offset(14.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = deck.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(14, 3).addBox(-42.0F, -13.0F, 2.0F, 17.0F, 13.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(-42.0F, 0.0F, 2.0F, 17.0F, 13.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(14, 0).addBox(-25.0F, 0.0F, 2.0F, 14.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(14, 0).addBox(-25.0F, -16.0F, 2.0F, 14.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-11.0F, 0.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-11.0F, -16.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r3_r1 = cube_r1.addOrReplaceChild("cube_r3_r1", CubeListBuilder.create().texOffs(11, 0).addBox(14.25F, 0.0F, 0.75F, 17.0F, 13.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(11, 3).addBox(14.25F, -13.0F, 0.75F, 17.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(48.25F, 0.0F, 1.25F, 0.0F, 0.0F, 3.1416F));

		PartDefinition bottom = Knarr.addOrReplaceChild("bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r2 = bottom.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(4, 1).addBox(-43.0F, 3.0F, -3.0F, 18.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r6_r1 = cube_r2.addOrReplaceChild("cube_r6_r1", CubeListBuilder.create().texOffs(11, 2).addBox(-13.25F, 8.25F, -2.0F, 14.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(30.75F, -1.25F, 0.0F, -3.1416F, 0.0F, 1.5708F));

		PartDefinition cube_r3_r2 = cube_r2.addOrReplaceChild("cube_r3_r2", CubeListBuilder.create().texOffs(4, 1).addBox(-4.25F, 4.25F, -3.0F, 18.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(30.75F, -1.25F, 0.0F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r5_r1 = cube_r2.addOrReplaceChild("cube_r5_r1", CubeListBuilder.create().texOffs(11, 2).addBox(-17.6F, 0.8F, -2.0F, 14.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-46.2F, 4.1F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r5_r2 = cube_r2.addOrReplaceChild("cube_r5_r2", CubeListBuilder.create().texOffs(4, 3).addBox(-9.2F, -5.5F, -2.5F, 12.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.7F, 1.8F, 0.0F, 0.0F, 0.0F, 2.3998F));

		PartDefinition cube_r4_r1 = cube_r2.addOrReplaceChild("cube_r4_r1", CubeListBuilder.create().texOffs(4, 3).addBox(-9.2F, -5.5F, -2.5F, 12.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-43.9F, 5.1F, 0.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r3 = bottom.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 2).addBox(-11.0F, -3.0F, -8.0F, 16.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(12, 2).addBox(5.0F, -3.0F, -8.0F, 12.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(2, 2).addBox(-25.0F, -3.0F, -8.0F, 14.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-25.0F, -12.0F, -3.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(6, 1).addBox(-42.0F, -9.0F, -3.0F, 17.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(-3, 0).addBox(-42.0F, 3.0F, -3.0F, 17.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-25.0F, 2.0F, -3.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(-11.0F, -12.0F, -3.0F, 18.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(14, 0).addBox(7.0F, -12.0F, -3.0F, 10.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(14, 0).addBox(7.0F, 2.0F, -3.0F, 10.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(-11.0F, 2.0F, -3.0F, 18.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r7_r1 = cube_r3.addOrReplaceChild("cube_r7_r1", CubeListBuilder.create().texOffs(6, 1).addBox(14.25F, -9.0F, -4.25F, 17.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(-3, 0).addBox(14.25F, 3.0F, -4.25F, 17.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(48.25F, 0.0F, 1.25F, 0.0F, 0.0F, 3.1416F));

		PartDefinition sides = Knarr.addOrReplaceChild("sides", CubeListBuilder.create().texOffs(18, 36).addBox(-33.0F, -11.0F, -16.0F, 8.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(16, 36).addBox(-43.0F, -11.0F, -13.0F, 10.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(16, 36).addBox(-43.0F, -11.0F, 10.0F, 10.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-26.0F, -11.0F, -19.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 36).addBox(-33.0F, -11.0F, 13.0F, 8.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-26.0F, -11.0F, 16.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(2.0F, -11.0F, -19.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-11.0F, -11.0F, -19.0F, 13.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(2.0F, -11.0F, 16.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-11.0F, -11.0F, 16.0F, 13.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition sides_r1 = sides.addOrReplaceChild("sides_r1", CubeListBuilder.create().texOffs(16, 36).addBox(-4.25F, -9.75F, 10.0F, 10.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(16, 36).addBox(-4.25F, -9.75F, -13.0F, 10.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 36).addBox(5.75F, -9.75F, 13.0F, 8.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 36).addBox(5.75F, -9.75F, -16.0F, 8.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(30.75F, -1.25F, 0.0F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r4 = sides.addOrReplaceChild("cube_r4", CubeListBuilder.create(), PartPose.offsetAndRotation(35.0F, -8.0F, -9.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r5 = sides.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 36).addBox(5.5001F, -3.0F, 22.5F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-7.4999F, -3.0F, 22.5F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 36).addBox(-1.4999F, -3.0F, 25.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 36).addBox(5.5001F, -3.0F, 25.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(3.5001F, 3.0F, 21.5F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 36).addBox(-0.2499F, 3.0F, 24.5F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-7.4999F, 3.0F, 21.5F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-6.4999F, 6.0F, 21.5F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(3.5001F, 6.0F, 21.5F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.5F, -8.0F, -3.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r8_r1 = cube_r5.addOrReplaceChild("cube_r8_r1", CubeListBuilder.create().texOffs(9, 36).addBox(-3.7501F, -3.75F, -11.25F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 36).addBox(1.9999F, -9.75F, -10.25F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 36).addBox(-5.0001F, -9.75F, -10.25F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-0.0001F, -0.75F, -14.25F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-10.0001F, -0.75F, -14.25F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-11.0001F, -3.75F, -14.25F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-0.0001F, -3.75F, -14.25F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-11.0001F, -9.75F, -13.25F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(1.9999F, -9.75F, -13.25F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4997F, 6.75F, -68.75F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition steer = Knarr.addOrReplaceChild("steer", CubeListBuilder.create().texOffs(4, 1).addBox(2.75F, 12.0F, -1.0F, 4.0F, 8.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(4, 1).addBox(0.75F, 9.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(4, 1).addBox(0.75F, -2.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(40.5F, -10.0F, 4.6F));

		PartDefinition row = steer.addOrReplaceChild("row", CubeListBuilder.create(), PartPose.offsetAndRotation(45.0F, -1.0F, -2.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r7 = row.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(9, 0).addBox(-6.0F, -49.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 8.0F, -10.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mast_1 = Knarr.addOrReplaceChild("mast_1", CubeListBuilder.create().texOffs(8, 0).addBox(-3.0F, -15.0F, -0.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-3.0F, -30.0F, -0.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-3.0F, -45.0F, -0.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-3.0F, -60.0F, -0.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-3.0F, -75.0F, -0.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-3.0F, -81.0F, -0.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.0F, -5.0F, -1.0F));

		PartDefinition cube_r6 = mast_1.addOrReplaceChild("cube_r6", CubeListBuilder.create(), PartPose.offsetAndRotation(-47.5F, -15.5F, 1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition BannerStick = Knarr.addOrReplaceChild("BannerStick", CubeListBuilder.create().texOffs(8, 0).addBox(12.0F, -100.0F, -0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, -1.0F, 0.0F));

		PartDefinition mast_oben = Knarr.addOrReplaceChild("mast_oben", CubeListBuilder.create().texOffs(0, 0).addBox(9.0F, -69.0F, -16.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(9.0F, -69.0F, -32.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(9.0F, -69.0F, 0.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(9.0F, -69.0F, 16.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 0.0F, 0.0F));

		PartDefinition chest_1 = Knarr.addOrReplaceChild("chest_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition sack0 = chest_1.addOrReplaceChild("sack0", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.7889F, -3.9F, 0.0556F, 0.1745F, -1.5708F, 0.0F));

		PartDefinition chest_4 = Knarr.addOrReplaceChild("chest_4", CubeListBuilder.create(), PartPose.offset(10.0F, 0.0F, 0.0F));

		PartDefinition sack5 = chest_4.addOrReplaceChild("sack5", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.7889F, -3.9F, 0.0556F, -0.0873F, -1.5708F, 0.0F));

		PartDefinition chest_2 = Knarr.addOrReplaceChild("chest_2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition sack1 = chest_2.addOrReplaceChild("sack1", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(30.6111F, -3.9F, -5.9444F, 0.1745F, -1.5708F, 0.0F));

		PartDefinition sack2 = chest_2.addOrReplaceChild("sack2", CubeListBuilder.create().texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(21.6111F, 0.1F, -9.9444F));

		PartDefinition chest_3 = Knarr.addOrReplaceChild("chest_3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition sack3 = chest_3.addOrReplaceChild("sack3", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-39.3889F, -3.9F, -3.9444F, 0.1309F, 3.1416F, 0.0F));

		PartDefinition sack4 = chest_3.addOrReplaceChild("sack4", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-39.3889F, -3.9F, 4.0556F, -0.0873F, -1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}


	@Override
	public void setupAnim(KnarrEntity knarrEntity, float f, float g, float h, float i, float j) {

		this.chest_1.visible = knarrEntity.getInvFillState() >= 15;
		this.chest_2.visible = knarrEntity.getInvFillState() >= 30;
		this.chest_3.visible = knarrEntity.getInvFillState() >= 60;
		this.chest_4.visible = knarrEntity.getInvFillState() >= 90;

		this.steer.yRot = -knarrEntity.getRotSpeed() * 0.15F;
	}

	@Override
	public @NotNull ModelPart root() {
		return this.Knarr;
	}
}