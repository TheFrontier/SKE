package frontier.ske.event

import com.google.common.reflect.TypeToken
import frontier.ske.eventManager
import org.spongepowered.api.event.Event
import org.spongepowered.api.event.EventListener
import org.spongepowered.api.event.EventManager
import org.spongepowered.api.event.Order

operator fun EventManager.set(plugin: Any, listener: Any) {
    this.registerListeners(plugin, listener)
}

inline fun <reified T : Event> EventManager.registerListener(
    plugin: Any,
    listener: EventListener<in T>,
    order: Order = Order.DEFAULT,
    beforeModifications: Boolean = false
) {
    this.registerListener(plugin, object : TypeToken<T>() {}, order, beforeModifications, listener)
}

fun Event.post(): Boolean =
    eventManager.post(this)