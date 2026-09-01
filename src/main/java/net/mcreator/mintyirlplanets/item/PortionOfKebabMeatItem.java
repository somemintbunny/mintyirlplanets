package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PortionOfKebabMeatItem extends Item {
	public PortionOfKebabMeatItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.6f).build()));
	}
}