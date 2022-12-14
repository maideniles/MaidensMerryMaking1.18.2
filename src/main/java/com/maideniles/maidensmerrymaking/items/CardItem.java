package com.maideniles.maidensmerrymaking.items;

import net.minecraft.client.gui.screens.Screen;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.Level;

import javax.annotation.Nullable;
import java.util.List;

public class CardItem extends Item {
    public CardItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player entity, InteractionHand hand) {
        ItemStack stack = new ItemStack(Items.DIAMOND);

        if (!entity.getInventory().add(stack)) {
            entity.drop(stack, false);
        }
        entity.sendMessage(new TextComponent("Happy Easter! Don't spend it all in one place! Love, Grandma"), entity.getUUID());

        stack.shrink(1);

        return InteractionResultHolder.consume(stack);
    }



    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flagIn) {

        if(!Screen.hasShiftDown()) {
            tooltip.add(new TranslatableComponent("tooltip.maidensmerrymaking.easter_card_shift"));
        } else {
            tooltip.add(new TranslatableComponent("tooltip.maidensmerrymaking.easter_card"));
        }
        super.appendHoverText(stack, level, tooltip, flagIn);
    }

}

