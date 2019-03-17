package frontier.ske.block.tileentity.carrier

import org.spongepowered.api.block.tileentity.carrier.BrewingStand
import org.spongepowered.api.data.key.Keys

inline var BrewingStand.remainingBrewTime: Int
    get() = get(Keys.REMAINING_BREW_TIME).orElse(0)
    set(value) {
        offer(Keys.REMAINING_BREW_TIME, value)
    }