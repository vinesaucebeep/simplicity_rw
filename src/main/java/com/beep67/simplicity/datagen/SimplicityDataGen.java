package com.beep67.simplicity.datagen;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import com.beep67.simplicity.Simplicity;
import com.beep67.simplicity.datagen.provider.*;
import org.jetbrains.annotations.ApiStatus;


@Mod.EventBusSubscriber(modid = Simplicity.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SimplicityDataGen {

    @SubscribeEvent
    public static void onGatherData(final GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        ExistingFileHelper helper = event.getExistingFileHelper();
        ModBlockTagsProvider blockTagsProvider = new ModBlockTagsProvider(dataGenerator, Simplicity.MOD_ID, helper);


            dataGenerator.addProvider(event.includeServer(), blockTagsProvider);
            dataGenerator.addProvider(event.includeServer(), new ModItemTagsProvider(dataGenerator, blockTagsProvider, Simplicity.MOD_ID, helper));
            dataGenerator.addProvider(event.includeServer(), new ModRecipeProvider(dataGenerator));
            dataGenerator.addProvider(event.includeServer(), new ModLootTableProvider(dataGenerator));


            dataGenerator.addProvider(event.includeClient(), new ModItemModelProvider(dataGenerator, Simplicity.MOD_ID, helper));
            dataGenerator.addProvider(event.includeClient(), new ModBlockStateProvider(dataGenerator, Simplicity.MOD_ID, helper));
        }
    }
