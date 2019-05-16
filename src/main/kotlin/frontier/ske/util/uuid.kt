package frontier.ske.util

import org.spongepowered.api.profile.GameProfile
import java.util.*

fun String.toUUID(): UUID =
    UUID.fromString(this)

fun UUID.toGameProfile(name: String? = null): GameProfile =
    GameProfile.of(this, name)