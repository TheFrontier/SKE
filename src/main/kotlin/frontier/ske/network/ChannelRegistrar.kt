package frontier.ske.network

import frontier.ske.channelRegistrar
import frontier.ske.java.util.unwrap
import org.spongepowered.api.Platform
import org.spongepowered.api.network.ChannelBinding

fun String.toChannel(): ChannelBinding? =
    channelRegistrar.getChannel(this).unwrap()

fun ChannelBinding.unbind() {
    channelRegistrar.unbindChannel(this)
}

inline val Platform.Type.registeredChannels: Set<String>
    get() = channelRegistrar.getRegisteredChannels(this)

fun String.isChannelAvailable(): Boolean =
    channelRegistrar.isChannelAvailable(this)