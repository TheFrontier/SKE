package frontier.ske.block.tileentity

import com.flowpowered.math.vector.Vector3i
import org.spongepowered.api.block.tileentity.EndGateway
import org.spongepowered.api.data.key.Keys

/**
 * @see [org.spongepowered.api.data.manipulator.mutable.tileentity.EndGatewayData.exitPosition]
 */
inline var EndGateway.exitPosition: Vector3i
    get() = get(Keys.EXIT_POSITION).get()
    set(value) {
        offer(Keys.EXIT_POSITION, value)
    }

/**
 * @see [org.spongepowered.api.data.manipulator.mutable.tileentity.EndGatewayData.exactTeleport]
 */
inline var EndGateway.isExactTeleport: Boolean
    get() = get(Keys.EXACT_TELEPORT).orElse(false)
    set(value) {
        offer(Keys.EXACT_TELEPORT, value)
    }

/**
 * @see [org.spongepowered.api.data.manipulator.mutable.tileentity.EndGatewayData.age]
 */
inline var EndGateway.age: Long
    get() = get(Keys.END_GATEWAY_AGE).orElse(0)
    set(value) {
        offer(Keys.END_GATEWAY_AGE, value)
    }

/**
 * @see [org.spongepowered.api.data.manipulator.mutable.tileentity.EndGatewayData.teleportCooldown]
 */
inline var EndGateway.teleportCooldown: Int
    get() = get(Keys.END_GATEWAY_TELEPORT_COOLDOWN).orElse(0)
    set(value) {
        offer(Keys.END_GATEWAY_TELEPORT_COOLDOWN, value)
    }