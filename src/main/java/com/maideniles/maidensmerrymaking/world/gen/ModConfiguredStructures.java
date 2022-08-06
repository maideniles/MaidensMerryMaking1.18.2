package com.maideniles.maidensmerrymaking.world.gen;

import com.maideniles.maidensmerrymaking.MaidensMerryMaking;
import com.maideniles.maidensmerrymaking.init.ModStructures;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.PlainVillagePools;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.feature.ConfiguredStructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;

public class ModConfiguredStructures {
    /*
     * Static instance of our structure so we can reference it and add it to biomes easily.

    public static ConfiguredStructureFeature<?, ?> CONFIGURED_POT_O_GOLD = ModStructures.POT_O_GOLD_STRUCTURE.get()
            .configured(new JigsawConfiguration(() -> PlainVillagePools.START, 0));
    // Dummy JigsawConfiguration values for now. We will modify the pool at runtime since we cannot get json pool files here at mod init.
    // You can create and register your pools in code, pass in the code create pool here, and delete both newConfig and newContext in RunDownHouseStructure's createPiecesGenerator.
    // Note: JigsawConfiguration only takes 0 - 7 size so that's another reason why we are going to bypass that "codec" by changing size at runtime to get higher sizes.


     * Registers the configured structure which is what gets added to the biomes.
     * Noticed we are not using a forge registry because there is none for configured structures.
     *
     * We can register configured structures at any time before a world is clicked on and made.
     * But the best time to register configured features by code is honestly to do it in FMLCommonSetupEvent.

    public static void registerConfiguredStructures() {
        Registry<ConfiguredStructureFeature<?, ?>> registry = BuiltinRegistries.CONFIGURED_STRUCTURE_FEATURE;
        Registry.register(registry, new ResourceLocation(MaidensMerryMaking.MOD_ID, "configured_pot_o_gold"), CONFIGURED_POT_O_GOLD);
    }
    */

}
