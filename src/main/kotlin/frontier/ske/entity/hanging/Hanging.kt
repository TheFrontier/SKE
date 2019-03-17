package frontier.ske.entity.hanging

import org.spongepowered.api.entity.hanging.Hanging
import org.spongepowered.api.util.Direction

inline var Hanging.direction: Direction
    get() = direction().get()
    set(value) {
        direction().set(value)
    }