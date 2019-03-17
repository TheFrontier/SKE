package frontier.ske

import org.spongepowered.api.Platform
import org.spongepowered.api.plugin.PluginContainer

fun Platform.Component.toContainer(): PluginContainer = platform.getContainer(this)