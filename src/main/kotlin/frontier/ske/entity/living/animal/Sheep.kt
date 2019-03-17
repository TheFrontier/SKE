package frontier.ske.entity.living.animal

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.animal.Sheep

inline var Sheep.isSheared: Boolean
    get() = get(Keys.IS_SHEARED).orElse(false)
    set(value) {
        offer(Keys.IS_SHEARED, value)
    }