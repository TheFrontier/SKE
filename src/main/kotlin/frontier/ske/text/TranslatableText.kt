package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.TranslatableText
import org.spongepowered.api.text.format.TextColor
import org.spongepowered.api.text.serializer.TextSerializer
import org.spongepowered.api.text.serializer.TextSerializers
import java.net.URL

operator fun TranslatableText.invoke(serializer: TextSerializer = TextSerializers.FORMATTING_CODE): String =
    serializer.serialize(this)

infix fun TranslatableText.color(color: TextColor): TranslatableText = this.toBuilder().color(color).build()

fun TranslatableText.black(): TranslatableText = this.toBuilder().black().build()
fun TranslatableText.darkBlue(): TranslatableText = this.toBuilder().darkBlue().build()
fun TranslatableText.darkGreen(): TranslatableText = this.toBuilder().darkGreen().build()
fun TranslatableText.darkAqua(): TranslatableText = this.toBuilder().darkAqua().build()
fun TranslatableText.darkRed(): TranslatableText = this.toBuilder().darkRed().build()
fun TranslatableText.purple(): TranslatableText = this.toBuilder().purple().build()
fun TranslatableText.gold(): TranslatableText = this.toBuilder().gold().build()
fun TranslatableText.gray(): TranslatableText = this.toBuilder().gray().build()
fun TranslatableText.darkGray(): TranslatableText = this.toBuilder().darkGray().build()
fun TranslatableText.blue(): TranslatableText = this.toBuilder().blue().build()
fun TranslatableText.aqua(): TranslatableText = this.toBuilder().aqua().build()
fun TranslatableText.green(): TranslatableText = this.toBuilder().green().build()
fun TranslatableText.red(): TranslatableText = this.toBuilder().red().build()
fun TranslatableText.pink(): TranslatableText = this.toBuilder().pink().build()
fun TranslatableText.yellow(): TranslatableText = this.toBuilder().yellow().build()
fun TranslatableText.white(): TranslatableText = this.toBuilder().white().build()

fun TranslatableText.obfuscated(): TranslatableText = this.toBuilder().obfuscated().build()
fun TranslatableText.bold(): TranslatableText = this.toBuilder().bold().build()
fun TranslatableText.strikethrough(): TranslatableText = this.toBuilder().strikethrough().build()
fun TranslatableText.underline(): TranslatableText = this.toBuilder().underline().build()
fun TranslatableText.italic(): TranslatableText = this.toBuilder().italic().build()

fun TranslatableText.reset(): TranslatableText = this.toBuilder().reset().build()

infix fun TranslatableText.openUrl(url: String): TranslatableText =
    this.toBuilder().openUrl(url).build()

infix fun TranslatableText.openUrl(url: URL): TranslatableText =
    this.toBuilder().openUrl(url).build()

infix fun TranslatableText.runCommand(command: String): TranslatableText =
    this.toBuilder().runCommand(command).build()

infix fun TranslatableText.suggestCommand(command: String): TranslatableText =
    this.toBuilder().suggestCommand(command).build()

infix fun TranslatableText.changePage(page: Int): TranslatableText =
    this.toBuilder().changePage(page).build()

infix fun TranslatableText.executeCallback(callback: (CommandSource) -> Unit): TranslatableText =
    this.toBuilder().executeCallback(callback).build()

infix fun TranslatableText.showText(text: String): TranslatableText =
    this.toBuilder().showText(text).build()

infix fun TranslatableText.showText(text: Text): TranslatableText =
    this.toBuilder().showText(text).build()

infix fun TranslatableText.showItem(item: ItemStackSnapshot): TranslatableText =
    this.toBuilder().showItem(item).build()

infix fun TranslatableText.insertText(text: String): TranslatableText =
    this.toBuilder().insertText(text).build()