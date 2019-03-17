package frontier.ske.entity.living.monster

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.monster.Endermite

inline var Endermite.expireTicks: Int
    get() = get(Keys.EXPIRATION_TICKS).orElse(0)
    set(value) {
        offer(Keys.EXPIRATION_TICKS, value)
    }