package com.beep67.simplicity.datagen.provider;

import com.beep67.simplicity.Simplicity;
import com.beep67.simplicity.core.init.BlockInit;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Objects;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(DataGenerator dataGenerator, String modId, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, modId, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {

        cubeAllModBlock(BlockInit.GREENSCHIST.get(), new ResourceLocation(Simplicity.MOD_ID, "block/ruby_ore"));

    }

    public void cubeAllModBlock(Block block, ResourceLocation texture) {
        getVariantBuilder(block).partialState().setModels(new ConfiguredModel(models().cubeAll(ForgeRegistries.BLOCKS.getKey(block).getPath(), texture)));
        itemModels().withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(ForgeRegistries.BLOCKS.getKey(block).getNamespace(), "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }

    private void cubeAllModBlock(Block block) {
        cubeAllModBlock(block, new ResourceLocation(Simplicity.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }
}
