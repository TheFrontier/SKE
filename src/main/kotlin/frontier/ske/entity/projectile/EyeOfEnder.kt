package frontier.ske.entity.projectile

import com.flowpowered.math.vector.Vector3d
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.projectile.EyeOfEnder

inline var EyeOfEnder.target: Vector3d
    get() = get(Keys.TARGETED_LOCATION).get()
    set(value) {
        offer(Keys.TARGETED_LOCATION, value)
    }

inline var EyeOfEnder.willShatter: Boolean
    get() = get(Keys.WILL_SHATTER).orElse(false)
    set(value) {
        offer(Keys.WILL_SHATTER, value)
    }