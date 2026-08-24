package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class SliceOfCheeseItem extends Item {
	public SliceOfCheeseItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.3f).build()));
	}
}