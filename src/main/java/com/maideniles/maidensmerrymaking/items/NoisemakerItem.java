package com.maideniles.maidensmerrymaking.items;

import com.maideniles.maidensmerrymaking.init.ModItems;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Position;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvents;
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
import java.util.Random;

import static com.maideniles.maidensmerrymaking.blocks.PresentBlock.inclusiveBoundedRandom;
import static net.minecraft.world.level.block.Block.popResource;

public class NoisemakerItem extends Item {
    public NoisemakerItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }


    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player entity, InteractionHand hand) {
        Random rand = new Random();
        Integer noise_id = rand.nextInt(10);
        entity.getCooldowns().addCooldown(this, 60);


        ItemStack stack = entity.getItemInHand(hand);

        if(noise_id ==0){
            entity.playSound(SoundEvents.CREEPER_PRIMED, 1.0F,1.0F);
        }
        if(noise_id ==1) {
            if (rand.nextInt(20) == 0) {
                entity.playSound(SoundEvents.ENDER_DRAGON_DEATH, 1.0F,1.0F);
            }
            else{
                entity.playSound(SoundEvents.TOTEM_USE, 1.0F,1.0F);
            }

        }
        if(noise_id ==2){
            entity.playSound(SoundEvents.ZOMBIE_AMBIENT, 1.0F,1.0F);
        }
        if(noise_id ==3){
            entity.playSound(SoundEvents.WITHER_AMBIENT, 1.0F,1.0F);
        }
        if(noise_id ==4){
            entity.playSound(SoundEvents.GHAST_WARN, 1.0F,1.0F);
        }
        if(noise_id ==5){
            entity.playSound(SoundEvents.LIGHTNING_BOLT_THUNDER, 1.0F,1.0F);
        }
        if(noise_id ==6){
            entity.playSound(SoundEvents.ENDERMAN_SCREAM, 1.0F,1.0F);
        }
        if(noise_id ==7){
            entity.playSound(SoundEvents.AMBIENT_CAVE, 1.0F,1.0F);
        }
        if(noise_id ==8){
            entity.playSound(SoundEvents.EVOKER_PREPARE_SUMMON, 1.0F,1.0F);
        }
        if(noise_id ==9){
            entity.playSound(SoundEvents.CAT_HISS, 1.0F,1.0F);
        }





        stack.shrink(1);

        return InteractionResultHolder.consume(stack);
    }



    //  @Override
    //   public void appendHoverText(ItemStack stack, @Nullable Level level, List<Component> tooltip, TooltipFlag flagIn) {

    //     if(!Screen.hasShiftDown()) {
    //        tooltip.add(new TranslatableComponent("tooltip.maidensmerrymaking.easter_card_shift"));
    //     } else {
    //         tooltip.add(new TranslatableComponent("tooltip.maidensmerrymaking.easter_card"));
    //     }
    //    super.appendHoverText(stack, level, tooltip, flagIn);
    //   }

}



