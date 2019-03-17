package frontier.ske.java.util

import java.util.*

fun <T> Optional<T>.unwrap(): T? = this.orElse(null)

fun <T> Optional<Optional<T>>.flattenUnwrap(): T? = this.flatten().unwrap()

fun <T> T?.wrap(): Optional<T> = Optional.ofNullable(this)

fun <T> Optional<Optional<T>>.flatten(): Optional<T> = this.flatMap { it }