package frontier.ske.text

import org.spongepowered.api.text.LiteralText
import org.spongepowered.api.text.Text
import org.spongepowered.api.text.format.TextColors
import org.spongepowered.api.text.format.TextColors.*
import org.spongepowered.api.text.format.TextStyles
import org.spongepowered.api.text.format.TextStyles.*
import org.spongepowered.api.text.serializer.TextSerializers

fun Iterable<Text>.join(): Text = Text.join(this)
infix fun Iterable<Text>.joinWith(separator: Text): Text = Text.joinWith(separator, this)

operator fun Text.plus(other: Text): Text = Text.of(this, other)
operator fun Text.plus(other: String): Text = Text.of(this, other)

operator fun Text.Builder.plus(child: String): Text.Builder = this.append(child.text())
operator fun Text.Builder.plus(child: Text): Text.Builder = this.append(child)
operator fun Text.Builder.plus(children: Iterable<Text>): Text.Builder = this.append(children)

operator fun String.not(): Text = Text.of(this)
operator fun Text.Builder.not(): Text = this.build()

operator fun String.unaryPlus(): Text = TextSerializers.FORMATTING_CODE.deserialize(this)
operator fun Text.unaryMinus(): String = TextSerializers.FORMATTING_CODE.serialize(this)

fun String.text(): LiteralText = Text.of(this)
fun String.newText(): LiteralText.Builder = Text.builder(this)

fun String.black(): Text = this.newText().black().build()
fun String.darkBlue(): Text = this.newText().darkBlue().build()
fun String.darkGreen(): Text = this.newText().darkGreen().build()
fun String.darkAqua(): Text = this.newText().darkAqua().build()
fun String.darkRed(): Text = this.newText().darkRed().build()
fun String.purple(): Text = this.newText().purple().build()
fun String.gold(): Text = this.newText().gold().build()
fun String.gray(): Text = this.newText().gray().build()
fun String.darkGray(): Text = this.newText().darkGray().build()
fun String.blue(): Text = this.newText().blue().build()
fun String.aqua(): Text = this.newText().aqua().build()
fun String.green(): Text = this.newText().green().build()
fun String.red(): Text = this.newText().red().build()
fun String.pink(): Text = this.newText().pink().build()
fun String.yellow(): Text = this.newText().yellow().build()
fun String.white(): Text = this.newText().white().build()

fun String.obfuscated(): Text = this.newText().obfuscated().build()
fun String.bold(): Text = this.newText().bold().build()
fun String.strikethrough(): Text = this.newText().strikethrough().build()
fun String.underline(): Text = this.newText().underline().build()
fun String.italic(): Text = this.newText().italic().build()

fun String.reset(): Text = this.newText().reset().build()

fun Text.Builder.black(): Text.Builder = color(BLACK)
fun Text.Builder.darkBlue(): Text.Builder = color(DARK_BLUE)
fun Text.Builder.darkGreen(): Text.Builder = color(DARK_GREEN)
fun Text.Builder.darkAqua(): Text.Builder = color(DARK_AQUA)
fun Text.Builder.darkRed(): Text.Builder = color(DARK_RED)
fun Text.Builder.purple(): Text.Builder = color(DARK_PURPLE)
fun Text.Builder.gold(): Text.Builder = color(GOLD)
fun Text.Builder.gray(): Text.Builder = color(GRAY)
fun Text.Builder.darkGray(): Text.Builder = color(DARK_GRAY)
fun Text.Builder.blue(): Text.Builder = color(BLUE)
fun Text.Builder.aqua(): Text.Builder = color(AQUA)
fun Text.Builder.green(): Text.Builder = color(GREEN)
fun Text.Builder.red(): Text.Builder = color(RED)
fun Text.Builder.pink(): Text.Builder = color(LIGHT_PURPLE)
fun Text.Builder.yellow(): Text.Builder = color(YELLOW)
fun Text.Builder.white(): Text.Builder = color(WHITE)

