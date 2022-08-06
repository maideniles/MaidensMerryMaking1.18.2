package com.maideniles.maidensmerrymaking.render;

import com.maideniles.maidensmerrymaking.items.armor.model.RedChristmasArmorModel;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.client.IItemRenderProperties;
import org.checkerframework.checker.units.qual.A;

public class RedChristmasArmorRenderProperties implements IItemRenderProperties
{
    public static final RedChristmasArmorRenderProperties INSTANCE = new RedChristmasArmorRenderProperties();

    private RedChristmasArmorRenderProperties()
    {

    }

    @SuppressWarnings("unchecked")
    @Override
    public HumanoidModel<?> getArmorModel(LivingEntity entityLiving, ItemStack itemStack, EquipmentSlot armorSlot, HumanoidModel<?> _default)
    {
        return (HumanoidModel<?>) RedChristmasArmorModel.INSTANCE;
    }
}