package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BlueberryItem extends Item {
	public BlueberryItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(5).saturationModifier(1f).build()));
	}
}