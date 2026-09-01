package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class InspiringEssenceItem extends Item {
	public InspiringEssenceItem(Item.Properties properties) {
		super(properties.rarity(Rarity.EPIC).stacksTo(99).fireResistant());
	}

@Override public ItemUseAnimation getUseAnimation(ItemStack itemstack) {
	return ItemUseAnimation.BOW;
}
}