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
    copper("copper",295,new int[]{1,2,1,1},5,ItemList.copperIngot,"item.armor.equip",0),
    bronze("bronze",420,new int[]{2,3,2,1},5,ItemList.bronzeIngot,"item.armor.equip",0),
    brass("brass",455,new int[]{2,3,2,1},10,ItemList.brassIngot,"item.armor.equip",0),
    silver("silver",215,new int[]{1,1,1,1},50,ItemList.silverIngot,"item.armor.equip",0),
    platinum("platinum",385,new int[]{2,7,5,3},25,ItemList.platinumIngot,"item.armor.equip",0),
    promethium("promethium",1790,new int[]{3,8,6,3},25,ItemList.promethiumIngot,"item.armor.equip",0),
    hard_iron("hard_iron",830,new int[]{3,8,6,3},25,ItemList.hard_ironIngot,"item.armor.equip",0),
    mithril("mithril",1710,new int[]{3,8,6,3},25,ItemList.mithrilIngot,"item.armor.equip",4),
    orichalcum("orichalcum",1670,new int[]{3,8,6,3},25,ItemList.orichalcumIngot,"item.armor.equip",6),
    adamant("adamant",1750,new int[]{3,8,6,3},25,ItemList.adamantIngot,"item.armor.equip",6),
    glowing_iron("glowing_iron",1650,new int[]{4,9,7,4},35,ItemList.glowing_ironIngot,"item.armor.equip",12),
    uridium("uridium",1735,new int[]{4,9,7,4},35,ItemList.uridiumIngot,"item.armor.equip",12),
    tritanium("tritanium",1735,new int[]{4,9,7,4},35,ItemList.tritaniumIngot,"item.armor.equip",12),
    quadium("quadium",1790,new int[]{4,9,7,4},35,ItemList.quadiumIngot,"item.armor.equip",12),
    etherium("etherium",1870,new int[]{4,9,7,4},35,ItemList.etheriumIngot,"item.armor.equip",12),
    byzanium("byzanium",1890,new int[]{4,9,7,4},35,ItemList.byzaniumIngot,"item.armor.equip",12),
    bolognium("bolognium",1950,new int[]{4,9,7,4},35,ItemList.bologniumIngot,"item.armor.equip",12),
    duratine("duratine",2030,new int[]{4,9,7,4},40,ItemList.duratineIngot,"item.armor.equip",12),
    dark_iron("dark_iron",2110,new int[]{5,10,8,5},45,ItemList.dark_ironIngot,"item.armor.equip",16),
    arenak("arenak",2190,new int[]{6,11,9,6},50,ItemList.arenakIngot,"item.armor.equip",20);






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

