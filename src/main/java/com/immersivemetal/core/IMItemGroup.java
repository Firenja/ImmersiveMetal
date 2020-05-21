package com.immersivemetal.core;


import com.immersivemetal.list.ItemList;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class IMItemGroup extends ItemGroup
{

    public IMItemGroup()
    {
        super("immersivemetal");
    }

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemList.adamantAxe);
    }

}
