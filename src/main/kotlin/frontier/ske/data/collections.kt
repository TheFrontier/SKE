package frontier.ske.data

import org.spongepowered.api.data.key.Key
import org.spongepowered.api.data.value.BaseValue
import org.spongepowered.api.data.value.mutable.CompositeValueStore
import org.spongepowered.api.data.value.mutable.ListValue
import org.spongepowered.api.data.value.mutable.MapValue
import org.spongepowered.api.data.value.mutable.SetValue

fun <S : CompositeValueStore<*, *>> Collection<S>.filter(key: Key<out BaseValue<Boolean>>): List<S> =
    this.filter { it.get(key).orElse(false) }

fun <S : CompositeValueStore<*, *>> Collection<S>.filterNot(key: Key<out BaseValue<Boolean>>): List<S> =
    this.filterNot { it.get(key).orElse(false) }

fun <S : CompositeValueStore<*, *>, T> Collection<S>.filterNotNull(key: Key<out BaseValue<T>>): List<S> =
    this.filter { it.get(key).isPresent }

@JvmName("filterEmptyList")
fun <S : CompositeValueStore<*, *>, T> Collection<S>.filterEmpty(key: Key<out ListValue<T>>): List<S> =
    this.filter { it.getOrEmpty(key).isEmpty() }

@JvmName("filterNotEmptyList")
fun <S : CompositeValueStore<*, *>, T> Collection<S>.filterNotEmpty(key: Key<out ListValue<T>>): List<S> =
    this.filterNot { it.getOrEmpty(key).isEmpty() }

@JvmName("filterEmptySet")
fun <S : CompositeValueStore<*, *>, T> Collection<S>.filterEmpty(key: Key<out SetValue<T>>): List<S> =
    this.filter { it.getOrEmpty(key).isEmpty() }

@JvmName("filterNotEmptySet")
fun <S : CompositeValueStore<*, *>, T> Collection<S>.filterNotEmpty(key: Key<out SetValue<T>>): List<S> =
    this.filterNot { it.getOrEmpty(key).isEmpty() }

@JvmName("filterEmptyMap")
fun <S : CompositeValueStore<*, *>, K, V> Collection<S>.filterEmpty(key: Key<out MapValue<K, V>>): List<S> =
    this.filter { it.getOrEmpty(key).isEmpty() }

@JvmName("filterNotEmptyMap")
fun <S : CompositeValueStore<*, *>, K, V> Collection<S>.filterNotEmpty(key: Key<out MapValue<K, V>>): List<S> =
    this.filterNot { it.getOrEmpty(key).isEmpty() }