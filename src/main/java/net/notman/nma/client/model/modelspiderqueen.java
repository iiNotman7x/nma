package net.notman.nma.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class modelspiderqueen<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("nma", "modelspiderqueen"), "main");
	public final ModelPart body;
	public final ModelPart sac;
	public final ModelPart sac2;
	public final ModelPart sac3;
	public final ModelPart sac4;
	public final ModelPart head;
	public final ModelPart Legs;
	public final ModelPart leg1;
	public final ModelPart leg12;
	public final ModelPart leg2;
	public final ModelPart leg22;
	public final ModelPart leg3;
	public final ModelPart leg32;
	public final ModelPart leg4;
	public final ModelPart leg42;
	public final ModelPart leg5;
	public final ModelPart leg52;
	public final ModelPart leg6;
	public final ModelPart leg62;
	public final ModelPart leg7;
	public final ModelPart leg72;
	public final ModelPart leg8;
	public final ModelPart leg82;

	public modelspiderqueen(ModelPart root) {
		this.body = root.getChild("body");
		this.sac = this.body.getChild("sac");
		this.sac2 = this.sac.getChild("sac2");
		this.sac3 = this.sac2.getChild("sac3");
		this.sac4 = this.sac3.getChild("sac4");
		this.head = this.body.getChild("head");
		this.Legs = this.body.getChild("Legs");
		this.leg1 = this.Legs.getChild("leg1");
		this.leg12 = this.leg1.getChild("leg12");
		this.leg2 = this.Legs.getChild("leg2");
		this.leg22 = this.leg2.getChild("leg22");
		this.leg3 = this.Legs.getChild("leg3");
		this.leg32 = this.leg3.getChild("leg32");
		this.leg4 = this.Legs.getChild("leg4");
		this.leg42 = this.leg4.getChild("leg42");
		this.leg5 = this.Legs.getChild("leg5");
		this.leg52 = this.leg5.getChild("leg52");
		this.leg6 = this.Legs.getChild("leg6");
		this.leg62 = this.leg6.getChild("leg62");
		this.leg7 = this.Legs.getChild("leg7");
		this.leg72 = this.leg7.getChild("leg72");
		this.leg8 = this.Legs.getChild("leg8");
		this.leg82 = this.leg8.getChild("leg82");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create().texOffs(0, 20).addBox(-4.0F, -5.0F, -9.0F, 8.0F, 8.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 15.0F, 0.0F));
		PartDefinition sac = body.addOrReplaceChild("sac", CubeListBuilder.create().texOffs(10, 50).addBox(-6.0F, -6.0F, -7.0F, 12.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, 10.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition sac2 = sac.addOrReplaceChild("sac2", CubeListBuilder.create().texOffs(10, 50).addBox(-6.1F, -5.2F, -1.0F, 12.2F, 10.2F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, -1.0F, -3.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition sac3 = sac2.addOrReplaceChild("sac3", CubeListBuilder.create().texOffs(8, 48).addBox(-6.2F, -5.4F, 2.0F, 12.4F, 10.4F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition sac4 = sac3.addOrReplaceChild("sac4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition sac4_r1 = sac4.addOrReplaceChild("sac4_r1", CubeListBuilder.create().texOffs(8, 48).addBox(-6.3F, -5.6F, 0.0F, 12.6F, 10.6F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 1.0F, 6.0F, 0.0873F, 0.0F, 0.0F));
		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(36, 4).addBox(-3.5F, -5.5F, -13.5F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, -2.0F, 0.1309F, 0.0F, 0.0F));
		PartDefinition Legs = body.addOrReplaceChild("Legs", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition leg1 = Legs.addOrReplaceChild("leg1", CubeListBuilder.create().texOffs(27, 0).addBox(-8.0F, -1.0F, -3.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, 4.0F));
		PartDefinition leg12 = leg1.addOrReplaceChild("leg12", CubeListBuilder.create().texOffs(23, 0).addBox(-12.0F, -1.1F, -1.1F, 12.0F, 2.1F, 2.2F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 0.0F, -2.0F));
		PartDefinition leg2 = Legs.addOrReplaceChild("leg2", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, -1.0F, -1.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 2.0F));
		PartDefinition leg22 = leg2.addOrReplaceChild("leg22", CubeListBuilder.create().texOffs(23, 0).addBox(0.0F, -1.1F, -1.1F, 12.0F, 2.1F, 2.2F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 0.0F, 0.0F));
		PartDefinition leg3 = Legs.addOrReplaceChild("leg3", CubeListBuilder.create().texOffs(27, 0).addBox(-8.0F, -1.0F, -3.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, 1.0F));
		PartDefinition leg32 = leg3.addOrReplaceChild("leg32", CubeListBuilder.create().texOffs(23, 0).addBox(-12.0F, -1.1F, -1.1F, 12.0F, 2.1F, 2.2F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 0.0F, -2.0F));
		PartDefinition leg4 = Legs.addOrReplaceChild("leg4", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, -1.0F, -3.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, 1.0F));
		PartDefinition leg42 = leg4.addOrReplaceChild("leg42", CubeListBuilder.create().texOffs(23, 0).addBox(0.0F, -1.1F, -1.1F, 12.0F, 2.1F, 2.2F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 0.0F, -2.0F));
		PartDefinition leg5 = Legs.addOrReplaceChild("leg5", CubeListBuilder.create().texOffs(27, 0).addBox(-8.0F, -1.0F, -3.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, -2.0F));
		PartDefinition leg52 = leg5.addOrReplaceChild("leg52", CubeListBuilder.create().texOffs(23, 0).addBox(-12.0F, -1.1F, -1.1F, 12.0F, 2.1F, 2.2F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 0.0F, -2.0F));
		PartDefinition leg6 = Legs.addOrReplaceChild("leg6", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, -1.0F, -3.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, -2.0F));
		PartDefinition leg62 = leg6.addOrReplaceChild("leg62", CubeListBuilder.create().texOffs(23, 0).addBox(0.0F, -1.1F, -1.1F, 12.0F, 2.1F, 2.2F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 0.0F, -2.0F));
		PartDefinition leg7 = Legs.addOrReplaceChild("leg7", CubeListBuilder.create().texOffs(27, 0).addBox(-8.0F, -1.0F, -3.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.0F, 0.0F, -5.0F));
		PartDefinition leg72 = leg7.addOrReplaceChild("leg72", CubeListBuilder.create().texOffs(23, 0).addBox(-12.0F, -1.1F, -1.1F, 12.0F, 2.1F, 2.2F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, 0.0F, -2.0F));
		PartDefinition leg8 = Legs.addOrReplaceChild("leg8", CubeListBuilder.create().texOffs(27, 0).addBox(-1.0F, -1.0F, -3.0F, 9.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, 0.0F, -5.0F));
		PartDefinition leg82 = leg8.addOrReplaceChild("leg82", CubeListBuilder.create().texOffs(23, 0).addBox(0.0F, -1.1F, -1.1F, 12.0F, 2.1F, 2.2F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, 0.0F, -2.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}