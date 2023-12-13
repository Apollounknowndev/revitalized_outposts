package dev.worldgen.outposts.registry;

import com.mojang.serialization.Codec;
import dev.worldgen.lithostitched.worldgen.modifier.predicate.ModifierPredicate;
import dev.worldgen.outposts.worldgen.VanillaOutpostsEnabledModifierPredicate;
import org.apache.logging.log4j.util.BiConsumer;

public class RevitalizedOutpostsRegistries {
    public static void registerModifierPredicate(BiConsumer<String, Codec<? extends ModifierPredicate>> consumer) {
        consumer.accept("vanilla_outposts_enabled", VanillaOutpostsEnabledModifierPredicate.CODEC);
    }
}
