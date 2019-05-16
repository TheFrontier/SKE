package frontier.ske.service

import frontier.ske.util.unwrap
import org.spongepowered.api.service.ProviderRegistration
import org.spongepowered.api.service.ServiceManager
import kotlin.reflect.KClass

//
// ServiceManager
//

inline fun <reified T> ServiceManager.setProvider(plugin: Any, provider: T) {
    this.setProvider(plugin, T::class.java, provider)
}

inline fun <reified T> ServiceManager.provide(): T? =
    this.provide(T::class.java).unwrap()

inline fun <reified T> ServiceManager.getRegistration(): ProviderRegistration<T>? =
    this.getRegistration(T::class.java).unwrap()

operator fun ServiceManager.contains(service: KClass<*>): Boolean =
    this.isRegistered(service.java)

inline fun <reified T> ServiceManager.require(): T =
    this.provideUnchecked(T::class.java)