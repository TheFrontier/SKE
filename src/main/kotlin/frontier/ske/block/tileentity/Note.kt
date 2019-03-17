package frontier.ske.block.tileentity

import org.spongepowered.api.block.tileentity.Note
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.data.type.NotePitch

inline var Note.pitch: NotePitch
    get() = get(Keys.NOTE_PITCH).get()
    set(value) {
        offer(Keys.NOTE_PITCH, value)
    }