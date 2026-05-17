package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModFluids;

public class GustaviumItem extends BucketItem {
	public GustaviumItem(Item.Properties properties) {
		super(MintyirlplanetsModFluids.GUSTAVIUM.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}