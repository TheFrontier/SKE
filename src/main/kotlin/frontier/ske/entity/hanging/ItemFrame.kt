package frontier.ske.entity.hanging

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.hanging.ItemFrame
import org.spongepowered.api.util.rotation.Rotation

inline var ItemFrame.rotation: Rotation
    get() = get(Keys.ROTATION).get()
    set(value) {
        offer(Keys.ROTATION, value)
    }