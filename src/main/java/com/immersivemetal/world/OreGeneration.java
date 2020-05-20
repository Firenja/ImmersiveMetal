package com.immersivemetal.world;

import com.immersivemetal.config.ConfigOre;
import com.immersivemetal.list.BlockList;
import com.sun.org.apache.xpath.internal.operations.Bool;
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
                    if (ConfigOre.glowingironspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.glowing_ironOre.getDefaultState(), 8)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.glowingironOrecount.get(), ConfigOre.glowingironOrebottomOffset.get(), -ConfigOre.glowingironOretopOffset.get(), ConfigOre.glowingironOremaximum.get()))));
                    }
                    if (ConfigOre.uridiumspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.uridiumOre.getDefaultState(), 5)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.uridiumOrecount.get(), ConfigOre.uridiumOrebottomOffset.get(), -ConfigOre.uridiumOretopOffset.get(), ConfigOre.uridiumOremaximum.get()))));
                    }
                    if (ConfigOre.tritaniumspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.tritaniumOre.getDefaultState(), 7)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.tritaniumOrecount.get(), ConfigOre.tritaniumOrebottomOffset.get(), -ConfigOre.tritaniumOretopOffset.get(), ConfigOre.tritaniumOremaximum.get()))));
                    }
                    if (ConfigOre.quadiumspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.quadiumOre.getDefaultState(), 6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.quadiumOrecount.get(), ConfigOre.quadiumOrebottomOffset.get(), -ConfigOre.quadiumOretopOffset.get(), ConfigOre.quadiumOremaximum.get()))));
                    }
                    if (ConfigOre.etheriumspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.etheriumOre.getDefaultState(), 4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.etheriumOrecount.get(), ConfigOre.etheriumOrebottomOffset.get(), -ConfigOre.etheriumOretopOffset.get(), ConfigOre.etheriumOremaximum.get()))));
                    }
                    if (ConfigOre.byzaniumspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.byzaniumOre.getDefaultState(), 6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.byzaniumOrecount.get(), ConfigOre.byzaniumOrebottomOffset.get(), -ConfigOre.byzaniumOretopOffset.get(), ConfigOre.byzaniumOremaximum.get()))));
                    }
                    if (ConfigOre.bologniumspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NETHERRACK, BlockList.bologniumOre.getDefaultState(), 4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.bologniumOrecount.get(), ConfigOre.bologniumOrebottomOffset.get(), -ConfigOre.bologniumOretopOffset.get(), ConfigOre.bologniumOremaximum.get()))));
                    }
                }
                else if (biome == Biomes.END_BARRENS|| biome == Biomes.END_HIGHLANDS || biome == Biomes.END_MIDLANDS || biome == Biomes.SMALL_END_ISLANDS)
                {
                    if (ConfigOre.enderiumspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)) , BlockList.enderiumOre.getDefaultState(), 6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.enderiumOrecount.get(), ConfigOre.enderiumOrebottomOffset.get(), -ConfigOre.enderiumOretopOffset.get(), ConfigOre.enderiumOremaximum.get()))));
                    }
                    if (ConfigOre.enderitspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.create("end_stone", null, new BlockMatcher(Blocks.END_STONE)), BlockList.enderitOre.getDefaultState(), 6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.enderitOrecount.get(), ConfigOre.enderitOrebottomOffset.get(), -ConfigOre.enderitOretopOffset.get(), ConfigOre.enderitOremaximum.get()))));
                    }
                }
                else
                {
                    if (ConfigOre.arenakspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.arenakOre.getDefaultState(), 3)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.arenakOrecount.get(), ConfigOre.arenakOrebottomOffset.get(), -ConfigOre.arenakOretopOffset.get(), ConfigOre.arenakOremaximum.get()))));
                    }
                    if (ConfigOre.darkironspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.dark_ironOre.getDefaultState(), 4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.darkironOrecount.get(), ConfigOre.darkironOrebottomOffset.get(), -ConfigOre.darkironOretopOffset.get(), ConfigOre.darkironOremaximum.get()))));
                    }
                    if (ConfigOre.duratinespawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.duratineOre.getDefaultState(), 5)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.duratineOrecount.get(), ConfigOre.duratineOrebottomOffset.get(), -ConfigOre.duratineOretopOffset.get(), ConfigOre.duratineOremaximum.get()))));
                    }
                    if (ConfigOre.adamantspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.adamantOre.getDefaultState(), 7)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.adamantOrecount.get(), ConfigOre.adamantOrebottomOffset.get(), -ConfigOre.adamantOretopOffset.get(), ConfigOre.adamantOremaximum.get()))));
                    }
                    if (ConfigOre.orichalcumspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.orichalcumOre.getDefaultState(), 5)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.orichalcumOrecount.get(), ConfigOre.orichalcumOrebottomOffset.get(), -ConfigOre.orichalcumOretopOffset.get(), ConfigOre.orichalcumOremaximum.get()))));
                    }
                    if (ConfigOre.mithrilspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.mithrilOre.getDefaultState(), 6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.mithrilOrecount.get(), ConfigOre.mithrilOrebottomOffset.get(), -ConfigOre.mithrilOretopOffset.get(), ConfigOre.mithrilOremaximum.get()))));
                    }
                    if (ConfigOre.hardironspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.hard_ironOre.getDefaultState(), 4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.hardironOrecount.get(), ConfigOre.hardironOrebottomOffset.get(), -ConfigOre.hardironOretopOffset.get(), ConfigOre.hardironOremaximum.get()))));
                    }
                    if (ConfigOre.promethiumspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.promethiumOre.getDefaultState(), 3)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.promethiumOrecount.get(), ConfigOre.promethiumOrebottomOffset.get(), -ConfigOre.promethiumOretopOffset.get(), ConfigOre.promethiumOremaximum.get()))));
                    }
                    if (ConfigOre.platinumspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.platinumOre.getDefaultState(), 4)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.platinumOrecount.get(), ConfigOre.platinumOrebottomOffset.get(), -ConfigOre.platinumOretopOffset.get(), ConfigOre.platinumOremaximum.get()))));
                    }
                    if (ConfigOre.silverspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.silverOre.getDefaultState(), 3)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.silverOrecount.get(), ConfigOre.silverOrebottomOffset.get(), -ConfigOre.silverOretopOffset.get(), ConfigOre.silverOremaximum.get()))));
                    }
                    if (ConfigOre.zincspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.zincOre.getDefaultState(), 5)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.zincOrecount.get(), ConfigOre.zincOrebottomOffset.get(), -ConfigOre.zincOretopOffset.get(), ConfigOre.zincOremaximum.get()))));
                    }
                    if (ConfigOre.tinspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.tinOre.getDefaultState(), 6)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.tinOrecount.get(), ConfigOre.tinOrebottomOffset.get(), -ConfigOre.tinOretopOffset.get(), ConfigOre.tinOremaximum.get()))));
                    }
                    if (ConfigOre.copperspawn.get())
                    {
                        biome.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.func_225566_b_(new OreFeatureConfig(OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockList.copperOre.getDefaultState(), 7)).func_227228_a_(Placement.COUNT_RANGE.func_227446_a_(new CountRangeConfig(ConfigOre.copperOrecount.get(), ConfigOre.copperOrebottomOffset.get(), -ConfigOre.copperOretopOffset.get(), ConfigOre.copperOremaximum.get()))));
                    }
                }
            }
        }
    }
}
