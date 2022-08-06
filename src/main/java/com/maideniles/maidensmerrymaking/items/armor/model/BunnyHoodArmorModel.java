package com.maideniles.maidensmerrymaking.items.armor.model;


import com.google.common.collect.ImmutableList;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.geom.EntityModelSet;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.LivingEntity;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(value = Dist.CLIENT, bus = Mod.EventBusSubscriber.Bus.MOD)
public class BunnyHoodArmorModel extends HumanoidModel<LivingEntity>
{
    public static BunnyHoodArmorModel INSTANCE;
    public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(new ResourceLocation(MaidensMerryMaking.MOD_ID, "bunny_hood"), "main");

    public BunnyHoodArmorModel(ModelPart root)
    {
        super(root);
    }

    public static LayerDefinition createBodyLayer()
    {
        MeshDefinition meshdefinition = HumanoidModel.createMesh(CubeDeformation.NONE, 0.0F);
        PartDefinition partdefinition = meshdefinition.getRoot();
        PartDefinition head = partdefinition.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.ZERO);

        head.addOrReplaceChild("hat_1", CubeListBuilder.create()
                        .texOffs(0, 33)
                        .addBox(-4F, -8F, -4F, 8F, 8F, 8F,
                                new CubeDeformation(0.5F)),
                PartPose.offsetAndRotation(0F, 0F, 0F, 0F, 0F, 0F));

        head.addOrReplaceChild("hat_2", CubeListBuilder.create()
                        .texOffs(32, 34)
                        .addBox(-3.5F, -9.5F, -3.5F, 7F, 1F, 7F,
                                new CubeDeformation(0.0F)),
                PartPose.offsetAndRotation(0F, 0F, 0F, 0F, 0F, 0F));


        head.addOrReplaceChild("earLeft", CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(1F, -15.75F, 0F, 2F, 7F, 1F,
                                new CubeDeformation(0.5F)),
                PartPose.offsetAndRotation(0F, 0F, 0F, 0F, 0F, 0F));

        head.addOrReplaceChild("earRight", CubeListBuilder.create()
                        .texOffs(0, 0)
                        .addBox(-3F, -15.75F, 0F, 2F, 7F, 1F,
                                new CubeDeformation(0.5F)),
                PartPose.offsetAndRotation(0F, 0F, 0F, 0F, 0F, 0F));


        return LayerDefinition.create(meshdefinition, 64, 64);

    }



    @Override
    protected Iterable<ModelPart> bodyParts()
    {
        return ImmutableList.of();
    }

    @SubscribeEvent
    public static void registerLayer(EntityRenderersEvent.RegisterLayerDefinitions event)
    {
        event.registerLayerDefinition(LAYER_LOCATION, BunnyHoodArmorModel::createBodyLayer);
    }

    @SubscribeEvent
    public static void bakeModelLayers(EntityRenderersEvent.AddLayers event)
    {
        EntityModelSet entityModelSet = event.getEntityModels();
        INSTANCE = new BunnyHoodArmorModel(entityModelSet.bakeLayer(LAYER_LOCATION));
    }

}