fun Text.Builder.obfuscated(): Text.Builder = style(OBFUSCATED)
fun Text.Builder.bold(): Text.Builder = style(BOLD)
fun Text.Builder.strikethrough(): Text.Builder = style(STRIKETHROUGH)
fun Text.Builder.underline(): Text.Builder = style(UNDERLINE)
fun Text.Builder.italic(): Text.Builder = style(ITALIC)

fun Text.Builder.reset(): Text.Builder = color(TextColors.RESET).style(TextStyles.RESET)

fun Text.black(): Text = this.toBuilder().color(BLACK).build()
fun Text.darkBlue(): Text = this.toBuilder().color(DARK_BLUE).build()
fun Text.darkGreen(): Text = this.toBuilder().color(DARK_GREEN).build()
fun Text.darkAqua(): Text = this.toBuilder().color(DARK_AQUA).build()
fun Text.darkRed(): Text = this.toBuilder().color(DARK_RED).build()
fun Text.purple(): Text = this.toBuilder().color(DARK_PURPLE).build()
fun Text.gold(): Text = this.toBuilder().color(GOLD).build()
fun Text.gray(): Text = this.toBuilder().color(GRAY).build()
fun Text.darkGray(): Text = this.toBuilder().color(DARK_GRAY).build()
fun Text.blue(): Text = this.toBuilder().color(BLUE).build()
fun Text.aqua(): Text = this.toBuilder().color(AQUA).build()
fun Text.green(): Text = this.toBuilder().color(GREEN).build()
fun Text.red(): Text = this.toBuilder().color(RED).build()
fun Text.pink(): Text = this.toBuilder().color(LIGHT_PURPLE).build()
fun Text.yellow(): Text = this.toBuilder().color(YELLOW).build()
fun Text.white(): Text = this.toBuilder().color(WHITE).build()

fun Text.obfuscated(): Text = this.toBuilder().style(OBFUSCATED).build()
fun Text.bold(): Text = this.toBuilder().style(BOLD).build()
fun Text.strikethrough(): Text = this.toBuilder().style(STRIKETHROUGH).build()
fun Text.underline(): Text = this.toBuilder().style(UNDERLINE).build()
fun Text.italic(): Text = this.toBuilder().style(ITALIC).build()

fun Text.reset(): Text = this.toBuilder().color(TextColors.RESET).style(TextStyles.RESET).build()

fun Any.black(): Text = this.toString().newText().black().build()
fun Any.darkBlue(): Text = this.toString().newText().darkBlue().build()
fun Any.darkGreen(): Text = this.toString().newText().darkGreen().build()
fun Any.darkAqua(): Text = this.toString().newText().darkAqua().build()
fun Any.darkRed(): Text = this.toString().newText().darkRed().build()
fun Any.purple(): Text = this.toString().newText().purple().build()
fun Any.gold(): Text = this.toString().newText().gold().build()
fun Any.gray(): Text = this.toString().newText().gray().build()
fun Any.darkGray(): Text = this.toString().newText().darkGray().build()
fun Any.blue(): Text = this.toString().newText().blue().build()
fun Any.aqua(): Text = this.toString().newText().aqua().build()
fun Any.green(): Text = this.toString().newText().green().build()
fun Any.red(): Text = this.toString().newText().red().build()
fun Any.pink(): Text = this.toString().newText().pink().build()
fun Any.yellow(): Text = this.toString().newText().yellow().build()
fun Any.white(): Text = this.toString().newText().white().build()

fun Any.obfuscated(): Text = this.toString().newText().obfuscated().build()
fun Any.bold(): Text = this.toString().newText().bold().build()
fun Any.strikethrough(): Text = this.toString().newText().strikethrough().build()
fun Any.underline(): Text = this.toString().newText().underline().build()
fun Any.italic(): Text = this.toString().newText().italic().build()

fun Any.reset(): Text = this.toString().newText().reset().build()