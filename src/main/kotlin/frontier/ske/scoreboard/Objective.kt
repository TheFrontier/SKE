package frontier.ske.scoreboard

import frontier.ske.util.unwrap
import org.spongepowered.api.scoreboard.Score
import org.spongepowered.api.scoreboard.objective.Objective
import org.spongepowered.api.text.Text

operator fun Objective.contains(name: Text): Boolean =
    this.hasScore(name)

operator fun Objective.plusAssign(score: Score) {
    this.addScore(score)
}

operator fun Objective.get(name: Text): Score? =
    this.getScore(name).unwrap()

operator fun Objective.minus(score: Score): Boolean =
    this.removeScore(score)

operator fun Objective.minusAssign(score: Score) {
    this.removeScore(score)
}

operator fun Objective.minus(name: Text): Boolean =
    this.removeScore(name)

operator fun Objective.minusAssign(name: Text) {
    this.removeScore(name)
}