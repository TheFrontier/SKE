package frontier.ske.entity.living.monster

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.monster.Blaze

inline var Blaze.isAflame: Boolean
    get() = get(Keys.IS_AFLAME).orElse(false)
    set(value) {
        offer(Keys.IS_AFLAME, value)
    }