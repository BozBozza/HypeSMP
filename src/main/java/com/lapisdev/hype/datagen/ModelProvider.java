package com.lapisdev.hype.datagen;

import com.lapisdev.hype.item.ModItems;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.model.ModelTemplates;

public class ModelProvider extends FabricModelProvider {
    public ModelProvider(FabricPackOutput output) {super(output);}

    @Override
    public void generateBlockStateModels(BlockModelGenerators blockModelGenerators) {

    }

    @Override
    public void generateItemModels(ItemModelGenerators itemModelGenerators) {
        itemModelGenerators.generateFlatItem(ModItems.EXCALIBUR, ModelTemplates.FLAT_HANDHELD_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.EYE_OF_HORUS, ModelTemplates.FLAT_ITEM);
        itemModelGenerators.generateFlatItem(ModItems.SEVEN_LEAGUE_BOOTS, ModelTemplates.FLAT_ITEM);
    }
}
