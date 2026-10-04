package com.lapisdev.hype;

import com.lapisdev.hype.item.ModItems;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class CreativeTab {
    public static final CreativeModeTab HYPE_TAB = Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Hype.MOD_ID, "hype_items"), FabricCreativeModeTab.builder().icon(() -> new ItemStack(ModItems.EXCALIBUR))
                    .title(Component.translatable("creativetab.hype"))
                    .displayItems((parameters, output) -> {
                        output.accept(ModItems.EXCALIBUR);
                        output.accept(ModItems.EYE_OF_HORUS);
                        output.accept(ModItems.SEVEN_LEAGUE_BOOTS);
                    }).build());

    public static void registerCreativeTab(){
    }
}
