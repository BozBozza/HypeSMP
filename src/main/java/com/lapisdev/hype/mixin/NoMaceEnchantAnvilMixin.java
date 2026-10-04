package com.lapisdev.hype.mixin;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Enchantment.class)
public abstract class NoMaceEnchantAnvilMixin {
    @Inject(method = "canEnchant", at = @At("HEAD"), cancellable = true)
    private void hype$blockMaceEnchanting(ItemStack itemStack, CallbackInfoReturnable<Boolean> cir) {
        if (itemStack.is(Items.MACE)) {
            cir.setReturnValue(false);
        }
    }
}
