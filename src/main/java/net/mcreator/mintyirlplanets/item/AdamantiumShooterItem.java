package net.mcreator.mintyirlplanets.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.ItemUseAnimation;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.InteractionHand;

import net.mcreator.mintyirlplanets.procedures.AdamantiumShooterRightclickedProcedure;

public class AdamantiumShooterItem extends Item {
	public AdamantiumShooterItem(Item.Properties properties) {
		super(properties.stacksTo(1));
	}

	@Override
	public ItemUseAnimation getUseAnimation(ItemStack itemstack) {
		return ItemUseAnimation.BOW;
	}

	@Override
	public int getUseDuration(ItemStack itemstack, LivingEntity livingEntity) {
		return 10;
	}

	@Override
	public InteractionResult use(Level world, Player entity, InteractionHand hand) {
		InteractionResult ar = super.use(world, entity, hand);
		entity.startUsingItem(hand);
		return ar;
	}

	@Override
	public ItemStack finishUsingItem(ItemStack itemstack, Level world, LivingEntity entity) {
		ItemStack retval = super.finishUsingItem(itemstack, world, entity);
		AdamantiumShooterRightclickedProcedure.execute(world, entity.getX(), entity.getY(), entity.getZ(), entity);
		return retval;
	}
}