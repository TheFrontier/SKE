package frontier.ske.entity.living

import frontier.ske.java.util.flatten
import frontier.ske.java.util.unwrap
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.data.type.HandPreference
import org.spongepowered.api.entity.EntitySnapshot
import org.spongepowered.api.entity.living.Living

inline var Living.health: Double
    get() = get(Keys.HEALTH).orElse(0.0)
    set(value) {
        offer(Keys.HEALTH, value)
    }

inline var Living.maxHealth: Double
    get() = get(Keys.MAX_HEALTH).orElse(0.0)
    set(value) {
        offer(Keys.MAX_HEALTH, value)
    }

inline val Living.lastAttacker: EntitySnapshot?
    get() = get(Keys.LAST_ATTACKER).flatten().unwrap()

inline val Living.lastDamage: Double?
    get() = get(Keys.LAST_DAMAGE).flatten().unwrap()

inline var Living.absorption: Double
    get() = get(Keys.ABSORPTION).orElse(0.0)
    set(value) {
        offer(Keys.ABSORPTION, value)
    }

inline var Living.dominantHand: HandPreference
    get() = get(Keys.DOMINANT_HAND).get()
    set(value) {
        offer(Keys.DOMINANT_HAND, value)
    }

inline var Living.maxAir: Int
    get() = get(Keys.MAX_AIR).orElse(0)
    set(value) {
        offer(Keys.MAX_AIR, value)
    }

inline var Living.remainingAir: Int
    get() = get(Keys.REMAINING_AIR).orElse(0)
    set(value) {
        offer(Keys.REMAINING_AIR, value)
    }

inline var Living.saturation: Double
    get() = get(Keys.SATURATION).orElse(0.0)
    set(value) {
        offer(Keys.SATURATION, value)
    }

inline var Living.stuckArrows: Int
    get() = get(Keys.STUCK_ARROWS).orElse(0)
    set(value) {
        offer(Keys.STUCK_ARROWS, value)
    }