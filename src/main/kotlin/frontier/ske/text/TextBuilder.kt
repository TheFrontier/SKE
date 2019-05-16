package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.action.TextActions
import org.spongepowered.api.text.format.TextColors
import org.spongepowered.api.text.format.TextStyles
import java.net.URL

operator fun Text.Builder.not(): Text = this.build()

operator fun Text.Builder.plus(child: String): Text.Builder = this.append(Text.of(child))
operator fun Text.Builder.plus(child: Text): Text.Builder = this.append(child)
operator fun Text.Builder.plus(children: Iterable<Text>): Text.Builder = this.append(children)

operator fun Text.Builder.plusAssign(child: String) {
    this.append(Text.of(child))
}

operator fun Text.Builder.plusAssign(child: Text) {
    this.append(child)
}

operator fun Text.Builder.plusAssign(children: Iterable<Text>) {
    this.append(children)
}

fun Text.Builder.black(): Text.Builder = color(TextColors.BLACK)
fun Text.Builder.darkBlue(): Text.Builder = color(TextColors.DARK_BLUE)
fun Text.Builder.darkGreen(): Text.Builder = color(TextColors.DARK_GREEN)
fun Text.Builder.darkAqua(): Text.Builder = color(TextColors.DARK_AQUA)
fun Text.Builder.darkRed(): Text.Builder = color(TextColors.DARK_RED)
fun Text.Builder.purple(): Text.Builder = color(TextColors.DARK_PURPLE)
fun Text.Builder.gold(): Text.Builder = color(TextColors.GOLD)
fun Text.Builder.gray(): Text.Builder = color(TextColors.GRAY)
fun Text.Builder.darkGray(): Text.Builder = color(TextColors.DARK_GRAY)
fun Text.Builder.blue(): Text.Builder = color(TextColors.BLUE)
fun Text.Builder.aqua(): Text.Builder = color(TextColors.AQUA)
fun Text.Builder.green(): Text.Builder = color(TextColors.GREEN)
fun Text.Builder.red(): Text.Builder = color(TextColors.RED)
fun Text.Builder.pink(): Text.Builder = color(TextColors.LIGHT_PURPLE)
fun Text.Builder.yellow(): Text.Builder = color(TextColors.YELLOW)
fun Text.Builder.white(): Text.Builder = color(TextColors.WHITE)

fun Text.Builder.obfuscated(): Text.Builder = style(TextStyles.OBFUSCATED)
fun Text.Builder.bold(): Text.Builder = style(TextStyles.BOLD)
fun Text.Builder.strikethrough(): Text.Builder = style(TextStyles.STRIKETHROUGH)
fun Text.Builder.underline(): Text.Builder = style(TextStyles.UNDERLINE)
fun Text.Builder.italic(): Text.Builder = style(TextStyles.ITALIC)

fun Text.Builder.reset(): Text.Builder = color(TextColors.RESET).style(TextStyles.RESET)

infix fun Text.Builder.openUrl(url: String): Text.Builder =
    this.onClick(TextActions.openUrl(URL(url)))

infix fun Text.Builder.openUrl(url: URL): Text.Builder =
    this.onClick(TextActions.openUrl(url))

infix fun Text.Builder.runCommand(command: String): Text.Builder =
    this.onClick(TextActions.runCommand(command))

infix fun Text.Builder.suggestCommand(command: String): Text.Builder =
    this.onClick(TextActions.suggestCommand(command))

infix fun Text.Builder.changePage(page: Int): Text.Builder =
    this.onClick(TextActions.changePage(page))

infix fun Text.Builder.executeCallback(callback: (CommandSource) -> Unit): Text.Builder =
    this.onClick(TextActions.executeCallback(callback))

infix fun Text.Builder.showText(text: String): Text.Builder =
    this.onHover(TextActions.showText(!text))

infix fun Text.Builder.showText(text: Text): Text.Builder =
    this.onHover(TextActions.showText(text))

infix fun Text.Builder.showItem(item: ItemStackSnapshot): Text.Builder =
    this.onHover(TextActions.showItem(item))

infix fun Text.Builder.insertText(text: String): Text.Builder =
    this.onShiftClick(TextActions.insertText(text))