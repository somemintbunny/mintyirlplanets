package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class HerbalLeafItem extends Item {
	public HerbalLeafItem(Item.Properties properties) {
		super(properties.stacksTo(99).food((new FoodProperties.Builder()).nutrition(7).saturationModifier(0.5f).build(), Consumables.defaultFood().consumeSeconds(1F).build()));
	}
}