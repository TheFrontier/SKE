package frontier.ske.service

import org.spongepowered.api.service.context.ContextCalculator
import org.spongepowered.api.service.context.Contextual
import org.spongepowered.api.service.context.ContextualService

operator fun <T : Contextual> ContextualService<T>.plusAssign(calculator: ContextCalculator<T>) {
    this.registerContextCalculator(calculator)
}