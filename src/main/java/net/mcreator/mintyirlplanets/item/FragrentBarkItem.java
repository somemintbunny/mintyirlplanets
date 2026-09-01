package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class FragrentBarkItem extends Item {
	public FragrentBarkItem(Item.Properties properties) {
		super(properties.stacksTo(99).food((new FoodProperties.Builder()).nutrition(5).saturationModifier(0.1f).build(), Consumables.defaultFood().consumeSeconds(3F).build()));
	}
}