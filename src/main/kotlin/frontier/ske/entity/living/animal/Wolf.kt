package frontier.ske.entity.living.animal

import frontier.ske.java.util.flatten
import frontier.ske.java.util.unwrap
import frontier.ske.java.util.wrap
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.animal.Wolf
import java.util.*

inline var Wolf.isSitting: Boolean
    get() = get(Keys.IS_SITTING).orElse(false)
    set(value) {
        offer(Keys.IS_SITTING, value)
    }

inline var Wolf.isWet: Boolean
    get() = get(Keys.IS_WET).orElse(false)
    set(value) {
        offer(Keys.IS_WET, value)
    }

inline var Wolf.tamedOwner: UUID?
    get() = get(Keys.TAMED_OWNER).flatten().unwrap()
    set(value) {
        offer(Keys.TAMED_OWNER, value.wrap())
    }