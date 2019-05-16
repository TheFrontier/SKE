package frontier.ske.plugin

import frontier.ske.util.unwrap
import org.spongepowered.api.plugin.PluginContainer
import org.spongepowered.api.plugin.PluginManager

operator fun PluginManager.get(instance: Any): PluginContainer? =
    this.fromInstance(instance).unwrap()

operator fun PluginManager.get(id: String): PluginContainer? =
    this.getPlugin(id).unwrap()

operator fun PluginManager.contains(id: String): Boolean =
        this.isLoaded(id)