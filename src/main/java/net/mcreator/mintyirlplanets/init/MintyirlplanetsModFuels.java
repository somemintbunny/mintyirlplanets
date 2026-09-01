/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mintyirlplanets.init;

import net.neoforged.neoforge.event.furnace.FurnaceFuelBurnTimeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.item.ItemStack;

@EventBusSubscriber
public class MintyirlplanetsModFuels {
	@SubscribeEvent
	public static void furnaceFuelBurnTimeEvent(FurnaceFuelBurnTimeEvent event) {
		ItemStack itemstack = event.getItemStack();
		if (itemstack.getItem() == MintyirlplanetsModBlocks.MOONSHROOM_2_PLANKS.get().asItem())
			event.setBurnTime(1200);
		else if (itemstack.getItem() == MintyirlplanetsModBlocks.DAMNED_PLANKS.get().asItem())
			event.setBurnTime(1200);
		else if (itemstack.getItem() == MintyirlplanetsModBlocks.CROATIAN_PLANKS.get().asItem())
			event.setBurnTime(1200);
		else if (itemstack.getItem() == MintyirlplanetsModBlocks.FRAGRENT_PLANKS.get().asItem())
			event.setBurnTime(1200);
		else if (itemstack.getItem() == MintyirlplanetsModBlocks.SUBCONSIUS_PLANKS.get().asItem())
			event.setBurnTime(1200);
		else if (itemstack.getItem() == MintyirlplanetsModItems.INSPIRING_ESSENCE.get())
			event.setBurnTime(3200);
	}
}