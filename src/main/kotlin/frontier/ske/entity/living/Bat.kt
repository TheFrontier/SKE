package frontier.ske.entity.living

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.Bat

inline var Bat.isSleeping: Boolean
    get() = get(Keys.IS_SLEEPING).orElse(false)
    set(value) {
        offer(Keys.IS_SLEEPING, value)
    }