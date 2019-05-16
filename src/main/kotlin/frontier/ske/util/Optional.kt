package frontier.ske.util

import java.util.*

fun <T> Optional<T>.unwrap(): T? = this.orElse(null)

fun <T> T?.wrap(): Optional<T> = Optional.ofNullable(this)

fun <T> Optional<Optional<T>>.flatten(): Optional<T> = this.flatMap { it }