package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.entity.Entity;

public class WormPlaybackConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !entity.isAlive();
	}
}