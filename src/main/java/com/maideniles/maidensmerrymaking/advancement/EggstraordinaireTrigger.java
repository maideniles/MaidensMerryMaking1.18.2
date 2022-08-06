package com.maideniles.maidensmerrymaking.advancement;

import com.google.gson.JsonObject;
import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.critereon.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.util.GsonHelper;
import net.minecraftforge.fml.common.Mod;



public class EggstraordinaireTrigger extends SimpleCriterionTrigger<EggstraordinaireTrigger.Instance> {

    private static final ResourceLocation ID = MaidensMerryMaking.prefix("found_eggs");

    @Override
    public ResourceLocation getId() {
        return ID;
    }

    @Override
    public Instance createInstance(JsonObject json, EntityPredicate.Composite player, DeserializationContext condition) {
        ResourceLocation advancementId = new ResourceLocation(GsonHelper.getAsString(json, "advancement"));
        return new EggstraordinaireTrigger.Instance(player, advancementId);
    }

    public void trigger(ServerPlayer player, Advancement advancement) {
        this.trigger(player, (instance) -> instance.test(advancement));
    }

    public static class Instance extends AbstractCriterionTriggerInstance {

        private final ResourceLocation advancementLocation;

        public Instance(EntityPredicate.Composite player, ResourceLocation advancementLocation) {
            super(EggstraordinaireTrigger.ID, player);
            this.advancementLocation = advancementLocation;
        }

        public static Instance hasAdvancement(ResourceLocation advancement) {
            return new Instance(EntityPredicate.Composite.ANY, advancement);
        }

        boolean test(Advancement advancement) {
            return advancementLocation.equals(advancement.getId());
        }

        @Override
        public JsonObject serializeToJson(SerializationContext serializer) {
            JsonObject json = super.serializeToJson(serializer);
            json.addProperty("advancement", advancementLocation.toString());
            return json;
        }
    }
}
