package com.maideniles.maidensmerrymaking.entity.client.model;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.entity.custom.ColoredBunnyEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class ColoredBunnyModel extends AnimatedGeoModel<ColoredBunnyEntity> {

    @Override
    public ResourceLocation getModelLocation(ColoredBunnyEntity object) {
        return new ResourceLocation(MaidensMerryMaking.MOD_ID,"geo/bunny.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(ColoredBunnyEntity object) {
        return new ResourceLocation(MaidensMerryMaking.MOD_ID,"textures/entity/bunny/pink_bunny.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(ColoredBunnyEntity animatable) {
        return new ResourceLocation(MaidensMerryMaking.MOD_ID, "animations/bunny.animation.json");
    }
}
