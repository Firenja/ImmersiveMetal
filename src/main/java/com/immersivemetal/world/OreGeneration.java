package com.immersivemetal.world;

import com.immersivemetal.list.BlockList;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.pattern.BlockMatcher;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.common.Tags;
import net.minecraftforge.registries.ForgeRegistries;

public class OreGeneration {
    public static void setupOreGeneration()
    {
        for (Biome biome : ForgeRegistries.BIOMES)
        {
            if (biome != null)
            {

                if (biome == Biomes.NETHER)
                {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.glowing_ironOre.getDefaultState(), 8)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(4, 10, 0, 5))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.uridiumOre.getDefaultState(), 5)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(4, 10, 0, 5))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.tritaniumOre.getDefaultState(), 7)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(4, 10, 0, 5))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.quadiumOre.getDefaultState(), 6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3, 10, 0, 5))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.etheriumOre.getDefaultState(), 4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3, 10, 0, 5))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.byzaniumOre.getDefaultState(), 6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3, 10, 0, 5))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.bologniumOre.getDefaultState(), 4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3, 10, 0, 5))));

                }
                else if (biome == Biomes.END_BARRENS|| biome == Biomes.END_HIGHLANDS || biome == Biomes.END_MIDLANDS || biome == Biomes.SMALL_END_ISLANDS)
                {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)) , BlockList.enderiumOre.getDefaultState(), 6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(10, 40, -150, 20))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockList.enderitOre.getDefaultState(), 6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(7, 40, -150, 15))));
                }
                else
                {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.copperOre.getDefaultState(), 7)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(11, 10, -20, 11))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.tinOre.getDefaultState(), 6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(9, 10, -20, 10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.zincOre.getDefaultState(), 5)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(7, 10, -20, 10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.silverOre.getDefaultState(), 3)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3, 10, -200, 10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.platinumOre.getDefaultState(), 4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(7, 10, -200, 10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.promethiumOre.getDefaultState(), 3)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(5, 10, -200, 10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.hard_ironOre.getDefaultState(), 4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(6, 10, -200, 10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.mithrilOre.getDefaultState(), 6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(6, 10, -200, 10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.orichalcumOre.getDefaultState(), 5)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(5, 10, -200, 10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.adamantOre.getDefaultState(), 7)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(7, 10, -230, 10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.duratineOre.getDefaultState(), 5)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(5, 10, -230, 10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.dark_ironOre.getDefaultState(), 4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(4, 10, -230, 10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.arenakOre.getDefaultState(), 3)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3, 10, -230, 10))));

                }
            }
        }
    }
}
