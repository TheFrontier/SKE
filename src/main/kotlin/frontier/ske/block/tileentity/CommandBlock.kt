package frontier.ske.block.tileentity

import frontier.ske.java.util.flatten
import frontier.ske.java.util.unwrap
import org.spongepowered.api.block.tileentity.CommandBlock
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.text.Text

inline var CommandBlock.command: String
    get() = get(Keys.COMMAND).orElse("")
    set(value) {
        offer(Keys.COMMAND, value)
    }

inline val CommandBlock.lastCommandOutput: Text?
    get() = get(Keys.LAST_COMMAND_OUTPUT).flatten().unwrap()

inline val CommandBlock.successCount: Int
    get() = get(Keys.SUCCESS_COUNT).orElse(0)

inline var CommandBlock.tracksOutput: Boolean
    get() = get(Keys.TRACKS_OUTPUT).orElse(false)
    set(value) {
        offer(Keys.TRACKS_OUTPUT, value)
    }