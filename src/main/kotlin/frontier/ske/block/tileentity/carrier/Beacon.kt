package frontier.ske.block.tileentity.carrier

import frontier.ske.java.util.flatten
import frontier.ske.java.util.unwrap
import frontier.ske.java.util.wrap
import org.spongepowered.api.block.tileentity.carrier.Beacon
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.effect.potion.PotionEffectType

inline var Beacon.primaryEffect: PotionEffectType?
    get() = get(Keys.BEACON_PRIMARY_EFFECT).flatten().unwrap()
    set(value) {
        offer(Keys.BEACON_PRIMARY_EFFECT, value.wrap())
    }

inline var Beacon.secondaryEffect: PotionEffectType?
    get() = get(Keys.BEACON_SECONDARY_EFFECT).flatten().unwrap()
    set(value) {
        offer(Keys.BEACON_SECONDARY_EFFECT, value.wrap())
    }