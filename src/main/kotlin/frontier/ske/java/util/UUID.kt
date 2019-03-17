package frontier.ske.java.util

import frontier.ske.scheduler
import frontier.ske.server
import frontier.ske.service.user.userStorageService
import org.spongepowered.api.entity.living.player.Player
import org.spongepowered.api.entity.living.player.User
import org.spongepowered.api.profile.GameProfile
import org.spongepowered.api.scheduler.Task
import org.spongepowered.api.world.World
import org.spongepowered.api.world.storage.WorldProperties
import java.util.*

fun UUID.toPlayer(): Player? =
    server.getPlayer(this).unwrap()

fun UUID.toUser(): User? =
    userStorageService[this].unwrap()

fun UUID.toWorld(): World? =
    server.getWorld(this).unwrap()

fun UUID.toWorldProperties(): WorldProperties? =
    server.getWorldProperties(this).unwrap()

fun UUID.toTask(): Task? =
    scheduler.getTaskById(this).unwrap()

fun UUID.toGameProfile(name: String? = null): GameProfile =
    GameProfile.of(this, name)