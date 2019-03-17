package frontier.ske.block.tileentity.carrier

import org.spongepowered.api.block.tileentity.carrier.Furnace
import org.spongepowered.api.data.key.Keys

inline var Furnace.maxBurnTime: Int
    get() = get(Keys.MAX_BURN_TIME).orElse(0)
    set(value) {
        offer(Keys.MAX_BURN_TIME, value)
    }

inline var Furnace.maxCookTime: Int
    get() = get(Keys.MAX_COOK_TIME).orElse(0)
    set(value) {
        offer(Keys.MAX_COOK_TIME, value)
    }

inline var Furnace.passedBurnTime: Int
    get() = get(Keys.PASSED_BURN_TIME).orElse(0)
    set(value) {
        offer(Keys.PASSED_BURN_TIME, value)
    }

inline var Furnace.passedCookTime: Int
    get() = get(Keys.PASSED_COOK_TIME).orElse(0)
    set(value) {
        offer(Keys.PASSED_COOK_TIME, value)
    }