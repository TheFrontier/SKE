package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.LiteralText
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.format.TextColor
import org.spongepowered.api.text.serializer.TextSerializer
import org.spongepowered.api.text.serializer.TextSerializers
import java.net.URL

operator fun String.invoke(serializer: TextSerializer = TextSerializers.FORMATTING_CODE): Text =
    serializer.deserialize(this)

operator fun String.not(): Text = Text.of(this)
fun String.text(): LiteralText = Text.of(this)
fun String.newText(): LiteralText.Builder = Text.builder(this)

infix fun String.color(color: TextColor): LiteralText = this.newText().color(color).build()

fun String.black(): Text = this.newText().black().build()
fun String.darkBlue(): Text = this.newText().darkBlue().build()
fun String.darkGreen(): Text = this.newText().darkGreen().build()
fun String.darkAqua(): Text = this.newText().darkAqua().build()
fun String.darkRed(): Text = this.newText().darkRed().build()
fun String.purple(): Text = this.newText().purple().build()
fun String.gold(): Text = this.newText().gold().build()
fun String.gray(): Text = this.newText().gray().build()
fun String.darkGray(): Text = this.newText().darkGray().build()
fun String.blue(): Text = this.newText().blue().build()
fun String.aqua(): Text = this.newText().aqua().build()
fun String.green(): Text = this.newText().green().build()
fun String.red(): Text = this.newText().red().build()
fun String.pink(): Text = this.newText().pink().build()
fun String.yellow(): Text = this.newText().yellow().build()
fun String.white(): Text = this.newText().white().build()

fun String.obfuscated(): Text = this.newText().obfuscated().build()
fun String.bold(): Text = this.newText().bold().build()
fun String.strikethrough(): Text = this.newText().strikethrough().build()
fun String.underline(): Text = this.newText().underline().build()
fun String.italic(): Text = this.newText().italic().build()

fun String.reset(): Text = this.newText().reset().build()

infix fun String.openUrl(url: String): Text = this.newText().openUrl(url).build()
infix fun String.openUrl(url: URL): Text = this.newText().openUrl(url).build()
infix fun String.runCommand(command: String): Text = this.newText().runCommand(command).build()
infix fun String.suggestCommand(command: String): Text = this.newText().suggestCommand(command).build()
infix fun String.changePage(page: Int): Text = this.newText().changePage(page).build()
infix fun String.executeCallback(callback: (CommandSource) -> Unit): Text = this.newText().executeCallback(callback).build()

infix fun String.showText(text: String): Text = this.newText().showText(text).build()
infix fun String.showText(text: Text): Text = this.newText().showText(text).build()
infix fun String.showItem(item: ItemStackSnapshot): Text = this.newText().showItem(item).build()

infix fun String.insertText(text: String): Text = this.newText().insertText(text).build()