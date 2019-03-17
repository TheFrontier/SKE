package frontier.ske.entity.living.animal

import frontier.ske.java.util.flatten
import frontier.ske.java.util.unwrap
import frontier.ske.java.util.wrap
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.data.type.HorseColor
import org.spongepowered.api.data.type.HorseStyle
import org.spongepowered.api.entity.living.animal.Horse
import java.util.*

inline var Horse.color: HorseColor
    get() = get(Keys.HORSE_COLOR).get()
    set(value) {
        offer(Keys.HORSE_COLOR, value)
    }

inline var Horse.style: HorseStyle
    get() = get(Keys.HORSE_STYLE).get()
    set(value) {
        offer(Keys.HORSE_STYLE, value)
    }

inline var Horse.tamedOwner: UUID?
    get() = get(Keys.TAMED_OWNER).flatten().unwrap()
    set(value) {
        offer(Keys.TAMED_OWNER, value.wrap())
    }