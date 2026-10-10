package com.talhanation.smallships_viking_addon.client.model.sail;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.talhanation.smallships.client.model.sail.SailModel;
import com.talhanation.smallships.world.entity.ship.Ship;
import com.talhanation.smallships_viking_addon.SmallShipsVikingAddonMod;
import com.talhanation.smallships_viking_addon.world.entity.ship.TransportDrakkarEntity;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.NotNull;

public class TransportDrakkarSailModel extends SailModel {
	@SuppressWarnings("unused")
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(SmallShipsVikingAddonMod.MOD_ID, TransportDrakkarEntity.ID + "_sail_model"), "main");

	private final ModelPart DrakkarTransportSail;
	private final ModelPart ropes;
	private final ModelPart rope_1;
	private final ModelPart cube_r114;
	private final ModelPart cube_r115;
	private final ModelPart cube_r116;
	private final ModelPart rope_2;
	private final ModelPart cube_r117;
	private final ModelPart cube_r118;
	private final ModelPart cube_r119;
	private final ModelPart sail_main;
	private final ModelPart sail_main_1;
	private final ModelPart sail_main_1_bottom;
	private final ModelPart sail_main_2;
	private final ModelPart sail_main_2_bottom;
	private final ModelPart sail_main_3;
	private final ModelPart sail_main_3_bottom;
	private final ModelPart sail_main_4;
	private final ModelPart sail_main_0;
	private final ModelPart sail_main_0_bottom;
	private final ModelPart sail_main_rope_right_0;
	private final ModelPart cube_r73;
	private final ModelPart cube_r74;
	private final ModelPart cube_r75;
	private final ModelPart sail_main_rope_right_1;
	private final ModelPart cube_r23;
	private final ModelPart cube_r24;
	private final ModelPart cube_r25;
	private final ModelPart sail_main_rope_right_2;
	private final ModelPart cube_r26;
	private final ModelPart cube_r27;
	private final ModelPart cube_r28;
	private final ModelPart sail_main_rope_right_3;
	private final ModelPart cube_r29;
	private final ModelPart cube_r30;
	private final ModelPart cube_r31;
	private final ModelPart sail_main_rope_right_4;
	private final ModelPart cube_r8;
	private final ModelPart cube_r9;
	private final ModelPart cube_r10;
	private final ModelPart sail_main_rope_left_0;
	private final ModelPart cube_r76;
	private final ModelPart cube_r77;
	private final ModelPart cube_r78;
	private final ModelPart sail_main_rope_left_1;
	private final ModelPart cube_r32;
	private final ModelPart cube_r33;
	private final ModelPart cube_r34;
	private final ModelPart sail_main_rope_left_2;
	private final ModelPart cube_r35;
	private final ModelPart cube_r36;
	private final ModelPart cube_r37;
	private final ModelPart sail_main_rope_left_3;
	private final ModelPart cube_r38;
	private final ModelPart cube_r39;
	private final ModelPart cube_r40;
	private final ModelPart sail_main_rope_left_4;
	private final ModelPart cube_r14;
	private final ModelPart cube_r15;
	private final ModelPart cube_r16;
	public TransportDrakkarSailModel() {
		ModelPart root = createBodyLayer().bakeRoot();
		this.DrakkarTransportSail = root.getChild("DrakkarTransportSail");
		this.ropes = this.DrakkarTransportSail.getChild("ropes");
		this.rope_1 = this.ropes.getChild("rope_1");
		this.cube_r114 = this.rope_1.getChild("cube_r114");
		this.cube_r115 = this.rope_1.getChild("cube_r115");
		this.cube_r116 = this.rope_1.getChild("cube_r116");
		this.rope_2 = this.ropes.getChild("rope_2");
		this.cube_r117 = this.rope_2.getChild("cube_r117");
		this.cube_r118 = this.rope_2.getChild("cube_r118");
		this.cube_r119 = this.rope_2.getChild("cube_r119");
		this.sail_main = this.DrakkarTransportSail.getChild("sail_main");
		this.sail_main_1 = this.sail_main.getChild("sail_main_1");
		this.sail_main_1_bottom = this.sail_main_1.getChild("sail_main_1_bottom");
		this.sail_main_2 = this.sail_main.getChild("sail_main_2");
		this.sail_main_2_bottom = this.sail_main_2.getChild("sail_main_2_bottom");
		this.sail_main_3 = this.sail_main.getChild("sail_main_3");
		this.sail_main_3_bottom = this.sail_main_3.getChild("sail_main_3_bottom");
		this.sail_main_4 = this.sail_main.getChild("sail_main_4");
		this.sail_main_0 = this.sail_main.getChild("sail_main_0");
		this.sail_main_0_bottom = this.sail_main_0.getChild("sail_main_0_bottom");
		this.sail_main_rope_right_0 = this.sail_main.getChild("sail_main_rope_right_0");
		this.cube_r73 = this.sail_main_rope_right_0.getChild("cube_r73");
		this.cube_r74 = this.sail_main_rope_right_0.getChild("cube_r74");
		this.cube_r75 = this.sail_main_rope_right_0.getChild("cube_r75");
		this.sail_main_rope_right_1 = this.sail_main.getChild("sail_main_rope_right_1");
		this.cube_r23 = this.sail_main_rope_right_1.getChild("cube_r23");
		this.cube_r24 = this.sail_main_rope_right_1.getChild("cube_r24");
		this.cube_r25 = this.sail_main_rope_right_1.getChild("cube_r25");
		this.sail_main_rope_right_2 = this.sail_main.getChild("sail_main_rope_right_2");
		this.cube_r26 = this.sail_main_rope_right_2.getChild("cube_r26");
		this.cube_r27 = this.sail_main_rope_right_2.getChild("cube_r27");
		this.cube_r28 = this.sail_main_rope_right_2.getChild("cube_r28");
		this.sail_main_rope_right_3 = this.sail_main.getChild("sail_main_rope_right_3");
		this.cube_r29 = this.sail_main_rope_right_3.getChild("cube_r29");
		this.cube_r30 = this.sail_main_rope_right_3.getChild("cube_r30");
		this.cube_r31 = this.sail_main_rope_right_3.getChild("cube_r31");
		this.sail_main_rope_right_4 = this.sail_main.getChild("sail_main_rope_right_4");
		this.cube_r8 = this.sail_main_rope_right_4.getChild("cube_r8");
		this.cube_r9 = this.sail_main_rope_right_4.getChild("cube_r9");
		this.cube_r10 = this.sail_main_rope_right_4.getChild("cube_r10");
		this.sail_main_rope_left_0 = this.sail_main.getChild("sail_main_rope_left_0");
		this.cube_r76 = this.sail_main_rope_left_0.getChild("cube_r76");
		this.cube_r77 = this.sail_main_rope_left_0.getChild("cube_r77");
		this.cube_r78 = this.sail_main_rope_left_0.getChild("cube_r78");
		this.sail_main_rope_left_1 = this.sail_main.getChild("sail_main_rope_left_1");
		this.cube_r32 = this.sail_main_rope_left_1.getChild("cube_r32");
		this.cube_r33 = this.sail_main_rope_left_1.getChild("cube_r33");
		this.cube_r34 = this.sail_main_rope_left_1.getChild("cube_r34");
		this.sail_main_rope_left_2 = this.sail_main.getChild("sail_main_rope_left_2");
		this.cube_r35 = this.sail_main_rope_left_2.getChild("cube_r35");
		this.cube_r36 = this.sail_main_rope_left_2.getChild("cube_r36");
		this.cube_r37 = this.sail_main_rope_left_2.getChild("cube_r37");
		this.sail_main_rope_left_3 = this.sail_main.getChild("sail_main_rope_left_3");
		this.cube_r38 = this.sail_main_rope_left_3.getChild("cube_r38");
		this.cube_r39 = this.sail_main_rope_left_3.getChild("cube_r39");
		this.cube_r40 = this.sail_main_rope_left_3.getChild("cube_r40");
		this.sail_main_rope_left_4 = this.sail_main.getChild("sail_main_rope_left_4");
		this.cube_r14 = this.sail_main_rope_left_4.getChild("cube_r14");
		this.cube_r15 = this.sail_main_rope_left_4.getChild("cube_r15");
		this.cube_r16 = this.sail_main_rope_left_4.getChild("cube_r16");
	}


	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition DrakkarTransportSail = partdefinition.addOrReplaceChild("DrakkarTransportSail", CubeListBuilder.create(), PartPose.offset(-22.0F, 51.0F, 0.0F));

		PartDefinition ropes = DrakkarTransportSail.addOrReplaceChild("ropes", CubeListBuilder.create(), PartPose.offset(43.5F, -16.0F, 0.0F));

		PartDefinition rope_1 = ropes.addOrReplaceChild("rope_1", CubeListBuilder.create(), PartPose.offsetAndRotation(41.0F, -37.0F, 0.0F, 0.0F, -1.5708F, -0.7374F));

		PartDefinition cube_r114 = rope_1.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(11, 23).addBox(34.5F, -0.5F, -17.5F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(64.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(20, 24).addBox(74.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(7, 24).addBox(84.5F, -0.5F, -17.5F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(7, 24).addBox(101.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(13, 25).addBox(49.5F, -0.5F, -17.5F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 24).addBox(22.5F, 0.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 28).addBox(22.5F, -1.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(9, 22).addBox(11.5F, -0.5F, -17.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.5F, 17.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r115 = rope_1.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(14, 6).addBox(-1.75F, -1.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, 0.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r116 = rope_1.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(4, 3).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.5F, 0.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition rope_2 = ropes.addOrReplaceChild("rope_2", CubeListBuilder.create(), PartPose.offsetAndRotation(-95.0F, -45.0F, 0.0F, 0.7941F, -1.5708F, 0.0F));

		PartDefinition cube_r117 = rope_2.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(16, 28).addBox(34.5F, -0.5F, -17.5F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(79.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(89.5F, -0.5F, -17.5F, 17.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(64.5F, -0.5F, -17.5F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 24).addBox(49.5F, -0.5F, -17.5F, 15.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(22.5F, 0.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(21, 22).addBox(22.5F, -1.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 22).addBox(11.5F, -0.5F, -17.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 11.5F, 17.0F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r118 = rope_2.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(14, 6).addBox(-1.75F, -1.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -22.5F, 0.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r119 = rope_2.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(4, 3).addBox(-1.5F, -1.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -10.5F, 0.0F, 0.0F, 0.0F, -2.3562F));

		PartDefinition sail_main = DrakkarTransportSail.addOrReplaceChild("sail_main", CubeListBuilder.create(), PartPose.offsetAndRotation(3.0F, -107.0F, 0.0F, 0.0F, 1.5708F, 0.0F));

		PartDefinition sail_main_1 = sail_main.addOrReplaceChild("sail_main_1", CubeListBuilder.create(), PartPose.offset(0.5F, -6.7923F, 9.0167F));

		PartDefinition cube_r1 = sail_main_1.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(64, 10).addBox(21.0F, -1.0F, -3.5F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(72, 51).addBox(-1.0F, -1.0F, -3.5F, 22.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(74, 19).addBox(-22.0F, -1.0F, -3.5F, 21.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 38).addBox(-48.0F, -1.0F, -3.5F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.5236F, 0.0F, 0.0F));

		PartDefinition cube_r2 = sail_main_1.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(64, 9).addBox(21.5F, -1.0F, 2.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(72, 36).addBox(-0.5F, -1.0F, 2.0F, 22.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(74, 1).addBox(-21.5F, -1.0F, 2.0F, 21.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 20).addBox(-47.5F, -1.0F, 2.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 6.7923F, -9.0167F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r3 = sail_main_1.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(64, 45).addBox(21.5F, -1.0F, 2.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(72, 30).addBox(-0.5F, -1.0F, 2.0F, 22.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(73, 25).addBox(-21.5F, -1.0F, 2.0F, 21.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 9).addBox(-47.5F, -1.0F, 2.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 11.5118F, -12.5036F, 0.8727F, 0.0F, 0.0F));

		PartDefinition sail_main_1_bottom = sail_main_1.addOrReplaceChild("sail_main_1_bottom", CubeListBuilder.create().texOffs(64, 45).addBox(34.5F, -2.5F, -5.0F, 13.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(64, 45).addBox(21.5F, -2.5F, -5.0F, 13.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(64, 30).addBox(10.5F, -2.5F, -5.0F, 11.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(64, 30).addBox(-0.5F, -2.5F, -5.0F, 11.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(64, 25).addBox(-10.5F, -2.5F, -5.0F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(64, 25).addBox(-21.5F, -2.5F, -5.0F, 11.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(64, 9).addBox(-34.5F, -2.5F, -5.0F, 13.0F, 5.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(64, 9).addBox(-47.5F, -2.5F, -5.0F, 13.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.5F, 9.9798F, -11.218F, 1.0472F, 0.0F, 0.0F));

		PartDefinition sail_main_2 = sail_main.addOrReplaceChild("sail_main_2", CubeListBuilder.create(), PartPose.offset(0.0F, 6.2034F, -4.3437F));

		PartDefinition cube_r4 = sail_main_2.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(67, 56).addBox(-21.5F, -1.0F, -8.0F, 21.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 9).addBox(-47.5F, -1.0F, -8.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(72, 39).addBox(-0.5F, -1.0F, -8.0F, 22.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 31).addBox(21.5F, -1.0F, -8.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r5 = sail_main_2.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(64, 9).addBox(-47.5F, -1.0F, 2.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(71, 51).addBox(-21.5F, -1.0F, 2.0F, 21.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(72, 26).addBox(-0.5F, -1.0F, 2.0F, 22.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 27).addBox(21.5F, -1.0F, 2.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 3.7694F, -1.7577F, 1.0472F, 0.0F, 0.0F));

		PartDefinition cube_r6 = sail_main_2.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(64, 42).addBox(21.5F, -1.0F, -6.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(72, 51).addBox(-0.5F, -1.0F, -6.0F, 22.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(65, 54).addBox(-21.5F, -1.0F, -6.0F, 21.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 9).addBox(-47.5F, -1.0F, -6.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 7.3492F, -2.691F, 1.3963F, 0.0F, 0.0F));

		PartDefinition sail_main_2_bottom = sail_main_2.addOrReplaceChild("sail_main_2_bottom", CubeListBuilder.create().texOffs(64, 42).addBox(34.5F, -2.0F, -4.0F, 13.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(64, 42).addBox(21.5F, -2.0F, -4.0F, 13.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(64, 51).addBox(10.5F, -2.0F, -4.0F, 11.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(64, 51).addBox(-0.5F, -2.0F, -4.0F, 11.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(64, 54).addBox(-10.5F, -2.0F, -4.0F, 10.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(64, 54).addBox(-21.5F, -2.0F, -4.0F, 11.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(64, 9).addBox(-34.5F, -2.0F, -4.0F, 13.0F, 4.0F, 4.0F, new CubeDeformation(0.0F))
		.texOffs(64, 9).addBox(-47.5F, -2.0F, -4.0F, 13.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 13.258F, -3.7329F, 1.5708F, 0.0F, 0.0F));

		PartDefinition sail_main_3 = sail_main.addOrReplaceChild("sail_main_3", CubeListBuilder.create(), PartPose.offset(0.0F, 26.099F, -7.903F));

		PartDefinition cube_r7 = sail_main_3.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(74, 52).addBox(-21.5F, -1.0F, -5.0F, 21.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 43).addBox(-47.5F, -1.0F, -5.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(72, 1).addBox(-0.5F, -1.0F, -5.0F, 22.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 9).addBox(21.5F, -1.0F, -5.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 1.7453F, 0.0F, 0.0F));

		PartDefinition cube_r11 = sail_main_3.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(64, 9).addBox(-47.5F, -1.0F, -5.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(65, 38).addBox(-21.5F, -1.0F, -5.0F, 21.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 31).addBox(21.5F, -1.0F, -5.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(72, 1).addBox(-0.5F, -1.0F, -5.0F, 22.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.8112F, -0.1584F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r12 = sail_main_3.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(64, 9).addBox(21.5F, -1.0F, -9.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(72, 0).addBox(-0.5F, -1.0F, -9.0F, 22.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(74, 43).addBox(-21.5F, -1.0F, -9.0F, 21.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 2).addBox(-47.5F, -1.0F, -9.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.9366F, -0.2029F, 1.9199F, 0.0F, 0.0F));

		PartDefinition sail_main_3_bottom = sail_main_3.addOrReplaceChild("sail_main_3_bottom", CubeListBuilder.create().texOffs(64, 9).addBox(34.5F, -1.5F, -3.0F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(64, 9).addBox(21.5F, -1.5F, -3.0F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(64, 0).addBox(10.5F, -1.5F, -3.0F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(64, 0).addBox(-0.5F, -1.5F, -3.0F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(64, 43).addBox(-10.5F, -1.5F, -3.0F, 10.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(64, 43).addBox(-21.5F, -1.5F, -3.0F, 11.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(64, 2).addBox(-34.5F, -1.5F, -3.0F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(64, 2).addBox(-47.5F, -1.5F, -3.0F, 13.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 10.3938F, 2.8753F, 2.0944F, 0.0F, 0.0F));

		PartDefinition sail_main_4 = sail_main.addOrReplaceChild("sail_main_4", CubeListBuilder.create(), PartPose.offset(0.0F, 39.09F, -4.1297F));

		PartDefinition cube_r13 = sail_main_4.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(64, 1).addBox(-47.5F, -1.0F, -9.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(74, 41).addBox(-21.5F, -1.0F, -9.0F, 21.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(72, 0).addBox(-0.5F, -1.0F, -9.0F, 22.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 9).addBox(21.5F, -1.0F, -9.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -5.3533F, -2.4717F, 2.0944F, 0.0F, 0.0F));

		PartDefinition cube_r17 = sail_main_4.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(65, 0).addBox(-21.5F, -1.0F, -9.0F, 21.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 1).addBox(-47.5F, -1.0F, -9.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 0).addBox(-0.5F, -1.0F, -9.0F, 22.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 9).addBox(21.5F, -1.0F, -9.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 2.2689F, 0.0F, 0.0F));

		PartDefinition cube_r18 = sail_main_4.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(64, 9).addBox(21.5F, -1.0F, -9.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(69, 43).addBox(-0.5F, -1.0F, -9.0F, 22.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(65, 3).addBox(-21.5F, -1.0F, -9.0F, 21.0F, 2.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 36).addBox(-47.5F, -1.0F, -9.0F, 26.0F, 2.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 4.8428F, 3.3637F, 2.4435F, 0.0F, 0.0F));

		PartDefinition sail_main_0 = sail_main.addOrReplaceChild("sail_main_0", CubeListBuilder.create(), PartPose.offset(0.0F, -5.4083F, 11.0698F));

		PartDefinition sail_main_0_bottom = sail_main_0.addOrReplaceChild("sail_main_0_bottom", CubeListBuilder.create().texOffs(64, 45).addBox(34.5F, -3.0F, -6.0F, 13.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 45).addBox(21.5F, -3.0F, -6.0F, 13.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 30).addBox(10.5F, -3.0F, -6.0F, 11.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 30).addBox(-0.5F, -3.0F, -6.0F, 11.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 25).addBox(-10.5F, -3.0F, -6.0F, 10.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 25).addBox(-21.5F, -3.0F, -6.0F, 11.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 9).addBox(-34.5F, -3.0F, -6.0F, 13.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(64, 9).addBox(-47.5F, -3.0F, -6.0F, 13.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition sail_main_rope_right_0 = sail_main.addOrReplaceChild("sail_main_rope_right_0", CubeListBuilder.create(), PartPose.offsetAndRotation(-24.5F, 70.0F, 14.0F, 1.5849F, 1.4911F, 1.2877F));

		PartDefinition cube_r73 = sail_main_rope_right_0.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(11, 25).addBox(-8.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 25).addBox(1.5F, -0.5F, -17.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 25).addBox(18.5F, -0.5F, -17.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, 0.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, -1.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 26).addBox(25.5F, -0.5F, -17.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(37.5F, -0.5F, -17.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(49.5F, -0.5F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(7, 24).addBox(60.5F, -0.5F, -17.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.7479F, 17.1432F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r74 = sail_main_rope_right_0.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(9, 9).addBox(-12.65F, -12.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -42.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r75 = sail_main_rope_right_0.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(16, 4).addBox(-11.5F, -11.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition sail_main_rope_right_1 = sail_main.addOrReplaceChild("sail_main_rope_right_1", CubeListBuilder.create(), PartPose.offsetAndRotation(-24.5F, 70.0F, 14.0F, 1.5194F, 1.3471F, 1.183F));

		PartDefinition cube_r23 = sail_main_rope_right_1.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(11, 25).addBox(-8.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 25).addBox(1.5F, -0.5F, -17.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(23, 25).addBox(18.5F, -0.5F, -17.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, 0.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, -1.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(17, 26).addBox(25.5F, -0.5F, -17.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(37.5F, -0.5F, -17.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(49.5F, -0.5F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(7, 24).addBox(60.5F, -0.5F, -17.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.7479F, 17.1432F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r24 = sail_main_rope_right_1.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(9, 9).addBox(-12.65F, -12.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -42.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r25 = sail_main_rope_right_1.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(16, 4).addBox(-11.5F, -11.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition sail_main_rope_right_2 = sail_main.addOrReplaceChild("sail_main_rope_right_2", CubeListBuilder.create(), PartPose.offsetAndRotation(-24.5F, 70.0F, 14.0F, 1.6691F, 1.1639F, 1.2365F));

		PartDefinition cube_r26 = sail_main_rope_right_2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(11, 25).addBox(-8.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(11, 25).addBox(1.5F, -0.5F, -17.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(9, 24).addBox(18.5F, -0.5F, -17.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, 0.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, -1.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(9, 24).addBox(25.5F, -0.5F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(9, 24).addBox(36.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(9, 24).addBox(46.5F, -0.5F, -17.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.7479F, 17.1432F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r27 = sail_main_rope_right_2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(10, 8).addBox(-12.65F, -12.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -42.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r28 = sail_main_rope_right_2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(17, 3).addBox(-11.5F, -11.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition sail_main_rope_right_3 = sail_main.addOrReplaceChild("sail_main_rope_right_3", CubeListBuilder.create(), PartPose.offsetAndRotation(-24.5F, 70.0F, 14.0F, 1.8009F, 1.1094F, 1.2136F));

		PartDefinition cube_r29 = sail_main_rope_right_3.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(11, 25).addBox(-8.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 25).addBox(1.5F, -0.5F, -17.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(15, 25).addBox(18.5F, -0.5F, -17.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, 0.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, -1.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(15, 25).addBox(25.5F, -0.5F, -17.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.7479F, 17.1432F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r30 = sail_main_rope_right_3.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(9, 9).addBox(-12.65F, -12.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -42.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r31 = sail_main_rope_right_3.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(16, 4).addBox(-11.5F, -11.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition sail_main_rope_right_4 = sail_main.addOrReplaceChild("sail_main_rope_right_4", CubeListBuilder.create(), PartPose.offsetAndRotation(-24.5F, 70.0F, 14.0F, 1.9809F, 1.2654F, 1.1868F));

		PartDefinition cube_r8 = sail_main_rope_right_4.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(10, 25).addBox(-8.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 25).addBox(1.5F, -0.5F, -17.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(12, 24).addBox(18.5F, -0.5F, -17.5F, 5.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, 0.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, -1.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.7479F, 17.1432F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r9 = sail_main_rope_right_4.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(9, 9).addBox(-12.65F, -12.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -42.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r10 = sail_main_rope_right_4.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(16, 4).addBox(-11.5F, -11.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition sail_main_rope_left_0 = sail_main.addOrReplaceChild("sail_main_rope_left_0", CubeListBuilder.create(), PartPose.offsetAndRotation(25.0F, 70.0F, 14.0F, 1.164F, 1.4925F, 1.4485F));

		PartDefinition cube_r76 = sail_main_rope_left_0.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(0, 25).addBox(-8.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(1.5F, -0.5F, -17.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(18.5F, -0.5F, -17.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, 0.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, -1.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(24.5F, -0.5F, -17.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 26).addBox(36.5F, -0.5F, -17.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(48.5F, -0.5F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(9, 25).addBox(59.5F, -0.5F, -17.5F, 9.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.7479F, 17.1432F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r77 = sail_main_rope_left_0.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(9, 10).addBox(-12.65F, -12.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -42.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r78 = sail_main_rope_left_0.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(16, 4).addBox(-11.5F, -11.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition sail_main_rope_left_1 = sail_main.addOrReplaceChild("sail_main_rope_left_1", CubeListBuilder.create(), PartPose.offsetAndRotation(25.0F, 70.0F, 14.0F, 0.9284F, 1.2831F, 1.2304F));

		PartDefinition cube_r32 = sail_main_rope_left_1.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(0, 25).addBox(-8.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(1.5F, -0.5F, -17.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(18.5F, -0.5F, -17.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, 0.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, -1.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(24.5F, -0.5F, -17.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(10, 26).addBox(36.5F, -0.5F, -17.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(48.5F, -0.5F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(59.5F, -0.5F, -17.5F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.7479F, 17.1432F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r33 = sail_main_rope_left_1.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(9, 10).addBox(-12.65F, -12.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -42.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r34 = sail_main_rope_left_1.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(16, 4).addBox(-11.5F, -11.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition sail_main_rope_left_2 = sail_main.addOrReplaceChild("sail_main_rope_left_2", CubeListBuilder.create(), PartPose.offsetAndRotation(25.0F, 70.0F, 14.0F, 1.4662F, 1.1726F, 1.8814F));

		PartDefinition cube_r35 = sail_main_rope_left_2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(0, 25).addBox(-8.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(1.5F, -0.5F, -17.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(18.5F, -0.5F, -17.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, 0.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, -1.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(24.5F, -0.5F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(35.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(16, 26).addBox(45.5F, -0.5F, -17.5F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.7479F, 17.1432F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r36 = sail_main_rope_left_2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(9, 10).addBox(-12.65F, -12.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -42.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r37 = sail_main_rope_left_2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(16, 4).addBox(-11.5F, -11.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition sail_main_rope_left_3 = sail_main.addOrReplaceChild("sail_main_rope_left_3", CubeListBuilder.create(), PartPose.offsetAndRotation(25.0F, 70.0F, 14.0F, 1.2018F, 1.1007F, 1.7332F));

		PartDefinition cube_r38 = sail_main_rope_left_3.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(0, 25).addBox(-8.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(1.5F, -0.5F, -17.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(18.5F, -0.5F, -17.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, 0.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, -1.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(15, 26).addBox(24.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.7479F, 17.1432F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r39 = sail_main_rope_left_3.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(9, 10).addBox(-12.65F, -12.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -42.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r40 = sail_main_rope_left_3.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(16, 4).addBox(-11.5F, -11.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition sail_main_rope_left_4 = sail_main.addOrReplaceChild("sail_main_rope_left_4", CubeListBuilder.create(), PartPose.offsetAndRotation(25.0F, 70.0F, 14.0F, 0.48F, 0.9338F, 1.213F));

		PartDefinition cube_r14 = sail_main_rope_left_4.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 25).addBox(-8.5F, -0.5F, -17.5F, 10.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 26).addBox(1.5F, -0.5F, -17.5F, 7.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(18.5F, -0.5F, -17.5F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, 0.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F))
		.texOffs(0, 24).addBox(7.5F, -1.75F, -17.5F, 11.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -8.7479F, 17.1432F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r15 = sail_main_rope_left_4.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(9, 10).addBox(-12.65F, -12.75F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -42.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		PartDefinition cube_r16 = sail_main_rope_left_4.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(16, 4).addBox(-11.5F, -11.5F, -1.0F, 3.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -30.748F, 0.1432F, 0.0F, 0.0F, -2.3562F));

		return LayerDefinition.create(meshdefinition, 128, 64);
	}

	@Override
	public void setupAnim(@NotNull Ship ship, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		int state = ship.getData(Ship.SAIL_STATE);

		showSail(state, this.sail_main_0, this.sail_main_1, this.sail_main_2, this.sail_main_3, this.sail_main_4, this.sail_main_1_bottom, this.sail_main_2_bottom, this.sail_main_3_bottom);

		this.sail_main_rope_right_0.visible = state == 0;
		this.sail_main_rope_right_1.visible = state == 1;
		this.sail_main_rope_right_2.visible = state == 2;
		this.sail_main_rope_right_3.visible = state == 3;
		this.sail_main_rope_right_4.visible = state == 4;
		this.sail_main_rope_left_0.visible = state == 0;
		this.sail_main_rope_left_1.visible = state == 1;
		this.sail_main_rope_left_2.visible = state == 2;
		this.sail_main_rope_left_3.visible = state == 3;
		this.sail_main_rope_left_4.visible = state == 4;
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer buffer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha){
		DrakkarTransportSail.render(poseStack, buffer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}