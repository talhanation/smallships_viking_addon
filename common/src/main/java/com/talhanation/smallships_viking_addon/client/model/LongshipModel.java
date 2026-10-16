package com.talhanation.smallships_viking_addon.client.model;


import com.talhanation.smallships.client.model.ShipModel;
import com.talhanation.smallships.world.entity.ship.abilities.Paddleable;
import com.talhanation.smallships_viking_addon.SmallShipsVikingAddonMod;
import com.talhanation.smallships_viking_addon.world.entity.ship.LongshipEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class LongshipModel extends ShipModel<LongshipEntity> {
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath(SmallShipsVikingAddonMod.MOD_ID, LongshipEntity.ID + "_model"), "main");
	private final ModelPart Longship;
	private final ModelPart deck;
	private final ModelPart cube_r1;
	private final ModelPart bottom;
	private final ModelPart cube_r2;
	private final ModelPart cube_r3;
	private final ModelPart dragon_tail;
	private final ModelPart dragon_tail2;
	private final ModelPart sides;
	private final ModelPart cube_r4;
	private final ModelPart cube_r5;
	private final ModelPart steer;
	private final ModelPart row;
	private final ModelPart mast_1;
	private final ModelPart cube_r6;
	private final ModelPart row_L_1;
	private final ModelPart row_L_2;
	private final ModelPart row_L_3;
	private final ModelPart row_L_6;
	private final ModelPart row_L_4;
	private final ModelPart row_L_5;
	private final ModelPart row_R_1;
	private final ModelPart row_R_2;
	private final ModelPart row_R_3;
	private final ModelPart row_R_4;
	private final ModelPart row_R_5;
	private final ModelPart row_R_6;
	private final ModelPart chest_1;
	private final ModelPart sack1;
	private final ModelPart sack7;
	private final ModelPart sack2;
	private final ModelPart chest_2;
	private final ModelPart sack5;
	private final ModelPart sack0;
	private final ModelPart chest_3;
	private final ModelPart sack3;
	private final ModelPart sack4;
	private final ModelPart sack6;
	private final ModelPart chest_4;
	private final ModelPart sack8;

	public LongshipModel(ModelPart root) {
		this.Longship = root.getChild("Longship");
		this.deck = this.Longship.getChild("deck");
		this.cube_r1 = this.deck.getChild("cube_r1");
		this.bottom = this.Longship.getChild("bottom");
		this.cube_r2 = this.bottom.getChild("cube_r2");
		this.cube_r3 = this.bottom.getChild("cube_r3");
		this.dragon_tail = this.bottom.getChild("dragon_tail");
		this.dragon_tail2 = this.bottom.getChild("dragon_tail2");
		this.sides = this.Longship.getChild("sides");
		this.cube_r4 = this.sides.getChild("cube_r4");
		this.cube_r5 = this.sides.getChild("cube_r5");
		this.steer = this.Longship.getChild("steer");
		this.row = this.steer.getChild("row");
		this.mast_1 = this.Longship.getChild("mast_1");
		this.cube_r6 = this.mast_1.getChild("cube_r6");
		this.row_L_1 = this.Longship.getChild("row_L_1");
		this.row_L_2 = this.Longship.getChild("row_L_2");
		this.row_L_3 = this.Longship.getChild("row_L_3");
		this.row_L_6 = this.Longship.getChild("row_L_6");
		this.row_L_4 = this.Longship.getChild("row_L_4");
		this.row_L_5 = this.Longship.getChild("row_L_5");
		this.row_R_1 = this.Longship.getChild("row_R_1");
		this.row_R_2 = this.Longship.getChild("row_R_2");
		this.row_R_3 = this.Longship.getChild("row_R_3");
		this.row_R_4 = this.Longship.getChild("row_R_4");
		this.row_R_5 = this.Longship.getChild("row_R_5");
		this.row_R_6 = this.Longship.getChild("row_R_6");
		this.chest_1 = this.Longship.getChild("chest_1");
		this.sack1 = this.chest_1.getChild("sack1");
		this.sack7 = this.chest_1.getChild("sack7");
		this.sack2 = this.chest_1.getChild("sack2");
		this.chest_2 = this.Longship.getChild("chest_2");
		this.sack5 = this.chest_2.getChild("sack5");
		this.sack0 = this.chest_2.getChild("sack0");
		this.chest_3 = this.Longship.getChild("chest_3");
		this.sack3 = this.chest_3.getChild("sack3");
		this.sack4 = this.chest_3.getChild("sack4");
		this.sack6 = this.chest_3.getChild("sack6");
		this.chest_4 = this.Longship.getChild("chest_4");
		this.sack8 = this.chest_4.getChild("sack8");
	}



	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Longship = partdefinition.addOrReplaceChild("Longship", CubeListBuilder.create(), PartPose.offset(24.0F, 24.0F, 0.0F));

		PartDefinition deck = Longship.addOrReplaceChild("deck", CubeListBuilder.create(), PartPose.offset(14.0F, 0.0F, 0.0F));

		PartDefinition cube_r1 = deck.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(22, 0).addBox(-84.0F, -13.0F, 2.0F, 17.0F, 13.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(21, 0).addBox(-84.0F, 0.0F, 2.0F, 17.0F, 13.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-11.0F, 0.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-11.0F, -16.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-39.0F, -16.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-39.0F, 0.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-67.0F, -16.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-67.0F, 0.0F, 2.0F, 28.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r3_r1 = cube_r1.addOrReplaceChild("cube_r3_r1", CubeListBuilder.create().texOffs(21, 0).addBox(14.25F, 0.0F, 0.75F, 17.0F, 13.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(22, 0).addBox(14.25F, -13.0F, 0.75F, 17.0F, 13.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(48.25F, 0.0F, 1.25F, 0.0F, 0.0F, 3.1416F));

		PartDefinition bottom = Longship.addOrReplaceChild("bottom", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r8_r1 = bottom.addOrReplaceChild("cube_r8_r1", CubeListBuilder.create().texOffs(15, 6).addBox(-6.6F, 0.8F, -2.0F, 5.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-86.3F, -11.8F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r8_r2 = bottom.addOrReplaceChild("cube_r8_r2", CubeListBuilder.create().texOffs(4, 4).addBox(-15.6F, 0.8F, -2.0F, 12.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-83.55F, 6.4F, -1.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r7_r1 = bottom.addOrReplaceChild("cube_r7_r1", CubeListBuilder.create().texOffs(5, 1).addBox(-15.6F, 0.8F, -2.0F, 14.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-86.3F, 2.2F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r2 = bottom.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(4, 1).addBox(-85.0F, 3.0F, -3.0F, 18.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r3_r2 = cube_r2.addOrReplaceChild("cube_r3_r2", CubeListBuilder.create().texOffs(4, 1).addBox(-4.25F, 4.25F, -3.0F, 18.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(30.75F, -1.25F, 0.0F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r5_r1 = cube_r2.addOrReplaceChild("cube_r5_r1", CubeListBuilder.create().texOffs(4, 3).addBox(-9.2F, -5.5F, -2.5F, 12.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(32.7F, 1.8F, 0.0F, 0.0F, 0.0F, 2.3998F));

		PartDefinition cube_r4_r1 = cube_r2.addOrReplaceChild("cube_r4_r1", CubeListBuilder.create().texOffs(4, 3).addBox(-9.2F, -5.5F, -2.5F, 12.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-85.9F, 5.1F, 0.0F, 0.0F, 0.0F, 0.6545F));

		PartDefinition cube_r3 = bottom.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(8, 2).addBox(-11.0F, -3.0F, -8.0F, 16.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(12, 2).addBox(5.0F, -3.0F, -8.0F, 12.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(2, 2).addBox(-25.0F, -3.0F, -8.0F, 14.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-25.0F, -12.0F, -3.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(6, 1).addBox(-84.0F, -9.0F, -3.0F, 17.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(-3, 0).addBox(-84.0F, 3.0F, -3.0F, 17.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-25.0F, 2.0F, -3.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(6, 2).addBox(-35.0F, -3.0F, -8.0F, 10.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(6, 2).addBox(-53.0F, -3.0F, -8.0F, 18.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(9, 2).addBox(-67.0F, -3.0F, -8.0F, 14.0F, 6.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(-2, 0).addBox(-41.0F, 2.0F, -3.0F, 16.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(-2, 0).addBox(-41.0F, -12.0F, -3.0F, 16.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-54.0F, 2.0F, -3.0F, 13.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-67.0F, 2.0F, -3.0F, 13.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-67.0F, -13.0F, -3.0F, 14.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(2, 0).addBox(-53.0F, -12.0F, -3.0F, 12.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(-11.0F, -12.0F, -3.0F, 18.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(14, 0).addBox(7.0F, -12.0F, -3.0F, 10.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(14, 0).addBox(7.0F, 2.0F, -3.0F, 10.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(6, 0).addBox(-11.0F, 2.0F, -3.0F, 18.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r7_r2 = cube_r3.addOrReplaceChild("cube_r7_r2", CubeListBuilder.create().texOffs(6, 1).addBox(14.25F, -9.0F, -4.25F, 17.0F, 7.0F, 5.0F, new CubeDeformation(0.0F))
				.texOffs(-3, 0).addBox(14.25F, 3.0F, -4.25F, 17.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(48.25F, 0.0F, 1.25F, 0.0F, 0.0F, 3.1416F));

		PartDefinition dragon_tail = bottom.addOrReplaceChild("dragon_tail", CubeListBuilder.create(), PartPose.offsetAndRotation(35.4F, 1.2F, 0.0F, 0.0F, 3.1416F, 0.0F));

		PartDefinition cube_r10_r1 = dragon_tail.addOrReplaceChild("cube_r10_r1", CubeListBuilder.create().texOffs(11, 4).addBox(-4.5F, -3.5F, -1.0F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8027F, -39.364F, -0.5F, 0.0F, 0.0F, 1.6144F));

		PartDefinition cube_r9_r1 = dragon_tail.addOrReplaceChild("cube_r9_r1", CubeListBuilder.create().texOffs(14, 3).addBox(5.15F, -12.425F, -1.5F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.1F, -42.8F, -0.4F, 0.0F, 0.0F, 0.829F));

		PartDefinition cube_r10_r2 = dragon_tail.addOrReplaceChild("cube_r10_r2", CubeListBuilder.create().texOffs(7, 3).addBox(-1.85F, -17.425F, -2.5F, 6.0F, 19.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.3F, -19.9F, 0.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r9_r2 = dragon_tail.addOrReplaceChild("cube_r9_r2", CubeListBuilder.create().texOffs(6, 2).addBox(-1.85F, -9.425F, -2.5F, 6.0F, 11.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, -10.8F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition cube_r6_r1 = dragon_tail.addOrReplaceChild("cube_r6_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-26.6F, 0.8F, -3.0F, 25.0F, 7.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.5708F));

		PartDefinition dragon_tail2 = bottom.addOrReplaceChild("dragon_tail2", CubeListBuilder.create(), PartPose.offset(-83.6F, 1.2F, 0.0F));

		PartDefinition cube_r10_r3 = dragon_tail2.addOrReplaceChild("cube_r10_r3", CubeListBuilder.create().texOffs(11, 4).addBox(-4.5F, -3.5F, -1.0F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.8027F, -39.364F, -0.5F, 0.0F, 0.0F, 1.6144F));

		PartDefinition cube_r9_r3 = dragon_tail2.addOrReplaceChild("cube_r9_r3", CubeListBuilder.create().texOffs(14, 3).addBox(5.15F, -12.425F, -1.5F, 5.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-14.1F, -42.8F, -0.4F, 0.0F, 0.0F, 0.829F));

		PartDefinition cube_r10_r4 = dragon_tail2.addOrReplaceChild("cube_r10_r4", CubeListBuilder.create().texOffs(7, 3).addBox(-1.85F, -17.425F, -2.5F, 6.0F, 19.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.2F, -20.5F, 0.5F, 0.0F, 0.0F, 0.3491F));

		PartDefinition cube_r9_r4 = dragon_tail2.addOrReplaceChild("cube_r9_r4", CubeListBuilder.create().texOffs(6, 2).addBox(-1.85F, -9.425F, -2.5F, 6.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.5F, -11.4F, 0.0F, 0.0F, 0.0F, -0.3491F));

		PartDefinition sides = Longship.addOrReplaceChild("sides", CubeListBuilder.create().texOffs(18, 36).addBox(-75.0F, -11.0F, -16.0F, 8.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(16, 36).addBox(-85.0F, -11.0F, -13.0F, 10.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(16, 36).addBox(-85.0F, -11.0F, 10.0F, 10.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-26.0F, -11.0F, -19.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 36).addBox(-75.0F, -11.0F, 13.0F, 8.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-26.0F, -11.0F, 16.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-41.0F, -11.0F, 16.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-67.0F, -11.0F, 16.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-41.0F, -11.0F, -19.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-67.0F, -11.0F, -19.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 36).addBox(-52.0F, -11.0F, 16.0F, 11.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 36).addBox(-52.0F, -11.0F, -19.0F, 11.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(2.0F, -11.0F, -19.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-11.0F, -11.0F, -19.0F, 13.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(2.0F, -11.0F, 16.0F, 15.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-11.0F, -11.0F, 16.0F, 13.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition sides_r1 = sides.addOrReplaceChild("sides_r1", CubeListBuilder.create().texOffs(16, 36).addBox(-4.25F, -9.75F, 10.0F, 10.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(16, 36).addBox(-4.25F, -9.75F, -13.0F, 10.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 36).addBox(5.75F, -9.75F, 13.0F, 8.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 36).addBox(5.75F, -9.75F, -16.0F, 8.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(30.75F, -1.25F, 0.0F, 3.1416F, 0.0F, 3.1416F));

		PartDefinition cube_r4 = sides.addOrReplaceChild("cube_r4", CubeListBuilder.create(), PartPose.offsetAndRotation(35.0F, -8.0F, -9.5F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r5 = sides.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(10, 36).addBox(5.5002F, -3.0F, 64.5F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-7.4998F, -3.0F, 64.5F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 36).addBox(-1.4998F, -3.0F, 67.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 36).addBox(5.5002F, -3.0F, 67.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(3.5002F, 3.0F, 63.5F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(9, 36).addBox(-0.2498F, 3.0F, 66.5F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-7.4998F, 3.0F, 63.5F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-6.4998F, 6.0F, 63.5F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(3.5002F, 6.0F, 63.5F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.5F, -8.0F, -3.5F, 0.0F, -1.5708F, 0.0F));

		PartDefinition cube_r8_r3 = cube_r5.addOrReplaceChild("cube_r8_r3", CubeListBuilder.create().texOffs(9, 36).addBox(-3.7501F, -3.75F, -11.25F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 36).addBox(1.9999F, -9.75F, -10.25F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(18, 36).addBox(-5.0001F, -9.75F, -10.25F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-0.0001F, -0.75F, -14.25F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-10.0001F, -0.75F, -14.25F, 9.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-11.0001F, -3.75F, -14.25F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 36).addBox(-0.0001F, -3.75F, -14.25F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(-11.0001F, -9.75F, -13.25F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(10, 36).addBox(1.9999F, -9.75F, -13.25F, 9.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.4997F, 6.75F, -68.75F, -3.1416F, 0.0F, -3.1416F));

		PartDefinition steer = Longship.addOrReplaceChild("steer", CubeListBuilder.create().texOffs(4, 1).addBox(2.75F, 12.0F, -1.0F, 6.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(4, 1).addBox(0.75F, 9.0F, -1.0F, 2.0F, 14.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(4, 1).addBox(0.75F, -2.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(40.5F, -10.0F, 4.6F));

		PartDefinition row = steer.addOrReplaceChild("row", CubeListBuilder.create(), PartPose.offsetAndRotation(45.0F, -1.0F, -2.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition cube_r7 = row.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(9, 0).addBox(-6.0F, -49.5F, 8.0F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.5F, 8.0F, -10.0F, 1.5708F, 0.0F, 0.0F));

		PartDefinition mast_1 = Longship.addOrReplaceChild("mast_1", CubeListBuilder.create().texOffs(8, 0).addBox(-19.0F, -15.0F, -0.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-19.0F, -30.0F, -0.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-19.0F, -45.0F, -0.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-19.0F, -60.0F, -0.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-19.0F, -75.0F, -0.5F, 3.0F, 15.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-19.0F, -81.0F, -0.5F, 3.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(8, 0).addBox(-18.0F, -96.0F, 0.5F, 1.0F, 15.0F, 1.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-21.0F, -64.0F, 17.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-21.0F, -64.0F, 1.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-21.0F, -64.0F, -15.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F))
				.texOffs(0, 0).addBox(-21.0F, -64.0F, -31.0F, 2.0F, 2.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -5.0F, -1.0F));

		PartDefinition cube_r6 = mast_1.addOrReplaceChild("cube_r6", CubeListBuilder.create(), PartPose.offsetAndRotation(-47.5F, -15.5F, 1.0F, 0.0F, 0.0F, -0.7854F));

		PartDefinition row_L_1 = Longship.addOrReplaceChild("row_L_1", CubeListBuilder.create().texOffs(33, 3).addBox(-2.5F, -1.147F, -30.4148F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.5F, -11.0F, -16.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r8 = row_L_1.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(9, 0).addBox(-3.0F, 13.1874F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-3.0F, -3.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 9.7765F, -20.1022F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_L_2 = Longship.addOrReplaceChild("row_L_2", CubeListBuilder.create().texOffs(33, 3).addBox(-2.9F, -1.8542F, -29.1901F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.1F, -11.0F, -19.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r9 = row_L_2.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 0).addBox(-7.0F, 13.6874F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-7.0F, -3.3126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(6.1F, 9.0694F, -18.8775F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_L_3 = Longship.addOrReplaceChild("row_L_3", CubeListBuilder.create().texOffs(33, 3).addBox(-2.9F, -1.8542F, -29.1901F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.1F, -11.0F, -19.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r10 = row_L_3.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(9, 0).addBox(-11.0F, 13.1874F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-11.0F, -3.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.1F, 9.0694F, -18.8775F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_L_4 = Longship.addOrReplaceChild("row_L_4", CubeListBuilder.create().texOffs(33, 3).addBox(-2.9F, -1.8542F, -29.1901F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-37.1F, -11.0F, -19.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r11 = row_L_4.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(9, 0).addBox(-11.0F, 13.1874F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-11.0F, -3.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.1F, 9.0694F, -18.8775F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_L_5 = Longship.addOrReplaceChild("row_L_5", CubeListBuilder.create().texOffs(33, 3).addBox(-2.9F, -1.8542F, -29.1901F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-55.1F, -11.0F, -19.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r12 = row_L_5.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(9, 0).addBox(-11.0F, 13.1874F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-11.0F, -3.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.1F, 9.0694F, -18.8775F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_L_6 = Longship.addOrReplaceChild("row_L_6", CubeListBuilder.create().texOffs(33, 3).addBox(-2.9F, -1.6647F, -32.3467F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-73.1F, -11.0F, -16.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r13 = row_L_6.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(9, 0).addBox(-25.0F, 13.1874F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-25.0F, -3.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(24.1F, 9.2588F, -22.0341F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_R_1 = Longship.addOrReplaceChild("row_R_1", CubeListBuilder.create().texOffs(33, 3).addBox(-2.0F, -1.2505F, 22.7961F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.0F, -15.0F, 16.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r14 = row_R_1.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(9, 0).addBox(-5.0F, 23.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-5.0F, 6.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.0F, 9.673F, -14.5164F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_R_2 = Longship.addOrReplaceChild("row_R_2", CubeListBuilder.create().texOffs(33, 3).addBox(-2.0F, -1.9576F, 21.5714F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.0F, -15.0F, 18.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r15 = row_R_2.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(9, 0).addBox(-3.0F, 23.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-3.0F, 6.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 8.9659F, -15.7412F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_R_3 = Longship.addOrReplaceChild("row_R_3", CubeListBuilder.create().texOffs(33, 3).addBox(-2.0F, -1.9576F, 21.5714F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-20.0F, -15.0F, 18.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r16 = row_R_3.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(9, 0).addBox(-3.0F, 23.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-3.0F, 6.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 8.9659F, -15.7412F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_R_4 = Longship.addOrReplaceChild("row_R_4", CubeListBuilder.create().texOffs(33, 3).addBox(-2.0F, -1.9576F, 21.5714F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-38.0F, -15.0F, 18.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r17 = row_R_4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(9, 0).addBox(-3.0F, 23.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-3.0F, 6.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 8.9659F, -15.7412F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_R_5 = Longship.addOrReplaceChild("row_R_5", CubeListBuilder.create().texOffs(33, 3).addBox(-2.0F, -1.9576F, 21.5714F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-56.0F, -15.0F, 18.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r18 = row_R_5.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(9, 0).addBox(-3.0F, 23.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-3.0F, 6.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.0F, 8.9659F, -15.7412F, 1.5708F, 0.0F, 0.0F));

		PartDefinition row_R_6 = Longship.addOrReplaceChild("row_R_6", CubeListBuilder.create().texOffs(33, 3).addBox(-2.0F, -1.5093F, 23.7621F, 5.0F, 1.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-74.0F, -15.0F, 16.0F, -0.2618F, 0.0F, 0.0F));

		PartDefinition cube_r19 = row_R_6.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(9, 0).addBox(-17.0F, 23.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F))
				.texOffs(9, 0).addBox(-17.0F, 6.8126F, 9.4235F, 1.0F, 17.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 9.4142F, -13.5505F, 1.5708F, 0.0F, 0.0F));

		PartDefinition chest_1 = Longship.addOrReplaceChild("chest_1", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

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

		PartDefinition sack2 = chest_1.addOrReplaceChild("sack2", CubeListBuilder.create().texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(31.6111F, 1.1F, 0.0556F));

		PartDefinition chest_2 = Longship.addOrReplaceChild("chest_2", CubeListBuilder.create(), PartPose.offset(-14.0F, 0.0F, 0.0F));

		PartDefinition sack5 = chest_2.addOrReplaceChild("sack5", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.9889F, -3.9F, 0.0556F, -0.0873F, -1.5708F, 0.0F));

		PartDefinition sack0 = chest_2.addOrReplaceChild("sack0", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-16.7889F, -3.9F, 0.0556F, 0.1745F, -1.5708F, 0.0F));

		PartDefinition chest_3 = Longship.addOrReplaceChild("chest_3", CubeListBuilder.create(), PartPose.offset(-42.0F, 0.0F, 2.6F));

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

		PartDefinition sack6 = chest_3.addOrReplaceChild("sack6", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-39.3889F, -3.9F, -8.9444F, -0.0873F, -1.5708F, 0.0F));

		PartDefinition chest_4 = Longship.addOrReplaceChild("chest_4", CubeListBuilder.create(), PartPose.offset(-35.0F, 0.0F, 2.6F));

		PartDefinition sack8 = chest_4.addOrReplaceChild("sack8", CubeListBuilder.create().texOffs(31, 56).addBox(-3.7111F, -5.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(32, 56).addBox(-1.8111F, -11.7F, -1.5556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -0.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -10.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -10.6F, -3.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(0.2889F, -5.6F, -0.0556F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F))
				.texOffs(30, 55).addBox(0.2889F, -5.6F, -3.0556F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F))
				.texOffs(31, 56).addBox(-3.7111F, -5.6F, -3.0556F, 4.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-39.3889F, -2.9F, 0.0556F, 0.1309F, 1.5708F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}




	@Override
	public void setupAnim(LongshipEntity longshipEntity, float f, float g, float h, float i, float j) {

		this.chest_1.visible = longshipEntity.getInvFillState() >= 15;
		this.chest_2.visible = longshipEntity.getInvFillState() >= 30;
		this.chest_3.visible = longshipEntity.getInvFillState() >= 60;
		this.chest_4.visible = longshipEntity.getInvFillState() >= 90;

		this.steer.yRot = -longshipEntity.getRotSpeed() * 0.15F;

		longshipEntity.animatePaddle(Paddleable.PaddleSide.LEFT, this.row_L_1 , f);
		longshipEntity.animatePaddle(Paddleable.PaddleSide.LEFT, this.row_L_2 , f);
		longshipEntity.animatePaddle(Paddleable.PaddleSide.LEFT, this.row_L_3 , f);
		longshipEntity.animatePaddle(Paddleable.PaddleSide.LEFT, this.row_L_4 , f);
		longshipEntity.animatePaddle(Paddleable.PaddleSide.LEFT, this.row_L_5 , f);
		longshipEntity.animatePaddle(Paddleable.PaddleSide.LEFT, this.row_L_6 , f);

		longshipEntity.animatePaddle(Paddleable.PaddleSide.RIGHT, this.row_R_1 , f);
		longshipEntity.animatePaddle(Paddleable.PaddleSide.RIGHT, this.row_R_2 , f);
		longshipEntity.animatePaddle(Paddleable.PaddleSide.RIGHT, this.row_R_3 , f);
		longshipEntity.animatePaddle(Paddleable.PaddleSide.RIGHT, this.row_R_4 , f);
		longshipEntity.animatePaddle(Paddleable.PaddleSide.RIGHT, this.row_R_5 , f);
		longshipEntity.animatePaddle(Paddleable.PaddleSide.RIGHT, this.row_R_6 , f);
	}

	@Override
	public @NotNull ModelPart root() {
		return this.Longship;
	}
}