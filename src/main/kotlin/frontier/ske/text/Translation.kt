package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.TranslatableText
import org.spongepowered.api.text.format.TextColor
import org.spongepowered.api.text.translation.Translation
import java.net.URL

operator fun Translation.not(): TranslatableText = Text.of(this)
fun Translation.text(): TranslatableText = Text.of(this)
fun Translation.newText(): TranslatableText.Builder = Text.builder(this)

infix fun Translation.color(color: TextColor): TranslatableText = this.newText().color(color).build()

fun Translation.black(): TranslatableText = this.newText().black().build()
fun Translation.darkBlue(): TranslatableText = this.newText().darkBlue().build()
fun Translation.darkGreen(): TranslatableText = this.newText().darkGreen().build()
fun Translation.darkAqua(): TranslatableText = this.newText().darkAqua().build()
fun Translation.darkRed(): TranslatableText = this.newText().darkRed().build()
fun Translation.purple(): TranslatableText = this.newText().purple().build()
fun Translation.gold(): TranslatableText = this.newText().gold().build()
fun Translation.gray(): TranslatableText = this.newText().gray().build()
fun Translation.darkGray(): TranslatableText = this.newText().darkGray().build()
fun Translation.blue(): TranslatableText = this.newText().blue().build()
fun Translation.aqua(): TranslatableText = this.newText().aqua().build()
fun Translation.green(): TranslatableText = this.newText().green().build()
fun Translation.red(): TranslatableText = this.newText().red().build()
fun Translation.pink(): TranslatableText = this.newText().pink().build()
fun Translation.yellow(): TranslatableText = this.newText().yellow().build()
fun Translation.white(): TranslatableText = this.newText().white().build()

fun Translation.obfuscated(): TranslatableText = this.newText().obfuscated().build()
fun Translation.bold(): TranslatableText = this.newText().bold().build()
fun Translation.strikethrough(): TranslatableText = this.newText().strikethrough().build()
fun Translation.underline(): TranslatableText = this.newText().underline().build()
fun Translation.italic(): TranslatableText = this.newText().italic().build()

fun Translation.reset(): TranslatableText = this.newText().reset().build()

infix fun Translation.openUrl(url: String): TranslatableText =
    this.newText().openUrl(url).build()

infix fun Translation.openUrl(url: URL): TranslatableText =
    this.newText().openUrl(url).build()

infix fun Translation.runCommand(command: String): TranslatableText =
    this.newText().runCommand(command).build()

infix fun Translation.suggestCommand(command: String): TranslatableText =
    this.newText().suggestCommand(command).build()

infix fun Translation.changePage(page: Int): TranslatableText =
    this.newText().changePage(page).build()

infix fun Translation.executeCallback(callback: (CommandSource) -> Unit): TranslatableText =
    this.newText().executeCallback(callback).build()

infix fun Translation.showText(text: String): TranslatableText =
    this.newText().showText(text).build()

infix fun Translation.showText(text: Text): TranslatableText =
    this.newText().showText(text).build()

infix fun Translation.showItem(item: ItemStackSnapshot): TranslatableText =
    this.newText().showItem(item).build()

infix fun Translation.insertText(text: String): TranslatableText =
    this.newText().insertText(text).build()