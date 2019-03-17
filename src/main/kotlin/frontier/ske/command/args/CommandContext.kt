package frontier.ske.command.args

import org.spongepowered.api.command.args.CommandContext
import kotlin.reflect.KProperty

inline operator fun <reified T> CommandContext.getValue(self: Any?, property: KProperty<*>): T =
    this.getOne<T>(property.name).orElse(null)