package frontier.ske.entity.living.animal

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.data.type.RabbitType
import org.spongepowered.api.entity.living.animal.Rabbit

inline var Rabbit.variant: RabbitType
    get() = get(Keys.RABBIT_TYPE).get()
    set(value) {
        offer(Keys.RABBIT_TYPE, value)
    }