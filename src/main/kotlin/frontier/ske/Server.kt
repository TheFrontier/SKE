package frontier.ske

import frontier.ske.data.filter
import frontier.ske.data.filterNot
import frontier.ske.util.unwrap
import kotlinx.coroutines.future.await
import org.spongepowered.api.Server
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.player.Player
import org.spongepowered.api.text.Text
import org.spongepowered.api.world.storage.WorldProperties
import java.util.*

operator fun Server.get(uniqueId: UUID): Player? =
        this.getPlayer(uniqueId).unwrap()

operator fun Server.get(name: String): Player? =
        this.getPlayer(name).unwrap()

suspend fun Server.copyWorldAsync(properties: WorldProperties, newName: String): WorldProperties? =
        this.copyWorld(properties, newName).await().unwrap()

suspend fun Server.deleteWorldAsync(properties: WorldProperties): Boolean =
        this.deleteWorld(properties).await()

fun Server.sendMessage(message: Text) {
    this.broadcastChannel.send(message)
}

inline val Server.visiblePlayers: Collection<Player>
    get() = this.onlinePlayers.filterNot(Keys.VANISH)

inline val Server.vanishedPlayers: Collection<Player>
    get() = this.onlinePlayers.filter(Keys.VANISH)