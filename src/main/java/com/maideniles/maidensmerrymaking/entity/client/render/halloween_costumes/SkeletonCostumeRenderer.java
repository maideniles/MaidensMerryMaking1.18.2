package com.maideniles.maidensmerrymaking.entity.client.render.halloween_costumes;


import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.SkeletonModel;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.ItemInHandLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.monster.Skeleton;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class SkeletonCostumeRenderer extends MobRenderer<Skeleton, SkeletonModel<Skeleton>> {

    //HALLOWEEN COSTUME LOCATION--COSTUME DECIDE LATER
    private static final ResourceLocation COSTUME_LOCATION = new ResourceLocation(MaidensMerryMaking.MOD_ID, "textures/entity/halloween/skeleton_costume.png");

    public SkeletonCostumeRenderer(EntityRendererProvider.Context p_173952_) {
        super(p_173952_, new SkeletonModel<>(p_173952_.bakeLayer(ModelLayers.SKELETON)), 0.3F);
        this.addLayer(new ItemInHandLayer(this));

    }

    @Override
    public ResourceLocation getTextureLocation(Skeleton p_114482_) {
        return COSTUME_LOCATION;
    }

}