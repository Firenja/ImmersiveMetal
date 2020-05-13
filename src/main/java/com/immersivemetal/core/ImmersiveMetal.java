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
    //um nur eine instance von sich selber zuzulassen
    public static ImmersiveMetal instance;
    //string mit der modid
    public static final String modid = "immersivemetal";
    //zur ausgabe in logs
    private static final Logger logger = LogManager.getLogger(modid);
    //die gruppe der items und blöcke im mod
    public static final ItemGroup immersive_metal = new IMItemGroup();

    public ImmersiveMetal()
    {
        //legt beim konstruktion sich selber auf die instanz ab
        instance = this;
        //legt die setup funktion auf den fml listener ab
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        //legt die clientRegistries funktion auf den fml listener ab
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);
        //registriert sich selber beim fml
        MinecraftForge.EVENT_BUS.register(this);
    }

    //wird beim laden des mods ausgeführt
    private void setup(final FMLCommonSetupEvent event)
    {
        OreGeneration.setupOreGeneration();
        logger.info("möp");
    }

    //wird beim laden des users ausgeführt
    private void clientRegistries(final FMLClientSetupEvent event)
    {
        logger.info("mäp");
    }

    //Klasse kümmert sich um das registrieren aller items blöcke und co
    @Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class RegistryEvents
    {

        //regisrtiert alle blöcke zu beginn
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

                    //OreBlock

                    BlockList.copperOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("copper_ore")),
                    BlockList.tinOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("tin_ore")),
                    BlockList.zincOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("zinc_ore")),
                    BlockList.silverOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(2, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("silver_ore")),
                    BlockList.platinumOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("platinum_ore")),
                    BlockList.promethiumOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("promethium_ore")),
                    BlockList.hard_ironOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("hard_iron_ore")),
                    BlockList.mithrilOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(3, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("mithril_ore")),
                    BlockList.orichalcumOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("orichalcum_ore")),
                    BlockList.adamantOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(4, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("adamant_ore")),
                    BlockList.glowing_ironOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 10).lightValue(3).sound(SoundType.METAL)).setRegistryName(getResourceLocation("glowing_iron_nether_ore")),
                    BlockList.uridiumOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("uridium_nether_ore")),
                    BlockList.tritaniumOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("tritanium_nether_ore")),
                    BlockList.quadiumOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("quadium_nether_ore")),
                    BlockList.etheriumOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("etherium_nether_ore")),
                    BlockList.byzaniumOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("byzanium_nether_ore")),
                    BlockList.bologniumOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(5, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("bolognium_nether_ore")),
                    BlockList.duratineOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(10, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("duratine_ore")),
                    BlockList.dark_ironOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(15, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("dark_iron_ore")),
                    BlockList.arenakOre = new Block(Block.Properties.create(Material.IRON).hardnessAndResistance(20, 10).lightValue(0).sound(SoundType.METAL)).setRegistryName(getResourceLocation("arenak_ore"))

            );
            logger.info(modid + ": Blocks reg");

        }


        //regisrtiert alle items zu beginn
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
                            ItemList.arenakNugget = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("arenak_nugget"))


                            /*

                            //ore_powder
                            ItemList.copperPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("copperPowder")),
                            ItemList.tinPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("tinPowder")),
                            ItemList.bronzePowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("bronzePowder")),
                            ItemList.zincPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("zincPowder")),
                            ItemList.brassPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("brassPowder")),
                            ItemList.silverPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("silverPowder")),
                            ItemList.platinumPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("platinumPowder")),
                            ItemList.promethiumPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("promethiumPowder")),
                            ItemList.hard_ironPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("hard_ironPowder")),
                            ItemList.mithrilPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("mithrilPowder")),
                            ItemList.orichalcumPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("orichalcumPowder")),
                            ItemList.adamantPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("adamantPowder")),
                            ItemList.glowing_ironPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("glowing_ironPowder")),
                            ItemList.uridiumPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("uridiumPowder")),
                            ItemList.tritaniumPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("tritaniumPowder")),
                            ItemList.quadiumPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("quadiumPowder")),
                            ItemList.etheriumPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("etheriumPowder")),
                            ItemList.byzaniumPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("byzaniumPowder")),
                            ItemList.bologniumPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("bologniumPowder")),
                            ItemList.duratinePowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("duratinePowder")),
                            ItemList.dark_ironPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("dark_ironPowder")),
                            ItemList.arenakPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("arenakPowder")),
                            ItemList.goldPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("goldPowder")),
                            ItemList.ironPowder = new Item(new Item.Properties().group(immersive_metal)).setRegistryName(getResourceLocation("ironPowder")),



                            //axe
                            ItemList.copperAxe = new AxeItem(ToolMaterialList.Copper, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("copperAxe"),
                            ItemList.bronzeAxe = new AxeItem(ToolMaterialList.Bronze, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("bronzeAxe"),
                            ItemList.brassAxe = new AxeItem(ToolMaterialList.Brass, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("brassAxe"),
                            ItemList.silverAxe = new AxeItem(ToolMaterialList.Silver, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("silverAxe"),
                            ItemList.platinumAxe = new AxeItem(ToolMaterialList.Platinum, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("platinumAxe"),
                            ItemList.promethiumAxe = new AxeItem(ToolMaterialList.Promethium, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("promethiumAxe"),
                            ItemList.hard_ironAxe = new AxeItem(ToolMaterialList.Hard_iron, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("hard_ironAxe"),
                            ItemList.mithrilAxe = new AxeItem(ToolMaterialList.Mithril, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("mithrilAxe"),
                            ItemList.orichalcumAxe = new AxeItem(ToolMaterialList.Orichalcum, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcumAxe"),
                            ItemList.adamantAxe = new AxeItem(ToolMaterialList.Adamant, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("adamantAxe"),
                            ItemList.glowing_ironAxe = new AxeItem(ToolMaterialList.Glowing_iron, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_ironAxe"),
                            ItemList.uridiumAxe = new AxeItem(ToolMaterialList.Uridium, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("uridiumAxe"),
                            ItemList.tritaniumAxe = new AxeItem(ToolMaterialList.Tritanium, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("tritaniumAxe"),
                            ItemList.quadiumAxe = new AxeItem(ToolMaterialList.Quadium, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("quadiumAxe"),
                            ItemList.etheriumAxe = new AxeItem(ToolMaterialList.Etherium, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("etheriumAxe"),
                            ItemList.byzaniumAxe = new AxeItem(ToolMaterialList.Byzanium, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("byzaniumAxe"),
                            ItemList.bologniumAxe = new AxeItem(ToolMaterialList.Bolognium, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("bologniumAxe"),
                            ItemList.duratineAxe = new AxeItem(ToolMaterialList.Duratine, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("duratineAxe"),
                            ItemList.dark_ironAxe = new AxeItem(ToolMaterialList.Dark_iron, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("dark_ironAxe"),
                            ItemList.arenakAxe = new AxeItem(ToolMaterialList.Arenak, 9, 1, new Item.Properties().group(immersive_metal)).setRegistryName("arenakAxe"),

                            //Shovel
                            ItemList.copperShovel = new ShovelItem(ToolMaterialList.Copper, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("copperShovel"),
                            ItemList.bronzeShovel = new ShovelItem(ToolMaterialList.Bronze, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("bronzeShovel"),
                            ItemList.brassShovel = new ShovelItem(ToolMaterialList.Brass, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("brassShovel"),
                            ItemList.silverShovel = new ShovelItem(ToolMaterialList.Silver, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("silverShovel"),
                            ItemList.platinumShovel = new ShovelItem(ToolMaterialList.Platinum, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("platinumShovel"),
                            ItemList.promethiumShovel = new ShovelItem(ToolMaterialList.Promethium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("promethiumShovel"),
                            ItemList.hard_ironShovel = new ShovelItem(ToolMaterialList.Hard_iron, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("hard_ironShovel"),
                            ItemList.mithrilShovel = new ShovelItem(ToolMaterialList.Mithril, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("mithrilShovel"),
                            ItemList.orichalcumShovel = new ShovelItem(ToolMaterialList.Orichalcum, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcumShovel"),
                            ItemList.adamantShovel = new ShovelItem(ToolMaterialList.Adamant, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("adamantShovel"),
                            ItemList.glowing_ironShovel = new ShovelItem(ToolMaterialList.Glowing_iron, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_ironShovel"),
                            ItemList.uridiumShovel = new ShovelItem(ToolMaterialList.Uridium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("uridiumShovel"),
                            ItemList.tritaniumShovel = new ShovelItem(ToolMaterialList.Tritanium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("tritaniumShovel"),
                            ItemList.quadiumShovel = new ShovelItem(ToolMaterialList.Quadium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("quadiumShovel"),
                            ItemList.etheriumShovel = new ShovelItem(ToolMaterialList.Etherium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("etheriumShovel"),
                            ItemList.byzaniumShovel = new ShovelItem(ToolMaterialList.Byzanium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("byzaniumShovel"),
                            ItemList.bologniumShovel = new ShovelItem(ToolMaterialList.Bolognium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("bologniumShovel"),
                            ItemList.duratineShovel = new ShovelItem(ToolMaterialList.Duratine, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("duratineShovel"),
                            ItemList.dark_ironShovel = new ShovelItem(ToolMaterialList.Dark_iron, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("dark_ironShovel"),
                            ItemList.arenakShovel = new ShovelItem(ToolMaterialList.Arenak, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("arenakShovel"),

                            //Pickaxe
                            ItemList.copperPickaxe = new PickaxeItem(ToolMaterialList.Copper, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("copperPickaxe"),
                            ItemList.bronzePickaxe = new PickaxeItem(ToolMaterialList.Bronze, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("bronzePickaxe"),
                            ItemList.brassPickaxe = new PickaxeItem(ToolMaterialList.Brass, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("brassPickaxe"),
                            ItemList.silverPickaxe = new PickaxeItem(ToolMaterialList.Silver, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("silverPickaxe"),
                            ItemList.platinumPickaxe = new PickaxeItem(ToolMaterialList.Platinum, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("platinumPickaxe"),
                            ItemList.promethiumPickaxe = new PickaxeItem(ToolMaterialList.Promethium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("promethiumPickaxe"),
                            ItemList.hard_ironPickaxe = new PickaxeItem(ToolMaterialList.Hard_iron, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("hard_ironPickaxe"),
                            ItemList.mithrilPickaxe = new PickaxeItem(ToolMaterialList.Mithril, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("mithrilPickaxe"),
                            ItemList.orichalcumPickaxe = new PickaxeItem(ToolMaterialList.Orichalcum, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcumPickaxe"),
                            ItemList.adamantPickaxe = new PickaxeItem(ToolMaterialList.Adamant, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("adamantPickaxe"),
                            ItemList.glowing_ironPickaxe = new PickaxeItem(ToolMaterialList.Glowing_iron, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_ironPickaxe"),
                            ItemList.uridiumPickaxe = new PickaxeItem(ToolMaterialList.Uridium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("uridiumPickaxe"),
                            ItemList.tritaniumPickaxe = new PickaxeItem(ToolMaterialList.Tritanium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("tritaniumPickaxe"),
                            ItemList.quadiumPickaxe = new PickaxeItem(ToolMaterialList.Quadium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("quadiumPickaxe"),
                            ItemList.etheriumPickaxe = new PickaxeItem(ToolMaterialList.Etherium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("etheriumPickaxe"),
                            ItemList.byzaniumPickaxe = new PickaxeItem(ToolMaterialList.Byzanium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("byzaniumPickaxe"),
                            ItemList.bologniumPickaxe = new PickaxeItem(ToolMaterialList.Bolognium, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("bologniumPickaxe"),
                            ItemList.duratinePickaxe = new PickaxeItem(ToolMaterialList.Duratine, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("duratinePickaxe"),
                            ItemList.dark_ironPickaxe = new PickaxeItem(ToolMaterialList.Dark_iron, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("dark_ironPickaxe"),
                            ItemList.arenakPickaxe = new PickaxeItem(ToolMaterialList.Arenak, -1, 1, new Item.Properties().group(immersive_metal)).setRegistryName("arenakPickaxe"),

                            //Hoe
                            ItemList.copperHoe = new HoeItem(ToolMaterialList.Copper, -1, new Item.Properties().group(immersive_metal)).setRegistryName("copperHoe"),
                            ItemList.bronzeHoe = new HoeItem(ToolMaterialList.Bronze, -1, new Item.Properties().group(immersive_metal)).setRegistryName("bronzeHoe"),
                            ItemList.brassHoe = new HoeItem(ToolMaterialList.Brass, -1, new Item.Properties().group(immersive_metal)).setRegistryName("brassHoe"),
                            ItemList.silverHoe = new HoeItem(ToolMaterialList.Silver, -1, new Item.Properties().group(immersive_metal)).setRegistryName("silverHoe"),
                            ItemList.platinumHoe = new HoeItem(ToolMaterialList.Platinum, -1, new Item.Properties().group(immersive_metal)).setRegistryName("platinumHoe"),
                            ItemList.promethiumHoe = new HoeItem(ToolMaterialList.Promethium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("promethiumHoe"),
                            ItemList.hard_ironHoe = new HoeItem(ToolMaterialList.Hard_iron, -1, new Item.Properties().group(immersive_metal)).setRegistryName("hard_ironHoe"),
                            ItemList.mithrilHoe = new HoeItem(ToolMaterialList.Mithril, -1, new Item.Properties().group(immersive_metal)).setRegistryName("mithrilHoe"),
                            ItemList.orichalcumHoe = new HoeItem(ToolMaterialList.Orichalcum, -1, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcumHoe"),
                            ItemList.adamantHoe = new HoeItem(ToolMaterialList.Adamant, -1, new Item.Properties().group(immersive_metal)).setRegistryName("adamantHoe"),
                            ItemList.glowing_ironHoe = new HoeItem(ToolMaterialList.Glowing_iron, -1, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_ironHoe"),
                            ItemList.uridiumHoe = new HoeItem(ToolMaterialList.Uridium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("uridiumHoe"),
                            ItemList.tritaniumHoe = new HoeItem(ToolMaterialList.Tritanium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("tritaniumHoe"),
                            ItemList.quadiumHoe = new HoeItem(ToolMaterialList.Quadium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("quadiumHoe"),
                            ItemList.etheriumHoe = new HoeItem(ToolMaterialList.Etherium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("etheriumHoe"),
                            ItemList.byzaniumHoe = new HoeItem(ToolMaterialList.Byzanium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("byzaniumHoe"),
                            ItemList.bologniumHoe = new HoeItem(ToolMaterialList.Bolognium, -1, new Item.Properties().group(immersive_metal)).setRegistryName("bologniumHoe"),
                            ItemList.duratineHoe = new HoeItem(ToolMaterialList.Duratine, -1, new Item.Properties().group(immersive_metal)).setRegistryName("duratineHoe"),
                            ItemList.dark_ironHoe = new HoeItem(ToolMaterialList.Dark_iron, -1, new Item.Properties().group(immersive_metal)).setRegistryName("dark_ironHoe"),
                            ItemList.arenakHoe = new HoeItem(ToolMaterialList.Arenak, -1, new Item.Properties().group(immersive_metal)).setRegistryName("arenakHoe"),

                            //Sword
                            ItemList.copperSword = new SwordItem(ToolMaterialList.Copper, 4, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("copperSword"),
                            ItemList.bronzeSword = new SwordItem(ToolMaterialList.Bronze, 4, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("bronzeSword"),
                            ItemList.brassSword = new SwordItem(ToolMaterialList.Brass, 4, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("brassSword"),
                            ItemList.silverSword = new SwordItem(ToolMaterialList.Silver, 2, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("silverSword"),
                            ItemList.platinumSword = new SwordItem(ToolMaterialList.Platinum, 4, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("platinumSword"),
                            ItemList.promethiumSword = new SwordItem(ToolMaterialList.Promethium, 6, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("promethiumSword"),
                            ItemList.hard_ironSword = new SwordItem(ToolMaterialList.Hard_iron, 6, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("hard_ironSword"),
                            ItemList.mithrilSword = new SwordItem(ToolMaterialList.Mithril, 6, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("mithrilSword"),
                            ItemList.orichalcumSword = new SwordItem(ToolMaterialList.Orichalcum, 6, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcumSword"),
                            ItemList.adamantSword = new SwordItem(ToolMaterialList.Adamant, 6, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("adamantSword"),
                            ItemList.glowing_ironSword = new SwordItem(ToolMaterialList.Glowing_iron, 7, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_ironSword"),
                            ItemList.uridiumSword = new SwordItem(ToolMaterialList.Uridium, 6, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("uridiumSword"),
                            ItemList.tritaniumSword = new SwordItem(ToolMaterialList.Tritanium, 8, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("tritaniumSword"),
                            ItemList.quadiumSword = new SwordItem(ToolMaterialList.Quadium, 8, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("quadiumSword"),
                            ItemList.etheriumSword = new SwordItem(ToolMaterialList.Etherium, 8, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("etheriumSword"),
                            ItemList.byzaniumSword = new SwordItem(ToolMaterialList.Byzanium, 9, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("byzaniumSword"),
                            ItemList.bologniumSword = new SwordItem(ToolMaterialList.Bolognium, 9, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("bologniumSword"),
                            ItemList.duratineSword = new SwordItem(ToolMaterialList.Duratine, 9, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("duratineSword"),
                            ItemList.dark_ironSword = new SwordItem(ToolMaterialList.Dark_iron, 10, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("dark_ironSword"),
                            ItemList.arenakSword = new SwordItem(ToolMaterialList.Arenak, 12, 1.6F, new Item.Properties().group(immersive_metal)).setRegistryName("arenakSword"),

                            //Helmet
                            ItemList.copperHelmet = new ArmorItem(ArmorMaterialList.copper, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("copperHelmet"),
                            ItemList.bronzeHelmet = new ArmorItem(ArmorMaterialList.bronze, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("bronzeHelmet"),
                            ItemList.brassHelmet = new ArmorItem(ArmorMaterialList.brass, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("brassHelmet"),
                            ItemList.silverHelmet = new ArmorItem(ArmorMaterialList.silver, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("silverHelmet"),
                            ItemList.platinumHelmet = new ArmorItem(ArmorMaterialList.platinum, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("platinumHelmet"),
                            ItemList.promethiumHelmet = new ArmorItem(ArmorMaterialList.promethium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("promethiumHelmet"),
                            ItemList.hard_ironHelmet = new ArmorItem(ArmorMaterialList.hard_iron, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("hard_ironHelmet"),
                            ItemList.mithrilHelmet = new ArmorItem(ArmorMaterialList.mithril, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("mithrilHelmet"),
                            ItemList.orichalcumHelmet = new ArmorItem(ArmorMaterialList.orichalcum, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcumHelmet"),
                            ItemList.adamantHelmet = new ArmorItem(ArmorMaterialList.adamant, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("adamantHelmet"),
                            ItemList.glowing_ironHelmet = new ArmorItem(ArmorMaterialList.glowing_iron, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_ironHelmet"),
                            ItemList.uridiumHelmet = new ArmorItem(ArmorMaterialList.uridium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("uridiumHelmet"),
                            ItemList.tritaniumHelmet = new ArmorItem(ArmorMaterialList.tritanium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("tritaniumHelmet"),
                            ItemList.quadiumHelmet = new ArmorItem(ArmorMaterialList.quadium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("quadiumHelmet"),
                            ItemList.etheriumHelmet = new ArmorItem(ArmorMaterialList.etherium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("etheriumHelmet"),
                            ItemList.byzaniumHelmet = new ArmorItem(ArmorMaterialList.byzanium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("byzaniumHelmet"),
                            ItemList.bologniumHelmet = new ArmorItem(ArmorMaterialList.bolognium, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("bologniumHelmet"),
                            ItemList.duratineHelmet = new ArmorItem(ArmorMaterialList.duratine, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("duratineHelmet"),
                            ItemList.dark_ironHelmet = new ArmorItem(ArmorMaterialList.dark_iron, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("dark_ironHelmet"),
                            ItemList.arenakHelmet = new ArmorItem(ArmorMaterialList.arenak, EquipmentSlotType.HEAD, new Item.Properties().group(immersive_metal)).setRegistryName("arenakHelmet"),

                            //Chestplate
                            ItemList.copperChestplate = new ArmorItem(ArmorMaterialList.copper, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("copperChestplate"),
                            ItemList.bronzeChestplate = new ArmorItem(ArmorMaterialList.bronze, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("bronzeChestplate"),
                            ItemList.brassChestplate = new ArmorItem(ArmorMaterialList.brass, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("brassChestplate"),
                            ItemList.silverChestplate = new ArmorItem(ArmorMaterialList.silver, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("silverChestplate"),
                            ItemList.platinumChestplate = new ArmorItem(ArmorMaterialList.platinum, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("platinumChestplate"),
                            ItemList.promethiumChestplate = new ArmorItem(ArmorMaterialList.promethium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("promethiumChestplate"),
                            ItemList.hard_ironChestplate = new ArmorItem(ArmorMaterialList.hard_iron, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("hard_ironChestplate"),
                            ItemList.mithrilChestplate = new ArmorItem(ArmorMaterialList.mithril, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("mithrilChestplate"),
                            ItemList.orichalcumChestplate = new ArmorItem(ArmorMaterialList.orichalcum, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcumChestplate"),
                            ItemList.adamantChestplate = new ArmorItem(ArmorMaterialList.adamant, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("adamantChestplate"),
                            ItemList.glowing_ironChestplate = new ArmorItem(ArmorMaterialList.glowing_iron, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_ironChestplate"),
                            ItemList.uridiumChestplate = new ArmorItem(ArmorMaterialList.uridium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("uridiumChestplate"),
                            ItemList.tritaniumChestplate = new ArmorItem(ArmorMaterialList.tritanium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("tritaniumChestplate"),
                            ItemList.quadiumChestplate = new ArmorItem(ArmorMaterialList.quadium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("quadiumChestplate"),
                            ItemList.etheriumChestplate = new ArmorItem(ArmorMaterialList.etherium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("etheriumChestplate"),
                            ItemList.byzaniumChestplate = new ArmorItem(ArmorMaterialList.byzanium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("byzaniumChestplate"),
                            ItemList.bologniumChestplate = new ArmorItem(ArmorMaterialList.bolognium, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("bologniumChestplate"),
                            ItemList.duratineChestplate = new ArmorItem(ArmorMaterialList.duratine, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("duratineChestplate"),
                            ItemList.dark_ironChestplate = new ArmorItem(ArmorMaterialList.dark_iron, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("dark_ironChestplate"),
                            ItemList.arenakChestplate = new ArmorItem(ArmorMaterialList.arenak, EquipmentSlotType.CHEST, new Item.Properties().group(immersive_metal)).setRegistryName("arenakChestplate"),

                            //Leggings
                            ItemList.copperLeggings = new ArmorItem(ArmorMaterialList.copper, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("copperLeggings"),
                            ItemList.bronzeLeggings = new ArmorItem(ArmorMaterialList.bronze, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("bronzeLeggings"),
                            ItemList.brassLeggings = new ArmorItem(ArmorMaterialList.brass, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("brassLeggings"),
                            ItemList.silverLeggings = new ArmorItem(ArmorMaterialList.silver, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("silverLeggings"),
                            ItemList.platinumLeggings = new ArmorItem(ArmorMaterialList.platinum, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("platinumLeggings"),
                            ItemList.promethiumLeggings = new ArmorItem(ArmorMaterialList.promethium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("promethiumLeggings"),
                            ItemList.hard_ironLeggings = new ArmorItem(ArmorMaterialList.hard_iron, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("hard_ironLeggings"),
                            ItemList.mithrilLeggings = new ArmorItem(ArmorMaterialList.mithril, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("mithrilLeggings"),
                            ItemList.orichalcumLeggings = new ArmorItem(ArmorMaterialList.orichalcum, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcumLeggings"),
                            ItemList.adamantLeggings = new ArmorItem(ArmorMaterialList.adamant, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("adamantLeggings"),
                            ItemList.glowing_ironLeggings = new ArmorItem(ArmorMaterialList.glowing_iron, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_ironLeggings"),
                            ItemList.uridiumLeggings = new ArmorItem(ArmorMaterialList.uridium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("uridiumLeggings"),
                            ItemList.tritaniumLeggings = new ArmorItem(ArmorMaterialList.tritanium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("tritaniumLeggings"),
                            ItemList.quadiumLeggings = new ArmorItem(ArmorMaterialList.quadium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("quadiumLeggings"),
                            ItemList.etheriumLeggings = new ArmorItem(ArmorMaterialList.etherium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("etheriumLeggings"),
                            ItemList.byzaniumLeggings = new ArmorItem(ArmorMaterialList.byzanium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("byzaniumLeggings"),
                            ItemList.bologniumLeggings = new ArmorItem(ArmorMaterialList.bolognium, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("bologniumLeggings"),
                            ItemList.duratineLeggings = new ArmorItem(ArmorMaterialList.duratine, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("duratineLeggings"),
                            ItemList.dark_ironLeggings = new ArmorItem(ArmorMaterialList.dark_iron, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("dark_ironLeggings"),
                            ItemList.arenakLeggings = new ArmorItem(ArmorMaterialList.arenak, EquipmentSlotType.LEGS, new Item.Properties().group(immersive_metal)).setRegistryName("arenakLeggings"),

                            //boots
                            ItemList.copperBoots = new ArmorItem(ArmorMaterialList.copper, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("copperBoots"),
                            ItemList.bronzeBoots = new ArmorItem(ArmorMaterialList.bronze, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("bronzeBoots"),
                            ItemList.brassBoots = new ArmorItem(ArmorMaterialList.brass, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("brassBoots"),
                            ItemList.silverBoots = new ArmorItem(ArmorMaterialList.silver, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("silverBoots"),
                            ItemList.platinumBoots = new ArmorItem(ArmorMaterialList.platinum, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("platinumBoots"),
                            ItemList.promethiumBoots = new ArmorItem(ArmorMaterialList.promethium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("promethiumBoots"),
                            ItemList.hard_ironBoots = new ArmorItem(ArmorMaterialList.hard_iron, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("hard_ironBoots"),
                            ItemList.mithrilBoots = new ArmorItem(ArmorMaterialList.mithril, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("mithrilBoots"),
                            ItemList.orichalcumBoots = new ArmorItem(ArmorMaterialList.orichalcum, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("orichalcumBoots"),
                            ItemList.adamantBoots = new ArmorItem(ArmorMaterialList.adamant, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("adamantBoots"),
                            ItemList.glowing_ironBoots = new ArmorItem(ArmorMaterialList.glowing_iron, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("glowing_ironBoots"),
                            ItemList.uridiumBoots = new ArmorItem(ArmorMaterialList.uridium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("uridiumBoots"),
                            ItemList.tritaniumBoots = new ArmorItem(ArmorMaterialList.tritanium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("tritaniumBoots"),
                            ItemList.quadiumBoots = new ArmorItem(ArmorMaterialList.quadium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("quadiumBoots"),
                            ItemList.etheriumBoots = new ArmorItem(ArmorMaterialList.etherium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("etheriumBoots"),
                            ItemList.byzaniumBoots = new ArmorItem(ArmorMaterialList.byzanium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("byzaniumBoots"),
                            ItemList.bologniumBoots = new ArmorItem(ArmorMaterialList.bolognium, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("bologniumBoots"),
                            ItemList.duratineBoots = new ArmorItem(ArmorMaterialList.duratine, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("duratineBoots"),
                            ItemList.dark_ironBoots = new ArmorItem(ArmorMaterialList.dark_iron, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("dark_ironBoots"),
                            ItemList.arenakBoots = new ArmorItem(ArmorMaterialList.arenak, EquipmentSlotType.FEET, new Item.Properties().group(immersive_metal)).setRegistryName("arenakBoots")
*/

                    );
            logger.info(modid + ": Items reg");

        }


        //gibt die ressourcenloc des items zurück
        private static ResourceLocation getResourceLocation(String name) {
            return new ResourceLocation(modid, name);
        }

    }
}
