package dev.worldgen.outposts.worldgen;

import com.mojang.serialization.Codec;
import dev.worldgen.lithostitched.worldgen.modifier.predicate.ModifierPredicate;
import dev.worldgen.outposts.ConfigHandler;

public class VanillaOutpostsEnabledModifierPredicate implements ModifierPredicate {
    public static final VanillaOutpostsEnabledModifierPredicate INSTANCE = new VanillaOutpostsEnabledModifierPredicate();
    public static final Codec<VanillaOutpostsEnabledModifierPredicate> CODEC = Codec.unit(INSTANCE);
    @Override
    public boolean test() {
        return ConfigHandler.getConfig().enableVanillaOutposts();
    }

    @Override
    public Codec<? extends ModifierPredicate> codec() {
        return CODEC;
    }
}
