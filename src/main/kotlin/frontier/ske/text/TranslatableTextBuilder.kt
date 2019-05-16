package frontier.ske.text

import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.item.inventory.ItemStackSnapshot
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.TranslatableText
import org.spongepowered.api.text.action.TextActions
import org.spongepowered.api.text.format.TextColors
import org.spongepowered.api.text.format.TextStyles
import java.net.URL

operator fun TranslatableText.Builder.not(): Text = this.build()

operator fun TranslatableText.Builder.plus(child: String): TranslatableText.Builder = this.append(Text.of(child))
operator fun TranslatableText.Builder.plus(child: Text): TranslatableText.Builder = this.append(child)
operator fun TranslatableText.Builder.plus(children: Iterable<Text>): TranslatableText.Builder = this.append(children)

operator fun TranslatableText.Builder.plusAssign(child: String) {
    this.append(TranslatableText.of(child))
}

operator fun TranslatableText.Builder.plusAssign(child: Text) {
    this.append(child)
}

operator fun TranslatableText.Builder.plusAssign(children: Iterable<Text>) {
    this.append(children)
}

fun TranslatableText.Builder.black(): TranslatableText.Builder = color(TextColors.BLACK)
fun TranslatableText.Builder.darkBlue(): TranslatableText.Builder = color(TextColors.DARK_BLUE)
fun TranslatableText.Builder.darkGreen(): TranslatableText.Builder = color(TextColors.DARK_GREEN)
fun TranslatableText.Builder.darkAqua(): TranslatableText.Builder = color(TextColors.DARK_AQUA)
fun TranslatableText.Builder.darkRed(): TranslatableText.Builder = color(TextColors.DARK_RED)
fun TranslatableText.Builder.purple(): TranslatableText.Builder = color(TextColors.DARK_PURPLE)
fun TranslatableText.Builder.gold(): TranslatableText.Builder = color(TextColors.GOLD)
fun TranslatableText.Builder.gray(): TranslatableText.Builder = color(TextColors.GRAY)
fun TranslatableText.Builder.darkGray(): TranslatableText.Builder = color(TextColors.DARK_GRAY)
fun TranslatableText.Builder.blue(): TranslatableText.Builder = color(TextColors.BLUE)
fun TranslatableText.Builder.aqua(): TranslatableText.Builder = color(TextColors.AQUA)
fun TranslatableText.Builder.green(): TranslatableText.Builder = color(TextColors.GREEN)
fun TranslatableText.Builder.red(): TranslatableText.Builder = color(TextColors.RED)
fun TranslatableText.Builder.pink(): TranslatableText.Builder = color(TextColors.LIGHT_PURPLE)
fun TranslatableText.Builder.yellow(): TranslatableText.Builder = color(TextColors.YELLOW)
fun TranslatableText.Builder.white(): TranslatableText.Builder = color(TextColors.WHITE)

fun TranslatableText.Builder.obfuscated(): TranslatableText.Builder = style(TextStyles.OBFUSCATED)
fun TranslatableText.Builder.bold(): TranslatableText.Builder = style(TextStyles.BOLD)
fun TranslatableText.Builder.strikethrough(): TranslatableText.Builder = style(TextStyles.STRIKETHROUGH)
fun TranslatableText.Builder.underline(): TranslatableText.Builder = style(TextStyles.UNDERLINE)
fun TranslatableText.Builder.italic(): TranslatableText.Builder = style(TextStyles.ITALIC)

fun TranslatableText.Builder.reset(): TranslatableText.Builder = color(TextColors.RESET).style(TextStyles.RESET)

infix fun TranslatableText.Builder.openUrl(url: String): TranslatableText.Builder =
    this.onClick(TextActions.openUrl(URL(url)))

infix fun TranslatableText.Builder.openUrl(url: URL): TranslatableText.Builder =
    this.onClick(TextActions.openUrl(url))

infix fun TranslatableText.Builder.runCommand(command: String): TranslatableText.Builder =
    this.onClick(TextActions.runCommand(command))

infix fun TranslatableText.Builder.suggestCommand(command: String): TranslatableText.Builder =
    this.onClick(TextActions.suggestCommand(command))

infix fun TranslatableText.Builder.changePage(page: Int): TranslatableText.Builder =
    this.onClick(TextActions.changePage(page))

infix fun TranslatableText.Builder.executeCallback(callback: (CommandSource) -> Unit): TranslatableText.Builder =
    this.onClick(TextActions.executeCallback(callback))

infix fun TranslatableText.Builder.showText(text: String): TranslatableText.Builder =
    this.onHover(TextActions.showText(!text))

infix fun TranslatableText.Builder.showText(text: Text): TranslatableText.Builder =
    this.onHover(TextActions.showText(text))

infix fun TranslatableText.Builder.showItem(item: ItemStackSnapshot): TranslatableText.Builder =
    this.onHover(TextActions.showItem(item))

infix fun TranslatableText.Builder.insertText(text: String): TranslatableText.Builder =
    this.onShiftClick(TextActions.insertText(text))