package com.maideniles.maidensmerrymaking.entity.client.render;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.entity.client.model.ColoredBunnyModel;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredBunnyEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

import javax.annotation.Nullable;

public class BlueBunnyRenderer extends GeoEntityRenderer<ColoredBunnyEntity> {

    public BlueBunnyRenderer (EntityRendererProvider.Context renderManager ) {
        super(renderManager, new ColoredBunnyModel());
        this.shadowRadius = 0.3F;
    }

    @Override
    public RenderType getRenderType(ColoredBunnyEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer, @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {

        stack.scale(0.6F,0.6F,0.6F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }

    @Override
    public ResourceLocation getTextureLocation(ColoredBunnyEntity instance) {
        return new ResourceLocation(MaidensMerryMaking.MOD_ID,"textures/entity/bunny/blue_bunny.png");

    }
}
