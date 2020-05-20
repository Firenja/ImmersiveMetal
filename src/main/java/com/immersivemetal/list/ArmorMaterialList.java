package com.immersivemetal.list;

import com.immersivemetal.config.ConfigArmor;
import com.immersivemetal.core.ImmersiveMetal;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public enum ArmorMaterialList implements IArmorMaterial
{

    copper("copper", ConfigArmor.copperarmordurability.get(),new int[]{ConfigArmor.copperarmordefhelmet.get(),ConfigArmor.copperarmordefchestplate.get(),ConfigArmor.copperarmordefleggings.get(),ConfigArmor.copperarmordefboots.get()},ConfigArmor.copperarmorentchantvalue.get(),ItemList.copperIngot,"item.armor.equip",ConfigArmor.copperarmortoughness.get()),
    bronze("bronze",ConfigArmor.bronzearmordurability.get(),new int[]{ConfigArmor.bronzearmordefhelmet.get(),ConfigArmor.bronzearmordefchestplate.get(),ConfigArmor.bronzearmordefleggings.get(),ConfigArmor.bronzearmordefboots.get()},ConfigArmor.bronzearmorentchantvalue.get(),ItemList.bronzeIngot,"item.armor.equip",ConfigArmor.bronzearmortoughness.get()),
    brass("brass",ConfigArmor.brassarmordurability.get(),new int[]{ConfigArmor.brassarmordefhelmet.get(),ConfigArmor.brassarmordefchestplate.get(),ConfigArmor.brassarmordefleggings.get(),ConfigArmor.brassarmordefboots.get()},ConfigArmor.brassarmorentchantvalue.get(),ItemList.brassIngot,"item.armor.equip",ConfigArmor.brassarmortoughness.get()),
    silver("silver",ConfigArmor.silverarmordurability.get(),new int[]{ConfigArmor.silverarmordefhelmet.get(),ConfigArmor.silverarmordefchestplate.get(),ConfigArmor.silverarmordefleggings.get(),ConfigArmor.silverarmordefboots.get()},ConfigArmor.silverarmorentchantvalue.get(),ItemList.silverIngot,"item.armor.equip",ConfigArmor.silverarmortoughness.get()),
    platinum("platinum",ConfigArmor.platinumarmordurability.get(),new int[]{ConfigArmor.platinumarmordefhelmet.get(),ConfigArmor.platinumarmordefchestplate.get(),ConfigArmor.platinumarmordefleggings.get(),ConfigArmor.platinumarmordefboots.get()},ConfigArmor.platinumarmorentchantvalue.get(),ItemList.platinumIngot,"item.armor.equip",ConfigArmor.platinumarmortoughness.get()),
    promethium("promethium",ConfigArmor.promethiumarmordurability.get(),new int[]{ConfigArmor.promethiumarmordefhelmet.get(),ConfigArmor.promethiumarmordefchestplate.get(),ConfigArmor.promethiumarmordefleggings.get(),ConfigArmor.promethiumarmordefboots.get()},ConfigArmor.promethiumarmorentchantvalue.get(),ItemList.promethiumIngot,"item.armor.equip",ConfigArmor.promethiumarmortoughness.get()),
    hard_iron("hard_iron",ConfigArmor.hardironarmordurability.get(),new int[]{ConfigArmor.hardironarmordefhelmet.get(),ConfigArmor.hardironarmordefchestplate.get(),ConfigArmor.hardironarmordefleggings.get(),ConfigArmor.hardironarmordefboots.get()},ConfigArmor.hardironarmorentchantvalue.get(),ItemList.hard_ironIngot,"item.armor.equip",ConfigArmor.hardironarmortoughness.get()),
    mithril("mithril",ConfigArmor.mithrilarmordurability.get(),new int[]{ConfigArmor.mithrilarmordefhelmet.get(),ConfigArmor.mithrilarmordefchestplate.get(),ConfigArmor.mithrilarmordefleggings.get(),ConfigArmor.mithrilarmordefboots.get()},ConfigArmor.mithrilarmorentchantvalue.get(),ItemList.mithrilIngot,"item.armor.equip",ConfigArmor.mithrilarmortoughness.get()),
    orichalcum("orichalcum",ConfigArmor.orichalcumarmordurability.get(),new int[]{ConfigArmor.orichalcumarmordefhelmet.get(),ConfigArmor.orichalcumarmordefchestplate.get(),ConfigArmor.orichalcumarmordefleggings.get(),ConfigArmor.orichalcumarmordefboots.get()},ConfigArmor.orichalcumarmorentchantvalue.get(),ItemList.orichalcumIngot,"item.armor.equip",ConfigArmor.orichalcumarmortoughness.get()),
    adamant("adamant",ConfigArmor.adamantarmordurability.get(),new int[]{ConfigArmor.adamantarmordefhelmet.get(),ConfigArmor.adamantarmordefchestplate.get(),ConfigArmor.adamantarmordefleggings.get(),ConfigArmor.adamantarmordefboots.get()},ConfigArmor.adamantarmorentchantvalue.get(),ItemList.adamantIngot,"item.armor.equip",ConfigArmor.adamantarmortoughness.get()),
    glowing_iron("glowing_iron",ConfigArmor.glowingironarmordurability.get(),new int[]{ConfigArmor.glowingironarmordefhelmet.get(),ConfigArmor.glowingironarmordefchestplate.get(),ConfigArmor.glowingironarmordefleggings.get(),ConfigArmor.glowingironarmordefboots.get()},ConfigArmor.glowingironarmorentchantvalue.get(),ItemList.glowing_ironIngot,"item.armor.equip",ConfigArmor.glowingironarmortoughness.get()),
    uridium("uridium",ConfigArmor.uridiumarmordurability.get(),new int[]{ConfigArmor.uridiumarmordefhelmet.get(),ConfigArmor.uridiumarmordefchestplate.get(),ConfigArmor.uridiumarmordefleggings.get(),ConfigArmor.uridiumarmordefboots.get()},ConfigArmor.uridiumarmorentchantvalue.get(),ItemList.uridiumIngot,"item.armor.equip",ConfigArmor.uridiumarmortoughness.get()),
    tritanium("tritanium",ConfigArmor.tritaniumarmordurability.get(),new int[]{ConfigArmor.tritaniumarmordefhelmet.get(),ConfigArmor.tritaniumarmordefchestplate.get(),ConfigArmor.tritaniumarmordefleggings.get(),ConfigArmor.tritaniumarmordefboots.get()},ConfigArmor.tritaniumarmorentchantvalue.get(),ItemList.tritaniumIngot,"item.armor.equip",ConfigArmor.tritaniumarmortoughness.get()),
    quadium("quadium",ConfigArmor.quadiumarmordurability.get(),new int[]{ConfigArmor.quadiumarmordefhelmet.get(),ConfigArmor.quadiumarmordefchestplate.get(),ConfigArmor.quadiumarmordefleggings.get(),ConfigArmor.quadiumarmordefboots.get()},ConfigArmor.quadiumarmorentchantvalue.get(),ItemList.quadiumIngot,"item.armor.equip",ConfigArmor.quadiumarmortoughness.get()),
    etherium("etherium",ConfigArmor.etheriumarmordurability.get(),new int[]{ConfigArmor.etheriumarmordefhelmet.get(),ConfigArmor.etheriumarmordefchestplate.get(),ConfigArmor.etheriumarmordefleggings.get(),ConfigArmor.etheriumarmordefboots.get()},ConfigArmor.etheriumarmorentchantvalue.get(),ItemList.etheriumIngot,"item.armor.equip",ConfigArmor.etheriumarmortoughness.get()),
    byzanium("byzanium",ConfigArmor.byzaniumarmordurability.get(),new int[]{ConfigArmor.byzaniumarmordefhelmet.get(),ConfigArmor.byzaniumarmordefchestplate.get(),ConfigArmor.byzaniumarmordefleggings.get(),ConfigArmor.byzaniumarmordefboots.get()},ConfigArmor.byzaniumarmorentchantvalue.get(),ItemList.byzaniumIngot,"item.armor.equip",ConfigArmor.byzaniumarmortoughness.get()),
    bolognium("bolognium",ConfigArmor.bologniumarmordurability.get(),new int[]{ConfigArmor.bologniumarmordefhelmet.get(),ConfigArmor.bologniumarmordefchestplate.get(),ConfigArmor.bologniumarmordefleggings.get(),ConfigArmor.bologniumarmordefboots.get()},ConfigArmor.bologniumarmorentchantvalue.get(),ItemList.bologniumIngot,"item.armor.equip",ConfigArmor.bologniumarmortoughness.get()),
    duratine("duratine",ConfigArmor.duratinearmordurability.get(),new int[]{ConfigArmor.duratinearmordefhelmet.get(),ConfigArmor.duratinearmordefchestplate.get(),ConfigArmor.duratinearmordefleggings.get(),ConfigArmor.duratinearmordefboots.get()},ConfigArmor.duratinearmorentchantvalue.get(),ItemList.duratineIngot,"item.armor.equip",ConfigArmor.duratinearmorentchantvalue.get()),
    dark_iron("dark_iron",ConfigArmor.darkironarmordurability.get(),new int[]{ConfigArmor.darkironarmordefhelmet.get(),ConfigArmor.darkironarmordefchestplate.get(),ConfigArmor.darkironarmordefleggings.get(),ConfigArmor.darkironarmordefboots.get()},ConfigArmor.darkironarmorentchantvalue.get(),ItemList.dark_ironIngot,"item.armor.equip",ConfigArmor.darkironarmortoughness.get()),
    arenak("arenak",ConfigArmor.arenakarmordurability.get(),new int[]{ConfigArmor.arenakarmordefhelmet.get(),ConfigArmor.arenakarmordefchestplate.get(),ConfigArmor.arenakarmordefleggings.get(),ConfigArmor.arenakarmordefboots.get()},ConfigArmor.arenakarmorentchantvalue.get(),ItemList.arenakIngot,"item.armor.equip",ConfigArmor.arenakarmortoughness.get()),
    enderium("enderium",ConfigArmor.enderiumarmordurability.get(),new int[]{ConfigArmor.enderiumarmordefhelmet.get(),ConfigArmor.enderiumarmordefchestplate.get(),ConfigArmor.enderiumarmordefleggings.get(),ConfigArmor.enderiumarmordefboots.get()},ConfigArmor.enderiumarmorentchantvalue.get(),ItemList.enderiumIngot,"item.armor.equip",ConfigArmor.enderiumarmortoughness.get()),
    enderit("enderit",ConfigArmor.enderitarmordurability.get(),new int[]{ConfigArmor.enderitarmordefhelmet.get(),ConfigArmor.enderitarmordefchestplate.get(),ConfigArmor.enderitarmordefleggings.get(),ConfigArmor.enderitarmordefboots.get()},ConfigArmor.enderitarmorentchantvalue.get(),ItemList.enderitIngot,"item.armor.equip",ConfigArmor.enderitarmortoughness.get());

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

