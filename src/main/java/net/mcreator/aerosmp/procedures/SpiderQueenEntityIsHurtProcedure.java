package net.mcreator.aerosmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class SpiderQueenEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity spider_armored = null;
		Entity spider_speedy = null;
		double hurt_counter = 0;
		double num_armored = 0;
		double num_speedy = 0;
		num_armored = entity.getPersistentData().getBoolean("ominous") ? 2 : 1;
		num_speedy = entity.getPersistentData().getBoolean("ominous") ? 4 : 3;
		hurt_counter = entity.getPersistentData().getDouble("hurt_counter");
		if (hurt_counter >= 10) {
			entity.getPersistentData().putDouble("hurt_counter", 0);
			for (int index0 = 0; index0 < (int) num_armored; index0++) {
				spider_armored = world instanceof ServerLevel _level4 ? EntityType.SPIDER.spawn(_level4, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED) : null;
				if (spider_armored instanceof LivingEntity _livingEntity5 && _livingEntity5.getAttributes().hasAttribute(Attributes.ARMOR))
					_livingEntity5.getAttribute(Attributes.ARMOR).setBaseValue(20);
				if (spider_armored instanceof LivingEntity _livingEntity6 && _livingEntity6.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity6.getAttribute(Attributes.MAX_HEALTH).setBaseValue(30);
				if (spider_armored instanceof LivingEntity _livingEntity7 && _livingEntity7.getAttributes().hasAttribute(Attributes.ATTACK_DAMAGE))
					_livingEntity7.getAttribute(Attributes.ATTACK_DAMAGE).setBaseValue(12);
				if (spider_armored instanceof LivingEntity _entity)
					_entity.setHealth(30);
			}
			for (int index1 = 0; index1 < (int) num_speedy; index1++) {
				spider_speedy = world instanceof ServerLevel _level9 ? EntityType.CAVE_SPIDER.spawn(_level9, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED) : null;
				if (spider_speedy instanceof LivingEntity _livingEntity10 && _livingEntity10.getAttributes().hasAttribute(Attributes.MOVEMENT_SPEED))
					_livingEntity10.getAttribute(Attributes.MOVEMENT_SPEED).setBaseValue(0.7);
				if (spider_speedy instanceof LivingEntity _livingEntity11 && _livingEntity11.getAttributes().hasAttribute(Attributes.MAX_HEALTH))
					_livingEntity11.getAttribute(Attributes.MAX_HEALTH).setBaseValue(5);
				if (spider_speedy instanceof LivingEntity _entity)
					_entity.setHealth(5);
			}
		} else {
			entity.getPersistentData().putDouble("hurt_counter", (hurt_counter + 1));
		}
	}
}