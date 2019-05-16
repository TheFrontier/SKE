package frontier.ske.command

import frontier.ske.util.unwrap
import org.spongepowered.api.command.args.CommandContext
import org.spongepowered.api.text.Text
import kotlin.reflect.KProperty

operator fun <T> CommandContext.get(key: String): T? =
    this.getOne<T>(key).unwrap()

operator fun <T> CommandContext.get(key: Text): T? =
    this.getOne<T>(key).unwrap()

operator fun <T> CommandContext.set(key: String, value: T) {
    this.putArg(key, value)
}

operator fun <T> CommandContext.set(key: Text, value: T) {
    this.putArg(key, value)
}

operator fun CommandContext.contains(key: String): Boolean =
    this.hasAny(key)

operator fun CommandContext.contains(key: Text): Boolean =
    this.hasAny(key)

var CommandContext.snapshot: CommandContext.Snapshot
    get() = this.createSnapshot()
    set(value) {
        this.applySnapshot(value)
    }

operator fun <T> CommandContext.getValue(self: Any?, property: KProperty<*>): T =
    this.getOne<T>(property.name).orElse(null)

operator fun <T> CommandContext.setValue(self: Any?, property: KProperty<*>, value: T) =
    this.putArg(property.name, value)