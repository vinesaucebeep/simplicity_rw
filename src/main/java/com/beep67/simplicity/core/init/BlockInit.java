package com.beep67.simplicity.core.init;

import com.beep67.simplicity.Simplicity;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class BlockInit {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Simplicity.MOD_ID);

    public static final RegistryObject<Block> GREENSCHIST = BLOCKS.register("greenschist", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));

}
