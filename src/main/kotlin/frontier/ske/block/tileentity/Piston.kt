package frontier.ske.block.tileentity

import org.spongepowered.api.block.tileentity.Piston
import org.spongepowered.api.data.key.Keys

inline var Piston.isExtended: Boolean
    get() = get(Keys.EXTENDED).orElse(false)
    set(value) {
        offer(Keys.EXTENDED, value)
    }