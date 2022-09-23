package com.beep67.simplicity;

import com.beep67.simplicity.core.init.ItemInit;
import com.beep67.simplicity.core.init.BlockInit;
import com.electronwill.nightconfig.core.Config;
import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

import java.io.ObjectInputFilter;

@Mod(Simplicity.MOD_ID)
public class Simplicity {
    public static final Logger LOGGER = LogUtils.getLogger();

    public static final String MOD_ID = "simplicity";

    public Simplicity() {

        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ItemInit.ITEMS.register(eventBus);
        BlockInit.BLOCKS.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }


}

