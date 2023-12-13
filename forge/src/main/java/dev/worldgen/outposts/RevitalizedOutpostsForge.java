package dev.worldgen.outposts;

import com.mojang.serialization.Codec;
import dev.worldgen.lithostitched.registry.LithostitchedRegistries;
import dev.worldgen.lithostitched.worldgen.modifier.predicate.ModifierPredicate;
import dev.worldgen.outposts.registry.RevitalizedOutpostsRegistries;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLPaths;
import net.minecraftforge.registries.DeferredRegister;

@Mod("revitalized_outposts")
public class RevitalizedOutpostsForge {
    private static final DeferredRegister<Codec<? extends ModifierPredicate>> DEFERRED_MODIFIER_PREDICATES_TYPES = DeferredRegister.create(LithostitchedRegistries.MODIFIER_PREDICATE_TYPE, "revitalized_outposts");

    public RevitalizedOutpostsForge() {
        ConfigHandler.load(FMLPaths.CONFIGDIR.get().resolve("revitalized_outposts.json"));
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        RevitalizedOutpostsRegistries.registerModifierPredicate((name, codec) -> DEFERRED_MODIFIER_PREDICATES_TYPES.register(name, () -> codec));
        DEFERRED_MODIFIER_PREDICATES_TYPES.register(bus);
    }
}