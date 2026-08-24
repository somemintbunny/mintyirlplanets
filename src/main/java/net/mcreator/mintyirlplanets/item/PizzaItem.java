package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class PizzaItem extends Item {
	public PizzaItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.6f).build(), Consumables.defaultFood().consumeSeconds(3.1F).build()));
	}
}