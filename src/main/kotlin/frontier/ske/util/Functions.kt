package frontier.ske.util

import java.util.function.Predicate

fun <T> ((T) -> Boolean).toPredicate(): Predicate<T> = Predicate { value ->
    this(value)
}