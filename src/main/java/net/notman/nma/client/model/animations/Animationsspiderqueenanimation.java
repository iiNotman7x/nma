package net.notman.nma.client.model.animations;

import net.minecraft.client.animation.KeyframeAnimations;
import net.minecraft.client.animation.Keyframe;
import net.minecraft.client.animation.AnimationDefinition;
import net.minecraft.client.animation.AnimationChannel;

// Save this class in your mod and generate all required imports
/**
 * Made with Blockbench 5.1.4 Exported for Minecraft version 1.19 or later with
 * Mojang mappings
 * 
 * @author Author
 */
public class Animationsspiderqueenanimation {
	public static final AnimationDefinition Idle = AnimationDefinition.Builder.withLength(2.5F).looping()
			.addAnimation("body",
					new AnimationChannel(AnimationChannel.Targets.POSITION, new Keyframe(0.0F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.posVec(0.0F, -2.0F, 0.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5F, KeyframeAnimations.posVec(0.0F, 0.0F, 0.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg1",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, 30.0F, 12.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(17.8512F, 26.3619F, 28.5272F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5F, KeyframeAnimations.degreeVec(10.0F, 30.0F, 12.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg2",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(10.0F, -30.0F, -12.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(17.8512F, -26.3619F, -28.5272F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5F, KeyframeAnimations.degreeVec(10.0F, -30.0F, -12.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg3", new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 10.0F, 10.0F), AnimationChannel.Interpolations.LINEAR),
					new Keyframe(1.25F, KeyframeAnimations.degreeVec(2.613F, 9.656F, 25.2207F), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 10.0F, 10.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg4",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -10.0F, -10.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(2.613F, -9.656F, -25.2207F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, -10.0F, -10.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg5",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 10.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(-1.2971F, -4.8291F, 25.0547F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, -5.0F, 10.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg6",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 5.0F, -10.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(-1.2971F, 4.8291F, -25.0547F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 5.0F, -10.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg7",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(-2.5F, -30.0F, 10.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(-12.1568F, -27.7425F, 29.8427F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5F, KeyframeAnimations.degreeVec(-2.5F, -30.0F, 10.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg8",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(-2.5F, 30.0F, -10.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(-12.1568F, 27.7425F, -29.8427F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(2.5F, KeyframeAnimations.degreeVec(-2.5F, 30.0F, -10.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg12",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -65.0F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -75.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -65.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg22",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 67.5F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 73.75F), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 65.0F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg32",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -62.5F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -75.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -62.5F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg42",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 62.5F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 75.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 62.5F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg52",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -62.5F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -75.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -62.5F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg62",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 62.5F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 75.0F), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 62.5F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg72",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -62.5F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -77.5F), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, -62.5F), AnimationChannel.Interpolations.LINEAR)))
			.addAnimation("leg82",
					new AnimationChannel(AnimationChannel.Targets.ROTATION, new Keyframe(0.0F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 62.5F), AnimationChannel.Interpolations.LINEAR),
							new Keyframe(1.25F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 77.5F), AnimationChannel.Interpolations.LINEAR), new Keyframe(2.5F, KeyframeAnimations.degreeVec(0.0F, 0.0F, 62.5F), AnimationChannel.Interpolations.LINEAR)))
			.build();
}