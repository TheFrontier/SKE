package frontier.ske.text

import org.spongepowered.api.text.Text
import org.spongepowered.api.text.channel.MessageChannel
import org.spongepowered.api.text.channel.MessageReceiver
import org.spongepowered.api.text.chat.ChatType
import org.spongepowered.api.world.World

fun Collection<MessageReceiver>.toMessageChannel(): MessageChannel =
        MessageChannel.fixed(this)

operator fun MessageChannel.plus(other: MessageChannel): MessageChannel =
        MessageChannel.combined(this, other)

operator fun MessageChannel.plus(other: Collection<MessageChannel>): MessageChannel =
    MessageChannel.combined(other + this)

fun World.toMessageChannel(): MessageChannel =
        MessageChannel.world(this)

operator fun MessageChannel.plusAssign(original: Text) {
    this.send(original)
}

operator fun MessageChannel.plusAssign(original: Pair<Text, ChatType>) {
    this.send(original.first, original.second)
}