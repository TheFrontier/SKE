package frontier.ske.util

import org.spongepowered.api.plugin.PluginContainer
import org.spongepowered.api.util.metric.MetricsConfigManager

operator fun MetricsConfigManager.contains(container: PluginContainer): Boolean =
    this.areMetricsEnabled(container)

operator fun MetricsConfigManager.contains(plugin: Any): Boolean =
    this.areMetricsEnabled(plugin)