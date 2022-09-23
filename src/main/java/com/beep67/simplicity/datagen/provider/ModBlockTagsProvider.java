package com.beep67.simplicity.datagen.provider;

import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator dataGenerator, String modId,ExistingFileHelper existingFileHelper) {
        super(dataGenerator, modId, existingFileHelper);
    }
}
