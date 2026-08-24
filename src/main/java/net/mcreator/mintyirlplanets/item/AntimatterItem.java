package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class AntimatterItem extends Item {
	public AntimatterItem(Item.Properties properties) {
		super(properties.rarity(Rarity.RARE).stacksTo(99));
	}
}