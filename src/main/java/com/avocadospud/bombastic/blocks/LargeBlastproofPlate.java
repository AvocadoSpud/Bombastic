package com.avocadospud.bombastic.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;

public class LargeBlastproofPlate extends Block {

    public LargeBlastproofPlate() {
        super(Properties.create(Material.IRON, MaterialColor.GREEN).hardnessAndResistance(2.0F, 1200.0F)


        );
    }
}
