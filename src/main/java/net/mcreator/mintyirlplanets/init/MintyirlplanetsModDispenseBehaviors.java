/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mintyirlplanets.init;

import net.neoforged.fml.event.lifecycle.FMLCommonSetupEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.block.DispenserBlock;
import net.minecraft.core.dispenser.BoatDispenseItemBehavior;

@EventBusSubscriber
public class MintyirlplanetsModDispenseBehaviors {
	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			DispenserBlock.registerBehavior(MintyirlplanetsModItems.SUBCONSIUS_BOAT.get(), new BoatDispenseItemBehavior(MintyirlplanetsModEntities.SUBCONSIUS_BOAT.get()));
			DispenserBlock.registerBehavior(MintyirlplanetsModItems.SUBCONSIUS_CHEST_BOAT.get(), new BoatDispenseItemBehavior(MintyirlplanetsModEntities.SUBCONSIUS_CHEST_BOAT.get()));
		});
	}
}