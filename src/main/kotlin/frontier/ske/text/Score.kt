package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.scoreboard.Score
import org.spongepowered.api.text.ScoreText
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.format.TextColor
import java.net.URL

operator fun Score.not(): ScoreText = Text.of(this)
fun Score.text(): ScoreText = Text.of(this)
fun Score.newText(): ScoreText.Builder = Text.builder(this)

infix fun Score.color(color: TextColor): ScoreText = this.newText().color(color).build()

fun Score.black(): ScoreText = this.newText().black().build()
fun Score.darkBlue(): ScoreText = this.newText().darkBlue().build()
fun Score.darkGreen(): ScoreText = this.newText().darkGreen().build()
fun Score.darkAqua(): ScoreText = this.newText().darkAqua().build()
fun Score.darkRed(): ScoreText = this.newText().darkRed().build()
fun Score.purple(): ScoreText = this.newText().purple().build()
fun Score.gold(): ScoreText = this.newText().gold().build()
fun Score.gray(): ScoreText = this.newText().gray().build()
fun Score.darkGray(): ScoreText = this.newText().darkGray().build()
fun Score.blue(): ScoreText = this.newText().blue().build()
fun Score.aqua(): ScoreText = this.newText().aqua().build()
fun Score.green(): ScoreText = this.newText().green().build()
fun Score.red(): ScoreText = this.newText().red().build()
fun Score.pink(): ScoreText = this.newText().pink().build()
fun Score.yellow(): ScoreText = this.newText().yellow().build()
fun Score.white(): ScoreText = this.newText().white().build()

fun Score.obfuscated(): ScoreText = this.newText().obfuscated().build()
fun Score.bold(): ScoreText = this.newText().bold().build()
fun Score.strikethrough(): ScoreText = this.newText().strikethrough().build()
fun Score.underline(): ScoreText = this.newText().underline().build()
fun Score.italic(): ScoreText = this.newText().italic().build()

fun Score.reset(): ScoreText = this.newText().reset().build()

infix fun Score.openUrl(url: String): ScoreText =
    this.newText().openUrl(url).build()

infix fun Score.openUrl(url: URL): ScoreText =
    this.newText().openUrl(url).build()

infix fun Score.runCommand(command: String): ScoreText =
    this.newText().runCommand(command).build()

infix fun Score.suggestCommand(command: String): ScoreText =
    this.newText().suggestCommand(command).build()

infix fun Score.changePage(page: Int): ScoreText =
    this.newText().changePage(page).build()

infix fun Score.executeCallback(callback: (CommandSource) -> Unit): ScoreText =
    this.newText().executeCallback(callback).build()

infix fun Score.showText(text: String): ScoreText =
    this.newText().showText(text).build()

infix fun Score.showText(text: Text): ScoreText =
    this.newText().showText(text).build()

infix fun Score.showItem(item: ItemStackSnapshot): ScoreText =
    this.newText().showItem(item).build()

infix fun Score.insertText(text: String): ScoreText =
    this.newText().insertText(text).build()