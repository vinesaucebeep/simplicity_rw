package com.beep67.simplicity.datagen.provider;

import com.beep67.simplicity.core.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class ModBlockTagsProvider extends BlockTagsProvider {
    public ModBlockTagsProvider(DataGenerator dataGenerator, String modId, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, modId, existingFileHelper);
    }

    @Override
    protected void addTags() {

        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(BlockInit.GREENSCHIST.get())
                .add(BlockInit.POLISHED_GREENSCHIST.get())
                .add(BlockInit.GREENSCHIST_BRICKS.get())
                .add(BlockInit.GREENSCHIST_TILES.get())
                .add(BlockInit.CHISELED_GREENSCHIST.get())
                .add(BlockInit.CRACKED_GREENSCHIST_BRICKS.get())
                .add(BlockInit.CRACKED_GREENSCHIST_TILES.get())
                .add(BlockInit.SCORIA.get());




    }
}
