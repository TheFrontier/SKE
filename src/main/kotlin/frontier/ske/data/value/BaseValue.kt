package frontier.ske.data.value

import org.spongepowered.api.data.value.BaseValue
import kotlin.reflect.KProperty

operator fun <E> BaseValue<E>.getValue(self: Any, property: KProperty<*>): E =
    this.get()