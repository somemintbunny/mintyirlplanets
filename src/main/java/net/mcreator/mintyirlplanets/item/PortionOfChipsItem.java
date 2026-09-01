package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PortionOfChipsItem extends Item {
	public PortionOfChipsItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.2f).build()));
	}
}