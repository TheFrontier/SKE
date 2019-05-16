package frontier.ske.scoreboard

import org.spongepowered.api.scoreboard.Score
import kotlin.reflect.KProperty

operator fun Score.getValue(self: Any?, property: KProperty<*>): Int =
        this.score

operator fun Score.setValue(self: Any?, property: KProperty<*>, value: Int) {
    this.score = value
}