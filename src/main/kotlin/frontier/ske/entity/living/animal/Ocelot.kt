package frontier.ske.entity.living.animal

import frontier.ske.java.util.flatten
import frontier.ske.java.util.unwrap
import frontier.ske.java.util.wrap
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.data.type.OcelotType
import org.spongepowered.api.entity.living.animal.Ocelot
import java.util.*

inline var Ocelot.isSitting: Boolean
    get() = get(Keys.IS_SITTING).orElse(false)
    set(value) {
        offer(Keys.IS_SITTING, value)
    }

inline var Ocelot.variant: OcelotType
    get() = get(Keys.OCELOT_TYPE).get()
    set(value) {
        offer(Keys.OCELOT_TYPE, value)
    }

inline var Ocelot.tamedOwner: UUID?
    get() = get(Keys.TAMED_OWNER).flatten().unwrap()
    set(value) {
        offer(Keys.TAMED_OWNER, value.wrap())
    }