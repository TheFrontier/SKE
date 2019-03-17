package frontier.ske.entity.living.monster

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.monster.Vindicator

inline var Vindicator.isJohnny: Boolean
    get() = get(Keys.IS_JOHNNY).orElse(false)
    set(value) {
        offer(Keys.IS_JOHNNY, value)
    }