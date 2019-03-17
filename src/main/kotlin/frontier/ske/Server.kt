package frontier.ske

import org.spongepowered.api.Server
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.living.player.Player
import org.spongepowered.api.text.Text

fun Server.sendMessage(message: Text) {
    this.broadcastChannel.send(message)
}

inline val Server.visiblePlayers: Collection<Player>
    get() = this.onlinePlayers.filterNot {
        it.get(Keys.VANISH).orElse(false)
    }

inline val Server.vanishedPlayers: Collection<Player>
    get() = this.onlinePlayers.filter {
        it.get(Keys.VANISH).orElse(false)
    }