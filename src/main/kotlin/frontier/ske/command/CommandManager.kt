package frontier.ske.command

import frontier.ske.commandManager
import frontier.ske.java.util.unwrap
import org.spongepowered.api.command.CommandCallable
import org.spongepowered.api.command.CommandManager
import org.spongepowered.api.command.CommandMapping
import org.spongepowered.api.plugin.PluginContainer

operator fun CommandManager.set(plugin: Any, vararg alias: String, callable: CommandCallable) {
    this.register(plugin, callable, *alias)
}

fun CommandMapping.remove(): CommandMapping? =
    commandManager.removeMapping(this).unwrap()

inline val CommandMapping.owner: PluginContainer?
    get() =
        commandManager.getOwner(this).unwrap()