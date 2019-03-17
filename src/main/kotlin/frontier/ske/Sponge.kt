package frontier.ske

import frontier.ske.java.util.unwrap
import org.spongepowered.api.*
import org.spongepowered.api.asset.AssetManager
import org.spongepowered.api.command.CommandManager
import org.spongepowered.api.config.ConfigManager
import org.spongepowered.api.data.DataManager
import org.spongepowered.api.data.property.PropertyRegistry
import org.spongepowered.api.event.CauseStackManager
import org.spongepowered.api.event.EventManager
import org.spongepowered.api.network.ChannelRegistrar
import org.spongepowered.api.plugin.PluginManager
import org.spongepowered.api.scheduler.Scheduler
import org.spongepowered.api.service.ServiceManager
import org.spongepowered.api.util.metric.MetricsConfigManager
import org.spongepowered.api.world.TeleportHelper

inline val game: Game get() = Sponge.getGame()

inline val platform: Platform get() = Sponge.getPlatform()

inline val gameRegistry: GameRegistry get() = Sponge.getRegistry()

inline val dataManager: DataManager get() = Sponge.getDataManager()

inline val propertyRegistry: PropertyRegistry get() = Sponge.getPropertyRegistry()

inline val pluginManager: PluginManager get() = Sponge.getPluginManager()

inline val eventManager: EventManager get() = Sponge.getEventManager()

inline val assetManager: AssetManager get() = Sponge.getAssetManager()

inline val configManager: ConfigManager get() = Sponge.getConfigManager()

inline val commandManager: CommandManager get() = Sponge.getCommandManager()

inline val serviceManager: ServiceManager get() = Sponge.getServiceManager()

inline val scheduler: Scheduler get() = Sponge.getScheduler()

inline val channelRegistrar: ChannelRegistrar get() = Sponge.getChannelRegistrar()

inline val teleportHelper: TeleportHelper get() = Sponge.getTeleportHelper()

inline val server: Server get() = Sponge.getServer()

inline val gameDictionary: GameDictionary? get() = Sponge.getDictionary().unwrap()

inline val causeStackManager: CauseStackManager get() = Sponge.getCauseStackManager()

inline val metricsConfigManager: MetricsConfigManager get() = Sponge.getMetricsConfigManager()