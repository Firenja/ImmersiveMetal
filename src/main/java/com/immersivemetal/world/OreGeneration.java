package com.immersivemetal.world;

import com.immersivemetal.core.ImmersiveMetal;
import com.immersivemetal.list.BlockList;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.Biomes;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.placement.CountRangeConfig;
import net.minecraft.world.gen.placement.DepthAverageConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.logging.Logger;

public class OreGeneration
{
    public static void setupOreGeneration()
    {
        for (Biome biome: ForgeRegistries.BIOMES)
        {
            if (biome !=null)
            {

                if (biome !=Biomes.NETHER ||biome !=Biomes.THE_END )
                {

                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.copperOre.getDefaultState(),7)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(11,10,-20,11))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.tinOre.getDefaultState(),6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(9,10,-20,10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.zincOre.getDefaultState(),5)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(7,10,-20,10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.silverOre.getDefaultState(),3)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3,10,-200,10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.platinumOre.getDefaultState(),4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(7,10,-200,10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.promethiumOre.getDefaultState(),3)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(5,10,-200,10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.hard_ironOre.getDefaultState(),4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(6,10,-200,10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.mithrilOre.getDefaultState(),6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(6,10,-200,10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.orichalcumOre.getDefaultState(),5)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(5,10,-200,10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.adamantOre.getDefaultState(),7)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(7,10,-230,10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.duratineOre.getDefaultState(),5)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(5,10,-230,10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.dark_ironOre.getDefaultState(),4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(4,10,-230,10))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.arenakOre.getDefaultState(),3)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3,10,-230,10))));

                }
                else if (biome !=Biomes.THE_END)
                {
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.glowing_ironOre.getDefaultState(),8)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(4,10,0,5))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.uridiumOre.getDefaultState(),5)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(4,10,0,5))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.tritaniumOre.getDefaultState(),7)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(4,10,0,5))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.quadiumOre.getDefaultState(),6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3,10,0,5))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.etheriumOre.getDefaultState(),4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3,10,0,5))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.byzaniumOre.getDefaultState(),6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3,10,0,5))));
                    biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.bologniumOre.getDefaultState(),4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(3,10,0,5))));

               }
            }

            /*
     biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.testblockorenether.getDefaultState(),5)).func_227228_a_(Placement.COUNT_DEPTH_AVERAGE.func_227446_a_(new DepthAverageConfig(1,10,5))));
            //   CountRangeConfig testoreplacement = new CountRangeConfig(100,1,255,100);
                //     biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES,Feature.ORE.func_225566_b_(new OreFeatureConfig(new OreFeatureConfig.FillerBlockType(Blocks.END_STONE), BlockList.testblockoreend.getDefaultState(),5)).func_227228_a_(Placement.COUNT_DEPTH_AVERAGE.func_227446_a_(new DepthAverageConfig(10,50,5))));

                        Biomes.THE_END.addFeature(Decoration.UNDERGROUND_ORES, Feature.EMERALD_ORE.func_225566_b_(
                    new ReplaceBlockConfig(Blocks.END_STONE.getDefaultState(), RegisterBlocks.amethystOre.getDefaultState())).func_227228_a_( Placement.COUNT_RANGE.func_227446_a_( )));

            */
        }

    }
}
