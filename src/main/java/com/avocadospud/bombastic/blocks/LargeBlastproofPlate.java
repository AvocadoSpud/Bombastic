package com.avocadospud.bombastic.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.ToolType;

public class LargeBlastproofPlate extends Block {

    public LargeBlastproofPlate() {
        super(Properties.create(Material.ROCK)
                .hardnessAndResistance(1.0f, 1.0f)
                .sound(SoundType.STONE)
                .harvestTool(ToolType.PICKAXE)


        );
    }
}
