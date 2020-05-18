package com.immersivemetal.list;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier
{
    Copper(4,10,200,2,5,ItemList.copperIngot),
    Bronze(4,10,260,2,5,ItemList.bronzeIngot),
    Brass(4,10,280,2,10,ItemList.brassIngot),
    Silver(2,10,50,0,50,ItemList.silverIngot),
    Platinum(4,10,250,2,25,ItemList.platinumIngot),
    Promethium(6,10,1600,5,25,ItemList.platinumIngot),
    Hard_iron(6,10,500,5,25,ItemList.hard_ironIngot),
    Mithril(6,10,1200,6,25,ItemList.mithrilIngot),
    Orichalcum(6,10,1000,7,25,ItemList.orichalcumIngot),
    Adamant(6,10,1400,7,25,ItemList.adamantIngot),
    Glowing_iron(7,10,900,7,35,ItemList.glowing_ironIngot),
    Uridium(6,10,1100,8,35,ItemList.uridiumIngot),
    Tritanium(8,10,1300,9,35,ItemList.tritaniumIngot),
    Quadium(8,10,1600,9,35,ItemList.quadiumIngot),
    Etherium(8,10,1900,10,35,ItemList.etheriumIngot),
    Byzanium(9,10,2000,10,35,ItemList.byzaniumIngot),
    Bolognium(9,10,2300,11,35,ItemList.bologniumIngot),
    Duratine(9,10,2500,11,40,ItemList.duratineIngot),
    Dark_iron(10,10,2700,12,45,ItemList.dark_ironIngot),
    Arenak(12,10,3000,13,50,ItemList.arenakIngot);

    private float attackDamage;
    private float effi;
    private int dura;
    private int harvelvl;
    private int entchantabi;
    private Item repairmats;

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
