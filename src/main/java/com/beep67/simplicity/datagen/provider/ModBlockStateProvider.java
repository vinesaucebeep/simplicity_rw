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

        cubeAllModBlock(BlockInit.GREENSCHIST.get(), new ResourceLocation(Simplicity.MOD_ID, "block/greenschist"));
        cubeAllModBlock(BlockInit.POLISHED_GREENSCHIST.get(), new ResourceLocation(Simplicity.MOD_ID, "block/polished_greenschist"));
        cubeAllModBlock(BlockInit.GREENSCHIST_BRICKS.get(), new ResourceLocation(Simplicity.MOD_ID, "block/greenschist_bricks"));
        cubeAllModBlock(BlockInit.GREENSCHIST_TILES.get(), new ResourceLocation(Simplicity.MOD_ID, "block/greenschist_tiles"));
        cubeAllModBlock(BlockInit.CHISELED_GREENSCHIST.get(), new ResourceLocation(Simplicity.MOD_ID, "block/chiseled_greenschist"));
        cubeAllModBlock(BlockInit.CRACKED_GREENSCHIST_BRICKS.get(), new ResourceLocation(Simplicity.MOD_ID, "block/cracked_greenschist_bricks"));
        cubeAllModBlock(BlockInit.CRACKED_GREENSCHIST_TILES.get(), new ResourceLocation(Simplicity.MOD_ID, "block/cracked_greenschist_tiles"));

    }

    public void cubeAllModBlock(Block block, ResourceLocation texture) {
        getVariantBuilder(block).partialState().setModels(new ConfiguredModel(models().cubeAll(ForgeRegistries.BLOCKS.getKey(block).getPath(), texture)));
        itemModels().withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(ForgeRegistries.BLOCKS.getKey(block).getNamespace(), "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }

    private void cubeAllModBlock(Block block) {
        cubeAllModBlock(block, new ResourceLocation(Simplicity.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }
}
