package com.lapisdev.hype.mixin;

import com.lapisdev.hype.tags.LegendaryStorage;
import net.minecraft.world.Container;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

// Stops players clicking/shift-clicking/swapping legendaries into storage container screens
@Mixin(Slot.class)
public abstract class NoStorageSlotMixin {
    @Shadow @Final public Container container;

    @Inject(method = "mayPlace", at = @At("HEAD"), cancellable = true)
    private void hype$blockLegendariesInStorage(ItemStack itemStack, CallbackInfoReturnable<Boolean> cir) {
        if (LegendaryStorage.isBlocked(container, itemStack)) {
            cir.setReturnValue(false);
        }
    }
}
