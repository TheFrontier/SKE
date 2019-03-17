package frontier.ske.entity.living.animal

import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.data.type.LlamaVariant
import org.spongepowered.api.entity.living.animal.Llama

inline var Llama.strength: Int
    get() = get(Keys.LLAMA_STRENGTH).orElse(0)
    set(value) {
        offer(Keys.LLAMA_STRENGTH, value)
    }

inline var Llama.variant: LlamaVariant
    get() = get(Keys.LLAMA_VARIANT).get()
    set(value) {
        offer(Keys.LLAMA_VARIANT, value)
    }