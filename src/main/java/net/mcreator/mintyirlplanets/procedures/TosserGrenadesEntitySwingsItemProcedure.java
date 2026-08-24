package net.mcreator.mintyirlplanets.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.projectile.Projectile;
import net.minecraft.world.entity.projectile.AbstractArrow;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.registries.Registries;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModEntities;
import net.mcreator.mintyirlplanets.entity.TosserGrenadeEntity;

public class TosserGrenadesEntitySwingsItemProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (world instanceof ServerLevel projectileLevel) {
			Projectile _entityToSpawn = initArrowProjectile(new TosserGrenadeEntity(MintyirlplanetsModEntities.TOSSER_GRENADE.get(), 0, 0, 0, projectileLevel, createArrowWeaponItemStack(projectileLevel, 3, (byte) 0)), entity, 20, true, false, false,
					AbstractArrow.Pickup.DISALLOWED);
			_entityToSpawn.setPos(x, (y + 1.3), z);
			_entityToSpawn.shoot((entity.getLookAngle().x), (entity.getLookAngle().y + 0.1), (entity.getLookAngle().z), (float) 0.5, 0);
			projectileLevel.addFreshEntity(_entityToSpawn);
		}
	}

	private static AbstractArrow initArrowProjectile(AbstractArrow entityToSpawn, Entity shooter, float damage, boolean silent, boolean fire, boolean particles, AbstractArrow.Pickup pickup) {
		entityToSpawn.setOwner(shooter);
		entityToSpawn.setBaseDamage(damage);
		if (silent)
			entityToSpawn.setSilent(true);
		if (fire)
			entityToSpawn.igniteForSeconds(100);
		if (particles)
			entityToSpawn.setCritArrow(true);
		entityToSpawn.pickup = pickup;
		return entityToSpawn;
	}

	private static ItemStack createArrowWeaponItemStack(Level level, int knockback, byte piercing) {
		ItemStack weapon = new ItemStack(Items.ARROW);
		if (knockback > 0)
			weapon.enchant(level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.KNOCKBACK), knockback);
		if (piercing > 0)
			weapon.enchant(level.registryAccess().lookupOrThrow(Registries.ENCHANTMENT).getOrThrow(Enchantments.PIERCING), piercing);
		return weapon;
	}
}