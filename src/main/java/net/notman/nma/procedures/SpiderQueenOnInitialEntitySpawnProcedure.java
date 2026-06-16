package net.notman.nma.procedures;

import net.minecraft.world.entity.Entity;

public class SpiderQueenOnInitialEntitySpawnProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		entity.getPersistentData().putDouble("HitCounter", 0);
	}
}