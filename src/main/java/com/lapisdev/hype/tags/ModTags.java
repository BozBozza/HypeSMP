package com.lapisdev.hype.tags;

import com.lapisdev.hype.Hype;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModTags {
    public static final TagKey<Item> LEGENDARY = TagKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(Hype.MOD_ID, "legendary"));
}
