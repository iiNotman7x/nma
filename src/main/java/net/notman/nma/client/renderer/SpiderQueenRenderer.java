package net.notman.nma.client.renderer;

import net.notman.nma.entity.SpiderQueenEntity;
import net.notman.nma.client.model.animations.Animationsspiderqueenanimation;
import net.notman.nma.client.model.Modelmodelspiderqueen;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import com.mojang.blaze3d.vertex.PoseStack;

public class SpiderQueenRenderer extends MobRenderer<SpiderQueenEntity, Modelmodelspiderqueen<SpiderQueenEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("nma:textures/entities/spider_queen.png");

	public SpiderQueenRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(Modelmodelspiderqueen.LAYER_LOCATION)), 2f);
	}

	@Override
	protected void scale(SpiderQueenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.8f, 0.8f, 0.8f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpiderQueenEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends Modelmodelspiderqueen<SpiderQueenEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<SpiderQueenEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(SpiderQueenEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, Animationsspiderqueenanimation.Idle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(SpiderQueenEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}