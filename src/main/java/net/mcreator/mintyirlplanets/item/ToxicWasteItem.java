package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BucketItem;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModFluids;

public class ToxicWasteItem extends BucketItem {
	public ToxicWasteItem(Item.Properties properties) {
		super(MintyirlplanetsModFluids.TOXIC_WASTE.get(), properties.craftRemainder(Items.BUCKET).stacksTo(1)

		);
	}
}