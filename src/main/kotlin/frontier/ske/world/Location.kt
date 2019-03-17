package frontier.ske.world

import com.flowpowered.math.vector.Vector3d
import com.flowpowered.math.vector.Vector3i
import org.spongepowered.api.entity.Entity
import org.spongepowered.api.world.Location
import org.spongepowered.api.world.World

fun Location<World>.getNearbyEntities(distance: Double = 1.0): Collection<Entity> =
    extent.getNearbyEntities(position, distance)

operator fun Location<World>.plus(v: Vector3d): Location<World> =
    this.add(v)

operator fun Location<World>.plus(v: Vector3i): Location<World> =
    this.add(v)

operator fun Location<World>.minus(v: Vector3d): Location<World> =
    this.sub(v)

operator fun Location<World>.minus(v: Vector3i): Location<World> =
    this.sub(v)