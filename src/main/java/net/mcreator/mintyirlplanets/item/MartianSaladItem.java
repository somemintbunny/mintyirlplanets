package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.component.TooltipDisplay;
import net.minecraft.world.item.component.Consumables;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.network.chat.Component;

import net.mcreator.mintyirlplanets.procedures.MartianSaladPlayerFinishesUsingItemProcedure;

import java.util.function.Consumer;

public class MartianSaladItem extends Item {
	public MartianSaladItem(Item.Properties properties) {
		super(properties.stacksTo(99).food((new FoodProperties.Builder()).nutrition(15).saturationModifier(1f).build(), Consumables.defaultFood().animation(ItemUseAnimation.NONE).consumeSeconds(1.5F).build()).usingConvertsTo(Items.BOWL));
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Item.TooltipContext context, TooltipDisplay tooltipDisplay, Consumer<Component> componentConsumer, TooltipFlag flag) {
		super.appendHoverText(itemstack, context, tooltipDisplay, componentConsumer, flag);
		componentConsumer.accept(Component.translatable("item.mintyirlplanets.martian_salad.description_0"));
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		MartianSaladPlayerFinishesUsingItemProcedure.execute(entity);
		return retval;
	}
}