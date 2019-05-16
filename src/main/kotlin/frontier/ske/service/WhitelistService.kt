package frontier.ske.service

import org.spongepowered.api.profile.GameProfile
import org.spongepowered.api.service.whitelist.WhitelistService

operator fun WhitelistService.contains(profile: GameProfile): Boolean =
    this.isWhitelisted(profile)

operator fun WhitelistService.plus(profile: GameProfile): Boolean =
    this.addProfile(profile)

operator fun WhitelistService.plusAssign(profile: GameProfile) {
    this.addProfile(profile)
}

operator fun WhitelistService.minus(profile: GameProfile): Boolean =
    this.removeProfile(profile)

operator fun WhitelistService.minusAssign(profile: GameProfile) {
    this.removeProfile(profile)
}