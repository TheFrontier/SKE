package frontier.ske.text

import org.spongepowered.api.text.Text
import org.spongepowered.api.text.TextElement
import org.spongepowered.api.text.TextTemplate
import org.spongepowered.api.text.channel.MessageReceiver

operator fun MessageReceiver.plusAssign(message: Text) {
    this.sendMessage(message)
}

operator fun MessageReceiver.plusAssign(template: TextTemplate) {
    this.sendMessage(template)
}

operator fun MessageReceiver.plusAssign(template: Pair<TextTemplate, Map<String, TextElement>>) {
    this.sendMessage(template.first, template.second)
}

operator fun MessageReceiver.plusAssign(messages: Iterable<Text>) {
    this.sendMessages(messages)
}