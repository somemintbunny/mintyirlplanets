package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ChipButtyItem extends Item {
	public ChipButtyItem(Item.Properties properties) {
		super(properties.food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.4f).build(), Consumables.defaultFood().consumeSeconds(2F).build()));
	}
}