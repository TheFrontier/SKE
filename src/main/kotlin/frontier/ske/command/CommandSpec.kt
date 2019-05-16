package frontier.ske.command

import frontier.ske.commandManager
import frontier.ske.util.unwrap
import org.spongepowered.api.command.CommandMapping
import org.spongepowered.api.command.CommandResult
import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.command.args.CommandContext
import org.spongepowered.api.command.spec.CommandSpec

operator fun CommandSpec.set(vararg aliases: String, plugin: Any): CommandMapping? =
    commandManager.register(plugin, this, *aliases).unwrap()

inline fun CommandSpec.Builder.executor(crossinline block: (src: CommandSource, ctx: CommandContext) -> Unit): CommandSpec.Builder =
    executor { src: CommandSource, ctx: CommandContext ->
        block(src, ctx)
        CommandResult.success()
    }