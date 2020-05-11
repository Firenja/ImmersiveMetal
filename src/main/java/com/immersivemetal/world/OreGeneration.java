package com.immersivemetal.world;

import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration
{
    public static void setupOreGeneration()
    {
        for (Biome biome: ForgeRegistries.BIOMES)
        {
            /*
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.testblockoreover.getDefaultState(),50)).func_227228_a_(Placement.COUNT_DEPTH_AVERAGE.func_227446_a_(new DepthAverageConfig(30,40,500))));
            //     biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.func_225566_b_(new OreFeatureConfig(new OreFeatureConfig.FillerBlockType(Blocks.END_STONE), BlockList.testblockoreend.getDefaultState(),5)).func_227228_a_(Placement.COUNT_DEPTH_AVERAGE.func_227446_a_(new DepthAverageConfig(10,50,5))));
            biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.testblockorenether.getDefaultState(),5)).func_227228_a_(Placement.COUNT_DEPTH_AVERAGE.func_227446_a_(new DepthAverageConfig(1,10,5))));
            //   CountRangeConfig testoreplacement = new CountRangeConfig(100,1,255,100);
            */
        }

    }
}
