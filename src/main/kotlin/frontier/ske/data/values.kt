package frontier.ske.data

import frontier.ske.util.flatten
import frontier.ske.util.unwrap
import org.spongepowered.api.data.DataTransactionResult
import org.spongepowered.api.data.key.Key
import org.spongepowered.api.data.value.BaseValue
import org.spongepowered.api.data.value.ValueContainer
import org.spongepowered.api.data.value.mutable.*
import java.util.*
import kotlin.reflect.KProperty

operator fun <E> BaseValue<E>.getValue(self: Any?, property: KProperty<*>): E =
    this.get()

operator fun <E> Value<E>.setValue(self: Any?, property: KProperty<*>, value: E) {
    this.set(value)
}

fun <E> ValueContainer<*>.unwrap(key: Key<out BaseValue<E>>): E? =
    this.get(key).unwrap()

fun <E> ValueContainer<*>.getOrEmpty(key: Key<out ListValue<E>>): List<E> =
    this.get(key).unwrap().orEmpty()

fun <E> ValueContainer<*>.getOrEmpty(key: Key<out SetValue<E>>): Set<E> =
    this.get(key).unwrap().orEmpty()

fun <K, V> ValueContainer<*>.getOrEmpty(key: Key<out MapValue<K, V>>): Map<K, V> =
    this.get(key).unwrap().orEmpty()

@JvmName("unwrapOptional")
fun <E> ValueContainer<*>.unwrap(key: Key<out OptionalValue<E>>): E? =
    this.get(key).flatten().unwrap()

fun <E> ValueContainer<*>.random(key: Key<out WeightedCollectionValue<E>>, random: Random): List<E> =
    this.get(key).unwrap()?.get(random).orEmpty()

@JvmName("addToList")
fun <E> CompositeValueStore<*, *>.add(key: Key<out ListValue<E>>, value: E): DataTransactionResult =
    this.transform(key) {
        it + value
    }

@JvmName("removeFromList")
fun <E> CompositeValueStore<*, *>.remove(key: Key<out ListValue<E>>, value: E): DataTransactionResult =
    this.transform(key) {
        it - value
    }

@JvmName("addToSet")
fun <E> CompositeValueStore<*, *>.add(key: Key<out SetValue<E>>, value: E): DataTransactionResult =
    this.transform(key) {
        it + value
    }

@JvmName("removeFromSet")
fun <E> CompositeValueStore<*, *>.remove(key: Key<out SetValue<E>>, value: E): DataTransactionResult =
    this.transform(key) {
        it - value
    }

fun <K, V> CompositeValueStore<*, *>.put(
    key: Key<out MapValue<K, V>>,
    valueKey: K, value: V
): DataTransactionResult =
    this.transform(key) {
        it + (valueKey to value)
    }

@JvmName("removeFromMap")
fun <K, V> CompositeValueStore<*, *>.remove(key: Key<out MapValue<K, V>>, valueKey: K): DataTransactionResult =
    this.transform(key) {
        it - valueKey
    }