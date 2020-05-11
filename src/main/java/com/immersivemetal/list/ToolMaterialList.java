package com.immersivemetal.list;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier
{
    //gibt die tool tierliste an mit den werten
    testtier1(10,10,10,10,10,ItemList.testitem) ;

    //der ausführbare schaden
    private float attackDamage;

    //die effiziens
    private float effi;

    //die haltbarkeit
    private int dura;

    //das abbaulevel
    private int harvelvl;

    //wie hoch das item verzaubert werden kann
    private int entchantabi;


    //welches material zum reppen benötigt wird
    private Item repairmats;


    //konstruk zum festlegen der werte
    ToolMaterialList(float attackDamagevalue, float effivalue, int duravalue, int harvelvlvalue, int entchantabivalue, Item repairmatsvalue)
    {
        attackDamage = attackDamagevalue;
        effi = effivalue;
        dura = duravalue;
        harvelvl = harvelvlvalue;
        entchantabi = entchantabivalue;
        repairmats = repairmatsvalue;
    }

    @Override
    public int getMaxUses()
    {
        return dura;
    }

    @Override
    public float getEfficiency()
    {
        return effi;
    }

    @Override
    public float getAttackDamage()
    {
        return attackDamage;
    }

    @Override
    public int getHarvestLevel()
    {
        return harvelvl;
    }

    @Override
    public int getEnchantability()
    {
        return entchantabi;
    }

    @Override
    public Ingredient getRepairMaterial()
    {
        return Ingredient.fromItems(repairmats);
    }
}
