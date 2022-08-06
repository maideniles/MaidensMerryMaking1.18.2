package com.maideniles.maidensmerrymaking.items;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class AngoraWoolItem extends Item {


    public AngoraWoolItem(Properties p_41383_) {
        super(p_41383_);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flagIn) {

        if(!Screen.hasShiftDown()) {
            tooltip.add(new TranslatableComponent("tooltip.maidensmerrymaking.angora_wool_shift"));
        } else {
            tooltip.add(new TranslatableComponent("tooltip.maidensmerrymaking.angora_wool"));
        }
        super.appendHoverText(stack, level, tooltip, flagIn);
    }
}
