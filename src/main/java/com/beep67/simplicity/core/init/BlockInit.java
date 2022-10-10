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
    public static final RegistryObject<Block> POLISHED_GREENSCHIST = BLOCKS.register("polished_greenschist", () -> new Block(BlockBehaviour.Properties.copy(Blocks.POLISHED_ANDESITE)));
    public static final RegistryObject<Block> GREENSCHIST_BRICKS = BLOCKS.register("greenschist_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> GREENSCHIST_TILES = BLOCKS.register("greenschist_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CHISELED_GREENSCHIST = BLOCKS.register("chiseled_greenschist", () -> new Block(BlockBehaviour.Properties.copy(Blocks.CHISELED_STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_GREENSCHIST_BRICKS = BLOCKS.register("cracked_greenschist_bricks", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));
    public static final RegistryObject<Block> CRACKED_GREENSCHIST_TILES = BLOCKS.register("cracked_greenschist_tiles", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE_BRICKS)));

    public static final RegistryObject<Block> SCORIA = BLOCKS.register("scoria", () -> new Block(BlockBehaviour.Properties.copy(Blocks.STONE)));



}
