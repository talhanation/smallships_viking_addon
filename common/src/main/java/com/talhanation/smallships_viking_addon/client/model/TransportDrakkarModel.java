package com.talhanation.smallships_viking_addon.client.model;


import com.talhanation.smallships.client.model.ShipModel;
import com.talhanation.smallships.world.entity.ship.abilities.Paddleable;
import com.talhanation.smallships_viking_addon.SmallShipsVikingAddonMod;
import com.talhanation.smallships_viking_addon.world.entity.ship.TransportDrakkarEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class TransportDrakkarModel extends ShipModel<TransportDrakkarEntity> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(SmallShipsVikingAddonMod.MOD_ID, TransportDrakkarEntity.ID + "_model"), "main");
	private final ModelPart DrakkarTransport;
	private final ModelPart mast_1;
	private final ModelPart deck;
	private final ModelPart cube_r1;
	private final ModelPart bottom;
	private final ModelPart cube_r2;
	private final ModelPart dragon;
	private final ModelPart dragon_tail;
	private final ModelPart cube_r3;
	private final ModelPart sides;
	private final ModelPart cube_r5;
	private final ModelPart row_L_1;
	private final ModelPart row_L_2;
	private final ModelPart row_L_3;
	private final ModelPart row_L_4;
	private final ModelPart row_L_5;
	private final ModelPart row_L_6;
	private final ModelPart row_L_7;
	private final ModelPart row_L_8;
	private final ModelPart row_R_1;
	private final ModelPart row_R_2;
	private final ModelPart row_R_3;
	private final ModelPart row_R_4;
	private final ModelPart row_R_5;
	private final ModelPart row_R_6;
	private final ModelPart row_R_7;
	private final ModelPart row_R_8;
	private final ModelPart steer;
	private final ModelPart row;
	private final ModelPart chest_1;
	private final ModelPart sack1;
	private final ModelPart sack7;
	private final ModelPart sack9;
	private final ModelPart sack2;
	private final ModelPart chest_2;
	private final ModelPart sack0;
	private final ModelPart sack5;
	private final ModelPart sack10;
	private final ModelPart sack11;
	private final ModelPart chest_3;
	private final ModelPart sack3;
	private final ModelPart sack4;
	private final ModelPart sack12;
	private final ModelPart sack6;
	private final ModelPart sack13;
	private final ModelPart chest_4;
	private final ModelPart sack8;
	private final ModelPart sack14;
	private final ModelPart sack15;

	public TransportDrakkarModel(ModelPart root) {
		this.DrakkarTransport = root.getChild("DrakkarTransport");
		this.mast_1 = this.DrakkarTransport.getChild("mast_1");
		this.deck = this.DrakkarTransport.getChild("deck");
		this.cube_r1 = this.deck.getChild("cube_r1");
		this.bottom = this.DrakkarTransport.getChild("bottom");
		this.cube_r2 = this.bottom.getChild("cube_r2");
		this.dragon = this.cube_r2.getChild("dragon");
		this.dragon_tail = this.cube_r2.getChild("dragon_tail");
		this.cube_r3 = this.bottom.getChild("cube_r3");
		this.sides = this.DrakkarTransport.getChild("sides");
		this.cube_r5 = this.sides.getChild("cube_r5");
		this.row_L_1 = this.DrakkarTransport.getChild("row_L_1");
		this.row_L_2 = this.DrakkarTransport.getChild("row_L_2");
		this.row_L_3 = this.DrakkarTransport.getChild("row_L_3");
		this.row_L_4 = this.DrakkarTransport.getChild("row_L_4");
		this.row_L_5 = this.DrakkarTransport.getChild("row_L_5");
		this.row_L_6 = this.DrakkarTransport.getChild("row_L_6");
		this.row_L_7 = this.DrakkarTransport.getChild("row_L_7");
		this.row_L_8 = this.DrakkarTransport.getChild("row_L_8");
		this.row_R_1 = this.DrakkarTransport.getChild("row_R_1");
		this.row_R_2 = this.DrakkarTransport.getChild("row_R_2");
		this.row_R_3 = this.DrakkarTransport.getChild("row_R_3");
		this.row_R_4 = this.DrakkarTransport.getChild("row_R_4");
		this.row_R_5 = this.DrakkarTransport.getChild("row_R_5");
		this.row_R_6 = this.DrakkarTransport.getChild("row_R_6");
		this.row_R_7 = this.DrakkarTransport.getChild("row_R_7");
		this.row_R_8 = this.DrakkarTransport.getChild("row_R_8");
		this.steer = this.DrakkarTransport.getChild("steer");
		this.row = this.steer.getChild("row");
		this.chest_1 = this.DrakkarTransport.getChild("chest_1");
		this.sack1 = this.chest_1.getChild("sack1");
		this.sack7 = this.chest_1.getChild("sack7");
		this.sack9 = this.chest_1.getChild("sack9");
		this.sack2 = this.chest_1.getChild("sack2");
		this.chest_2 = this.DrakkarTransport.getChild("chest_2");
		this.sack0 = this.chest_2.getChild("sack0");
		this.sack5 = this.chest_2.getChild("sack5");
		this.sack10 = this.chest_2.getChild("sack10");
		this.sack11 = this.chest_2.getChild("sack11");
		this.chest_3 = this.DrakkarTransport.getChild("chest_3");
		this.sack3 = this.chest_3.getChild("sack3");
		this.sack4 = this.chest_3.getChild("sack4");
		this.sack12 = this.chest_3.getChild("sack12");
		this.sack6 = this.chest_3.getChild("sack6");
		this.sack13 = this.chest_3.getChild("sack13");
		this.chest_4 = this.DrakkarTransport.getChild("chest_4");
		this.sack8 = this.chest_4.getChild("sack8");
		this.sack14 = this.chest_4.getChild("sack14");
		this.sack15 = this.chest_4.getChild("sack15");
	}


	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition DrakkarTransport = partdefinition.addOrReplaceChild("DrakkarTransport", CubeListBuilder.create(), PartPose.offset(0.0F, 25.3429F, 0.0F));

		PartDefinition mast_1 = DrakkarTransport.addOrReplaceChild("mast_1", CubeListBuilder.create().texOffs(8, 0).addBox(-19.0F, -15.0F, -0.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-19.0F, -30.0F, -0.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-19.0F, -45.0F, -0.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-19.0F, -60.0F, -0.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-19.0F, -80.0F, -0.5F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-19.0F, -96.0F, -0.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-18.0F, -114.0F, 0.5F, 1.0F, 18.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-21.0F, -84.0F, 19.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(2, 2).addBox(-21.0F, -84.0F, 35.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F))
				.texOffs(12, 12).addBox(-21.0F, -84.0F, -1.0F, 2.0F, 2.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-21.0F, -84.0F, 3.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-21.0F, -84.0F, -17.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-21.0F, -84.0F, -33.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(2, 2).addBox(-21.0F, -84.0F, -47.0F, 2.0F, 2.0F, 14.0F, new CubeDeformation(0.0F)), PartPose.offset(12.119F, -6.3429F, -1.1714F));

		PartDefinition deck = DrakkarTransport.addOrReplaceChild("deck", CubeListBuilder.create(), PartPose.offset(22.1191F, -1.3429F, -2.1714F));

		PartDefinition cube_r1 = deck.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(14, 3).addBox(-70.0F, -19.0F, 2.0F, 14.0F, 13.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 1).addBox(-82.0F, -16.0F, 2.0F, 12.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(14, 0).addBox(-70.0F, 10.0F, 2.0F, 14.0F, 13.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(2, 0).addBox(-82.0F, 10.0F, 2.0F, 12.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-56.0F, 10.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-56.0F, -22.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-56.0F, -6.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-84.0F, -6.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(26, 3).addBox(28.0F, -19.0F, 2.0F, 15.0F, 13.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(15, 6).addBox(43.0F, -16.0F, 2.0F, 13.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(28.0F, -6.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(26, 0).addBox(28.0F, 10.0F, 2.0F, 15.0F, 13.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(15, 0).addBox(43.0F, 10.0F, 2.0F, 13.0F, 10.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, 10.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -22.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(0.0F, -6.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-28.0F, 10.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-28.0F, -22.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-28.0F, -6.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition bottom = DrakkarTransport.addOrReplaceChild("bottom", CubeListBuilder.create(), PartPose.offset(8.119F, -1.3429F, -2.1714F));

		PartDefinition cube_r2 = bottom.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(8, 2).addBox(-70.0F, 5.0F, 6.0F, 14.0F, 7.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r5_r1 = cube_r2.addOrReplaceChild("cube_r5_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-7.2F, -3.5F, -7.5F, 10.0F, 7.0F, 11.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(54.0F, 11.4F, -0.1F, 3.1416F, 0.0F, 2.4871F));

		PartDefinition cube_r5_r2 = cube_r2.addOrReplaceChild("cube_r5_r2", CubeListBuilder.create().texOffs(6, 7).addBox(-13.2F, -3.5F, -5.5F, 16.0F, 7.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-13.2F, -3.5F, -14.5F, 16.0F, 7.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-77.5F, 11.4F, 11.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition dragon = cube_r2.addOrReplaceChild("dragon", CubeListBuilder.create(), PartPose.offset(-65.7F, 7.6F, 1.0F));

		PartDefinition cube_r11_r1 = dragon.addOrReplaceChild("cube_r11_r1", CubeListBuilder.create().texOffs(14, 3).addBox(-0.5F, -3.5F, -4.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(14, 3).addBox(-0.5F, -3.5F, 3.0F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.8027F, -50.664F, -0.5F, 0.0F, 0.0F, 2.7489F));

		PartDefinition cube_r9_r1 = dragon.addOrReplaceChild("cube_r9_r1", CubeListBuilder.create().texOffs(7, 0).addBox(-4.5F, -3.5F, -4.0F, 9.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-18.3027F, -39.364F, 1.5F, 0.0F, 0.0F, 1.6144F));

		PartDefinition cube_r8_r1 = dragon.addOrReplaceChild("cube_r8_r1", CubeListBuilder.create().texOffs(6, 0).addBox(2.15F, -12.425F, -5.5F, 8.0F, 7.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-30.6F, -42.8F, 1.6F, 0.0F, 0.0F, 0.829F));

		PartDefinition cube_r10_r1 = dragon.addOrReplaceChild("cube_r10_r1", CubeListBuilder.create().texOffs(9, 4).addBox(-1.0F, 3.0F, -1.5F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 4).addBox(-1.0F, 3.0F, 2.9F, 2.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.8739F, -41.0036F, -1.1F, 0.0F, 0.0F, 1.2217F));

		PartDefinition cube_r8_r2 = dragon.addOrReplaceChild("cube_r8_r2", CubeListBuilder.create().texOffs(5, 1).addBox(-1.0F, -6.0F, -4.5F, 2.0F, 10.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.8739F, -40.4036F, 1.6F, 0.0F, 0.0F, 1.2217F));

		PartDefinition cube_r9_r2 = dragon.addOrReplaceChild("cube_r9_r2", CubeListBuilder.create().texOffs(9, 4).addBox(-2.5F, 5.0F, -1.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 4).addBox(-2.5F, 5.0F, 4.0F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.2228F, -42.873F, -1.8F, 0.0F, 0.0F, 1.5272F));

		PartDefinition cube_r7_r1 = dragon.addOrReplaceChild("cube_r7_r1", CubeListBuilder.create().texOffs(6, 0).addBox(-2.5F, -6.0F, -5.5F, 3.0F, 12.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.4228F, -43.673F, 2.0F, 0.0F, 0.0F, 1.5272F));

		PartDefinition cube_r9_r3 = dragon.addOrReplaceChild("cube_r9_r3", CubeListBuilder.create().texOffs(4, 1).addBox(-2.85F, -17.425F, -5.5F, 7.0F, 23.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-24.8F, -19.9F, 2.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r8_r3 = dragon.addOrReplaceChild("cube_r8_r3", CubeListBuilder.create().texOffs(3, 0).addBox(-2.85F, -13.425F, -5.5F, 7.0F, 15.0F, 9.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-22.1F, -4.0F, 2.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r6_r1 = dragon.addOrReplaceChild("cube_r6_r1", CubeListBuilder.create().texOffs(1, 1).addBox(-26.6F, 1.8F, -5.0F, 25.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(1, 1).addBox(-26.6F, 1.8F, 0.0F, 25.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition dragon_tail = cube_r2.addOrReplaceChild("dragon_tail", CubeListBuilder.create(), PartPose.offsetAndRotation(38.0F, 7.5F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r11_r2 = dragon_tail.addOrReplaceChild("cube_r11_r2", CubeListBuilder.create().texOffs(11, 4).addBox(0.1941F, 12.3103F, -10.5F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 3).addBox(0.1941F, 12.3103F, -7.5F, 9.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8027F, -39.364F, 5.0F, 0.0F, 0.0F, 1.6144F));

		PartDefinition cube_r12_r1 = dragon_tail.addOrReplaceChild("cube_r12_r1", CubeListBuilder.create().texOffs(17, 5).addBox(-14.4136F, -13.2586F, -11.0F, 4.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.8711F, -43.654F, 8.0F, 0.0F, 0.0F, -0.9163F));

		PartDefinition cube_r11_r3 = dragon_tail.addOrReplaceChild("cube_r11_r3", CubeListBuilder.create().texOffs(15, 4).addBox(-18.9032F, -4.7135F, -11.0F, 5.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-7.3711F, -45.554F, 7.5F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r10_r2 = dragon_tail.addOrReplaceChild("cube_r10_r2", CubeListBuilder.create().texOffs(14, 3).addBox(-15.7513F, 6.8185F, -12.0F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9711F, -45.554F, 8.0F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r9_r4 = dragon_tail.addOrReplaceChild("cube_r9_r4", CubeListBuilder.create().texOffs(13, 2).addBox(-2.7103F, 2.0738F, -12.0F, 5.0F, 6.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.1F, -42.8F, 7.5F, 0.0F, 0.0F, 0.829F));

		PartDefinition cube_r11_r4 = dragon_tail.addOrReplaceChild("cube_r11_r4", CubeListBuilder.create().texOffs(7, 3).addBox(-15.517F, -8.1939F, -12.0F, 6.0F, 19.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(7, 3).addBox(-15.517F, -8.1939F, -8.0F, 6.0F, 19.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.3F, -19.9F, 6.0F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r10_r3 = dragon_tail.addOrReplaceChild("cube_r10_r3", CubeListBuilder.create().texOffs(7, 3).addBox(-18.2532F, -11.1385F, -11.0F, 6.0F, 11.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(6, 2).addBox(-18.2532F, -11.1385F, -7.0F, 6.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, -10.8F, 4.6F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r7_r2 = dragon_tail.addOrReplaceChild("cube_r7_r2", CubeListBuilder.create().texOffs(2, 2).addBox(-22.6F, 16.8F, -10.5F, 25.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-22.6F, 16.8F, -6.5F, 25.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 3.5F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r3 = bottom.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 0).addBox(32.0F, -4.0F, -15.9F, 22.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(32.0F, 4.0F, -15.9F, 22.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(10.0F, 4.0F, -15.9F, 22.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(10.0F, -4.0F, -15.9F, 22.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-12.0F, -4.0F, -15.9F, 22.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-12.0F, 4.0F, -15.9F, 22.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-34.0F, 4.0F, -15.9F, 22.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-34.0F, -4.0F, -15.9F, 22.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-56.0F, -4.0F, -15.9F, 22.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-56.0F, 4.0F, -15.9F, 22.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-78.0F, 4.0F, -15.9F, 22.0F, 4.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-78.0F, -4.0F, -15.9F, 22.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-6.0F, 6.0F, -12.0F, 22.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(28.0F, 3.0F, -12.0F, 14.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-28.0F, 6.0F, -12.0F, 22.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-42.0F, 6.0F, -12.0F, 14.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-56.0F, 6.0F, -12.0F, 14.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(13, 3).addBox(28.0F, -7.0F, -12.0F, 15.0F, 7.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(15, 3).addBox(18.0F, -10.0F, -12.0F, 10.0F, 8.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-6.0F, -10.0F, -12.0F, 24.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-28.0F, -10.0F, -12.0F, 22.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-42.0F, -10.0F, -12.0F, 14.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-56.0F, -10.0F, -12.0F, 14.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-70.0F, -10.0F, -12.0F, 14.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(10, 3).addBox(-77.0F, -7.0F, -12.0F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(10, 3).addBox(-77.0F, 6.0F, -12.0F, 7.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-28.0F, 12.0F, -3.0F, 22.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-28.0F, -18.0F, -3.0F, 22.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-42.0F, -18.0F, -3.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-56.0F, -18.0F, -3.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-42.0F, 12.0F, -3.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-56.0F, 12.0F, -3.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-82.0F, -15.0F, -3.0F, 12.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-70.0F, 12.0F, -3.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-6.0F, -18.0F, -3.0F, 24.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(18.0F, -18.0F, -3.0F, 10.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(28.0F, -15.0F, -3.0F, 15.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-6.0F, 12.0F, -3.0F, 22.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(28.0F, 9.0F, -3.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-70.0F, 8.0F, -8.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(1, 0).addBox(-82.0F, 9.0F, -3.0F, 12.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(1, 0).addBox(-82.0F, 5.0F, -8.0F, 12.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-42.0F, 8.0F, -8.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-56.0F, 8.0F, -8.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-28.0F, 8.0F, -8.0F, 22.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-6.0F, 8.0F, -8.0F, 22.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(28.0F, 5.0F, -8.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(12, 0).addBox(16.0F, 12.0F, -3.0F, 12.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(16.0F, 6.0F, -12.0F, 12.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(12, 0).addBox(16.0F, 8.0F, -8.0F, 12.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(42.0F, 4.0F, -3.0F, 14.0F, 12.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(42.0F, 2.0F, -8.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(42.0F, 3.0F, -12.0F, 13.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(28.0F, -11.0F, -8.0F, 15.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(11, 0).addBox(43.0F, -7.0F, -12.0F, 12.0F, 8.0F, 7.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(43.0F, -8.0F, -8.0F, 13.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(10, 0).addBox(43.0F, -12.0F, -3.0F, 13.0F, 12.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-6.0F, -14.0F, -8.0F, 18.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(2, 0).addBox(12.0F, -14.0F, -8.0F, 16.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-28.0F, -14.0F, -8.0F, 22.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-42.0F, -14.0F, -8.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-56.0F, -14.0F, -8.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-82.0F, -11.0F, -8.0F, 12.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-70.0F, -14.0F, -8.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-70.0F, -18.0F, -3.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition sides = DrakkarTransport.addOrReplaceChild("sides", CubeListBuilder.create().texOffs(8, 36).addBox(-70.0F, -11.0F, -22.0F, 14.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 36).addBox(-84.0F, -11.0F, -19.0F, 14.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(3, 36).addBox(-48.0F, -11.0F, -25.0F, 20.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(15, 36).addBox(-56.0F, -11.0F, -25.0F, 8.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(7, 36).addBox(-70.0F, -11.0F, 23.0F, 14.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(7, 36).addBox(-84.0F, -11.0F, 20.0F, 14.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(3, 36).addBox(-48.0F, -11.0F, 26.0F, 20.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(3, 36).addBox(-56.0F, -11.0F, 26.0F, 8.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(28.0F, -11.0F, -22.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(43.0F, -11.0F, -19.0F, 13.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(13.0F, -11.0F, -25.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-2.0F, -11.0F, -25.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-28.0F, -11.0F, -25.0F, 11.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-17.0F, -11.0F, -25.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(28.0F, -11.0F, 23.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(43.0F, -11.0F, 20.0F, 13.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(13.0F, -11.0F, 26.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-2.0F, -11.0F, 26.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-17.0F, -11.0F, 26.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-28.0F, -11.0F, 26.0F, 11.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(8.119F, -1.3429F, -2.1714F));

		PartDefinition cube_r5 = sides.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(9, 36).addBox(13.5002F, 3.0F, 61.5F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 36).addBox(10.5002F, 3.0F, 63.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 36).addBox(-2.4998F, 3.0F, 63.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(6, 36).addBox(7.5002F, 6.0F, 61.5F, 14.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(9.5002F, 9.0F, 61.5F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(9.5002F, 12.0F, 61.5F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(12, 36).addBox(-5.4998F, 12.0F, 61.5F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(12, 36).addBox(-5.4998F, 9.0F, 61.5F, 6.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(12, 36).addBox(-11.4998F, 6.0F, 61.5F, 12.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(12, 36).addBox(-12.4998F, 3.0F, 61.5F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(12, 36).addBox(-12.4998F, -3.0F, 63.5F, 13.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(10.5002F, -3.0F, 63.5F, 13.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-12.5003F, -3.0F, -79.5F, 20.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(3.4997F, -3.0F, -79.5F, 20.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.5F, -8.0F, -3.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition row_L_1 = DrakkarTransport.addOrReplaceChild("row_L_1", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -0.5F, -28.0F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(43.6191F, -13.3429F, -23.1714F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r4 = row_L_1.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 18.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, 1.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 9.0F, -23.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_L_2 = DrakkarTransport.addOrReplaceChild("row_L_2", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -0.5F, -28.0F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(28.6191F, -13.3429F, -26.1714F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r6 = row_L_2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 19.0F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, 2.0F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 9.0F, -23.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_L_3 = DrakkarTransport.addOrReplaceChild("row_L_3", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -0.5F, -28.0F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.619F, -13.3429F, -26.1714F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r7 = row_L_3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 18.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, 1.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 9.0F, -23.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_L_4 = DrakkarTransport.addOrReplaceChild("row_L_4", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -0.5F, -28.0F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.381F, -13.3429F, -26.1714F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r8 = row_L_4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 18.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, 1.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 9.0F, -23.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_L_5 = DrakkarTransport.addOrReplaceChild("row_L_5", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -0.5F, -28.0F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.381F, -13.3429F, -26.1714F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r9 = row_L_5.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 18.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, 1.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 9.0F, -23.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_L_6 = DrakkarTransport.addOrReplaceChild("row_L_6", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -0.5F, -28.0F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.3809F, -13.3429F, -26.1714F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r10 = row_L_6.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 18.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, 1.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 9.0F, -23.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_L_7 = DrakkarTransport.addOrReplaceChild("row_L_7", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -0.5F, -28.0F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-43.3809F, -13.3429F, -26.1714F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r11 = row_L_7.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 18.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, 1.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 9.0F, -23.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_L_8 = DrakkarTransport.addOrReplaceChild("row_L_8", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -0.5F, -28.0F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.3809F, -13.3429F, -23.1714F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r12 = row_L_8.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 18.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, 1.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 9.0F, -23.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_R_1 = DrakkarTransport.addOrReplaceChild("row_R_1", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -2.0176F, 17.9319F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(43.6191F, -15.4429F, 22.8286F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r13 = row_R_1.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(9, 0).addBox(2.0F, 13.6704F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(2.0F, -3.3296F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-2.5F, 6.1883F, -9.2385F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_R_2 = DrakkarTransport.addOrReplaceChild("row_R_2", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -2.0176F, 17.9319F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(28.6191F, -15.4429F, 25.8286F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r14 = row_R_2.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 13.6704F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, -3.3296F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 6.1883F, -9.2385F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_R_3 = DrakkarTransport.addOrReplaceChild("row_R_3", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -2.0176F, 17.9319F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.619F, -15.4429F, 25.8286F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r15 = row_R_3.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 13.6704F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, -3.3296F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 6.1883F, -9.2385F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_R_4 = DrakkarTransport.addOrReplaceChild("row_R_4", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -2.0176F, 17.9319F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.381F, -15.4429F, 25.8286F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r16 = row_R_4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 13.6704F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, -3.3296F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 6.1883F, -9.2385F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_R_5 = DrakkarTransport.addOrReplaceChild("row_R_5", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -2.0176F, 17.9319F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.381F, -15.4429F, 25.8286F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r17 = row_R_5.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 13.6704F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, -3.3296F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 6.1883F, -9.2385F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_R_6 = DrakkarTransport.addOrReplaceChild("row_R_6", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -2.0176F, 17.9319F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.3809F, -15.4429F, 25.8286F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r18 = row_R_6.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 13.6704F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, -3.3296F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 6.1883F, -9.2385F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_R_7 = DrakkarTransport.addOrReplaceChild("row_R_7", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -2.0176F, 17.9319F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-43.3809F, -15.4429F, 25.8286F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r19 = row_R_7.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 13.6704F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, -3.3296F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 6.1883F, -9.2385F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_R_8 = DrakkarTransport.addOrReplaceChild("row_R_8", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -2.0176F, 17.9319F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-57.3809F, -15.4429F, 22.8286F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r20 = row_R_8.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(9, 0).addBox(4.0F, 13.6704F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(4.0F, -3.3296F, 6.7059F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.5F, 6.1883F, -9.2385F, 1.5708F, 0.0F, 0.0F));

		PartDefinition steer = DrakkarTransport.addOrReplaceChild("steer", CubeListBuilder.create().texOffs(4, 1).addBox(4.75F, 12.0F, -1.0F, 8.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(4, 1).addBox(0.75F, 9.0F, -1.0F, 4.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(4, 1).addBox(0.75F, -2.0F, -1.0F, 4.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(67.6191F, -11.3429F, 10.4286F));

		PartDefinition row = steer.addOrReplaceChild("row", CubeListBuilder.create(), PartPose.offsetAndRotation(45.0F, -1.0F, -2.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r21 = row.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(9, 0).addBox(-6.0F, -50.5F, 8.0F, 1.0F, 18.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 8.0F, -10.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_1 = DrakkarTransport.addOrReplaceChild("chest_1", CubeListBuilder.create(), PartPose.offset(29.0F, -1.3429F, -8.0F));

		PartDefinition sack1 = chest_1.addOrReplaceChild("sack1", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(31.3111F, -3.9F, -5.9444F, 0.0873F, -1.5708F, 0.0F));

		PartDefinition sack7 = chest_1.addOrReplaceChild("sack7", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.3111F, -1.9F, -5.9444F, 0.0F, -1.5708F, 0.0F));

		PartDefinition sack9 = chest_1.addOrReplaceChild("sack9", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(31.3111F, -1.9F, 1.0556F, 0.0F, -1.5708F, 0.0F));

		PartDefinition sack2 = chest_1.addOrReplaceChild("sack2", CubeListBuilder.create().texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(31.6111F, 1.1F, 7.0556F));

		PartDefinition chest_2 = DrakkarTransport.addOrReplaceChild("chest_2", CubeListBuilder.create(), PartPose.offset(4.0F, -1.3429F, 0.0F));

		PartDefinition sack0 = chest_2.addOrReplaceChild("sack0", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.7889F, -2.9F, 0.0556F, 0.1745F, -1.5708F, 0.0F));

		PartDefinition sack5 = chest_2.addOrReplaceChild("sack5", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9889F, -3.9F, 0.0556F, -0.0873F, -1.5708F, 0.0F));

		PartDefinition sack10 = chest_2.addOrReplaceChild("sack10", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.9889F, -1.9F, -3.9444F, -0.0873F, 0.0F, 0.0F));

		PartDefinition sack11 = chest_2.addOrReplaceChild("sack11", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-9.9889F, -0.9F, 5.0556F, 0.0873F, 0.0F, 0.0F));

		PartDefinition chest_3 = DrakkarTransport.addOrReplaceChild("chest_3", CubeListBuilder.create(), PartPose.offset(-33.0F, -1.3429F, 2.6F));

		PartDefinition sack3 = chest_3.addOrReplaceChild("sack3", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-39.3889F, -3.9F, -1.9444F, 0.1309F, 3.1416F, 0.0F));

		PartDefinition sack4 = chest_3.addOrReplaceChild("sack4", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-39.3889F, -3.9F, 6.0556F, -0.0873F, -1.5708F, 0.0F));

		PartDefinition sack12 = chest_3.addOrReplaceChild("sack12", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-39.0889F, -3.9F, 12.4556F, 0.0873F, 0.0F, 0.0F));

		PartDefinition sack6 = chest_3.addOrReplaceChild("sack6", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-39.0889F, -3.9F, -9.7444F, 0.0873F, 0.0F, 0.0F));

		PartDefinition sack13 = chest_3.addOrReplaceChild("sack13", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-39.8889F, -3.9F, -16.9444F, 0.0F, -1.5708F, 0.0F));

		PartDefinition chest_4 = DrakkarTransport.addOrReplaceChild("chest_4", CubeListBuilder.create(), PartPose.offset(-11.0F, -1.3429F, 2.6F));

		PartDefinition sack8 = chest_4.addOrReplaceChild("sack8", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-54.3889F, -2.9F, -15.9444F, 0.1309F, 1.5708F, 0.0F));

		PartDefinition sack14 = chest_4.addOrReplaceChild("sack14", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-54.3889F, -2.9F, 11.0556F, 0.1309F, 1.5708F, 0.0F));

		PartDefinition sack15 = chest_4.addOrReplaceChild("sack15", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-55.3889F, -2.9F, 3.0556F, 0.1309F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(TransportDrakkarEntity transportDrakkarEntity, float f, float g, float h, float i, float j) {

		this.chest_1.visible = transportDrakkarEntity.getInvFillState() >= 15;
		this.chest_2.visible = transportDrakkarEntity.getInvFillState() >= 30;
		this.chest_3.visible = transportDrakkarEntity.getInvFillState() >= 60;
		this.chest_4.visible = transportDrakkarEntity.getInvFillState() >= 90;

		this.steer.yRot = -transportDrakkarEntity.getRotSpeed() * 0.15F;

		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.LEFT, this.row_L_1 , f);
		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.LEFT, this.row_L_2 , f);
		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.LEFT, this.row_L_3 , f);
		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.LEFT, this.row_L_4 , f);
		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.LEFT, this.row_L_5 , f);
		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.LEFT, this.row_L_6 , f);
		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.LEFT, this.row_L_7 , f);
		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.LEFT, this.row_L_8 , f);

		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.RIGHT, this.row_R_1 , f);
		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.RIGHT, this.row_R_2 , f);
		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.RIGHT, this.row_R_3 , f);
		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.RIGHT, this.row_R_4 , f);
		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.RIGHT, this.row_R_5 , f);
		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.RIGHT, this.row_R_6 , f);
		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.RIGHT, this.row_R_7 , f);
		transportDrakkarEntity.animatePaddle(Paddleable.PaddleSide.RIGHT, this.row_R_8 , f);
	}

	@Override
	public @NotNull ModelPart root() {
		return this.DrakkarTransport;
	}
}