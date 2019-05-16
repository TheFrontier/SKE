package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.format.TextColor
import java.net.URL

fun Number.color(color: TextColor): Text = this.toString().color(color)

fun Number.black(): Text = this.toString().black()
fun Number.darkBlue(): Text = this.toString().darkBlue()
fun Number.darkGreen(): Text = this.toString().darkGreen()
fun Number.darkAqua(): Text = this.toString().darkAqua()
fun Number.darkRed(): Text = this.toString().darkRed()
fun Number.purple(): Text = this.toString().purple()
fun Number.gold(): Text = this.toString().gold()
fun Number.gray(): Text = this.toString().gray()
fun Number.darkGray(): Text = this.toString().darkGray()
fun Number.blue(): Text = this.toString().blue()
fun Number.aqua(): Text = this.toString().aqua()
fun Number.green(): Text = this.toString().green()
fun Number.red(): Text = this.toString().red()
fun Number.pink(): Text = this.toString().pink()
fun Number.yellow(): Text = this.toString().yellow()
fun Number.white(): Text = this.toString().white()

fun Number.obfuscated(): Text = this.toString().obfuscated()
fun Number.bold(): Text = this.toString().bold()
fun Number.strikethrough(): Text = this.toString().strikethrough()
fun Number.underline(): Text = this.toString().underline()
fun Number.italic(): Text = this.toString().italic()

fun Number.reset(): Text = this.toString().reset()

fun Number.openUrl(url: String): Text = this.toString().openUrl(url)
fun Number.openUrl(url: URL): Text = this.toString().openUrl(url)
fun Number.runCommand(command: String): Text = this.toString().runCommand(command)
fun Number.suggestCommand(command: String): Text = this.toString().suggestCommand(command)
fun Number.changePage(page: Int): Text = this.toString().changePage(page)
fun Number.executeCallback(callback: (CommandSource) -> Unit): Text = this.toString().executeCallback(callback)

fun Number.showText(text: String): Text = this.toString().showText(text)
fun Number.showText(text: Text): Text = this.toString().showText(text)
fun Number.showItem(item: ItemStackSnapshot): Text = this.toString().showItem(item)

fun Number.insertText(text: String): Text = this.toString().insertText(text)