package dev.worldgen.outposts;

import com.mojang.serialization.Lifecycle;
import dev.worldgen.lithostitched.registry.LithostitchedBuiltInRegistries;
import dev.worldgen.lithostitched.registry.LithostitchedRegistries;
import dev.worldgen.outposts.registry.RevitalizedOutpostsRegistries;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;

public class RevitalizedOutpostsFabric implements ModInitializer {

    @Override
    public void onInitialize() {
        ConfigHandler.load(FabricLoader.getInstance().getConfigDir().resolve("revitalized_outposts.json"));

        RevitalizedOutpostsRegistries.registerModifierPredicate((name, codec) -> LithostitchedBuiltInRegistries.MODIFIER_PREDICATE_TYPE.register(ResourceKey.create(LithostitchedRegistries.MODIFIER_PREDICATE_TYPE, new ResourceLocation("revitalized_outposts", name)), codec, Lifecycle.stable()));
    }
}
