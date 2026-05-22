/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mintyirlplanets.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredHolder;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mintyirlplanets.MintyirlplanetsMod;

public class MintyirlplanetsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MintyirlplanetsMod.MODID);
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MOON_BLOCKS = REGISTRY.register("moon_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mintyirlplanets.moon_blocks")).icon(() -> new ItemStack(MintyirlplanetsModBlocks.MOON_ROCK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MintyirlplanetsModBlocks.MOONSHROOM_MOSS.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.MOONSHROOM_2_WOOD.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.MOONSHROOM_2_LOG.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.MOONSHROOM_2_PLANKS.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.MOONSHROOM_2_LEAVES.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.MOONSHROOM_STEM.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.MOONSHROOM_2_STAIRS.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.MOONSHROOM_2_SLAB.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.MOONSHROOM_2_FENCE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.MOONSHROOM_2_FENCE_GATE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.MOONSHROOM_2_PRESSURE_PLATE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.MOONSHROOM_2_BUTTON.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.MOONSHROOM_SPORES.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.SNAP_TRAP.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.TERRACELIUM_MOSS.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.DREAMDROP_ORE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.DARK_MOON_ROCK.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.DARK_MOON_STONE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.MOON_ROCK.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.LIGHT_MOON_STONE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.DAMNED_WOOD.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.DAMNED_LOG.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.DAMNED_PLANKS.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.DAMNED_LEAVES.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.DAMNED_STAIRS.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.DAMNED_SLAB.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.DAMNED_FENCE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.DAMNED_FENCE_GATE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.DAMNED_PRESSURE_PLATE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.DAMNED_BUTTON.get().asItem());
			}).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MARS_BLOCKS = REGISTRY.register("mars_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mintyirlplanets.mars_blocks")).icon(() -> new ItemStack(MintyirlplanetsModBlocks.FERROUS_SAND.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MintyirlplanetsModBlocks.FIBERGLASS.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CLEAR_PLASTC.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.REINFORCED_GLASS.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.FERROUS_SAND.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CORESTONE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CROATIAN_WOOD.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CROATIAN_LOG.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CROATIAN_PLANKS.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CROATIAN_LEAVES.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CROATIAN_STAIRS.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CROATIAN_SLAB.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CROATIAN_FENCE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CROATIAN_FENCE_GATE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CROATIAN_PRESSURE_PLATE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CROATIAN_BUTTON.get().asItem());
			}).withTabsBefore(MOON_BLOCKS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> SATURN_BLOCKS = REGISTRY.register("saturn_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mintyirlplanets.saturn_blocks")).icon(() -> new ItemStack(MintyirlplanetsModBlocks.MOSSY_STRANGE_STONE.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MintyirlplanetsModBlocks.STRANGE_STONE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.STRANGE_ROCK.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.MOSSY_STRANGE_STONE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.AQUAPHER_FLOWER.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.STAR_FLOWER.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.FOSSIL.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CROK_VINE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CROK_BULB.get().asItem());
				tabData.accept(MintyirlplanetsModItems.CROK_ESSENCE.get());
				tabData.accept(MintyirlplanetsModBlocks.POISON_SNAP_TRAP.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.FRAGRENT_LEAVES.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.FRAGRENT_WOOD.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.FRAGRENT_LOG.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.STRIPPED_FRAGRENT_LOG.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.STRIPPED_FRAGRENT_WOOD.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.FRAGRENT_PLANKS.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.FRAGRENT_STAIRS.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.FRAGRENT_SLAB.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.FRAGRENT_FENCE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.FRAGRENT_FENCE_GATE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.FRAGRENT_PRESSURE_PLATE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.FRAGRENT_BUTTON.get().asItem());
			}).withTabsBefore(MARS_BLOCKS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> WEAPONS_AND_TOOLS = REGISTRY.register("weapons_and_tools",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mintyirlplanets.weapons_and_tools")).icon(() -> new ItemStack(MintyirlplanetsModItems.DREAMDROP_SWORD.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MintyirlplanetsModItems.SIVER_SWORD.get());
				tabData.accept(MintyirlplanetsModItems.SIVER_PICKAXE.get());
				tabData.accept(MintyirlplanetsModItems.SIVER_AXE.get());
				tabData.accept(MintyirlplanetsModItems.SIVER_SHOVEL.get());
				tabData.accept(MintyirlplanetsModItems.SIVER_HOE.get());
				tabData.accept(MintyirlplanetsModItems.ALUMINEUM_SWORD.get());
				tabData.accept(MintyirlplanetsModItems.ALUMINEUM_PICKAXE.get());
				tabData.accept(MintyirlplanetsModItems.ALUMINEUM_AXE.get());
				tabData.accept(MintyirlplanetsModItems.ALUMINEUM_SHOVEL.get());
				tabData.accept(MintyirlplanetsModItems.ALUMINEUM_HOE.get());
				tabData.accept(MintyirlplanetsModItems.KRYPTONIUM_SWORD.get());
				tabData.accept(MintyirlplanetsModItems.KRYPTONIUM_PICKAXE.get());
				tabData.accept(MintyirlplanetsModItems.KRYPTONIUM_AXE.get());
				tabData.accept(MintyirlplanetsModItems.KRYPTONIUM_SHOVEL.get());
				tabData.accept(MintyirlplanetsModItems.KRYPTONIUM_HOE.get());
				tabData.accept(MintyirlplanetsModItems.LAZER_SHOOTER.get());
				tabData.accept(MintyirlplanetsModItems.DREAMDROP_SWORD.get());
				tabData.accept(MintyirlplanetsModItems.DREAMDROP_PICKAXE.get());
				tabData.accept(MintyirlplanetsModItems.DREAMDROP_AXE.get());
				tabData.accept(MintyirlplanetsModItems.DREAMDROP_SHOVEL.get());
				tabData.accept(MintyirlplanetsModItems.DREAMDROP_HOE.get());
				tabData.accept(MintyirlplanetsModItems.MYSTICAL_SHOOTER.get());
				tabData.accept(MintyirlplanetsModItems.STRANGE_ENERGY.get());
				tabData.accept(MintyirlplanetsModItems.DEMONIC_SWORD.get());
				tabData.accept(MintyirlplanetsModItems.DEMONIC_AXE.get());
				tabData.accept(MintyirlplanetsModItems.DEMONIC_PICKAXE.get());
				tabData.accept(MintyirlplanetsModItems.DEMONIC_SHOVEL.get());
				tabData.accept(MintyirlplanetsModItems.DEMONIC_HOE.get());
				tabData.accept(MintyirlplanetsModItems.ADAMANTIUMM_SWORD.get());
				tabData.accept(MintyirlplanetsModItems.ADAMANTIUMM_PICKAXE.get());
				tabData.accept(MintyirlplanetsModItems.ADAMANTIUMM_AXE.get());
				tabData.accept(MintyirlplanetsModItems.ADAMANTIUMM_SHOVEL.get());
				tabData.accept(MintyirlplanetsModItems.ADAMANTIUMM_HOE.get());
				tabData.accept(MintyirlplanetsModItems.ADAMANTIUM_SHOOTER.get());
				tabData.accept(MintyirlplanetsModItems.SILVER_BULLET.get());
				tabData.accept(MintyirlplanetsModItems.BRIMSTONE_PICKAXE.get());
				tabData.accept(MintyirlplanetsModItems.BRIMSTONE_AXE.get());
				tabData.accept(MintyirlplanetsModItems.BRIMSTONE_SWORD.get());
				tabData.accept(MintyirlplanetsModItems.BRIMSTONE_SHOVEL.get());
				tabData.accept(MintyirlplanetsModItems.BRIMSTONE_HOE.get());
				tabData.accept(MintyirlplanetsModItems.MOLTEN_SHOOTER.get());
				tabData.accept(MintyirlplanetsModItems.DREAMDROP_BULLET.get());
				tabData.accept(MintyirlplanetsModItems.SOULSTONE_PICKAXE.get());
				tabData.accept(MintyirlplanetsModItems.SOULSTONE_AXE.get());
				tabData.accept(MintyirlplanetsModItems.SOULSTONE_SWORD.get());
				tabData.accept(MintyirlplanetsModItems.SOULSTONE_SHOVEL.get());
				tabData.accept(MintyirlplanetsModItems.SOULSTONE_HOE.get());
				tabData.accept(MintyirlplanetsModItems.MIXOLYDIAN_AXE.get());
				tabData.accept(MintyirlplanetsModItems.MIXOLYDIAN_SWORD.get());
				tabData.accept(MintyirlplanetsModItems.MIXOLYDIAN_PICKAXE.get());
				tabData.accept(MintyirlplanetsModItems.MIXOLYDIAN_SHOVEL.get());
				tabData.accept(MintyirlplanetsModItems.MIXOLYDIAN_HOE.get());
				tabData.accept(MintyirlplanetsModItems.DEBUG_PICK.get());
			}).withTabsBefore(SATURN_BLOCKS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ARMOUR = REGISTRY.register("armour",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mintyirlplanets.armour")).icon(() -> new ItemStack(MintyirlplanetsModItems.DUMMY_1_HELMET.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MintyirlplanetsModItems.SIVER_ARMOR_HELMET.get());
				tabData.accept(MintyirlplanetsModItems.SIVER_ARMOR_CHESTPLATE.get());
				tabData.accept(MintyirlplanetsModItems.SIVER_ARMOR_LEGGINGS.get());
				tabData.accept(MintyirlplanetsModItems.SIVER_ARMOR_BOOTS.get());
				tabData.accept(MintyirlplanetsModItems.ALUMINEUM_ARMOR_HELMET.get());
				tabData.accept(MintyirlplanetsModItems.ALUMINEUM_ARMOR_CHESTPLATE.get());
				tabData.accept(MintyirlplanetsModItems.ALUMINEUM_ARMOR_LEGGINGS.get());
				tabData.accept(MintyirlplanetsModItems.ALUMINEUM_ARMOR_BOOTS.get());
				tabData.accept(MintyirlplanetsModItems.SPACE_HELMET.get());
				tabData.accept(MintyirlplanetsModItems.SPACE_CHESTPLATE.get());
				tabData.accept(MintyirlplanetsModItems.SPACE_LEGGINGS.get());
				tabData.accept(MintyirlplanetsModItems.SPACE_BOOTS.get());
				tabData.accept(MintyirlplanetsModItems.KRYPTONIUM_ARMOR_HELMET.get());
				tabData.accept(MintyirlplanetsModItems.KRYPTONIUM_ARMOR_CHESTPLATE.get());
				tabData.accept(MintyirlplanetsModItems.KRYPTONIUM_ARMOR_LEGGINGS.get());
				tabData.accept(MintyirlplanetsModItems.KRYPTONIUM_ARMOR_BOOTS.get());
				tabData.accept(MintyirlplanetsModItems.DREAMDROP_ARMOR_HELMET.get());
				tabData.accept(MintyirlplanetsModItems.DREAMDROP_ARMOR_CHESTPLATE.get());
				tabData.accept(MintyirlplanetsModItems.DREAMDROP_ARMOR_LEGGINGS.get());
				tabData.accept(MintyirlplanetsModItems.DREAMDROP_ARMOR_BOOTS.get());
				tabData.accept(MintyirlplanetsModItems.ADAMANTIUMM_ARMOR_HELMET.get());
				tabData.accept(MintyirlplanetsModItems.ADAMANTIUMM_ARMOR_CHESTPLATE.get());
				tabData.accept(MintyirlplanetsModItems.ADAMANTIUMM_ARMOR_LEGGINGS.get());
				tabData.accept(MintyirlplanetsModItems.ADAMANTIUMM_ARMOR_BOOTS.get());
				tabData.accept(MintyirlplanetsModItems.DEMONIC_ARMOR_HELMET.get());
				tabData.accept(MintyirlplanetsModItems.DEMONIC_ARMOR_CHESTPLATE.get());
				tabData.accept(MintyirlplanetsModItems.DEMONIC_ARMOR_LEGGINGS.get());
				tabData.accept(MintyirlplanetsModItems.DEMONIC_ARMOR_BOOTS.get());
				tabData.accept(MintyirlplanetsModItems.DEBUGGER_ARMOUR_HELMET.get());
				tabData.accept(MintyirlplanetsModItems.DEBUGGER_ARMOUR_CHESTPLATE.get());
				tabData.accept(MintyirlplanetsModItems.DEBUGGER_ARMOUR_LEGGINGS.get());
				tabData.accept(MintyirlplanetsModItems.DEBUGGER_ARMOUR_BOOTS.get());
				tabData.accept(MintyirlplanetsModItems.SOULSTONE_ARMOR_HELMET.get());
				tabData.accept(MintyirlplanetsModItems.SOULSTONE_ARMOR_CHESTPLATE.get());
				tabData.accept(MintyirlplanetsModItems.SOULSTONE_ARMOR_LEGGINGS.get());
				tabData.accept(MintyirlplanetsModItems.SOULSTONE_ARMOR_BOOTS.get());
				tabData.accept(MintyirlplanetsModItems.BRIMSTONE_ARMOR_HELMET.get());
				tabData.accept(MintyirlplanetsModItems.BRIMSTONE_ARMOR_CHESTPLATE.get());
				tabData.accept(MintyirlplanetsModItems.BRIMSTONE_ARMOR_LEGGINGS.get());
				tabData.accept(MintyirlplanetsModItems.BRIMSTONE_ARMOR_BOOTS.get());
				tabData.accept(MintyirlplanetsModItems.MIXOLYDIAN_ARMOR_HELMET.get());
				tabData.accept(MintyirlplanetsModItems.MIXOLYDIAN_ARMOR_CHESTPLATE.get());
				tabData.accept(MintyirlplanetsModItems.MIXOLYDIAN_ARMOR_LEGGINGS.get());
				tabData.accept(MintyirlplanetsModItems.MIXOLYDIAN_ARMOR_BOOTS.get());
			}).withTabsBefore(WEAPONS_AND_TOOLS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MOB_SPAWNING = REGISTRY.register("mob_spawning",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mintyirlplanets.mob_spawning")).icon(() -> new ItemStack(MintyirlplanetsModItems.EYEZOR_SPAWN_EGG.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MintyirlplanetsModItems.EYEZOR_SPAWN_EGG.get());
				tabData.accept(MintyirlplanetsModItems.REAPER_SPAWN_EGG.get());
				tabData.accept(MintyirlplanetsModItems.DEBUGGER_SPAWN_EGG.get());
				tabData.accept(MintyirlplanetsModItems.THE_CRUSHER_SPAWN_EGG.get());
				tabData.accept(MintyirlplanetsModItems.SHRUMPHER_SPAWN_EGG.get());
				tabData.accept(MintyirlplanetsModItems.MARTIAN_SPAWN_EGG.get());
				tabData.accept(MintyirlplanetsModItems.CHOKED_ZOMBIE_SPAWN_EGG.get());
				tabData.accept(MintyirlplanetsModItems.STILL_SLINGER_SPAWN_EGG.get());
				tabData.accept(MintyirlplanetsModItems.NIGHTMARE_SPAWN_EGG.get());
				tabData.accept(MintyirlplanetsModItems.LARRY_SPAWN_EGG.get());
				tabData.accept(MintyirlplanetsModItems.GLEEP_GLORP_SPAWN_EGG.get());
			}).withTabsBefore(ARMOUR.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MUSIC_DISCS = REGISTRY.register("music_discs",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mintyirlplanets.music_discs")).icon(() -> new ItemStack(MintyirlplanetsModItems.DISC_1.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MintyirlplanetsModItems.BLANK_DISC.get());
				tabData.accept(MintyirlplanetsModItems.DARK_MOONDISC.get());
				tabData.accept(MintyirlplanetsModItems.DISC_2.get());
				tabData.accept(MintyirlplanetsModItems.MUSIC_DISC_MARS.get());
				tabData.accept(MintyirlplanetsModItems.TORN_FIBERS.get());
				tabData.accept(MintyirlplanetsModItems.DISC_1.get());
			}).withTabsBefore(MOB_SPAWNING.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MINERALS = REGISTRY.register("minerals",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mintyirlplanets.minerals")).icon(() -> new ItemStack(MintyirlplanetsModItems.DREAMDROP.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MintyirlplanetsModBlocks.SIVER_ORE.get().asItem());
				tabData.accept(MintyirlplanetsModItems.RAW_SILVER.get());
				tabData.accept(MintyirlplanetsModBlocks.RAW_SILVER_BLOCK.get().asItem());
				tabData.accept(MintyirlplanetsModItems.SIVER_INGOT.get());
				tabData.accept(MintyirlplanetsModBlocks.SIVER_BLOCK.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.ALUMINUM_ORE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.ALUMINEUM_BLOCK.get().asItem());
				tabData.accept(MintyirlplanetsModItems.BAUXITE.get());
				tabData.accept(MintyirlplanetsModItems.ALUMINEUM.get());
				tabData.accept(MintyirlplanetsModBlocks.ALUMINUM_BLOCK.get().asItem());
				tabData.accept(MintyirlplanetsModItems.KRYPTONIUM.get());
				tabData.accept(MintyirlplanetsModBlocks.KRYPTONIUM_BLOCK.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.KRYPTONIUM_ORE.get().asItem());
				tabData.accept(MintyirlplanetsModItems.DREAMDROP.get());
				tabData.accept(MintyirlplanetsModBlocks.DREAMDROP_BLOCK.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.DEMONIC_BLOCK.get().asItem());
				tabData.accept(MintyirlplanetsModItems.RAW_DEMONIC_ORE.get());
				tabData.accept(MintyirlplanetsModItems.DEMONIC_INGOT.get());
				tabData.accept(MintyirlplanetsModBlocks.DEMONIC_ORE.get().asItem());
				tabData.accept(MintyirlplanetsModItems.RAW_ADAMANTIUM.get());
				tabData.accept(MintyirlplanetsModItems.ADAMANTIUMM.get());
				tabData.accept(MintyirlplanetsModBlocks.ADAMANTIUMM_BLOCK.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.ADAMANTIUMM_ORE.get().asItem());
				tabData.accept(MintyirlplanetsModItems.BRIMSTONE.get());
				tabData.accept(MintyirlplanetsModBlocks.BRIMSTONE_ORE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.BRIMSTONE_BLOCK.get().asItem());
				tabData.accept(MintyirlplanetsModItems.SOULSTONE.get());
				tabData.accept(MintyirlplanetsModBlocks.SOULSTONE_ORE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.SOULSTONE_BLOCK.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.METEORITE.get().asItem());
				tabData.accept(MintyirlplanetsModItems.MOLDEDMETEORITE.get());
			}).withTabsBefore(MUSIC_DISCS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> FOOD = REGISTRY.register("food",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mintyirlplanets.food")).icon(() -> new ItemStack(MintyirlplanetsModItems.HELL_FRUIT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MintyirlplanetsModItems.TV_MEAT.get());
				tabData.accept(MintyirlplanetsModItems.GLUCOSIDE_EXTRACT.get());
				tabData.accept(MintyirlplanetsModItems.HELL_FRUIT.get());
				tabData.accept(MintyirlplanetsModItems.TOSSER_TOT.get());
				tabData.accept(MintyirlplanetsModItems.FRAGRENT_BARK.get());
				tabData.accept(MintyirlplanetsModItems.MEAT.get());
				tabData.accept(MintyirlplanetsModItems.COOKED_MEAT.get());
				tabData.accept(MintyirlplanetsModItems.MARTIAN_SALAD.get());
			}).withTabsBefore(MINERALS.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> MISC = REGISTRY.register("misc",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mintyirlplanets.misc")).icon(() -> new ItemStack(MintyirlplanetsModItems.THE_MOON.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MintyirlplanetsModItems.THE_MOON.get());
				tabData.accept(MintyirlplanetsModItems.MARS.get());
				tabData.accept(MintyirlplanetsModItems.SATURN.get());
				tabData.accept(MintyirlplanetsModItems.COLD_DUST.get());
				tabData.accept(MintyirlplanetsModItems.PLANT_STEM.get());
				tabData.accept(MintyirlplanetsModItems.ANTIMATTER.get());
				tabData.accept(MintyirlplanetsModItems.LIGHT_MOON_PEBBLE.get());
				tabData.accept(MintyirlplanetsModItems.MOON_PEBBLE.get());
				tabData.accept(MintyirlplanetsModItems.FIBER_BALL.get());
				tabData.accept(MintyirlplanetsModItems.FRAGRENT_BARK.get());
				tabData.accept(MintyirlplanetsModItems.ALIEN_HYDE.get());
				tabData.accept(MintyirlplanetsModItems.STRANGE_PEBBLE.get());
				tabData.accept(MintyirlplanetsModItems.DRAGON_FOSSIL.get());
				tabData.accept(MintyirlplanetsModBlocks.UNLIT_FANCY_CANDLE.get().asItem());
				tabData.accept(MintyirlplanetsModItems.THE_ANTIDOTE.get());
				tabData.accept(MintyirlplanetsModItems.GUSTAVIUM_BUCKET.get());
				tabData.accept(MintyirlplanetsModItems.TOXIC_WASTE_BUCKET.get());
				tabData.accept(MintyirlplanetsModBlocks.SMOTHE_BONE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.BONE_BRICKS.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CHIZZELED_BONE.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CRACKED_BONE_BRICK.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.SMOTH_BONE_SLAB.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.BONE_BRICK_SLAB.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CHIZZELED_BONE_SLAB.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.CRACKED_BONE_BRICK_SLAB.get().asItem());
				tabData.accept(MintyirlplanetsModBlocks.BONE_SLAB.get().asItem());
				tabData.accept(MintyirlplanetsModItems.HELIUM_SHARD.get());
				tabData.accept(MintyirlplanetsModItems.FLOWER_CROWN_HELMET.get());
				tabData.accept(MintyirlplanetsModItems.FLOWER_CROWN_CHESTPLATE.get());
			}).withTabsBefore(FOOD.getId()).build());
	public static final DeferredHolder<CreativeModeTab, CreativeModeTab> ENDGAME_BLOCKS = REGISTRY.register("endgame_blocks",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mintyirlplanets.endgame_blocks")).icon(() -> new ItemStack(MintyirlplanetsModItems.DEBUG_PICK.get())).displayItems((parameters, tabData) -> {
				tabData.accept(MintyirlplanetsModItems.DEBUG_PICK.get());
				tabData.accept(MintyirlplanetsModItems.DEBUGGER_ARMOUR_HELMET.get());
				tabData.accept(MintyirlplanetsModItems.DEBUGGER_ARMOUR_CHESTPLATE.get());
				tabData.accept(MintyirlplanetsModItems.DEBUGGER_ARMOUR_LEGGINGS.get());
				tabData.accept(MintyirlplanetsModItems.DEBUGGER_ARMOUR_BOOTS.get());
			}).withTabsBefore(MISC.getId()).build());
}