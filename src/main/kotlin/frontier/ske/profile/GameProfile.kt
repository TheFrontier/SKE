package frontier.ske.profile

import frontier.ske.java.util.unwrap
import frontier.ske.service.user.userStorageService
import org.spongepowered.api.entity.living.player.User
import org.spongepowered.api.profile.GameProfile

fun GameProfile.toUser(): User? =
    userStorageService[this].unwrap()