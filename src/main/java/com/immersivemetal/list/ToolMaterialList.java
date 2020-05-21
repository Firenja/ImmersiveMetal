package com.immersivemetal.list;

import com.immersivemetal.config.ConfigTool;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.crafting.Ingredient;


public enum ToolMaterialList implements IItemTier
{
    Copper(ConfigTool.copperattackDamage.get(),ConfigTool.copperefficiencyValue.get(),ConfigTool.copperdurability.get(),ConfigTool.copperharvestLevel.get(),ConfigTool.copperenchantability.get(),ItemList.copperIngot),
    Bronze(ConfigTool.bronzeattackDamage.get(),ConfigTool.bronzeefficiencyValue.get(),ConfigTool.bronzedurability.get(),ConfigTool.bronzeharvestLevel.get(),ConfigTool.bronzeenchantability.get(),ItemList.bronzeIngot),
    Brass(ConfigTool.brassattackDamage.get(),ConfigTool.brassefficiencyValue.get(),ConfigTool.brassdurability.get(),ConfigTool.brassharvestLevel.get(),ConfigTool.brassenchantability.get(),ItemList.brassIngot),
    Silver(ConfigTool.silverattackDamage.get(),ConfigTool.silverefficiencyValue.get(),ConfigTool.silverdurability.get(),ConfigTool.silverharvestLevel.get(),ConfigTool.silverenchantability.get(),ItemList.silverIngot),
    Platinum(ConfigTool.platinumattackDamage.get(),ConfigTool.platinumefficiencyValue.get(),ConfigTool.platinumdurability.get(),ConfigTool.platinumharvestLevel.get(),ConfigTool.platinumenchantability.get(),ItemList.platinumIngot),
    Promethium(ConfigTool.promethiumattackDamage.get(),ConfigTool.promethiumefficiencyValue.get(),ConfigTool.promethiumdurability.get(),ConfigTool.promethiumharvestLevel.get(),ConfigTool.promethiumenchantability.get(),ItemList.promethiumIngot),
    Hard_iron(ConfigTool.hardironattackDamage.get(),ConfigTool.hardironefficiencyValue.get(),ConfigTool.hardirondurability.get(),ConfigTool.hardironharvestLevel.get(),ConfigTool.hardironenchantability.get(),ItemList.hard_ironIngot),
    Mithril(ConfigTool.mithrilattackDamage.get(),ConfigTool.mithrilefficiencyValue.get(),ConfigTool.mithrildurability.get(),ConfigTool.mithrilharvestLevel.get(),ConfigTool.mithrilenchantability.get(),ItemList.mithrilIngot),
    Orichalcum(ConfigTool.orichalcumattackDamage.get(),ConfigTool.orichalcumefficiencyValue.get(),ConfigTool.orichalcumdurability.get(),ConfigTool.orichalcumharvestLevel.get(),ConfigTool.orichalcumenchantability.get(),ItemList.orichalcumIngot),
    Adamant(ConfigTool.adamantattackDamage.get(),ConfigTool.adamantefficiencyValue.get(),ConfigTool.adamantdurability.get(),ConfigTool.adamantharvestLevel.get(),ConfigTool.adamantenchantability.get(),ItemList.adamantIngot),
    Glowing_iron(ConfigTool.glowingironattackDamage.get(),ConfigTool.glowingironefficiencyValue.get(),ConfigTool.glowingirondurability.get(),ConfigTool.glowingironharvestLevel.get(),ConfigTool.glowingironenchantability.get(),ItemList.glowing_ironIngot),
    Uridium(ConfigTool.uridiumattackDamage.get(),ConfigTool.uridiumefficiencyValue.get(),ConfigTool.uridiumdurability.get(),ConfigTool.uridiumharvestLevel.get(),ConfigTool.uridiumenchantability.get(),ItemList.uridiumIngot),
    Tritanium(ConfigTool.tritaniumattackDamage.get(),ConfigTool.tritaniumefficiencyValue.get(),ConfigTool.tritaniumdurability.get(),ConfigTool.tritaniumharvestLevel.get(),ConfigTool.tritaniumenchantability.get(),ItemList.tritaniumIngot),
    Quadium(ConfigTool.quadiumattackDamage.get(),ConfigTool.quadiumefficiencyValue.get(),ConfigTool.quadiumdurability.get(),ConfigTool.quadiumharvestLevel.get(),ConfigTool.quadiumenchantability.get(),ItemList.quadiumIngot),
    Etherium(ConfigTool.etheriumattackDamage.get(),ConfigTool.etheriumefficiencyValue.get(),ConfigTool.etheriumdurability.get(),ConfigTool.etheriumharvestLevel.get(),ConfigTool.etheriumenchantability.get(),ItemList.etheriumIngot),
    Byzanium(ConfigTool.byzaniumattackDamage.get(),ConfigTool.byzaniumefficiencyValue.get(),ConfigTool.byzaniumdurability.get(),ConfigTool.byzaniumharvestLevel.get(),ConfigTool.byzaniumenchantability.get(),ItemList.byzaniumIngot),
    Bolognium(ConfigTool.bologniumattackDamage.get(),ConfigTool.bologniumefficiencyValue.get(),ConfigTool.bologniumdurability.get(),ConfigTool.bologniumharvestLevel.get(),ConfigTool.bologniumenchantability.get(),ItemList.bologniumIngot),
    Duratine(ConfigTool.duratineattackDamage.get(),ConfigTool.duratineefficiencyValue.get(),ConfigTool.duratinedurability.get(),ConfigTool.duratineharvestLevel.get(),ConfigTool.duratineenchantability.get(),ItemList.duratineIngot),
    Dark_iron(ConfigTool.darkironattackDamage.get(),ConfigTool.darkironefficiencyValue.get(),ConfigTool.darkirondurability.get(),ConfigTool.darkironharvestLevel.get(),ConfigTool.darkironenchantability.get(),ItemList.dark_ironIngot),
    Arenak(ConfigTool.arenakattackDamage.get(),ConfigTool.arenakefficiencyValue.get(),ConfigTool.arenakdurability.get(),ConfigTool.arenakharvestLevel.get(),ConfigTool.arenakenchantability.get(),ItemList.arenakIngot),
    Enderium(ConfigTool.enderiumattackDamage.get(),ConfigTool.enderiumefficiencyValue.get(),ConfigTool.enderiumdurability.get(),ConfigTool.enderiumharvestLevel.get(),ConfigTool.enderiumenchantability.get(),ItemList.enderiumIngot),
    Enderit(ConfigTool.enderitattackDamage.get(),ConfigTool.enderitefficiencyValue.get(),ConfigTool.enderitdurability.get(),ConfigTool.enderitharvestLevel.get(),ConfigTool.enderitenchantability.get(),ItemList.enderitIngot);

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
