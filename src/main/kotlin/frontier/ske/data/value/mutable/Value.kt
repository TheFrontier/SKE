package frontier.ske.data.value.mutable

import org.spongepowered.api.data.value.mutable.Value
import kotlin.reflect.KProperty

operator fun <E> Value<E>.setValue(self: Any, property: KProperty<*>, value: E) {
    this.set(value)
}