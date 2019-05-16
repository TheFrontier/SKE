package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.format.TextColor
import org.spongepowered.api.text.serializer.TextSerializer
import org.spongepowered.api.text.serializer.TextSerializers
import java.net.URL

operator fun Text.invoke(serializer: TextSerializer = TextSerializers.FORMATTING_CODE): String =
    serializer.serialize(this)

fun Iterable<Text>.join(): Text =
    Text.join(this)

infix fun Iterable<Text>.joinWith(separator: Text): Text =
    Text.joinWith(separator, this)

operator fun Text.plus(other: Text): Text = Text.of(this, other)
operator fun Text.plus(other: Text.Builder): Text = Text.of(this, other.build())
operator fun Text.plus(other: String): Text = Text.of(this, other)

fun Text.color(color: TextColor): Text = this.toBuilder().color(color).build()

fun Text.black(): Text = this.toBuilder().black().build()
fun Text.darkBlue(): Text = this.toBuilder().darkBlue().build()
fun Text.darkGreen(): Text = this.toBuilder().darkGreen().build()
fun Text.darkAqua(): Text = this.toBuilder().darkAqua().build()
fun Text.darkRed(): Text = this.toBuilder().darkRed().build()
fun Text.purple(): Text = this.toBuilder().purple().build()
fun Text.gold(): Text = this.toBuilder().gold().build()
fun Text.gray(): Text = this.toBuilder().gray().build()
fun Text.darkGray(): Text = this.toBuilder().darkGray().build()
fun Text.blue(): Text = this.toBuilder().blue().build()
fun Text.aqua(): Text = this.toBuilder().aqua().build()
fun Text.green(): Text = this.toBuilder().green().build()
fun Text.red(): Text = this.toBuilder().red().build()
fun Text.pink(): Text = this.toBuilder().pink().build()
fun Text.yellow(): Text = this.toBuilder().yellow().build()
fun Text.white(): Text = this.toBuilder().white().build()

fun Text.obfuscated(): Text = this.toBuilder().obfuscated().build()
fun Text.bold(): Text = this.toBuilder().bold().build()
fun Text.strikethrough(): Text = this.toBuilder().strikethrough().build()
fun Text.underline(): Text = this.toBuilder().underline().build()
fun Text.italic(): Text = this.toBuilder().italic().build()

fun Text.reset(): Text = this.toBuilder().reset().build()

fun Text.openUrl(url: String): Text = this.toBuilder().openUrl(url).build()
fun Text.openUrl(url: URL): Text = this.toBuilder().openUrl(url).build()
fun Text.runCommand(command: String): Text = this.toBuilder().runCommand(command).build()
fun Text.suggestCommand(command: String): Text = this.toBuilder().suggestCommand(command).build()
fun Text.changePage(page: Int): Text = this.toBuilder().changePage(page).build()
fun Text.executeCallback(callback: (CommandSource) -> Unit): Text = this.toBuilder().executeCallback(callback).build()

fun Text.showText(text: String): Text = this.toBuilder().showText(text).build()
fun Text.showText(text: Text): Text = this.toBuilder().showText(text).build()
fun Text.showItem(item: ItemStackSnapshot): Text = this.toBuilder().showItem(item).build()

fun Text.insertText(text: String): Text = this.toBuilder().insertText(text).build()