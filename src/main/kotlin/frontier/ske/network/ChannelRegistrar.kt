package frontier.ske.network

import frontier.ske.util.unwrap
import org.spongepowered.api.Platform
import org.spongepowered.api.network.ChannelBinding
import org.spongepowered.api.network.ChannelRegistrar

operator fun ChannelRegistrar.get(channel: String): ChannelBinding? =
    this.getChannel(channel).unwrap()

operator fun ChannelRegistrar.minusAssign(channel: ChannelBinding) {
    this.unbindChannel(channel)
}

operator fun ChannelRegistrar.get(side: Platform.Type): Set<String> =
    this.getRegisteredChannels(side)

operator fun ChannelRegistrar.contains(channel: String): Boolean =
        this.isChannelAvailable(channel)