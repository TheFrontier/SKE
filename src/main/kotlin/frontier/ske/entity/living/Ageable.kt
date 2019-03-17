package frontier.ske.entity.living

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.Ageable

inline var Ageable.age: Int
    get() = get(Keys.AGE).orElse(0)
    set(value) {
        offer(Keys.AGE, value)
    }

inline var Ageable.isAdult: Boolean
    get() = get(Keys.IS_ADULT).orElse(false)
    set(value) {
        offer(Keys.IS_ADULT, value)
    }