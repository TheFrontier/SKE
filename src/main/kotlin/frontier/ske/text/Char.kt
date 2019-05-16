package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.LiteralText
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.format.TextColor
import java.net.URL

operator fun Char.not(): LiteralText = Text.of(this)
fun Char.text(): LiteralText = Text.of(this)
fun Char.newText(): LiteralText.Builder = Text.builder(this)

infix fun Char.color(color: TextColor): LiteralText = this.newText().color(color).build()

fun Char.black(): LiteralText = this.newText().black().build()
fun Char.darkBlue(): LiteralText = this.newText().darkBlue().build()
fun Char.darkGreen(): LiteralText = this.newText().darkGreen().build()
fun Char.darkAqua(): LiteralText = this.newText().darkAqua().build()
fun Char.darkRed(): LiteralText = this.newText().darkRed().build()
fun Char.purple(): LiteralText = this.newText().purple().build()
fun Char.gold(): LiteralText = this.newText().gold().build()
fun Char.gray(): LiteralText = this.newText().gray().build()
fun Char.darkGray(): LiteralText = this.newText().darkGray().build()
fun Char.blue(): LiteralText = this.newText().blue().build()
fun Char.aqua(): LiteralText = this.newText().aqua().build()
fun Char.green(): LiteralText = this.newText().green().build()
fun Char.red(): LiteralText = this.newText().red().build()
fun Char.pink(): LiteralText = this.newText().pink().build()
fun Char.yellow(): LiteralText = this.newText().yellow().build()
fun Char.white(): LiteralText = this.newText().white().build()

fun Char.obfuscated(): LiteralText = this.newText().obfuscated().build()
fun Char.bold(): LiteralText = this.newText().bold().build()
fun Char.strikethrough(): LiteralText = this.newText().strikethrough().build()
fun Char.underline(): LiteralText = this.newText().underline().build()
fun Char.italic(): LiteralText = this.newText().italic().build()

fun Char.reset(): LiteralText = this.newText().reset().build()

infix fun Char.openUrl(url: String): LiteralText =
    this.newText().openUrl(url).build()

infix fun Char.openUrl(url: URL): LiteralText =
    this.newText().openUrl(url).build()

infix fun Char.runCommand(command: String): LiteralText =
    this.newText().runCommand(command).build()

infix fun Char.suggestCommand(command: String): LiteralText =
    this.newText().suggestCommand(command).build()

infix fun Char.changePage(page: Int): LiteralText =
    this.newText().changePage(page).build()

infix fun Char.executeCallback(callback: (CommandSource) -> Unit): LiteralText =
    this.newText().executeCallback(callback).build()

infix fun Char.showText(text: String): LiteralText =
    this.newText().showText(text).build()

infix fun Char.showText(text: Text): LiteralText =
    this.newText().showText(text).build()

infix fun Char.showItem(item: ItemStackSnapshot): LiteralText =
    this.newText().showItem(item).build()

infix fun Char.insertText(text: String): LiteralText =
    this.newText().insertText(text).build()