package com.lapisdev.hype.item;

import com.lapisdev.hype.Hype;
import com.lapisdev.hype.item.custom.EyeofHorus;
import com.lapisdev.hype.item.custom.LegendaryItem;
import com.lapisdev.hype.item.custom.SevenLeagueBoots;
import net.fabricmc.fabric.api.creativetab.v1.CreativeModeTabEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.item.equipment.ArmorType;

import java.util.function.Function;

public class ModItems {
    public static final Item EXCALIBUR = registerItem("excalibur", properties ->  new LegendaryItem(properties.sword(ToolMaterial.NETHERITE, 3.0f, -2.4f)));
    public static final Item EYE_OF_HORUS = registerItem("eye_of_horus", EyeofHorus::new);
    public static final Item SEVEN_LEAGUE_BOOTS = registerItem("seven_league_boots", properties -> new SevenLeagueBoots(properties.humanoidArmor(ModArmorMaterials.SEVEN_LEAGUE, ArmorType.BOOTS)));

    private static Item registerItem(String name, Function<Item.Properties, Item> function){
        return Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(Hype.MOD_ID, name),
                function.apply(new Item.Properties().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Hype.MOD_ID, name)))));
    }

    public static void registeredItems(){
        CreativeModeTabEvents.modifyOutputEvent(CreativeModeTabs.INGREDIENTS).register(output -> {
            output.accept(EXCALIBUR);
            output.accept(EYE_OF_HORUS);
            output.accept(SEVEN_LEAGUE_BOOTS);
        });
    }
}
