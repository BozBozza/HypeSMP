package com.lapisdev.hype.item.custom;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.component.TooltipDisplay;

import java.util.function.Consumer;

public class SevenLeagueBoots extends LegendaryItem {
    public SevenLeagueBoots(Properties properties) {super(properties);}

    private static final int EFFECT_DURATION = 40;

    @Override
    public void inventoryTick(ItemStack stack, ServerLevel level, Entity entity, EquipmentSlot slot){
        super.inventoryTick(stack, level, entity, slot);

        if (slot != EquipmentSlot.FEET) return;
        if (!(entity instanceof LivingEntity living)) return;

        living.addEffect(new MobEffectInstance(MobEffects.SPEED, EFFECT_DURATION, 1, true, false));
    }

    @Override
    @SuppressWarnings("deprecation") // still the simplest way to add tooltip lines, works fine
    public void appendHoverText(ItemStack stack, TooltipContext context, TooltipDisplay display, Consumer<Component> tooltip, TooltipFlag flag) {
        super.appendHoverText(stack, context, display, tooltip, flag);
        tooltip.accept(Component.translatable("tooltip.hype.seven_league_boots").withStyle(ChatFormatting.BLUE));
    }
}
