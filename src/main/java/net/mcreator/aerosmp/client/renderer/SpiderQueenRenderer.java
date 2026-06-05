package net.mcreator.aerosmp.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import net.mcreator.aerosmp.entity.SpiderQueenEntity;
import net.mcreator.aerosmp.client.model.animations.SpiderQueenAnimation;
import net.mcreator.aerosmp.client.model.ModelSpiderQueen;

import com.mojang.blaze3d.vertex.PoseStack;

public class SpiderQueenRenderer extends MobRenderer<SpiderQueenEntity, ModelSpiderQueen<SpiderQueenEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("aerosmp:textures/entities/spider_queen.png");

	public SpiderQueenRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelSpiderQueen.LAYER_LOCATION)), 2f);
	}

	@Override
	protected void scale(SpiderQueenEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(2f, 2f, 2f);
	}

	@Override
	public ResourceLocation getTextureLocation(SpiderQueenEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends ModelSpiderQueen<SpiderQueenEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<SpiderQueenEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(SpiderQueenEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, SpiderQueenAnimation.Idle, ageInTicks, 1f);
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