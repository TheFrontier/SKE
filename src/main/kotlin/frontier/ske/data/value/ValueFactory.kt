package frontier.ske.data.value

import frontier.ske.valueFactory
import org.spongepowered.api.data.key.Key
import org.spongepowered.api.data.value.mutable.*

fun <E> Key<Value<E>>.createValue(element: E): Value<E> =
    valueFactory.createValue(this, element)

fun <E> Key<Value<E>>.createValue(element: E, defaultValue: E): Value<E> =
    valueFactory.createValue(this, element, defaultValue)

fun <E> Key<ListValue<E>>.createListValue(elements: List<E>): ListValue<E> =
    valueFactory.createListValue(this, elements)

fun <E> Key<ListValue<E>>.createListValue(elements: List<E>, defaults: List<E>): ListValue<E> =
    valueFactory.createListValue(this, elements, defaults)

fun <E> Key<SetValue<E>>.createSetValue(elements: Set<E>): SetValue<E> =
    valueFactory.createSetValue(this, elements)

fun <E> Key<SetValue<E>>.createSetValue(elements: Set<E>, defaults: Set<E>): SetValue<E> =
    valueFactory.createSetValue(this, elements, defaults)

fun <K, V> Key<MapValue<K, V>>.createMapValue(map: Map<K, V>): MapValue<K, V> =
    valueFactory.createMapValue(this, map)

fun <K, V> Key<MapValue<K, V>>.createMapValue(map: Map<K, V>, defaults: Map<K, V>): MapValue<K, V> =
    valueFactory.createMapValue(this, map, defaults)

fun <E> Key<OptionalValue<E>>.createOptionalValue(element: E?): OptionalValue<E> =
    valueFactory.createOptionalValue(this, element)