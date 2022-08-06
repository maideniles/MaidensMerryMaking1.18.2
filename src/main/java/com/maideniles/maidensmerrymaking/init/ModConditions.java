package com.maideniles.maidensmerrymaking.init;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.util.ChristmasEnabledCondition;
import com.maideniles.maidensmerrymaking.util.EasterEnabledCondition;
import com.maideniles.maidensmerrymaking.util.StPatricksDayEnabledCondition;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MaidensMerryMaking.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModConditions {

    @SubscribeEvent
    public static void registerSerializers(RegistryEvent.Register<RecipeSerializer<?>> evt) {
        CraftingHelper.register(new ChristmasEnabledCondition.Serializer());
        CraftingHelper.register(new StPatricksDayEnabledCondition.Serializer());
        CraftingHelper.register(new EasterEnabledCondition.Serializer());
    }
}