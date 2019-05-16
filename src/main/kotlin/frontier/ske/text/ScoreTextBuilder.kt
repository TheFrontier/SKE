package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.ScoreText
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.action.TextActions
import org.spongepowered.api.text.format.TextColors
import org.spongepowered.api.text.format.TextStyles
import java.net.URL

operator fun ScoreText.Builder.not(): Text = this.build()

operator fun ScoreText.Builder.plus(child: String): ScoreText.Builder = this.append(Text.of(child))
operator fun ScoreText.Builder.plus(child: Text): ScoreText.Builder = this.append(child)
operator fun ScoreText.Builder.plus(children: Iterable<Text>): ScoreText.Builder = this.append(children)

operator fun ScoreText.Builder.plusAssign(child: String) {
    this.append(ScoreText.of(child))
}

operator fun ScoreText.Builder.plusAssign(child: Text) {
    this.append(child)
}

operator fun ScoreText.Builder.plusAssign(children: Iterable<Text>) {
    this.append(children)
}

fun ScoreText.Builder.black(): ScoreText.Builder = color(TextColors.BLACK)
fun ScoreText.Builder.darkBlue(): ScoreText.Builder = color(TextColors.DARK_BLUE)
fun ScoreText.Builder.darkGreen(): ScoreText.Builder = color(TextColors.DARK_GREEN)
fun ScoreText.Builder.darkAqua(): ScoreText.Builder = color(TextColors.DARK_AQUA)
fun ScoreText.Builder.darkRed(): ScoreText.Builder = color(TextColors.DARK_RED)
fun ScoreText.Builder.purple(): ScoreText.Builder = color(TextColors.DARK_PURPLE)
fun ScoreText.Builder.gold(): ScoreText.Builder = color(TextColors.GOLD)
fun ScoreText.Builder.gray(): ScoreText.Builder = color(TextColors.GRAY)
fun ScoreText.Builder.darkGray(): ScoreText.Builder = color(TextColors.DARK_GRAY)
fun ScoreText.Builder.blue(): ScoreText.Builder = color(TextColors.BLUE)
fun ScoreText.Builder.aqua(): ScoreText.Builder = color(TextColors.AQUA)
fun ScoreText.Builder.green(): ScoreText.Builder = color(TextColors.GREEN)
fun ScoreText.Builder.red(): ScoreText.Builder = color(TextColors.RED)
fun ScoreText.Builder.pink(): ScoreText.Builder = color(TextColors.LIGHT_PURPLE)
fun ScoreText.Builder.yellow(): ScoreText.Builder = color(TextColors.YELLOW)
fun ScoreText.Builder.white(): ScoreText.Builder = color(TextColors.WHITE)

fun ScoreText.Builder.obfuscated(): ScoreText.Builder = style(TextStyles.OBFUSCATED)
fun ScoreText.Builder.bold(): ScoreText.Builder = style(TextStyles.BOLD)
fun ScoreText.Builder.strikethrough(): ScoreText.Builder = style(TextStyles.STRIKETHROUGH)
fun ScoreText.Builder.underline(): ScoreText.Builder = style(TextStyles.UNDERLINE)
fun ScoreText.Builder.italic(): ScoreText.Builder = style(TextStyles.ITALIC)

fun ScoreText.Builder.reset(): ScoreText.Builder = color(TextColors.RESET).style(TextStyles.RESET)

infix fun ScoreText.Builder.openUrl(url: String): ScoreText.Builder =
    this.onClick(TextActions.openUrl(URL(url)))

infix fun ScoreText.Builder.openUrl(url: URL): ScoreText.Builder =
    this.onClick(TextActions.openUrl(url))

infix fun ScoreText.Builder.runCommand(command: String): ScoreText.Builder =
    this.onClick(TextActions.runCommand(command))

infix fun ScoreText.Builder.suggestCommand(command: String): ScoreText.Builder =
    this.onClick(TextActions.suggestCommand(command))

infix fun ScoreText.Builder.changePage(page: Int): ScoreText.Builder =
    this.onClick(TextActions.changePage(page))

infix fun ScoreText.Builder.executeCallback(callback: (CommandSource) -> Unit): ScoreText.Builder =
    this.onClick(TextActions.executeCallback(callback))

infix fun ScoreText.Builder.showText(text: String): ScoreText.Builder =
    this.onHover(TextActions.showText(!text))

infix fun ScoreText.Builder.showText(text: Text): ScoreText.Builder =
    this.onHover(TextActions.showText(text))

infix fun ScoreText.Builder.showItem(item: ItemStackSnapshot): ScoreText.Builder =
    this.onHover(TextActions.showItem(item))

infix fun ScoreText.Builder.insertText(text: String): ScoreText.Builder =
    this.onShiftClick(TextActions.insertText(text))