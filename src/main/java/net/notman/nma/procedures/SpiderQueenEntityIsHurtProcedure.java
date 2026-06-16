package net.notman.nma.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class SpiderQueenEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		double HitsUntilSummon = 0;
		Entity TempEntity = null;
		if (entity.getPersistentData().getBoolean("ominous")) {
			HitsUntilSummon = 6;
		} else {
			HitsUntilSummon = 10;
		}
		if (entity.getPersistentData().getDouble("HitCounter") == HitsUntilSummon) {
			entity.getPersistentData().putDouble("HitCounter", 0);
			if (entity.getPersistentData().getBoolean("ominous")) {
				for (int index0 = 0; index0 < 2; index0++) {
					TempEntity = world instanceof ServerLevel _level4 ? EntityType.SPIDER.spawn(_level4, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED) : null;
					if (TempEntity instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.ARMOR))
						_livingEntity5.getAttribute(Attributes.ARMOR).setBaseValue(20);
					if (TempEntity instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
						_livingEntity6.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(12);
					if (TempEntity instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
						_livingEntity7.getAttribute(Attributes.MAX_HEALTH).setBaseValue(30);
					if (TempEntity instanceof LivingEntity _entity)
						_entity.setHealth(30);
				}
				for (int index1 = 0; index1 < 4; index1++) {
					TempEntity = world instanceof ServerLevel _level9 ? EntityType.CAVE_SPIDER.spawn(_level9, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED) : null;
					if (TempEntity instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
						_livingEntity10.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.6);
				}
			} else {
				TempEntity = world instanceof ServerLevel _level11 ? EntityType.SPIDER.spawn(_level11, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED) : null;
				if (TempEntity instanceof LivingEntity _livingEntity12 && _livingEntity12.getAttributes().hasAttribute(Attributes.ARMOR))
					_livingEntity12.getAttribute(Attributes.ARMOR).setBaseValue(20);
				if (TempEntity instanceof LivingEntity _livingEntity13 && _livingEntity13.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity13.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(12);
				if (TempEntity instanceof LivingEntity _livingEntity14 && _livingEntity14.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity14.getAttribute(Attributes.MAX_HEALTH).setBaseValue(30);
				if (TempEntity instanceof LivingEntity _entity)
					_entity.setHealth(30);
				for (int index2 = 0; index2 < 3; index2++) {
					TempEntity = world instanceof ServerLevel _level16 ? EntityType.CAVE_SPIDER.spawn(_level16, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED) : null;
					if (TempEntity instanceof LivingEntity _livingEntity17 && _livingEntity17.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
						_livingEntity17.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.6);
				}
			}
		} else {
			entity.getPersistentData().putDouble("HitCounter", (entity.getPersistentData().getDouble("HitCounter") + 1));
		}
		if (sourceentity instanceof Player && (sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.MACE) {
			sourceentity.hurt(new DamageSource(world.holderOrThrow(DamageTypes.MOB_ATTACK), entity), 8);
			if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(MobEffects.POISON, 60, 1, false, false));
			sourceentity.setDeltaMovement(new Vec3((Math.sin(sourceentity.getYRot()) * (-1.5)), 0.4, (Math.cos(sourceentity.getYRot()) * 1.5)));
		}
	}
}