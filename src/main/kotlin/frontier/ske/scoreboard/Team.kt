package frontier.ske.scoreboard

import org.spongepowered.api.entity.living.Living
import org.spongepowered.api.scoreboard.Team
import org.spongepowered.api.text.Text

operator fun Team.plusAssign(member: Text) {
    this.addMember(member)
}

operator fun Team.plusAssign(member: Living) {
    this.addMember(member.teamRepresentation)
}

operator fun Team.minusAssign(member: Text) {
    this.removeMember(member)
}

operator fun Team.minusAssign(member: Living) {
    this.removeMember(member.teamRepresentation)
}