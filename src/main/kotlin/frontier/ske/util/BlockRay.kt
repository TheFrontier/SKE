package frontier.ske.util

import com.flowpowered.math.vector.Vector3d
import org.spongepowered.api.entity.Entity
import org.spongepowered.api.util.blockray.BlockRay
import org.spongepowered.api.world.Location
import org.spongepowered.api.world.World
import org.spongepowered.api.world.extent.Extent

fun <E: Extent> Location<E>.newBlockRay(): BlockRay.BlockRayBuilder<E> =
        BlockRay.from(this)

operator fun <E : Extent> Location<E>.rangeTo(end: Vector3d): BlockRay.BlockRayBuilder<E> =
        BlockRay.from(this).to(end)

operator fun <E : Extent> Location<E>.rangeTo(end: Location<E>): BlockRay.BlockRayBuilder<E> {
    require(this.extent == end.extent)
    return this..end.position
}

fun <E : Extent> E.newBlockRay(start: Vector3d): BlockRay.BlockRayBuilder<E> =
        BlockRay.from(this, start)

fun Entity.newBlockRay(): BlockRay.BlockRayBuilder<World> =
        BlockRay.from(this)

operator fun Entity.rangeTo(end: Vector3d): BlockRay.BlockRayBuilder<World> =
        BlockRay.from(this).to(end)