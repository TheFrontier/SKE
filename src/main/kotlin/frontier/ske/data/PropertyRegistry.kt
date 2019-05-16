package frontier.ske.data

import frontier.ske.util.unwrap
import org.spongepowered.api.data.Property
import org.spongepowered.api.data.property.PropertyRegistry
import org.spongepowered.api.data.property.PropertyStore

inline fun <reified T : Property<*, *>> PropertyRegistry.register(store: PropertyStore<T>) {
    this.register(T::class.java, store)
}

inline fun <reified T : Property<*, *>> PropertyRegistry.getStore(): PropertyStore<T>? =
    this.getStore(T::class.java).unwrap()