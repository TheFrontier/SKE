package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.SelectorText
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.format.TextColor
import org.spongepowered.api.text.selector.Selector
import java.net.URL

operator fun Selector.not(): SelectorText = Text.of(this)
fun Selector.text(): SelectorText = Text.of(this)
fun Selector.newText(): SelectorText.Builder = Text.builder(this)

infix fun Selector.color(color: TextColor): SelectorText = this.newText().color(color).build()

fun Selector.black(): SelectorText = this.newText().black().build()
fun Selector.darkBlue(): SelectorText = this.newText().darkBlue().build()
fun Selector.darkGreen(): SelectorText = this.newText().darkGreen().build()
fun Selector.darkAqua(): SelectorText = this.newText().darkAqua().build()
fun Selector.darkRed(): SelectorText = this.newText().darkRed().build()
fun Selector.purple(): SelectorText = this.newText().purple().build()
fun Selector.gold(): SelectorText = this.newText().gold().build()
fun Selector.gray(): SelectorText = this.newText().gray().build()
fun Selector.darkGray(): SelectorText = this.newText().darkGray().build()
fun Selector.blue(): SelectorText = this.newText().blue().build()
fun Selector.aqua(): SelectorText = this.newText().aqua().build()
fun Selector.green(): SelectorText = this.newText().green().build()
fun Selector.red(): SelectorText = this.newText().red().build()
fun Selector.pink(): SelectorText = this.newText().pink().build()
fun Selector.yellow(): SelectorText = this.newText().yellow().build()
fun Selector.white(): SelectorText = this.newText().white().build()

fun Selector.obfuscated(): SelectorText = this.newText().obfuscated().build()
fun Selector.bold(): SelectorText = this.newText().bold().build()
fun Selector.strikethrough(): SelectorText = this.newText().strikethrough().build()
fun Selector.underline(): SelectorText = this.newText().underline().build()
fun Selector.italic(): SelectorText = this.newText().italic().build()

fun Selector.reset(): SelectorText = this.newText().reset().build()

infix fun Selector.openUrl(url: String): SelectorText =
    this.newText().openUrl(url).build()

infix fun Selector.openUrl(url: URL): SelectorText =
    this.newText().openUrl(url).build()

infix fun Selector.runCommand(command: String): SelectorText =
    this.newText().runCommand(command).build()

infix fun Selector.suggestCommand(command: String): SelectorText =
    this.newText().suggestCommand(command).build()

infix fun Selector.changePage(page: Int): SelectorText =
    this.newText().changePage(page).build()

infix fun Selector.executeCallback(callback: (CommandSource) -> Unit): SelectorText =
    this.newText().executeCallback(callback).build()

infix fun Selector.showText(text: String): SelectorText =
    this.newText().showText(text).build()

infix fun Selector.showText(text: Text): SelectorText =
    this.newText().showText(text).build()

infix fun Selector.showItem(item: ItemStackSnapshot): SelectorText =
    this.newText().showItem(item).build()

infix fun Selector.insertText(text: String): SelectorText =
    this.newText().insertText(text).build()