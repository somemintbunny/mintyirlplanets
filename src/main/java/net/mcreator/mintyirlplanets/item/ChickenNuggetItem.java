package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;

public class ChickenNuggetItem extends Item {
	public ChickenNuggetItem(Item.Properties properties) {
		super(properties.stacksTo(99).food((new FoodProperties.Builder()).nutrition(2).saturationModifier(0.5f).build(), Consumables.defaultFood().consumeSeconds(1F).build()));
	}
}