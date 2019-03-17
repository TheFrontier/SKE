package frontier.ske.entity.living.golem

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.golem.IronGolem

inline var IronGolem.isPlayerCreated: Boolean
    get() = get(Keys.PLAYER_CREATED).orElse(false)
    set(value) {
        offer(Keys.PLAYER_CREATED, value)
    }