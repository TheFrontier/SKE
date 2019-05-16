package frontier.ske.command

import frontier.ske.util.unwrap
import org.spongepowered.api.command.CommandCallable
import org.spongepowered.api.command.CommandManager
import org.spongepowered.api.command.CommandMapping
import org.spongepowered.api.plugin.PluginContainer

operator fun CommandManager.set(plugin: Any, vararg aliases: String, callable: CommandCallable) {
    this.register(plugin, callable, *aliases)
}

operator fun CommandManager.minus(mapping: CommandMapping): CommandMapping? =
        this.removeMapping(mapping).unwrap()

operator fun CommandManager.minusAssign(mapping: CommandMapping) {
    this.removeMapping(mapping)
}

operator fun CommandManager.get(instance: Any): Set<CommandMapping> =
    this.getOwnedBy(instance)

operator fun CommandManager.get(mapping: CommandMapping): PluginContainer? =
    this.getOwner(mapping).unwrap()