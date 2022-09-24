package com.beep67.simplicity.datagen.provider;

import com.beep67.simplicity.core.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator dataGenerator, String modId, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockInit.GREENSCHIST.get());
    }
}
