package com.immersivemetal.core;

import com.immersivemetal.list.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class IMItemGroup extends ItemGroup
{
    //gibt den namen der gruppe an
    public IMItemGroup()
    {
        super("Immersive Metal");
    }

    //gibt das icon an was im tab verwendet wird

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemList.testitem);
    }

}
