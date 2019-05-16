package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.ScoreText
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.format.TextColor
import org.spongepowered.api.text.serializer.TextSerializer
import org.spongepowered.api.text.serializer.TextSerializers
import java.net.URL

operator fun ScoreText.invoke(serializer: TextSerializer = TextSerializers.FORMATTING_CODE): String =
    serializer.serialize(this)

infix fun ScoreText.color(color: TextColor): ScoreText = this.toBuilder().color(color).build()

fun ScoreText.black(): ScoreText = this.toBuilder().black().build()
fun ScoreText.darkBlue(): ScoreText = this.toBuilder().darkBlue().build()
fun ScoreText.darkGreen(): ScoreText = this.toBuilder().darkGreen().build()
fun ScoreText.darkAqua(): ScoreText = this.toBuilder().darkAqua().build()
fun ScoreText.darkRed(): ScoreText = this.toBuilder().darkRed().build()
fun ScoreText.purple(): ScoreText = this.toBuilder().purple().build()
fun ScoreText.gold(): ScoreText = this.toBuilder().gold().build()
fun ScoreText.gray(): ScoreText = this.toBuilder().gray().build()
fun ScoreText.darkGray(): ScoreText = this.toBuilder().darkGray().build()
fun ScoreText.blue(): ScoreText = this.toBuilder().blue().build()
fun ScoreText.aqua(): ScoreText = this.toBuilder().aqua().build()
fun ScoreText.green(): ScoreText = this.toBuilder().green().build()
fun ScoreText.red(): ScoreText = this.toBuilder().red().build()
fun ScoreText.pink(): ScoreText = this.toBuilder().pink().build()
fun ScoreText.yellow(): ScoreText = this.toBuilder().yellow().build()
fun ScoreText.white(): ScoreText = this.toBuilder().white().build()

fun ScoreText.obfuscated(): ScoreText = this.toBuilder().obfuscated().build()
fun ScoreText.bold(): ScoreText = this.toBuilder().bold().build()
fun ScoreText.strikethrough(): ScoreText = this.toBuilder().strikethrough().build()
fun ScoreText.underline(): ScoreText = this.toBuilder().underline().build()
fun ScoreText.italic(): ScoreText = this.toBuilder().italic().build()

fun ScoreText.reset(): ScoreText = this.toBuilder().reset().build()

infix fun ScoreText.openUrl(url: String): ScoreText =
    this.toBuilder().openUrl(url).build()

infix fun ScoreText.openUrl(url: URL): ScoreText =
    this.toBuilder().openUrl(url).build()

infix fun ScoreText.runCommand(command: String): ScoreText =
    this.toBuilder().runCommand(command).build()

infix fun ScoreText.suggestCommand(command: String): ScoreText =
    this.toBuilder().suggestCommand(command).build()

infix fun ScoreText.changePage(page: Int): ScoreText =
    this.toBuilder().changePage(page).build()

infix fun ScoreText.executeCallback(callback: (CommandSource) -> Unit): ScoreText =
    this.toBuilder().executeCallback(callback).build()

infix fun ScoreText.showText(text: String): ScoreText =
    this.toBuilder().showText(text).build()

infix fun ScoreText.showText(text: Text): ScoreText =
    this.toBuilder().showText(text).build()

infix fun ScoreText.showItem(item: ItemStackSnapshot): ScoreText =
    this.toBuilder().showItem(item).build()

infix fun ScoreText.insertText(text: String): ScoreText =
    this.toBuilder().insertText(text).build()