package net.mcreator.mintyirlplanets.entity;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.vehicle.Boat;
import net.minecraft.world.entity.EntityType;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModItems;

public class SubconsiusBoatEntity extends Boat {
	public SubconsiusBoatEntity(EntityType<SubconsiusBoatEntity> type, Level world) {
		super(type, world, MintyirlplanetsModItems.SUBCONSIUS_BOAT);
	}
}