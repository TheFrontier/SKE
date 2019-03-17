package frontier.ske.entity.explosive

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.explosive.FusedExplosive

inline var FusedExplosive.fuseDuration: Int
    get() = getOrElse(Keys.FUSE_DURATION, 0)
    set(value) {
        offer(Keys.FUSE_DURATION, value)
    }

inline var FusedExplosive.ticksRemaining: Int
    get() = getOrElse(Keys.TICKS_REMAINING, 0)
    set(value) {
        offer(Keys.TICKS_REMAINING, value)
    }