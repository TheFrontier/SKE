package frontier.ske.entity

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.Item

inline var Item.despawnDelay: Int
    get() = get(Keys.DESPAWN_DELAY).orElse(0)
    set(value) {
        offer(Keys.DESPAWN_DELAY, value)
    }

inline var Item.hasInfiniteDespawnDelay: Boolean
    get() = get(Keys.INFINITE_DESPAWN_DELAY).orElse(false)
    set(value) {
        offer(Keys.INFINITE_DESPAWN_DELAY, value)
    }

inline var Item.hasInfinitePickupDelay: Boolean
    get() = get(Keys.INFINITE_PICKUP_DELAY).orElse(false)
    set(value) {
        offer(Keys.INFINITE_PICKUP_DELAY, value)
    }

inline var Item.pickupDelay: Int
    get() = get(Keys.PICKUP_DELAY).orElse(0)
    set(value) {
        offer(Keys.PICKUP_DELAY, value)
    }