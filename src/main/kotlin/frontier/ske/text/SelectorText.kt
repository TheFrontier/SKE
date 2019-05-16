package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.SelectorText
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.format.TextColor
import org.spongepowered.api.text.serializer.TextSerializer
import org.spongepowered.api.text.serializer.TextSerializers
import java.net.URL

operator fun SelectorText.invoke(serializer: TextSerializer = TextSerializers.FORMATTING_CODE): String =
    serializer.serialize(this)

infix fun SelectorText.color(color: TextColor): SelectorText = this.toBuilder().color(color).build()

fun SelectorText.black(): SelectorText = this.toBuilder().black().build()
fun SelectorText.darkBlue(): SelectorText = this.toBuilder().darkBlue().build()
fun SelectorText.darkGreen(): SelectorText = this.toBuilder().darkGreen().build()
fun SelectorText.darkAqua(): SelectorText = this.toBuilder().darkAqua().build()
fun SelectorText.darkRed(): SelectorText = this.toBuilder().darkRed().build()
fun SelectorText.purple(): SelectorText = this.toBuilder().purple().build()
fun SelectorText.gold(): SelectorText = this.toBuilder().gold().build()
fun SelectorText.gray(): SelectorText = this.toBuilder().gray().build()
fun SelectorText.darkGray(): SelectorText = this.toBuilder().darkGray().build()
fun SelectorText.blue(): SelectorText = this.toBuilder().blue().build()
fun SelectorText.aqua(): SelectorText = this.toBuilder().aqua().build()
fun SelectorText.green(): SelectorText = this.toBuilder().green().build()
fun SelectorText.red(): SelectorText = this.toBuilder().red().build()
fun SelectorText.pink(): SelectorText = this.toBuilder().pink().build()
fun SelectorText.yellow(): SelectorText = this.toBuilder().yellow().build()
fun SelectorText.white(): SelectorText = this.toBuilder().white().build()

fun SelectorText.obfuscated(): SelectorText = this.toBuilder().obfuscated().build()
fun SelectorText.bold(): SelectorText = this.toBuilder().bold().build()
fun SelectorText.strikethrough(): SelectorText = this.toBuilder().strikethrough().build()
fun SelectorText.underline(): SelectorText = this.toBuilder().underline().build()
fun SelectorText.italic(): SelectorText = this.toBuilder().italic().build()

fun SelectorText.reset(): SelectorText = this.toBuilder().reset().build()

infix fun SelectorText.openUrl(url: String): SelectorText =
    this.toBuilder().openUrl(url).build()

infix fun SelectorText.openUrl(url: URL): SelectorText =
    this.toBuilder().openUrl(url).build()

infix fun SelectorText.runCommand(command: String): SelectorText =
    this.toBuilder().runCommand(command).build()

infix fun SelectorText.suggestCommand(command: String): SelectorText =
    this.toBuilder().suggestCommand(command).build()

infix fun SelectorText.changePage(page: Int): SelectorText =
    this.toBuilder().changePage(page).build()

infix fun SelectorText.executeCallback(callback: (CommandSource) -> Unit): SelectorText =
    this.toBuilder().executeCallback(callback).build()

infix fun SelectorText.showText(text: String): SelectorText =
    this.toBuilder().showText(text).build()

infix fun SelectorText.showText(text: Text): SelectorText =
    this.toBuilder().showText(text).build()

infix fun SelectorText.showItem(item: ItemStackSnapshot): SelectorText =
    this.toBuilder().showItem(item).build()

infix fun SelectorText.insertText(text: String): SelectorText =
    this.toBuilder().insertText(text).build()