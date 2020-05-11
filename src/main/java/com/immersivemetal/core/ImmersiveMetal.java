package com.immersivemetal.core;

import com.immersivemetal.list.BlockList;
import com.immersivemetal.list.ItemList;
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

@Mod("immersive_metal")
public class ImmersiveMetal
{
    //um nur eine instance von sich selber zuzulassen
    public static ImmersiveMetal instance;
    //string mit der modid
    public static final String modid="immersive_metal";
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
            event.getRegistry().registerAll
                    (
                );
            logger.info("Block möpmöp");

        }


        //regisrtiert alle items zu beginn
        @SubscribeEvent
        public static void regItems(final RegistryEvent.Register<Item> event)
        {
            event.getRegistry().registerAll
                    (
             );
            logger.info("Item möpmöp");

        }


        //gibt die ressourcenloc des items zurück
        private static ResourceLocation getResourceLocation(String name)
        {
            return new ResourceLocation(modid,name);
        }

    }
}
