package frontier.ske.entity.living.animal

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.data.type.ParrotVariant
import org.spongepowered.api.entity.living.animal.Parrot

inline var Parrot.variant: ParrotVariant
    get() = get(Keys.PARROT_VARIANT).get()
    set(value) {
        offer(Keys.PARROT_VARIANT, value)
    }