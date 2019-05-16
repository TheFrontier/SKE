package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.LiteralText
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.format.TextColor
import java.net.URL

fun Number.text(): LiteralText = this.toString().text()
fun Number.newText(): LiteralText.Builder = this.toString().newText()

infix fun Number.color(color: TextColor): LiteralText = this.toString().color(color)

fun Number.black(): LiteralText = this.toString().black()
fun Number.darkBlue(): LiteralText = this.toString().darkBlue()
fun Number.darkGreen(): LiteralText = this.toString().darkGreen()
fun Number.darkAqua(): LiteralText = this.toString().darkAqua()
fun Number.darkRed(): LiteralText = this.toString().darkRed()
fun Number.purple(): LiteralText = this.toString().purple()
fun Number.gold(): LiteralText = this.toString().gold()
fun Number.gray(): LiteralText = this.toString().gray()
fun Number.darkGray(): LiteralText = this.toString().darkGray()
fun Number.blue(): LiteralText = this.toString().blue()
fun Number.aqua(): LiteralText = this.toString().aqua()
fun Number.green(): LiteralText = this.toString().green()
fun Number.red(): LiteralText = this.toString().red()
fun Number.pink(): LiteralText = this.toString().pink()
fun Number.yellow(): LiteralText = this.toString().yellow()
fun Number.white(): LiteralText = this.toString().white()

fun Number.obfuscated(): LiteralText = this.toString().obfuscated()
fun Number.bold(): LiteralText = this.toString().bold()
fun Number.strikethrough(): LiteralText = this.toString().strikethrough()
fun Number.underline(): LiteralText = this.toString().underline()
fun Number.italic(): LiteralText = this.toString().italic()

fun Number.reset(): LiteralText = this.toString().reset()

infix fun Number.openUrl(url: String): LiteralText =
    this.toString().openUrl(url)

infix fun Number.openUrl(url: URL): LiteralText =
    this.toString().openUrl(url)

infix fun Number.runCommand(command: String): LiteralText =
    this.toString().runCommand(command)

infix fun Number.suggestCommand(command: String): LiteralText =
    this.toString().suggestCommand(command)

infix fun Number.changePage(page: Int): LiteralText =
    this.toString().changePage(page)

infix fun Number.executeCallback(callback: (CommandSource) -> Unit): LiteralText =
    this.toString().executeCallback(callback)

infix fun Number.showText(text: String): LiteralText =
    this.toString().showText(text)

infix fun Number.showText(text: Text): LiteralText =
    this.toString().showText(text)

infix fun Number.showItem(item: ItemStackSnapshot): LiteralText =
    this.toString().showItem(item)

infix fun Number.insertText(text: String): LiteralText =
    this.toString().insertText(text)