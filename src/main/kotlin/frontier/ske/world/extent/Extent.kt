package frontier.ske.world.extent

import com.flowpowered.math.vector.Vector3d
import com.flowpowered.math.vector.Vector3i
import org.spongepowered.api.world.Location
import org.spongepowered.api.world.extent.Extent

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