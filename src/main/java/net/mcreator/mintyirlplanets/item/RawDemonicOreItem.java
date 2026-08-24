package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class RawDemonicOreItem extends Item {
	public RawDemonicOreItem(Item.Properties properties) {
		super(properties.stacksTo(99));
	}

	@Override
	public ItemUseAnimation getUseAnimation(ItemStack itemstack) {
		return ItemUseAnimation.BOW;
	}
}