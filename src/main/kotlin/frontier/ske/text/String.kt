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

operator fun String.not(): LiteralText = Text.of(this)
fun String.text(): LiteralText = Text.of(this)
fun String.newText(): LiteralText.Builder = Text.builder(this)

infix fun String.color(color: TextColor): LiteralText = this.newText().color(color).build()

fun String.black(): LiteralText = this.newText().black().build()
fun String.darkBlue(): LiteralText = this.newText().darkBlue().build()
fun String.darkGreen(): LiteralText = this.newText().darkGreen().build()
fun String.darkAqua(): LiteralText = this.newText().darkAqua().build()
fun String.darkRed(): LiteralText = this.newText().darkRed().build()
fun String.purple(): LiteralText = this.newText().purple().build()
fun String.gold(): LiteralText = this.newText().gold().build()
fun String.gray(): LiteralText = this.newText().gray().build()
fun String.darkGray(): LiteralText = this.newText().darkGray().build()
fun String.blue(): LiteralText = this.newText().blue().build()
fun String.aqua(): LiteralText = this.newText().aqua().build()
fun String.green(): LiteralText = this.newText().green().build()
fun String.red(): LiteralText = this.newText().red().build()
fun String.pink(): LiteralText = this.newText().pink().build()
fun String.yellow(): LiteralText = this.newText().yellow().build()
fun String.white(): LiteralText = this.newText().white().build()

fun String.obfuscated(): LiteralText = this.newText().obfuscated().build()
fun String.bold(): LiteralText = this.newText().bold().build()
fun String.strikethrough(): LiteralText = this.newText().strikethrough().build()
fun String.underline(): LiteralText = this.newText().underline().build()
fun String.italic(): LiteralText = this.newText().italic().build()

fun String.reset(): LiteralText = this.newText().reset().build()

infix fun String.openUrl(url: String): LiteralText =
    this.newText().openUrl(url).build()

infix fun String.openUrl(url: URL): LiteralText =
    this.newText().openUrl(url).build()

infix fun String.runCommand(command: String): LiteralText =
    this.newText().runCommand(command).build()

infix fun String.suggestCommand(command: String): LiteralText =
    this.newText().suggestCommand(command).build()

infix fun String.changePage(page: Int): LiteralText =
    this.newText().changePage(page).build()

infix fun String.executeCallback(callback: (CommandSource) -> Unit): LiteralText =
    this.newText().executeCallback(callback).build()

infix fun String.showText(text: String): LiteralText =
    this.newText().showText(text).build()

infix fun String.showText(text: Text): LiteralText =
    this.newText().showText(text).build()

infix fun String.showItem(item: ItemStackSnapshot): LiteralText =
    this.newText().showItem(item).build()

infix fun String.insertText(text: String): LiteralText =
    this.newText().insertText(text).build()