package frontier.ske.block.tileentity

import frontier.ske.data.value.getOrEmpty
import org.spongepowered.api.block.tileentity.Sign
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.text.Text

inline var Sign.lines: List<Text>
    get() = getOrEmpty(Keys.SIGN_LINES)
    set(value) {
        offer(Keys.SIGN_LINES, value)
    }