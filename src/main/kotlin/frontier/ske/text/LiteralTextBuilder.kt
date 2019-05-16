package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.LiteralText
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.action.TextActions
import org.spongepowered.api.text.format.TextColors
import org.spongepowered.api.text.format.TextStyles
import java.net.URL

operator fun LiteralText.Builder.not(): Text = this.build()

operator fun LiteralText.Builder.plus(child: String): LiteralText.Builder = this.append(Text.of(child))
operator fun LiteralText.Builder.plus(child: Text): LiteralText.Builder = this.append(child)
operator fun LiteralText.Builder.plus(children: Iterable<Text>): LiteralText.Builder = this.append(children)

operator fun LiteralText.Builder.plusAssign(child: String) {
    this.append(LiteralText.of(child))
}

operator fun LiteralText.Builder.plusAssign(child: Text) {
    this.append(child)
}

operator fun LiteralText.Builder.plusAssign(children: Iterable<Text>) {
    this.append(children)
}

fun LiteralText.Builder.black(): LiteralText.Builder = color(TextColors.BLACK)
fun LiteralText.Builder.darkBlue(): LiteralText.Builder = color(TextColors.DARK_BLUE)
fun LiteralText.Builder.darkGreen(): LiteralText.Builder = color(TextColors.DARK_GREEN)
fun LiteralText.Builder.darkAqua(): LiteralText.Builder = color(TextColors.DARK_AQUA)
fun LiteralText.Builder.darkRed(): LiteralText.Builder = color(TextColors.DARK_RED)
fun LiteralText.Builder.purple(): LiteralText.Builder = color(TextColors.DARK_PURPLE)
fun LiteralText.Builder.gold(): LiteralText.Builder = color(TextColors.GOLD)
fun LiteralText.Builder.gray(): LiteralText.Builder = color(TextColors.GRAY)
fun LiteralText.Builder.darkGray(): LiteralText.Builder = color(TextColors.DARK_GRAY)
fun LiteralText.Builder.blue(): LiteralText.Builder = color(TextColors.BLUE)
fun LiteralText.Builder.aqua(): LiteralText.Builder = color(TextColors.AQUA)
fun LiteralText.Builder.green(): LiteralText.Builder = color(TextColors.GREEN)
fun LiteralText.Builder.red(): LiteralText.Builder = color(TextColors.RED)
fun LiteralText.Builder.pink(): LiteralText.Builder = color(TextColors.LIGHT_PURPLE)
fun LiteralText.Builder.yellow(): LiteralText.Builder = color(TextColors.YELLOW)
fun LiteralText.Builder.white(): LiteralText.Builder = color(TextColors.WHITE)

fun LiteralText.Builder.obfuscated(): LiteralText.Builder = style(TextStyles.OBFUSCATED)
fun LiteralText.Builder.bold(): LiteralText.Builder = style(TextStyles.BOLD)
fun LiteralText.Builder.strikethrough(): LiteralText.Builder = style(TextStyles.STRIKETHROUGH)
fun LiteralText.Builder.underline(): LiteralText.Builder = style(TextStyles.UNDERLINE)
fun LiteralText.Builder.italic(): LiteralText.Builder = style(TextStyles.ITALIC)

fun LiteralText.Builder.reset(): LiteralText.Builder = color(TextColors.RESET).style(TextStyles.RESET)

infix fun LiteralText.Builder.openUrl(url: String): LiteralText.Builder =
    this.onClick(TextActions.openUrl(URL(url)))

infix fun LiteralText.Builder.openUrl(url: URL): LiteralText.Builder =
    this.onClick(TextActions.openUrl(url))

infix fun LiteralText.Builder.runCommand(command: String): LiteralText.Builder =
    this.onClick(TextActions.runCommand(command))

infix fun LiteralText.Builder.suggestCommand(command: String): LiteralText.Builder =
    this.onClick(TextActions.suggestCommand(command))

infix fun LiteralText.Builder.changePage(page: Int): LiteralText.Builder =
    this.onClick(TextActions.changePage(page))

infix fun LiteralText.Builder.executeCallback(callback: (CommandSource) -> Unit): LiteralText.Builder =
    this.onClick(TextActions.executeCallback(callback))

infix fun LiteralText.Builder.showText(text: String): LiteralText.Builder =
    this.onHover(TextActions.showText(!text))

infix fun LiteralText.Builder.showText(text: Text): LiteralText.Builder =
    this.onHover(TextActions.showText(text))

infix fun LiteralText.Builder.showItem(item: ItemStackSnapshot): LiteralText.Builder =
    this.onHover(TextActions.showItem(item))

infix fun LiteralText.Builder.insertText(text: String): LiteralText.Builder =
    this.onShiftClick(TextActions.insertText(text))