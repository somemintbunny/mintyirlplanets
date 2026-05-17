package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HellFruitItem extends Item {
	public HellFruitItem(Item.Properties properties) {
		super(properties.stacksTo(99).food((new FoodProperties.Builder()).nutrition(10).saturationModifier(1f).build(), Consumables.defaultFood().consumeSeconds(0F).build()));
	}
}