package com.lapisdev.hype.events;

import com.lapisdev.hype.tags.ModTags;
import net.fabricmc.fabric.api.event.lifecycle.v1.ServerEntityEvents;
import net.minecraft.world.entity.item.ItemEntity;

public class LegendaryEvents {
    public static void register(){
        ServerEntityEvents.ENTITY_LOAD.register(((entity, level) -> {
            if (entity instanceof ItemEntity item && item.getItem().is(ModTags.LEGENDARY)){
                item.setUnlimitedLifetime();
            }
        }));
    }
}
