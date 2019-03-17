package frontier.ske.data.value

import frontier.ske.java.util.unwrap
import org.spongepowered.api.data.key.Key
import org.spongepowered.api.data.value.ValueContainer
import org.spongepowered.api.data.value.mutable.ListValue
import org.spongepowered.api.data.value.mutable.MapValue

fun <E> ValueContainer<*>.getOrEmpty(key: Key<out ListValue<E>>): List<E> =
    get(key).unwrap().orEmpty()

fun <K, V> ValueContainer<*>.getOrEmpty(key: Key<out MapValue<K, V>>): Map<K, V> =
    get(key).unwrap().orEmpty()