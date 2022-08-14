package com.maideniles.maidensmerrymaking.entity.client.render.halloween_costumes;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.IllagerModel;
import net.minecraft.client.model.ZombieVillagerModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.IllagerRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Pillager;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class PillagerCostumeRenderer extends IllagerRenderer<Pillager> {

    //HALLOWEEN COSTUME LOCATION--COSTUME DECIDE LATER
    private static final ResourceLocation COSTUME_LOCATION = new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/halloween/pillager_costume.png");

    public PillagerCostumeRenderer(EntityRendererProvider.Context p_173952_) {
        super(p_173952_, new IllagerModel<>(p_173952_.bakeLayer(ModelLayers.PILLAGER)), 0.3F);
        this.addLayer(new ItemInHandLayer<>(this));
    }

    @Override
    public ResourceLocation getTextureLocation(Pillager p_114482_) {
        return COSTUME_LOCATION;
    }

}