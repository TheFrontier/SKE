package frontier.ske.command

import frontier.ske.text.not
import org.spongepowered.api.command.CommandException
import org.spongepowered.api.command.CommandSource
import org.spongepowered.api.entity.living.player.Player
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

@UseExperimental(ExperimentalContracts::class)
fun CommandSource.mustBePlayer(): Player {
    contract {
        returns() implies (this@mustBePlayer is Player)
    }

    if (this !is Player) {
        throw CommandException(!"You must be a player to use that command.")
    }

    return this
}