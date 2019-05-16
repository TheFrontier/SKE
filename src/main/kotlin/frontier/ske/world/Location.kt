package frontier.ske.world

import com.flowpowered.math.vector.Vector3d
import com.flowpowered.math.vector.Vector3i
import org.spongepowered.api.entity.Entity
import org.spongepowered.api.entity.EntityType
import org.spongepowered.api.util.Direction
import org.spongepowered.api.world.Location
import org.spongepowered.api.world.World
import org.spongepowered.api.world.extent.Extent

fun Location<World>.getNearbyEntities(distance: Double = 1.0): Collection<Entity> =
    extent.getNearbyEntities(position, distance)

operator fun <E : Extent> E.contains(location: Location<E>): Boolean =
    this == location.extent

operator fun <E : Extent> Location<E>.plus(v: Vector3d): Location<E> =
    this.add(v)

operator fun <E : Extent> Location<E>.plus(v: Vector3i): Location<E> =
    this.add(v)

operator fun <E : Extent> Location<E>.minus(v: Vector3d): Location<E> =
    this.sub(v)

operator fun <E : Extent> Location<E>.minus(v: Vector3i): Location<E> =
    this.sub(v)

operator fun <E : Extent> Location<E>.get(direction: Direction): Location<E> =
    this.getBlockRelative(direction)

operator fun <E : Extent> Location<E>.plus(type: EntityType): Entity =
    this.createEntity(type)

operator fun <E : Extent> Location<E>.plus(entity: Entity): Boolean =
    this.spawnEntity(entity)

operator fun <E : Extent> Location<E>.plusAssign(entity: Entity) {
    this.spawnEntity(entity)
}