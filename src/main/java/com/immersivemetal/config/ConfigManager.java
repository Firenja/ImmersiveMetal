package com.immersivemetal.config;

import com.electronwill.nightconfig.core.file.CommentedFileConfig;
import com.electronwill.nightconfig.core.io.WritingMode;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.fml.loading.FMLPaths;

import java.io.File;

public class ConfigManager
{
    public static final ForgeConfigSpec.Builder sBuilder = new ForgeConfigSpec.Builder();
    public static final ForgeConfigSpec sConfig;

    public static String pathConfig = FMLPaths.CONFIGDIR.get().resolve("immersivemetal-Config.toml").toString();

    static
    {
        ConfigOre.init(sBuilder);
        ConfigArmor.init(sBuilder);
        sConfig = sBuilder.build();
    }

    public static void loadConfig(ForgeConfigSpec config)
    {

        final CommentedFileConfig fileConfig = CommentedFileConfig.builder(new File(pathConfig)).sync().autosave().writingMode(WritingMode.REPLACE).build();
        fileConfig.load();
        config.setConfig(fileConfig);
    }
}
