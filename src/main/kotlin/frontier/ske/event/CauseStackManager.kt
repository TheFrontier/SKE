package frontier.ske.event

import frontier.ske.causeStackManager
import frontier.ske.util.unwrap
import org.spongepowered.api.event.CauseStackManager
import org.spongepowered.api.event.cause.Cause
import org.spongepowered.api.event.cause.EventContext
import org.spongepowered.api.event.cause.EventContextKey

inline val currentCause: Cause get() = causeStackManager.currentCause

inline val currentContext: EventContext get() = causeStackManager.currentContext

operator fun CauseStackManager.plus(obj: Any): CauseStackManager =
    this.pushCause(obj)

operator fun CauseStackManager.plusAssign(obj: Any) {
    this.pushCause(obj)
}

operator fun CauseStackManager.minusAssign(n: Int) {
    this.popCauses(n)
}

operator fun CauseStackManager.minusAssign(handle: CauseStackManager.StackFrame) {
    this.popCauseFrame(handle)
}

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

operator fun <T> CauseStackManager.minus(key: EventContextKey<T>): T? =
    this.removeContext(key).unwrap()

operator fun CauseStackManager.minusAssign(key: EventContextKey<*>) {
    this.removeContext(key)
}

operator fun CauseStackManager.StackFrame.plus(obj: Any): CauseStackManager.StackFrame =
    this.pushCause(obj)

operator fun CauseStackManager.StackFrame.plusAssign(obj: Any) {
    this.pushCause(obj)
}

operator fun <T> CauseStackManager.StackFrame.set(key: EventContextKey<T>, value: T) {
    this.addContext(key, value)
}

operator fun <T> CauseStackManager.StackFrame.minus(key: EventContextKey<T>): T? =
    this.removeContext(key).unwrap()

operator fun <T> CauseStackManager.StackFrame.minusAssign(key: EventContextKey<T>) {
    this.removeContext(key).unwrap()
}