package frontier.ske.block.tileentity.carrier

import org.spongepowered.api.block.tileentity.carrier.Hopper
import org.spongepowered.api.data.key.Keys

inline var Hopper.cooldown: Int
    get() = get(Keys.COOLDOWN).orElse(0)
    set(value) {
        offer(Keys.COOLDOWN, value)
    }