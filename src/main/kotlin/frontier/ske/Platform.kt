package frontier.ske

import org.spongepowered.api.Platform
import org.spongepowered.api.plugin.PluginContainer

inline val Platform.Component.container: PluginContainer
    get() = platform.getContainer(this)