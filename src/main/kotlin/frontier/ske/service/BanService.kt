package frontier.ske.service

import frontier.ske.util.unwrap
import frontier.ske.serviceManager
import org.spongepowered.api.profile.GameProfile
import org.spongepowered.api.service.ban.BanService
import org.spongepowered.api.util.ban.Ban
import java.net.InetAddress

inline val banService: BanService
    get() = serviceManager.require()

operator fun BanService.get(profile: GameProfile): Ban.Profile? =
    this.getBanFor(profile).unwrap()

operator fun BanService.get(address: InetAddress): Ban.Ip? =
    this.getBanFor(address).unwrap()

operator fun BanService.contains(profile: GameProfile): Boolean =
    this.isBanned(profile)

operator fun BanService.contains(address: InetAddress): Boolean =
    this.isBanned(address)

operator fun BanService.minus(profile: GameProfile): Boolean =
    this.pardon(profile)

operator fun BanService.minusAssign(profile: GameProfile) {
    this.pardon(profile)
}

operator fun BanService.minus(address: InetAddress): Boolean =
    this.pardon(address)

operator fun BanService.minusAssign(address: InetAddress) {
    this.pardon(address)
}

operator fun BanService.minus(ban: Ban): Boolean =
    this.removeBan(ban)

operator fun BanService.minusAssign(ban: Ban) {
    this.removeBan(ban)
}

operator fun BanService.plus(ban: Ban): Ban? =
    this.addBan(ban).unwrap()

operator fun BanService.plusAssign(ban: Ban) {
    this.addBan(ban)
}

operator fun BanService.contains(ban: Ban): Boolean =
    this.hasBan(ban)