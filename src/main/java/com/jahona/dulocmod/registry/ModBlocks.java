package com.jahona.dulocmod.registry;

import com.jahona.dulocmod.Dulocmod;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.fabricmc.fabric.api.tool.attribute.v1.FabricToolTags;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {
    public static final Block SHREK_BLOCK = new Block(FabricBlockSettings
            .of(Material.UNUSED_PLANT)
            .breakByTool(FabricToolTags.HOES,4)
            .requiresTool()
            .strength(6.9f, 42f).sounds(BlockSoundGroup.HONEY)
            .luminance(15));

    public static void registerBlocks() {

        Registry.register(Registry.BLOCK, new Identifier(Dulocmod.MOD_ID, "shrek_block"), SHREK_BLOCK);
    }
}
