package com.beep67.simplicity.core.init;

import com.beep67.simplicity.Simplicity;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Simplicity.MOD_ID);

    public static final RegistryObject<Item> GREENSCHIST = ITEMS.register("greenschist", () -> new BlockItem(BlockInit.GREENSCHIST.get(), new Item.Properties().tab(CreativeModeTab.TAB_BUILDING_BLOCKS)));
}
