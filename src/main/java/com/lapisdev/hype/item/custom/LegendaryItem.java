package com.lapisdev.hype.item.custom;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class LegendaryItem extends Item {
    public LegendaryItem(Properties properties) {super(properties.fireResistant().rarity(Rarity.EPIC));}

    @Override
    public boolean canFitInsideContainerItems(){
        return false;
    }
}
