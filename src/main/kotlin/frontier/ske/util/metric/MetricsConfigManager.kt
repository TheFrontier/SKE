package frontier.ske.util.metric

import frontier.ske.metricsConfigManager
import org.spongepowered.api.plugin.PluginContainer

inline val PluginContainer.hasMetricsEnabled: Boolean
    get() = metricsConfigManager.areMetricsEnabled(this)