package com.immersivemetal.list;

import com.immersivemetal.core.ImmersiveMetal;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum ArmorMaterialList implements IArmorMaterial
{
    testarmortier1("waffel",100,new int[]{1,2,3,4},10,ItemList.testitem,"entity.cat.ambient",10);

    private String name;
    private int[] dmgredu;
    private int dura;
    private int enchabi;
    private Item repitem;
    private String equisou;
    private float tough;

    private static final int[] masdmgarr = new int[]{13,15,16,11};

    ArmorMaterialList(String namevalue, int duravalue, int[] dmgreduvalue, int enchabivalue, Item repitemvalue,String equisouvalue,float toughvalue)
    {
        name = namevalue;
        dmgredu = dmgreduvalue;
        dura = duravalue;
        enchabi = enchabivalue;
        repitem = repitemvalue;
        equisou = equisouvalue;
        tough = toughvalue;
    }

    @Override
    public int getDurability(EquipmentSlotType slotIn)
    {
        return masdmgarr[slotIn.getIndex()] * dura;
    }

    @Override
    public int getDamageReductionAmount(EquipmentSlotType slotIn)
    {
        return dmgredu[slotIn.getIndex()];
    }

    @Override
    public int getEnchantability()
    {
        return enchabi;
    }

    @Override
    public SoundEvent getSoundEvent()
    {
        return new SoundEvent(new ResourceLocation(equisou));
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(repitem);
    }

    @Override
    public String getName()
    {
        return ImmersiveMetal.modid +":"+ name;
    }

    @Override
    public float getToughness()
    {
        return tough;
    }
}

