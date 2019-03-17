package frontier.ske.entity.projectile.arrow

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.data.type.PickupRule
import org.spongepowered.api.entity.projectile.arrow.Arrow

inline var Arrow.knockbackStrength: Int
    get() = get(Keys.KNOCKBACK_STRENGTH).orElse(0)
    set(value) {
        offer(Keys.KNOCKBACK_STRENGTH, value)
    }

inline var Arrow.pickupRule: PickupRule
    get() = get(Keys.PICKUP_RULE).get()
    set(value) {
        offer(Keys.PICKUP_RULE, value)
    }