package frontier.ske.entity.living.monster

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.monster.Slime

inline var Slime.size: Int
    get() = get(Keys.SLIME_SIZE).orElse(0)
    set(value) {
        offer(Keys.SLIME_SIZE, value)
    }