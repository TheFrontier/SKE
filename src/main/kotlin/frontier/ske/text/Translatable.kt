package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.TranslatableText
import org.spongepowered.api.text.format.TextColor
import org.spongepowered.api.text.translation.Translatable
import java.net.URL

operator fun Translatable.not(): TranslatableText = Text.of(this)
fun Translatable.text(): TranslatableText = Text.of(this)
fun Translatable.newText(): TranslatableText.Builder = Text.builder(this)

infix fun Translatable.color(color: TextColor): TranslatableText = this.newText().color(color).build()

fun Translatable.black(): TranslatableText = this.newText().black().build()
fun Translatable.darkBlue(): TranslatableText = this.newText().darkBlue().build()
fun Translatable.darkGreen(): TranslatableText = this.newText().darkGreen().build()
fun Translatable.darkAqua(): TranslatableText = this.newText().darkAqua().build()
fun Translatable.darkRed(): TranslatableText = this.newText().darkRed().build()
fun Translatable.purple(): TranslatableText = this.newText().purple().build()
fun Translatable.gold(): TranslatableText = this.newText().gold().build()
fun Translatable.gray(): TranslatableText = this.newText().gray().build()
fun Translatable.darkGray(): TranslatableText = this.newText().darkGray().build()
fun Translatable.blue(): TranslatableText = this.newText().blue().build()
fun Translatable.aqua(): TranslatableText = this.newText().aqua().build()
fun Translatable.green(): TranslatableText = this.newText().green().build()
fun Translatable.red(): TranslatableText = this.newText().red().build()
fun Translatable.pink(): TranslatableText = this.newText().pink().build()
fun Translatable.yellow(): TranslatableText = this.newText().yellow().build()
fun Translatable.white(): TranslatableText = this.newText().white().build()

fun Translatable.obfuscated(): TranslatableText = this.newText().obfuscated().build()
fun Translatable.bold(): TranslatableText = this.newText().bold().build()
fun Translatable.strikethrough(): TranslatableText = this.newText().strikethrough().build()
fun Translatable.underline(): TranslatableText = this.newText().underline().build()
fun Translatable.italic(): TranslatableText = this.newText().italic().build()

fun Translatable.reset(): TranslatableText = this.newText().reset().build()

infix fun Translatable.openUrl(url: String): TranslatableText =
    this.newText().openUrl(url).build()

infix fun Translatable.openUrl(url: URL): TranslatableText =
    this.newText().openUrl(url).build()

infix fun Translatable.runCommand(command: String): TranslatableText =
    this.newText().runCommand(command).build()

infix fun Translatable.suggestCommand(command: String): TranslatableText =
    this.newText().suggestCommand(command).build()

infix fun Translatable.changePage(page: Int): TranslatableText =
    this.newText().changePage(page).build()

infix fun Translatable.executeCallback(callback: (CommandSource) -> Unit): TranslatableText =
    this.newText().executeCallback(callback).build()

infix fun Translatable.showText(text: String): TranslatableText =
    this.newText().showText(text).build()

infix fun Translatable.showText(text: Text): TranslatableText =
    this.newText().showText(text).build()

infix fun Translatable.showItem(item: ItemStackSnapshot): TranslatableText =
    this.newText().showItem(item).build()

infix fun Translatable.insertText(text: String): TranslatableText =
    this.newText().insertText(text).build()