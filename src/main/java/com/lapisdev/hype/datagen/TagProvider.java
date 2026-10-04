package com.lapisdev.hype.datagen;

import com.lapisdev.hype.item.ModItems;
import com.lapisdev.hype.tags.ModTags;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;

import java.util.concurrent.CompletableFuture;

public class TagProvider extends FabricTagsProvider.ItemTagsProvider {
    public TagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registryLookupFuture) {
        super(output, registryLookupFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider registries) {
        valueLookupBuilder(ModTags.LEGENDARY)
                .add(ModItems.EXCALIBUR)
                .add(ModItems.EYE_OF_HORUS);
    }
}
