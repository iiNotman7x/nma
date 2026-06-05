package net.mcreator.aerosmp.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class SpiderQueenEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() <= 0.3) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = EntityType.SPIDER.spawn(_level, BlockPos.containing(x + Mth.nextInt(RandomSource.create(), -3, 3), y + 1, z + Mth.nextInt(RandomSource.create(), -3, 3)), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}