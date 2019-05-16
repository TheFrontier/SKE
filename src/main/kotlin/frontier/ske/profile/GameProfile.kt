package frontier.ske.profile

import frontier.ske.util.unwrap
import frontier.ske.service.userStorageService
import org.spongepowered.api.entity.living.player.User
import org.spongepowered.api.profile.GameProfile

fun GameProfile.toUser(): User? =
    userStorageService[this].unwrap()