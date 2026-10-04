package com.lapisdev.hype.mixin;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(ItemStack.class)
public abstract class NoMaceEnchantTableMixin {
    @Inject(method = "isEnchantable", at = @At("HEAD"), cancellable = true)
    private void hype$blockMaceEnchanting(CallbackInfoReturnable<Boolean> cir) {
        if (((ItemStack) (Object) this).is(Items.MACE)) {
            cir.setReturnValue(false);
        }
    }
}
