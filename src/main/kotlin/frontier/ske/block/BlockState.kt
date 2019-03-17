package frontier.ske.block

import org.spongepowered.api.block.BlockState
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.util.Axis

inline val BlockState.isAttached: Boolean
    get() = get(Keys.ATTACHED).orElse(false)

inline val BlockState.axis: Axis
    get() = get(Keys.AXIS).get()

