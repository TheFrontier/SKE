package frontier.ske.entity.living.monster

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.monster.Creeper

inline var Creeper.isCharged: Boolean
    get() = get(Keys.CREEPER_CHARGED).orElse(false)
    set(value) {
        offer(Keys.CREEPER_CHARGED, value)
    }