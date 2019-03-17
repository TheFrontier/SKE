package frontier.ske.entity.explosive

import frontier.ske.java.util.unwrap
import org.spongepowered.api.entity.explosive.Explosive

inline var Explosive.explosionRadius: Int?
    get() = explosionRadius().get().unwrap()
    set(value) {
        explosionRadius().setTo(value)
    }