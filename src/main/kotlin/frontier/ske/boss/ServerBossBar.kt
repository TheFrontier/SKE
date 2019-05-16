package frontier.ske.boss

import org.spongepowered.api.boss.ServerBossBar
import org.spongepowered.api.entity.living.player.Player

operator fun ServerBossBar.plus(player: Player): ServerBossBar =
    this.addPlayer(player)

operator fun ServerBossBar.plus(players: Collection<Player>): ServerBossBar =
    this.addPlayers(players)

operator fun ServerBossBar.plusAssign(player: Player) {
    this.addPlayer(player)
}

operator fun ServerBossBar.plusAssign(players: Collection<Player>) {
    this.addPlayers(players)
}

operator fun ServerBossBar.minus(player: Player): ServerBossBar =
    this.removePlayer(player)

operator fun ServerBossBar.minus(players: Collection<Player>): ServerBossBar =
    this.removePlayers(players)

operator fun ServerBossBar.minusAssign(player: Player) {
    this.removePlayer(player)
}

operator fun ServerBossBar.minusAssign(players: Collection<Player>) {
    this.removePlayers(players)
}