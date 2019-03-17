package frontier.ske.event

import frontier.ske.causeStackManager
import frontier.ske.java.util.unwrap
import org.spongepowered.api.event.CauseStackManager
import org.spongepowered.api.event.cause.Cause
import org.spongepowered.api.event.cause.EventContext
import org.spongepowered.api.event.cause.EventContextKey

inline val currentCause: Cause get() = causeStackManager.currentCause

inline val currentContext: EventContext get() = causeStackManager.currentContext

inline fun CauseStackManager.withCause(obj: Any, block: () -> Unit) {
    this.pushCause(obj)
    block()
    this.popCause()
}

operator fun <T> CauseStackManager.set(key: EventContextKey<T>, value: T) {
    this.addContext(key, value)
}

operator fun <T> CauseStackManager.get(key: EventContextKey<T>): T? =
    this.getContext(key).unwrap()

operator fun CauseStackManager.minusAssign(key: EventContextKey<*>) {
    this.removeContext(key)
}