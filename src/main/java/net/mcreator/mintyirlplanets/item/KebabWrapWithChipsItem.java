package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class KebabWrapWithChipsItem extends Item {
	public KebabWrapWithChipsItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.8f).build(), Consumables.defaultFood().consumeSeconds(2.75F).build()));
	}
}