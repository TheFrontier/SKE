package frontier.ske.entity.living

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.ArmorStand

inline var ArmorStand.hasArms: Boolean
    get() = get(Keys.ARMOR_STAND_HAS_ARMS).orElse(false)
    set(value) {
        offer(Keys.ARMOR_STAND_HAS_ARMS, value)
    }

inline var ArmorStand.hasBasePlate: Boolean
    get() = get(Keys.ARMOR_STAND_HAS_BASE_PLATE).orElse(false)
    set(value) {
        offer(Keys.ARMOR_STAND_HAS_BASE_PLATE, value)
    }

inline var ArmorStand.isSmall: Boolean
    get() = get(Keys.ARMOR_STAND_IS_SMALL).orElse(false)
    set(value) {
        offer(Keys.ARMOR_STAND_IS_SMALL, value)
    }

inline var ArmorStand.isMarker: Boolean
    get() = get(Keys.ARMOR_STAND_MARKER).orElse(false)
    set(value) {
        offer(Keys.ARMOR_STAND_MARKER, value)
    }