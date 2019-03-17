package frontier.ske.entity.hanging

import org.spongepowered.api.data.type.Art
import org.spongepowered.api.entity.hanging.Painting

inline var Painting.art: Art
    get() = art().get()
    set(value) {
        art().set(value)
    }