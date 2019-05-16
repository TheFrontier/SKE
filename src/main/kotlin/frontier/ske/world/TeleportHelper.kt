package frontier.ske.world

import frontier.ske.util.unwrap
import frontier.ske.teleportHelper
import org.spongepowered.api.world.Location
import org.spongepowered.api.world.TeleportHelper
import org.spongepowered.api.world.World

fun Location<World>.toSafe(): Location<World>? =
    teleportHelper.getSafeLocation(this).unwrap()

fun Location<World>.toSafe(
    height: Int = TeleportHelper.DEFAULT_HEIGHT,
    width: Int = TeleportHelper.DEFAULT_WIDTH,
    floorDistance: Int = TeleportHelper.DEFAULT_FLOOR_CHECK_DISTANCE
): Location<World>? =
    teleportHelper.getSafeLocation(this, height, width, floorDistance).unwrap()