package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.Item;

public class MoldedmeteoriteItem extends Item {
	public MoldedmeteoriteItem(Item.Properties properties) {
		super(properties.stacksTo(99).fireResistant());
	}
}