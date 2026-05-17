package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class CookedMeatItem extends Item {
	public CookedMeatItem(Item.Properties properties) {
		super(properties.stacksTo(99).food((new FoodProperties.Builder()).nutrition(6).saturationModifier(0.6f).build(), Consumables.defaultFood().consumeSeconds(1.3F).build()));
	}
}