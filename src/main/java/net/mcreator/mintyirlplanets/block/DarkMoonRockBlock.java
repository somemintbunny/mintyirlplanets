package net.mcreator.mintyirlplanets.block;

import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.network.chat.Component;

import net.mcreator.mintyirlplanets.init.MintyirlplanetsModBlocks;

import java.util.function.Consumer;

public class DarkMoonRockBlock extends Block {
	public DarkMoonRockBlock(BlockBehaviour.Properties properties) {
		super(properties.sound(SoundType.BASALT).strength(3f, 10f).speedFactor(0.6f));
	}

	public static class Item extends BlockItem {
		public Item(Item.Properties properties) {
			super(MintyirlplanetsModBlocks.DARK_MOON_ROCK.get(), properties);
		}

		@Override
		public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
			super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
			componentConsumer.accept(Component.translatable("block.mintyirlplanets.dark_moon_rock.description_0"));
		}
	}
}