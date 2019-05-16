package frontier.ske.world

import com.flowpowered.math.vector.Vector3d
import com.flowpowered.math.vector.Vector3i
import frontier.ske.util.unwrap
import org.spongepowered.api.entity.Entity
import org.spongepowered.api.world.Location
import org.spongepowered.api.world.extent.Extent
import java.util.*

operator fun Extent.get(entityUniqueId: UUID): Entity? =
    this.getEntity(entityUniqueId).unwrap()

@Suppress("UNCHECKED_CAST")
operator fun <E : Extent> E.get(position: Vector3i): Location<out E> =
    getLocation(position) as Location<out E>

@Suppress("UNCHECKED_CAST")
operator fun <E : Extent> E.get(position: Vector3d): Location<out E> =
    getLocation(position) as Location<out E>

@Suppress("UNCHECKED_CAST")
operator fun <E : Extent> E.get(x: Int, y: Int, z: Int): Location<out E> =
    getLocation(x, y, z) as Location<out E>

@Suppress("UNCHECKED_CAST")
operator fun <E : Extent> E.get(x: Double, y: Double, z: Double): Location<out E> =
    getLocation(x, y, z) as Location<out E>