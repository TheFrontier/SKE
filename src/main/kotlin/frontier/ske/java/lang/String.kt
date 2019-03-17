package frontier.ske.java.lang

import frontier.ske.java.util.unwrap
import frontier.ske.scheduler
import frontier.ske.server
import frontier.ske.service.user.userStorageService
import org.spongepowered.api.entity.living.player.Player
import org.spongepowered.api.entity.living.player.User
import org.spongepowered.api.scheduler.Task
import org.spongepowered.api.world.World
import org.spongepowered.api.world.storage.WorldProperties
import java.util.*

fun String.toUUID(): UUID =
    UUID.fromString(this)

fun String.toTasksByPattern(): Set<Task> =
    scheduler.getTasksByName(this)

fun String.toPlayer(): Player? =
    server.getPlayer(this).unwrap()

fun String.toUser(): User? =
    userStorageService[this].unwrap()

fun String.toWorld(): World? =
    server.getWorld(this).unwrap()

fun String.toWorldProperties(): WorldProperties? =
    server.getWorldProperties(this).unwrap()