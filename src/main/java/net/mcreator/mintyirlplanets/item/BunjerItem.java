package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class BunjerItem extends Item {
	public BunjerItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.5f).build(), Consumables.defaultFood().consumeSeconds(1.7F).build()));
	}
}