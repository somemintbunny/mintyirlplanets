package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.ParticleTypes;

public class HopperNymphEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (world instanceof ServerLevel _level)
			_level.sendParticles(ParticleTypes.SPIT, x, y, z, 10, 0, 3, 0, 2);
	}
}