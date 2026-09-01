package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.Identifier;
import net.minecraft.core.registries.Registries;

import net.mcreator.mintyirlplanets.MintyirlplanetsMod;

public class Disc2Item extends Item {
	public Disc2Item(Item.Properties properties) {
		super(properties.stacksTo(1).jukeboxPlayable(ResourceKey.create(Registries.JUKEBOX_SONG, Identifier.fromNamespaceAndPath(MintyirlplanetsMod.MODID, "disc_2"))));
	}
}