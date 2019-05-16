package frontier.ske.service

import frontier.ske.util.unwrap
import frontier.ske.serviceManager
import org.spongepowered.api.entity.living.player.User
import org.spongepowered.api.profile.GameProfile
import org.spongepowered.api.service.user.UserStorageService
import java.util.*

inline val userStorageService: UserStorageService
    get() = serviceManager.require()

fun UserStorageService.unwrap(uniqueId: UUID): User? =
    this[uniqueId].unwrap()

fun UserStorageService.unwrap(lastKnownName: String): User? =
    this[lastKnownName].unwrap()

fun UserStorageService.unwrap(profile: GameProfile): User? =
    this[profile].unwrap()

operator fun UserStorageService.minusAssign(profile: GameProfile) {
    this.delete(profile)
}

operator fun UserStorageService.minusAssign(user: User) {
    this.delete(user)
}