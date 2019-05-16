package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.SelectorText
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.action.TextActions
import org.spongepowered.api.text.format.TextColors
import org.spongepowered.api.text.format.TextStyles
import java.net.URL

operator fun SelectorText.Builder.not(): Text = this.build()

operator fun SelectorText.Builder.plus(child: String): SelectorText.Builder = this.append(Text.of(child))
operator fun SelectorText.Builder.plus(child: Text): SelectorText.Builder = this.append(child)
operator fun SelectorText.Builder.plus(children: Iterable<Text>): SelectorText.Builder = this.append(children)

operator fun SelectorText.Builder.plusAssign(child: String) {
    this.append(SelectorText.of(child))
}

operator fun SelectorText.Builder.plusAssign(child: Text) {
    this.append(child)
}

operator fun SelectorText.Builder.plusAssign(children: Iterable<Text>) {
    this.append(children)
}

fun SelectorText.Builder.black(): SelectorText.Builder = color(TextColors.BLACK)
fun SelectorText.Builder.darkBlue(): SelectorText.Builder = color(TextColors.DARK_BLUE)
fun SelectorText.Builder.darkGreen(): SelectorText.Builder = color(TextColors.DARK_GREEN)
fun SelectorText.Builder.darkAqua(): SelectorText.Builder = color(TextColors.DARK_AQUA)
fun SelectorText.Builder.darkRed(): SelectorText.Builder = color(TextColors.DARK_RED)
fun SelectorText.Builder.purple(): SelectorText.Builder = color(TextColors.DARK_PURPLE)
fun SelectorText.Builder.gold(): SelectorText.Builder = color(TextColors.GOLD)
fun SelectorText.Builder.gray(): SelectorText.Builder = color(TextColors.GRAY)
fun SelectorText.Builder.darkGray(): SelectorText.Builder = color(TextColors.DARK_GRAY)
fun SelectorText.Builder.blue(): SelectorText.Builder = color(TextColors.BLUE)
fun SelectorText.Builder.aqua(): SelectorText.Builder = color(TextColors.AQUA)
fun SelectorText.Builder.green(): SelectorText.Builder = color(TextColors.GREEN)
fun SelectorText.Builder.red(): SelectorText.Builder = color(TextColors.RED)
fun SelectorText.Builder.pink(): SelectorText.Builder = color(TextColors.LIGHT_PURPLE)
fun SelectorText.Builder.yellow(): SelectorText.Builder = color(TextColors.YELLOW)
fun SelectorText.Builder.white(): SelectorText.Builder = color(TextColors.WHITE)

fun SelectorText.Builder.obfuscated(): SelectorText.Builder = style(TextStyles.OBFUSCATED)
fun SelectorText.Builder.bold(): SelectorText.Builder = style(TextStyles.BOLD)
fun SelectorText.Builder.strikethrough(): SelectorText.Builder = style(TextStyles.STRIKETHROUGH)
fun SelectorText.Builder.underline(): SelectorText.Builder = style(TextStyles.UNDERLINE)
fun SelectorText.Builder.italic(): SelectorText.Builder = style(TextStyles.ITALIC)

fun SelectorText.Builder.reset(): SelectorText.Builder = color(TextColors.RESET).style(TextStyles.RESET)

infix fun SelectorText.Builder.openUrl(url: String): SelectorText.Builder =
    this.onClick(TextActions.openUrl(URL(url)))

infix fun SelectorText.Builder.openUrl(url: URL): SelectorText.Builder =
    this.onClick(TextActions.openUrl(url))

infix fun SelectorText.Builder.runCommand(command: String): SelectorText.Builder =
    this.onClick(TextActions.runCommand(command))

infix fun SelectorText.Builder.suggestCommand(command: String): SelectorText.Builder =
    this.onClick(TextActions.suggestCommand(command))

infix fun SelectorText.Builder.changePage(page: Int): SelectorText.Builder =
    this.onClick(TextActions.changePage(page))

infix fun SelectorText.Builder.executeCallback(callback: (CommandSource) -> Unit): SelectorText.Builder =
    this.onClick(TextActions.executeCallback(callback))

infix fun SelectorText.Builder.showText(text: String): SelectorText.Builder =
    this.onHover(TextActions.showText(!text))

infix fun SelectorText.Builder.showText(text: Text): SelectorText.Builder =
    this.onHover(TextActions.showText(text))

infix fun SelectorText.Builder.showItem(item: ItemStackSnapshot): SelectorText.Builder =
    this.onHover(TextActions.showItem(item))

infix fun SelectorText.Builder.insertText(text: String): SelectorText.Builder =
    this.onShiftClick(TextActions.insertText(text))