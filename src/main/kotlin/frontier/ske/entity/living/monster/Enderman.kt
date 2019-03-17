package frontier.ske.entity.living.monster

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.monster.Enderman

inline var Enderman.isScreaming: Boolean
    get() = get(Keys.IS_SCREAMING).orElse(false)
    set(value) {
        offer(Keys.IS_SCREAMING, value)
    }