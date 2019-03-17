package frontier.ske.plugin

import frontier.ske.java.util.unwrap
import frontier.ske.pluginManager
import org.spongepowered.api.plugin.PluginContainer

fun Any.toPluginContainer(): PluginContainer? =
    pluginManager.fromInstance(this).unwrap()

fun String.toPlugin(): PluginContainer? =
    pluginManager.getPlugin(this).unwrap()

inline val String.isPluginLoaded: Boolean
    get() =
        pluginManager.isLoaded(this)