package frontier.ske.scoreboard

import frontier.ske.util.unwrap
import frontier.ske.server
import org.spongepowered.api.scoreboard.Scoreboard
import org.spongepowered.api.scoreboard.Team
import org.spongepowered.api.scoreboard.critieria.Criterion
import org.spongepowered.api.scoreboard.displayslot.DisplaySlot
import org.spongepowered.api.scoreboard.objective.Objective
import org.spongepowered.api.text.Text

inline val serverScoreboard: Scoreboard?
    get() = server.serverScoreboard.unwrap()

operator fun Scoreboard.get(slot: DisplaySlot): Objective? =
    this.getObjective(slot).unwrap()

@Throws(IllegalArgumentException::class)
operator fun Scoreboard.plusAssign(objective: Objective) {
    this.addObjective(objective)
}

@Throws(IllegalStateException::class)
operator fun Scoreboard.set(objective: Objective?, displaySlot: DisplaySlot) {
    this.updateDisplaySlot(objective, displaySlot)
}

operator fun Scoreboard.minusAssign(slot: DisplaySlot) {
    this.clearSlot(slot)
}

operator fun Scoreboard.get(criteria: Criterion): Set<Objective> =
    this.getObjectivesByCriteria(criteria)

operator fun Scoreboard.minusAssign(objective: Objective) {
    this.removeObjective(objective)
}

operator fun Scoreboard.minusAssign(name: Text) {
    this.removeScores(name)
}

@Throws(IllegalArgumentException::class)
operator fun Scoreboard.plusAssign(team: Team) {
    this.registerTeam(team)
}