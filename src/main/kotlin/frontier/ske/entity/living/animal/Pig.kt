package frontier.ske.entity.living.animal

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.animal.Pig

inline var Pig.isSaddled: Boolean
    get() = get(Keys.PIG_SADDLE).orElse(false)
    set(value) {
        offer(Keys.PIG_SADDLE, value)
    }