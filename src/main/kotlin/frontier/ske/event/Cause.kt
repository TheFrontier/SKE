package frontier.ske.event

import frontier.ske.util.unwrap
import org.spongepowered.api.event.cause.Cause

inline fun <reified T> Cause.first(): T? =
    this.first(T::class.java).unwrap()

inline fun <reified T> Cause.last(): T? =
    this.last(T::class.java).unwrap()

inline fun <reified T> Cause.before(): Any? =
    this.before(T::class.java).unwrap()

inline fun <reified T> Cause.after(): Any? =
    this.after(T::class.java).unwrap()

inline fun <reified T> Cause.allOf(): List<T> =
    this.allOf(T::class.java)

inline fun <reified T> Cause.noneOf(): List<Any> =
    this.noneOf(T::class.java)

operator fun Cause.Builder.plus(cause: Any): Cause.Builder =
    this.append(cause)

operator fun Cause.Builder.plus(cause: Collection<Any>): Cause.Builder =
    this.appendAll(cause)

operator fun Cause.Builder.plusAssign(cause: Any) {
    this.append(cause)
}

operator fun Cause.Builder.plusAssign(cause: Collection<Any>) {
    this.appendAll(cause)
}

operator fun Cause.Builder.set(position: Int, cause: Any) {
    this.insert(position, cause)
}