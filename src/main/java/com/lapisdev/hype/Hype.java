package com.lapisdev.hype;

import com.lapisdev.hype.events.LegendaryEvents;
import com.lapisdev.hype.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Hype implements ModInitializer {
    public static final String MOD_ID = "hype";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModItems.registeredItems();
        CreativeTab.registerCreativeTab();

        LegendaryEvents.register();
    }
}
