package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.core.registries.Registries;

import net.mcreator.mintyirlplanets.MintyirlplanetsMod;

public class Disc1Item extends Item {
	public Disc1Item(Item.Properties properties) {
		super(properties.stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, ResourceLocation.fromNamespaceAndPath(MintyirlplanetsMod.MODID, "disc_1"))));
	}
}