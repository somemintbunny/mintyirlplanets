package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class MeatItem extends Item {
	public MeatItem(Item.Properties properties) {
		super(properties.stacksTo(99).food((new FoodProperties.Builder()).nutrition(3).saturationModifier(0.2f).build()).usingConvertsTo(Items.BONE));
	}
}