package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BigSalmonItem extends Item {
	public BigSalmonItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(4).saturationModifier(0.5f).build(), Consumables.defaultFood().consumeSeconds(2.75F).build()));
	}
}