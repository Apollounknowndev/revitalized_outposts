package dev.worldgen.outposts;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;

public record ConfigCodec(boolean enableVanillaOutposts) {
    public static final Codec<ConfigCodec> CODEC = RecordCodecBuilder.create((instance) -> instance.group(
        Codec.BOOL.fieldOf("enable_vanilla_outposts").forGetter(ConfigCodec::enableVanillaOutposts)
    ).apply(instance, ConfigCodec::new));
}
