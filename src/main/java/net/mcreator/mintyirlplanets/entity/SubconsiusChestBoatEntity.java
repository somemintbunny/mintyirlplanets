package net.mcreator.mintyirlplanets.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.ChestBoat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModItems;

public class SubconsiusChestBoatEntity extends ChestBoat {
	public SubconsiusChestBoatEntity(EntityType<SubconsiusChestBoatEntity> type, Level world) {
		super(type, world, MintyirlplanetsModItems.SUBCONSIUS_CHEST_BOAT);
	}
}