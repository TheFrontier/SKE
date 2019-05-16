package frontier.ske.util

import com.flowpowered.math.vector.Vector3d
import com.flowpowered.math.vector.Vector3i
import org.spongepowered.api.util.AABB

operator fun AABB.plus(amount: Vector3i): AABB =
        this.expand(amount)

operator fun AABB.plus(amount: Vector3d): AABB =
    this.expand(amount)