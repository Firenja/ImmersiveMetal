package com.immersivemetal.core;

import com.immersivemetal.list.ArmorMaterialList;
import com.immersivemetal.list.BlockList;
import com.immersivemetal.list.ItemList;
import com.immersivemetal.list.ToolMaterialList;
import com.immersivemetal.world.OreGeneration;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.*;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod("immersivemetal")
public class ImmersiveMetal
{
    public static ImmersiveMetal instance;
    public static final String modid = "immersivemetal";
    private static final Logger logger = LogManager.getLogger(modid);
    public static final ItemGroup immersive_metal = new IMItemGroup();

    public ImmersiveMetal()
    {
        instance = this;
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        OreGeneration.setupOreGeneration();
    }

    private void clientRegistries(final FMLClientSetupEvent event)
    {
    }

    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {

        @SubscribeEvent
        public static void regBlocks(final RegistryEvent.Register<Block> event)
        {
            event.getRegistry().registerAll(

                    //IngotBlocks
                    BlockList.copperIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("copper_block")),
                    BlockList.tinIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("tin_block")),
                    BlockList.bronzeIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("bronze_block")),
                    BlockList.zincIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("zinc_block")),
                    BlockList.brassIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("brass_block")),
                    BlockList.silverIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("silver_block")),
                    BlockList.platinumIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("platinum_block")),
                    BlockList.promethiumIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("promethium_block")),
                    BlockList.hard_ironIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("hard_iron_block")),
                    BlockList.mithrilIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("mithril_block")),
                    BlockList.orichalcumIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("orichalcum_block")),
                    BlockList.adamantIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("adamant_block")),
                    BlockList.glowing_ironIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(3).sound(SoundType.METAL)).setRegistryName(getResourceLocation("glowing_iron_block")),
                    BlockList.uridiumIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("uridium_block")),
                    BlockList.tritaniumIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("tritanium_block")),
                    BlockList.quadiumIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("quadium_block")),
                    BlockList.etheriumIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("etherium_block")),
                    BlockList.byzaniumIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("byzanium_block")),
                    BlockList.bologniumIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("bolognium_block")),
                    BlockList.duratineIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("duratine_block")),
                    BlockList.dark_ironIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("dark_iron_block")),
                    BlockList.arenakIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("arenak_block")),
                    BlockList.enderiumIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("enderium_block")),
                    BlockList.enderitIngotBlock = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 6).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("enderit_block")),

                    //OreBlock

                    BlockList.copperOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName(getResourceLocation("copper_ore")),
                    BlockList.tinOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName(getResourceLocation("tin_ore")),
                    BlockList.zincOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName(getResourceLocation("zinc_ore")),
                    BlockList.silverOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(2, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName(getResourceLocation("silver_ore")),
                    BlockList.platinumOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(2)).setRegistryName(getResourceLocation("platinum_ore")),
                    BlockList.promethiumOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(3)).setRegistryName(getResourceLocation("promethium_ore")),
                    BlockList.hard_ironOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(4)).setRegistryName(getResourceLocation("hard_iron_ore")),
                    BlockList.mithrilOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(3, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(5)).setRegistryName(getResourceLocation("mithril_ore")),
                    BlockList.orichalcumOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(4, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(6)).setRegistryName(getResourceLocation("orichalcum_ore")),
                    BlockList.adamantOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(4, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(7)).setRegistryName(getResourceLocation("adamant_ore")),
                    BlockList.glowing_ironOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5, 10).lightValue(3).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(7)).setRegistryName(getResourceLocation("glowing_iron_nether_ore")),
                    BlockList.uridiumOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(7)).setRegistryName(getResourceLocation("uridium_nether_ore")),
                    BlockList.tritaniumOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(8)).setRegistryName(getResourceLocation("tritanium_nether_ore")),
                    BlockList.quadiumOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(8)).setRegistryName(getResourceLocation("quadium_nether_ore")),
                    BlockList.etheriumOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(9)).setRegistryName(getResourceLocation("etherium_nether_ore")),
                    BlockList.byzaniumOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(9)).setRegistryName(getResourceLocation("byzanium_nether_ore")),
                    BlockList.bologniumOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(5, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(10)).setRegistryName(getResourceLocation("bolognium_nether_ore")),
                    BlockList.duratineOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(10, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(10)).setRegistryName(getResourceLocation("duratine_ore")),
                    BlockList.dark_ironOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(15, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(11)).setRegistryName(getResourceLocation("dark_iron_ore")),
                    BlockList.arenakOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(20, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(12)).setRegistryName(getResourceLocation("arenak_ore")),
                    BlockList.enderiumOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(15, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(11)).setRegistryName(getResourceLocation("enderium_end_ore")),
                    BlockList.enderitOre = new Block(Block.Properties.create(Material.ROCK).hardnessAndResistance(20, 10).lightValue(0).sound(SoundType.STONE).harvestTool(ToolType.PICKAXE).harvestLevel(12)).setRegistryName(getResourceLocation("enderit_end_ore"))
            );
        }

        @SubscribeEvent
        public static void regItems(final RegistryEvent.Register<Item> event)
        {
            event.getRegistry().registerAll
                    (
                            //BlockItems
                            ItemList.copperIngotBlock = new BlockItem(BlockList.copperIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.copperIngotBlock.getRegistryName()),
                            ItemList.tinIngotBlock = new BlockItem(BlockList.tinIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.tinIngotBlock.getRegistryName()),
                            ItemList.bronzeIngotBlock = new BlockItem(BlockList.bronzeIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.bronzeIngotBlock.getRegistryName()),
                            ItemList.zincIngotBlock = new BlockItem(BlockList.zincIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.zincIngotBlock.getRegistryName()),
                            ItemList.brassIngotBlock = new BlockItem(BlockList.brassIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.brassIngotBlock.getRegistryName()),
                            ItemList.silverIngotBlock = new BlockItem(BlockList.silverIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.silverIngotBlock.getRegistryName()),
                            ItemList.platinumIngotBlock = new BlockItem(BlockList.platinumIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.platinumIngotBlock.getRegistryName()),
                            ItemList.promethiumIngotBlock = new BlockItem(BlockList.promethiumIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.promethiumIngotBlock.getRegistryName()),
                            ItemList.hard_ironIngotBlock = new BlockItem(BlockList.hard_ironIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.hard_ironIngotBlock.getRegistryName()),
                            ItemList.mithrilIngotBlock = new BlockItem(BlockList.mithrilIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.mithrilIngotBlock.getRegistryName()),
                            ItemList.orichalcumIngotBlock = new BlockItem(BlockList.orichalcumIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.orichalcumIngotBlock.getRegistryName()),
                            ItemList.adamantIngotBlock = new BlockItem(BlockList.adamantIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.adamantIngotBlock.getRegistryName()),
                            ItemList.glowing_ironIngotBlock = new BlockItem(BlockList.glowing_ironIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.glowing_ironIngotBlock.getRegistryName()),
                            ItemList.uridiumIngotBlock = new BlockItem(BlockList.uridiumIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.uridiumIngotBlock.getRegistryName()),
                            ItemList.tritaniumIngotBlock = new BlockItem(BlockList.tritaniumIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.tritaniumIngotBlock.getRegistryName()),
                            ItemList.quadiumIngotBlock = new BlockItem(BlockList.quadiumIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.quadiumIngotBlock.getRegistryName()),
                            ItemList.etheriumIngotBlock = new BlockItem(BlockList.etheriumIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.etheriumIngotBlock.getRegistryName()),
                            ItemList.byzaniumIngotBlock = new BlockItem(BlockList.byzaniumIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.byzaniumIngotBlock.getRegistryName()),
                            ItemList.bologniumIngotBlock = new BlockItem(BlockList.bologniumIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.bologniumIngotBlock.getRegistryName()),
                            ItemList.duratineIngotBlock = new BlockItem(BlockList.duratineIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.duratineIngotBlock.getRegistryName()),
                            ItemList.dark_ironIngotBlock = new BlockItem(BlockList.dark_ironIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.dark_ironIngotBlock.getRegistryName()),
                            ItemList.arenakIngotBlock = new BlockItem(BlockList.arenakIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.arenakIngotBlock.getRegistryName()),
                            ItemList.enderiumIngotBlock = new BlockItem(BlockList.enderiumIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.enderiumIngotBlock.getRegistryName()),
                            ItemList.enderitIngotBlock = new BlockItem(BlockList.enderitIngotBlock, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.enderitIngotBlock.getRegistryName()),

                            //oreblockitem
                            ItemList.copperOre = new BlockItem(BlockList.copperOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.copperOre.getRegistryName()),
                            ItemList.tinOre = new BlockItem(BlockList.tinOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.tinOre.getRegistryName()),
                            ItemList.zincOre = new BlockItem(BlockList.zincOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.zincOre.getRegistryName()),
                            ItemList.silverOre = new BlockItem(BlockList.silverOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.silverOre.getRegistryName()),
                            ItemList.platinumOre = new BlockItem(BlockList.platinumOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.platinumOre.getRegistryName()),
                            ItemList.promethiumOre = new BlockItem(BlockList.promethiumOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.promethiumOre.getRegistryName()),
                            ItemList.hard_ironOre = new BlockItem(BlockList.hard_ironOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.hard_ironOre.getRegistryName()),
                            ItemList.mithrilOre = new BlockItem(BlockList.mithrilOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.mithrilOre.getRegistryName()),
                            ItemList.orichalcumOre = new BlockItem(BlockList.orichalcumOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.orichalcumOre.getRegistryName()),
                            ItemList.adamantOre = new BlockItem(BlockList.adamantOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.adamantOre.getRegistryName()),
                            ItemList.glowing_ironOre = new BlockItem(BlockList.glowing_ironOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.glowing_ironOre.getRegistryName()),
                            ItemList.uridiumOre = new BlockItem(BlockList.uridiumOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.uridiumOre.getRegistryName()),
                            ItemList.tritaniumOre = new BlockItem(BlockList.tritaniumOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.tritaniumOre.getRegistryName()),
                            ItemList.quadiumOre = new BlockItem(BlockList.quadiumOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.quadiumOre.getRegistryName()),
                            ItemList.etheriumOre = new BlockItem(BlockList.etheriumOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.etheriumOre.getRegistryName()),
                            ItemList.byzaniumOre = new BlockItem(BlockList.byzaniumOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.byzaniumOre.getRegistryName()),
                            ItemList.bologniumOre = new BlockItem(BlockList.bologniumOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.bologniumOre.getRegistryName()),
                            ItemList.duratineOre = new BlockItem(BlockList.duratineOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.duratineOre.getRegistryName()),
                            ItemList.dark_ironOre = new BlockItem(BlockList.dark_ironOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.dark_ironOre.getRegistryName()),
                            ItemList.arenakOre = new BlockItem(BlockList.arenakOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.arenakOre.getRegistryName()),
                            ItemList.enderiumOre = new BlockItem(BlockList.enderiumOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.enderiumOre.getRegistryName()),
                            ItemList.enderitOre = new BlockItem(BlockList.enderitOre, new Item.Properties().group(immersive_metal)).setRegistryName(BlockList.enderitOre.getRegistryName()),

                       //Ingots
                            ItemList.copperIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("copper_ingot")),
                            ItemList.tinIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("tin_ingot")),
                            ItemList.bronzeIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("bronze_ingot")),
                            ItemList.zincIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("zinc_ingot")),
                            ItemList.brassIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("brass_ingot")),
                            ItemList.silverIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("silver_ingot")),
                            ItemList.platinumIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("platinum_ingot")),
                            ItemList.promethiumIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("promethium_ingot")),
                            ItemList.hard_ironIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("hard_iron_ingot")),
                            ItemList.mithrilIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("mithril_ingot")),
                            ItemList.orichalcumIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("orichalcum_ingot")),
                            ItemList.adamantIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("adamant_ingot")),
                            ItemList.glowing_ironIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("glowing_iron_ingot")),
                            ItemList.uridiumIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("uridium_ingot")),
                            ItemList.tritaniumIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("tritanium_ingot")),
                            ItemList.quadiumIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("quadium_ingot")),
                            ItemList.etheriumIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("etherium_ingot")),
                            ItemList.byzaniumIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("byzanium_ingot")),
                            ItemList.bologniumIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("bolognium_ingot")),
                            ItemList.duratineIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("duratine_ingot")),
                            ItemList.dark_ironIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("dark_iron_ingot")),
                            ItemList.arenakIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("arenak_ingot")),
                            ItemList.enderiumIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("enderium_ingot")),
                            ItemList.enderitIngot = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("enderit_ingot")),

                            //Nugget
                            ItemList.copperNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("copper_nugget")),
                            ItemList.tinNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("tin_nugget")),
                            ItemList.bronzeNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("bronze_nugget")),
                            ItemList.zincNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("zinc_nugget")),
                            ItemList.brassNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("brass_nugget")),
                            ItemList.silverNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("silver_nugget")),
                            ItemList.platinumNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("platinum_nugget")),
                            ItemList.promethiumNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("promethium_nugget")),
                            ItemList.hard_ironNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("hard_iron_nugget")),
                            ItemList.mithrilNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("mithril_nugget")),
                            ItemList.orichalcumNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("orichalcum_nugget")),
                            ItemList.adamantNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("adamant_nugget")),
                            ItemList.glowing_ironNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("glowing_iron_nugget")),
                            ItemList.uridiumNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("uridium_nugget")),
                            ItemList.tritaniumNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("tritanium_nugget")),
                            ItemList.quadiumNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("quadium_nugget")),
                            ItemList.etheriumNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("etherium_nugget")),
                            ItemList.byzaniumNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("byzanium_nugget")),
                            ItemList.bologniumNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("bolognium_nugget")),
                            ItemList.duratineNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("duratine_nugget")),
                            ItemList.dark_ironNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("dark_iron_nugget")),
                            ItemList.arenakNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("arenak_nugget")),
                            ItemList.enderiumNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("enderium_nugget")),
                            ItemList.enderitNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("enderit_nugget")),

                            //axe
                            ItemList.copperAxe = new AxeItem(ToolMaterialList.Copper, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("copper_axe"),
                            ItemList.bronzeAxe = new AxeItem(ToolMaterialList.Bronze, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("bronze_axe"),
                            ItemList.brassAxe = new AxeItem(ToolMaterialList.Brass, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("brass_axe"),
                            ItemList.silverAxe = new AxeItem(ToolMaterialList.Silver, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("silver_axe"),
                            ItemList.platinumAxe = new AxeItem(ToolMaterialList.Platinum, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("platinum_axe"),
                            ItemList.promethiumAxe = new AxeItem(ToolMaterialList.Promethium, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("promethium_axe"),
                            ItemList.hard_ironAxe = new AxeItem(ToolMaterialList.Hard_iron, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("hard_iron_axe"),
                            ItemList.mithrilAxe = new AxeItem(ToolMaterialList.Mithril, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("mithril_axe"),
                            ItemList.orichalcumAxe = new AxeItem(ToolMaterialList.Orichalcum, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcum_axe"),
                            ItemList.adamantAxe = new AxeItem(ToolMaterialList.Adamant, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("adamant_axe"),
                            ItemList.glowing_ironAxe = new AxeItem(ToolMaterialList.Glowing_iron, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_iron_axe"),
                            ItemList.uridiumAxe = new AxeItem(ToolMaterialList.Uridium, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("uridium_axe"),
                            ItemList.tritaniumAxe = new AxeItem(ToolMaterialList.Tritanium, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("tritanium_axe"),
                            ItemList.quadiumAxe = new AxeItem(ToolMaterialList.Quadium, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("quadium_axe"),
                            ItemList.etheriumAxe = new AxeItem(ToolMaterialList.Etherium, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("etherium_axe"),
                            ItemList.byzaniumAxe = new AxeItem(ToolMaterialList.Byzanium, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("byzanium_axe"),
                            ItemList.bologniumAxe = new AxeItem(ToolMaterialList.Bolognium, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("bolognium_axe"),
                            ItemList.duratineAxe = new AxeItem(ToolMaterialList.Duratine, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("duratine_axe"),
                            ItemList.dark_ironAxe = new AxeItem(ToolMaterialList.Dark_iron, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("dark_iron_axe"),
                            ItemList.arenakAxe = new AxeItem(ToolMaterialList.Arenak, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("arenak_axe"),
                            ItemList.enderiumAxe = new AxeItem(ToolMaterialList.Enderium, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("enderium_axe"),
                            ItemList.enderitAxe = new AxeItem(ToolMaterialList.Enderit, 1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("enderit_axe"),

                            //Shovel
                            ItemList.copperShovel = new ShovelItem(ToolMaterialList.Copper, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("copper_shovel"),
                            ItemList.bronzeShovel = new ShovelItem(ToolMaterialList.Bronze, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("bronze_shovel"),
                            ItemList.brassShovel = new ShovelItem(ToolMaterialList.Brass, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("brass_shovel"),
                            ItemList.silverShovel = new ShovelItem(ToolMaterialList.Silver, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("silver_shovel"),
                            ItemList.platinumShovel = new ShovelItem(ToolMaterialList.Platinum, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("platinum_shovel"),
                            ItemList.promethiumShovel = new ShovelItem(ToolMaterialList.Promethium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("promethium_shovel"),
                            ItemList.hard_ironShovel = new ShovelItem(ToolMaterialList.Hard_iron, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("hard_iron_shovel"),
                            ItemList.mithrilShovel = new ShovelItem(ToolMaterialList.Mithril, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("mithril_shovel"),
                            ItemList.orichalcumShovel = new ShovelItem(ToolMaterialList.Orichalcum, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcum_shovel"),
                            ItemList.adamantShovel = new ShovelItem(ToolMaterialList.Adamant, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("adamant_shovel"),
                            ItemList.glowing_ironShovel = new ShovelItem(ToolMaterialList.Glowing_iron, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_iron_shovel"),
                            ItemList.uridiumShovel = new ShovelItem(ToolMaterialList.Uridium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("uridium_shovel"),
                            ItemList.tritaniumShovel = new ShovelItem(ToolMaterialList.Tritanium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("tritanium_shovel"),
                            ItemList.quadiumShovel = new ShovelItem(ToolMaterialList.Quadium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("quadium_shovel"),
                            ItemList.etheriumShovel = new ShovelItem(ToolMaterialList.Etherium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("etherium_shovel"),
                            ItemList.byzaniumShovel = new ShovelItem(ToolMaterialList.Byzanium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("byzanium_shovel"),
                            ItemList.bologniumShovel = new ShovelItem(ToolMaterialList.Bolognium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("bolognium_shovel"),
                            ItemList.duratineShovel = new ShovelItem(ToolMaterialList.Duratine, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("duratine_shovel"),
                            ItemList.dark_ironShovel = new ShovelItem(ToolMaterialList.Dark_iron, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("dark_iron_shovel"),
                            ItemList.arenakShovel = new ShovelItem(ToolMaterialList.Arenak, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("arenak_shovel"),
                            ItemList.enderiumShovel = new ShovelItem(ToolMaterialList.Enderium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("enderium_shovel"),
                            ItemList.enderitShovel = new ShovelItem(ToolMaterialList.Enderit, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("enderit_shovel"),

                            //Pickaxe
                            ItemList.copperPickaxe = new PickaxeItem(ToolMaterialList.Copper, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("copper_pickaxe"),
                            ItemList.bronzePickaxe = new PickaxeItem(ToolMaterialList.Bronze, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("bronze_pickaxe"),
                            ItemList.brassPickaxe = new PickaxeItem(ToolMaterialList.Brass, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("brass_pickaxe"),
                            ItemList.silverPickaxe = new PickaxeItem(ToolMaterialList.Silver, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("silver_pickaxe"),
                            ItemList.platinumPickaxe = new PickaxeItem(ToolMaterialList.Platinum, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("platinum_pickaxe"),
                            ItemList.promethiumPickaxe = new PickaxeItem(ToolMaterialList.Promethium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("promethium_pickaxe"),
                            ItemList.hard_ironPickaxe = new PickaxeItem(ToolMaterialList.Hard_iron, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("hard_iron_pickaxe"),
                            ItemList.mithrilPickaxe = new PickaxeItem(ToolMaterialList.Mithril, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("mithril_pickaxe"),
                            ItemList.orichalcumPickaxe = new PickaxeItem(ToolMaterialList.Orichalcum, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcum_pickaxe"),
                            ItemList.adamantPickaxe = new PickaxeItem(ToolMaterialList.Adamant, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("adamant_pickaxe"),
                            ItemList.glowing_ironPickaxe = new PickaxeItem(ToolMaterialList.Glowing_iron, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_iron_pickaxe"),
                            ItemList.uridiumPickaxe = new PickaxeItem(ToolMaterialList.Uridium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("uridium_pickaxe"),
                            ItemList.tritaniumPickaxe = new PickaxeItem(ToolMaterialList.Tritanium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("tritanium_pickaxe"),
                            ItemList.quadiumPickaxe = new PickaxeItem(ToolMaterialList.Quadium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("quadium_pickaxe"),
                            ItemList.etheriumPickaxe = new PickaxeItem(ToolMaterialList.Etherium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("etherium_pickaxe"),
                            ItemList.byzaniumPickaxe = new PickaxeItem(ToolMaterialList.Byzanium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("byzanium_pickaxe"),
                            ItemList.bologniumPickaxe = new PickaxeItem(ToolMaterialList.Bolognium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("bolognium_pickaxe"),
                            ItemList.duratinePickaxe = new PickaxeItem(ToolMaterialList.Duratine, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("duratine_pickaxe"),
                            ItemList.dark_ironPickaxe = new PickaxeItem(ToolMaterialList.Dark_iron, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("dark_iron_pickaxe"),
                            ItemList.arenakPickaxe = new PickaxeItem(ToolMaterialList.Arenak, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("arenak_pickaxe"),
                            ItemList.enderiumPickaxe = new PickaxeItem(ToolMaterialList.Enderium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("enderium_pickaxe"),
                            ItemList.enderitPickaxe = new PickaxeItem(ToolMaterialList.Enderit, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("enderit_pickaxe"),

                            //Hoe
                            ItemList.copperHoe = new HoeItem(ToolMaterialList.Copper, -1, new Item.Properties().group(immersive_metal)).setRegistryName("copper_hoe"),
                            ItemList.bronzeHoe = new HoeItem(ToolMaterialList.Bronze, -1, new Item.Properties().group(immersive_metal)).setRegistryName("bronze_hoe"),
                            ItemList.brassHoe = new HoeItem(ToolMaterialList.Brass, -1, new Item.Properties().group(immersive_metal)).setRegistryName("brass_hoe"),
                            ItemList.silverHoe = new HoeItem(ToolMaterialList.Silver, -1, new Item.Properties().group(immersive_metal)).setRegistryName("silver_hoe"),
                            ItemList.platinumHoe = new HoeItem(ToolMaterialList.Platinum, -1, new Item.Properties().group(immersive_metal)).setRegistryName("platinum_hoe"),
                            ItemList.promethiumHoe = new HoeItem(ToolMaterialList.Promethium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("promethium_hoe"),
                            ItemList.hard_ironHoe = new HoeItem(ToolMaterialList.Hard_iron, -1, new Item.Properties().group(immersive_metal)).setRegistryName("hard_iron_hoe"),
                            ItemList.mithrilHoe = new HoeItem(ToolMaterialList.Mithril, -1, new Item.Properties().group(immersive_metal)).setRegistryName("mithril_hoe"),
                            ItemList.orichalcumHoe = new HoeItem(ToolMaterialList.Orichalcum, -1, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcum_hoe"),
                            ItemList.adamantHoe = new HoeItem(ToolMaterialList.Adamant, -1, new Item.Properties().group(immersive_metal)).setRegistryName("adamant_hoe"),
                            ItemList.glowing_ironHoe = new HoeItem(ToolMaterialList.Glowing_iron, -1, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_iron_hoe"),
                            ItemList.uridiumHoe = new HoeItem(ToolMaterialList.Uridium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("uridium_hoe"),
                            ItemList.tritaniumHoe = new HoeItem(ToolMaterialList.Tritanium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("tritanium_hoe"),
                            ItemList.quadiumHoe = new HoeItem(ToolMaterialList.Quadium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("quadium_hoe"),
                            ItemList.etheriumHoe = new HoeItem(ToolMaterialList.Etherium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("etherium_hoe"),
                            ItemList.byzaniumHoe = new HoeItem(ToolMaterialList.Byzanium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("byzanium_hoe"),
                            ItemList.bologniumHoe = new HoeItem(ToolMaterialList.Bolognium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("bolognium_hoe"),
                            ItemList.duratineHoe = new HoeItem(ToolMaterialList.Duratine, -1, new Item.Properties().group(immersive_metal)).setRegistryName("duratine_hoe"),
                            ItemList.dark_ironHoe = new HoeItem(ToolMaterialList.Dark_iron, -1, new Item.Properties().group(immersive_metal)).setRegistryName("dark_iron_hoe"),
                            ItemList.arenakHoe = new HoeItem(ToolMaterialList.Arenak, -1, new Item.Properties().group(immersive_metal)).setRegistryName("arenak_hoe"),
                            ItemList.enderiumHoe = new HoeItem(ToolMaterialList.Enderium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("enderium_hoe"),
                            ItemList.enderitHoe = new HoeItem(ToolMaterialList.Enderit, -1, new Item.Properties().group(immersive_metal)).setRegistryName("enderit_hoe"),

                            //Sword
                            ItemList.copperSword = new SwordItem(ToolMaterialList.Copper, 4, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("copper_sword"),
                            ItemList.bronzeSword = new SwordItem(ToolMaterialList.Bronze, 4, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("bronze_sword"),
                            ItemList.brassSword = new SwordItem(ToolMaterialList.Brass, 4, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("brass_sword"),
                            ItemList.silverSword = new SwordItem(ToolMaterialList.Silver, 2, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("silver_sword"),
                            ItemList.platinumSword = new SwordItem(ToolMaterialList.Platinum, 4, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("platinum_sword"),
                            ItemList.promethiumSword = new SwordItem(ToolMaterialList.Promethium, 6, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("promethium_sword"),
                            ItemList.hard_ironSword = new SwordItem(ToolMaterialList.Hard_iron, 6, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("hard_iron_sword"),
                            ItemList.mithrilSword = new SwordItem(ToolMaterialList.Mithril, 6, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("mithril_sword"),
                            ItemList.orichalcumSword = new SwordItem(ToolMaterialList.Orichalcum, 6, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcum_sword"),
                            ItemList.adamantSword = new SwordItem(ToolMaterialList.Adamant, 6, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("adamant_sword"),
                            ItemList.glowing_ironSword = new SwordItem(ToolMaterialList.Glowing_iron, 7, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_iron_sword"),
                            ItemList.uridiumSword = new SwordItem(ToolMaterialList.Uridium, 6, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("uridium_sword"),
                            ItemList.tritaniumSword = new SwordItem(ToolMaterialList.Tritanium, 8, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("tritanium_sword"),
                            ItemList.quadiumSword = new SwordItem(ToolMaterialList.Quadium, 8, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("quadium_sword"),
                            ItemList.etheriumSword = new SwordItem(ToolMaterialList.Etherium, 8, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("etherium_sword"),
                            ItemList.byzaniumSword = new SwordItem(ToolMaterialList.Byzanium, 9, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("byzanium_sword"),
                            ItemList.bologniumSword = new SwordItem(ToolMaterialList.Bolognium, 9, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("bolognium_sword"),
                            ItemList.duratineSword = new SwordItem(ToolMaterialList.Duratine, 9, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("duratine_sword"),
                            ItemList.dark_ironSword = new SwordItem(ToolMaterialList.Dark_iron, 10, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("dark_iron_sword"),
                            ItemList.arenakSword = new SwordItem(ToolMaterialList.Arenak, 12, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("arenak_sword"),
                            ItemList.enderiumSword = new SwordItem(ToolMaterialList.Enderium, 10, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("enderium_sword"),
                            ItemList.enderitSword = new SwordItem(ToolMaterialList.Enderit, 12, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("enderit_sword"),

                            //Helmet
                            ItemList.copperHelmet = new ArmorItem(ArmorMaterialList.copper, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("copper_helmet"),
                            ItemList.bronzeHelmet = new ArmorItem(ArmorMaterialList.bronze, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("bronze_helmet"),
                            ItemList.brassHelmet = new ArmorItem(ArmorMaterialList.brass, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("brass_helmet"),
                            ItemList.silverHelmet = new ArmorItem(ArmorMaterialList.silver, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("silver_helmet"),
                            ItemList.platinumHelmet = new ArmorItem(ArmorMaterialList.platinum, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("platinum_helmet"),
                            ItemList.promethiumHelmet = new ArmorItem(ArmorMaterialList.promethium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("promethium_helmet"),
                            ItemList.hard_ironHelmet = new ArmorItem(ArmorMaterialList.hard_iron, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("hard_iron_helmet"),
                            ItemList.mithrilHelmet = new ArmorItem(ArmorMaterialList.mithril, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("mithril_helmet"),
                            ItemList.orichalcumHelmet = new ArmorItem(ArmorMaterialList.orichalcum, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcum_helmet"),
                            ItemList.adamantHelmet = new ArmorItem(ArmorMaterialList.adamant, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("adamant_helmet"),
                            ItemList.glowing_ironHelmet = new ArmorItem(ArmorMaterialList.glowing_iron, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_iron_helmet"),
                            ItemList.uridiumHelmet = new ArmorItem(ArmorMaterialList.uridium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("uridium_helmet"),
                            ItemList.tritaniumHelmet = new ArmorItem(ArmorMaterialList.tritanium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("tritanium_helmet"),
                            ItemList.quadiumHelmet = new ArmorItem(ArmorMaterialList.quadium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("quadium_helmet"),
                            ItemList.etheriumHelmet = new ArmorItem(ArmorMaterialList.etherium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("etherium_helmet"),
                            ItemList.byzaniumHelmet = new ArmorItem(ArmorMaterialList.byzanium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("byzanium_helmet"),
                            ItemList.bologniumHelmet = new ArmorItem(ArmorMaterialList.bolognium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("bolognium_helmet"),
                            ItemList.duratineHelmet = new ArmorItem(ArmorMaterialList.duratine, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("duratine_helmet"),
                            ItemList.dark_ironHelmet = new ArmorItem(ArmorMaterialList.dark_iron, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("dark_iron_helmet"),
                            ItemList.arenakHelmet = new ArmorItem(ArmorMaterialList.arenak, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("arenak_helmet"),
                            ItemList.enderiumHelmet = new ArmorItem(ArmorMaterialList.enderium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("enderium_helmet"),
                            ItemList.enderitHelmet = new ArmorItem(ArmorMaterialList.enderit, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("enderit_helmet"),

                            //Chestplate
                            ItemList.copperChestplate = new ArmorItem(ArmorMaterialList.copper, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("copper_chestplate"),
                            ItemList.bronzeChestplate = new ArmorItem(ArmorMaterialList.bronze, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("bronze_chestplate"),
                            ItemList.brassChestplate = new ArmorItem(ArmorMaterialList.brass, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("brass_chestplate"),
                            ItemList.silverChestplate = new ArmorItem(ArmorMaterialList.silver, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("silver_chestplate"),
                            ItemList.platinumChestplate = new ArmorItem(ArmorMaterialList.platinum, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("platinum_chestplate"),
                            ItemList.promethiumChestplate = new ArmorItem(ArmorMaterialList.promethium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("promethium_chestplate"),
                            ItemList.hard_ironChestplate = new ArmorItem(ArmorMaterialList.hard_iron, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("hard_iron_chestplate"),
                            ItemList.mithrilChestplate = new ArmorItem(ArmorMaterialList.mithril, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("mithril_chestplate"),
                            ItemList.orichalcumChestplate = new ArmorItem(ArmorMaterialList.orichalcum, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcum_chestplate"),
                            ItemList.adamantChestplate = new ArmorItem(ArmorMaterialList.adamant, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("adamant_chestplate"),
                            ItemList.glowing_ironChestplate = new ArmorItem(ArmorMaterialList.glowing_iron, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_iron_chestplate"),
                            ItemList.uridiumChestplate = new ArmorItem(ArmorMaterialList.uridium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("uridium_chestplate"),
                            ItemList.tritaniumChestplate = new ArmorItem(ArmorMaterialList.tritanium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("tritanium_chestplate"),
                            ItemList.quadiumChestplate = new ArmorItem(ArmorMaterialList.quadium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("quadium_chestplate"),
                            ItemList.etheriumChestplate = new ArmorItem(ArmorMaterialList.etherium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("etherium_chestplate"),
                            ItemList.byzaniumChestplate = new ArmorItem(ArmorMaterialList.byzanium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("byzanium_chestplate"),
                            ItemList.bologniumChestplate = new ArmorItem(ArmorMaterialList.bolognium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("bolognium_chestplate"),
                            ItemList.duratineChestplate = new ArmorItem(ArmorMaterialList.duratine, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("duratine_chestplate"),
                            ItemList.dark_ironChestplate = new ArmorItem(ArmorMaterialList.dark_iron, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("dark_iron_chestplate"),
                            ItemList.arenakChestplate = new ArmorItem(ArmorMaterialList.arenak, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("arenak_chestplate"),
                            ItemList.enderiumChestplate = new ArmorItem(ArmorMaterialList.enderium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("enderium_chestplate"),
                            ItemList.enderitChestplate = new ArmorItem(ArmorMaterialList.enderit, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("enderit_chestplate"),


                            //Leggings
                            ItemList.copperLeggings = new ArmorItem(ArmorMaterialList.copper, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("copper_leggings"),
                            ItemList.bronzeLeggings = new ArmorItem(ArmorMaterialList.bronze, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("bronze_leggings"),
                            ItemList.brassLeggings = new ArmorItem(ArmorMaterialList.brass, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("brass_leggings"),
                            ItemList.silverLeggings = new ArmorItem(ArmorMaterialList.silver, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("silver_leggings"),
                            ItemList.platinumLeggings = new ArmorItem(ArmorMaterialList.platinum, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("platinum_leggings"),
                            ItemList.promethiumLeggings = new ArmorItem(ArmorMaterialList.promethium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("promethium_leggings"),
                            ItemList.hard_ironLeggings = new ArmorItem(ArmorMaterialList.hard_iron, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("hard_iron_leggings"),
                            ItemList.mithrilLeggings = new ArmorItem(ArmorMaterialList.mithril, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("mithril_leggings"),
                            ItemList.orichalcumLeggings = new ArmorItem(ArmorMaterialList.orichalcum, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcum_leggings"),
                            ItemList.adamantLeggings = new ArmorItem(ArmorMaterialList.adamant, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("adamant_leggings"),
                            ItemList.glowing_ironLeggings = new ArmorItem(ArmorMaterialList.glowing_iron, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_iron_leggings"),
                            ItemList.uridiumLeggings = new ArmorItem(ArmorMaterialList.uridium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("uridium_leggings"),
                            ItemList.tritaniumLeggings = new ArmorItem(ArmorMaterialList.tritanium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("tritanium_leggings"),
                            ItemList.quadiumLeggings = new ArmorItem(ArmorMaterialList.quadium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("quadium_leggings"),
                            ItemList.etheriumLeggings = new ArmorItem(ArmorMaterialList.etherium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("etherium_leggings"),
                            ItemList.byzaniumLeggings = new ArmorItem(ArmorMaterialList.byzanium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("byzanium_leggings"),
                            ItemList.bologniumLeggings = new ArmorItem(ArmorMaterialList.bolognium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("bolognium_leggings"),
                            ItemList.duratineLeggings = new ArmorItem(ArmorMaterialList.duratine, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("duratine_leggings"),
                            ItemList.dark_ironLeggings = new ArmorItem(ArmorMaterialList.dark_iron, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("dark_iron_leggings"),
                            ItemList.arenakLeggings = new ArmorItem(ArmorMaterialList.arenak, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("arenak_leggings"),
                            ItemList.enderiumLeggings = new ArmorItem(ArmorMaterialList.enderium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("enderium_leggings"),
                            ItemList.enderitLeggings = new ArmorItem(ArmorMaterialList.enderit, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("enderit_leggings"),

                            //boots
                            ItemList.copperBoots = new ArmorItem(ArmorMaterialList.copper, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("copper_boots"),
                            ItemList.bronzeBoots = new ArmorItem(ArmorMaterialList.bronze, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("bronze_boots"),
                            ItemList.brassBoots = new ArmorItem(ArmorMaterialList.brass, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("brass_boots"),
                            ItemList.silverBoots = new ArmorItem(ArmorMaterialList.silver, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("silver_boots"),
                            ItemList.platinumBoots = new ArmorItem(ArmorMaterialList.platinum, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("platinum_boots"),
                            ItemList.promethiumBoots = new ArmorItem(ArmorMaterialList.promethium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("promethium_boots"),
                            ItemList.hard_ironBoots = new ArmorItem(ArmorMaterialList.hard_iron, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("hard_iron_boots"),
                            ItemList.mithrilBoots = new ArmorItem(ArmorMaterialList.mithril, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("mithril_boots"),
                            ItemList.orichalcumBoots = new ArmorItem(ArmorMaterialList.orichalcum, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcum_boots"),
                            ItemList.adamantBoots = new ArmorItem(ArmorMaterialList.adamant, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("adamant_boots"),
                            ItemList.glowing_ironBoots = new ArmorItem(ArmorMaterialList.glowing_iron, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_iron_boots"),
                            ItemList.uridiumBoots = new ArmorItem(ArmorMaterialList.uridium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("uridium_boots"),
                            ItemList.tritaniumBoots = new ArmorItem(ArmorMaterialList.tritanium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("tritanium_boots"),
                            ItemList.quadiumBoots = new ArmorItem(ArmorMaterialList.quadium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("quadium_boots"),
                            ItemList.etheriumBoots = new ArmorItem(ArmorMaterialList.etherium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("etherium_boots"),
                            ItemList.byzaniumBoots = new ArmorItem(ArmorMaterialList.byzanium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("byzanium_boots"),
                            ItemList.bologniumBoots = new ArmorItem(ArmorMaterialList.bolognium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("bolognium_boots"),
                            ItemList.duratineBoots = new ArmorItem(ArmorMaterialList.duratine, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("duratine_boots"),
                            ItemList.dark_ironBoots = new ArmorItem(ArmorMaterialList.dark_iron, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("dark_iron_boots"),
                            ItemList.arenakBoots = new ArmorItem(ArmorMaterialList.arenak, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("arenak_boots"),
                            ItemList.enderiumBoots = new ArmorItem(ArmorMaterialList.enderium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("enderium_boots"),
                            ItemList.enderitBoots = new ArmorItem(ArmorMaterialList.enderit, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("enderit_boots"),

                            //horse
                            ItemList.copperhorsearmor = new HorseArmorItem(5,getResourceLocation("textures/entity/horse/armor/horse_armor_copper.png"),new Item.Properties().group(immersive_metal)).setRegistryName("copper_horse_armor"),
                            ItemList.bronzehorsearmor = new HorseArmorItem(7,getResourceLocation("textures/entity/horse/armor/horse_armor_bronze.png"),new Item.Properties().group(immersive_metal)).setRegistryName("bronze_horse_armor"),
                            ItemList.brasshorsearmor = new HorseArmorItem(7,getResourceLocation("textures/entity/horse/armor/horse_armor_brass.png"),new Item.Properties().group(immersive_metal)).setRegistryName("brass_horse_armor"),
                            ItemList.silverhorsearmor = new HorseArmorItem(8,getResourceLocation("textures/entity/horse/armor/horse_armor_silver.png"),new Item.Properties().group(immersive_metal)).setRegistryName("silver_horse_armor"),
                            ItemList.platinumhorsearmor = new HorseArmorItem(11,getResourceLocation("textures/entity/horse/armor/horse_armor_platinum.png"),new Item.Properties().group(immersive_metal)).setRegistryName("platinum_horse_armor"),
                            ItemList.promethiumhorsearmor = new HorseArmorItem(11,getResourceLocation("textures/entity/horse/armor/horse_armor_promethium.png"),new Item.Properties().group(immersive_metal)).setRegistryName("promethium_horse_armor"),
                            ItemList.hard_ironhorsearmor = new HorseArmorItem(11,getResourceLocation("textures/entity/horse/armor/horse_armor_hard_iron.png"),new Item.Properties().group(immersive_metal)).setRegistryName("hard_iron_horse_armor"),
                            ItemList.mithrilhorsearmor = new HorseArmorItem(11,getResourceLocation("textures/entity/horse/armor/horse_armor_mithril.png"),new Item.Properties().group(immersive_metal)).setRegistryName("mithril_horse_armor"),
                            ItemList.orichalcumhorsearmor = new HorseArmorItem(11,getResourceLocation("textures/entity/horse/armor/horse_armor_orichalcum.png"),new Item.Properties().group(immersive_metal)).setRegistryName("orichalcum_horse_armor"),
                            ItemList.adamanthorsearmor = new HorseArmorItem(12,getResourceLocation("textures/entity/horse/armor/horse_armor_adamant.png"),new Item.Properties().group(immersive_metal)).setRegistryName("adamant_horse_armor"),
                            ItemList.glowing_ironhorsearmor = new HorseArmorItem(12,getResourceLocation("textures/entity/horse/armor/horse_armor_glowing_iron.png"),new Item.Properties().group(immersive_metal)).setRegistryName("glowing_iron_horse_armor"),
                            ItemList.uridiumhorsearmor = new HorseArmorItem(12,getResourceLocation("textures/entity/horse/armor/horse_armor_uridium.png"),new Item.Properties().group(immersive_metal)).setRegistryName("uridium_horse_armor"),
                            ItemList.tritaniumhorsearmor = new HorseArmorItem(12,getResourceLocation("textures/entity/horse/armor/horse_armor_tritanium.png"),new Item.Properties().group(immersive_metal)).setRegistryName("tritanium_horse_armor"),
                            ItemList.quadiumhorsearmor = new HorseArmorItem(12,getResourceLocation("textures/entity/horse/armor/horse_armor_quadium.png"),new Item.Properties().group(immersive_metal)).setRegistryName("quadium_horse_armor"),
                            ItemList.etheriumhorsearmor = new HorseArmorItem(13,getResourceLocation("textures/entity/horse/armor/horse_armor_etherium.png"),new Item.Properties().group(immersive_metal)).setRegistryName("etherium_horse_armor"),
                            ItemList.byzaniumhorsearmor = new HorseArmorItem(13,getResourceLocation("textures/entity/horse/armor/horse_armor_byzanium.png"),new Item.Properties().group(immersive_metal)).setRegistryName("byzanium_horse_armor"),
                            ItemList.bologniumhorsearmor = new HorseArmorItem(13,getResourceLocation("textures/entity/horse/armor/horse_armor_bolognium.png"),new Item.Properties().group(immersive_metal)).setRegistryName("bolognium_horse_armor"),
                            ItemList.duratinehorsearmor = new HorseArmorItem(14,getResourceLocation("textures/entity/horse/armor/horse_armor_duratine.png"),new Item.Properties().group(immersive_metal)).setRegistryName("duratine_horse_armor"),
                            ItemList.dark_ironhorsearmor = new HorseArmorItem(14,getResourceLocation("textures/entity/horse/armor/horse_armor_dark_iron.png"),new Item.Properties().group(immersive_metal)).setRegistryName("dark_iron_horse_armor"),
                            ItemList.arenakhorsearmor = new HorseArmorItem(15,getResourceLocation("textures/entity/horse/armor/horse_armor_arenak.png"),new Item.Properties().group(immersive_metal)).setRegistryName("arenak_horse_armor"),
                            ItemList.enderiumhorsearmor = new HorseArmorItem(14,getResourceLocation("textures/entity/horse/armor/horse_armor_enderium.png"),new Item.Properties().group(immersive_metal)).setRegistryName("enderium_horse_armor"),
                            ItemList.enderithorsearmor = new HorseArmorItem(15,getResourceLocation("textures/entity/horse/armor/horse_armor_enderit.png"),new Item.Properties().group(immersive_metal)).setRegistryName("enderit_horse_armor")

                    );

        }
        private static ResourceLocation getResourceLocation(String name) {
            return new ResourceLocation(modid, name);
        }

    }
}
