package com.avocadospud.bombastic.util;

import com.avocadospud.bombastic.Bombastic;

import com.avocadospud.bombastic.blocks.BlockItemBase;
import com.avocadospud.bombastic.blocks.LargeBlastproofPlate;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.item.Food;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Bombastic.MOD_ID);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Bombastic.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
        BLOCKS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
    // Items

    // Blocks
    public static final RegistryObject<Block> LARGE_BLASTPROOF_PLATE = BLOCKS.register("large_blastproof_plate", LargeBlastproofPlate::new);

    // Block Items
    public static final RegistryObject<Item> LARGE_BLASTPROOF_PLATE_ITEM = ITEMS.register("large_blastproof_plate", () -> new BlockItemBase(LARGE_BLASTPROOF_PLATE.get()));

}
