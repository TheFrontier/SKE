package frontier.ske.entity

import org.spongepowered.api.block.BlockState
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.entity.FallingBlock

inline var FallingBlock.canHurtEntities: Boolean
    get() = get(Keys.FALLING_BLOCK_CAN_HURT_ENTITIES).orElse(false)
    set(value) {
        offer(Keys.FALLING_BLOCK_CAN_HURT_ENTITIES, value)
    }

inline var FallingBlock.state: BlockState
    get() = get(Keys.FALLING_BLOCK_STATE).get()
    set(value) {
        offer(Keys.FALLING_BLOCK_STATE, value)
    }

inline var FallingBlock.fallDamagePerBlock: Double
    get() = get(Keys.FALL_DAMAGE_PER_BLOCK).orElse(0.0)
    set(value) {
        offer(Keys.FALL_DAMAGE_PER_BLOCK, value)
    }

inline var FallingBlock.fallTime: Int
    get() = get(Keys.FALL_TIME).orElse(0)
    set(value) {
        offer(Keys.FALL_TIME, value)
    }

inline var FallingBlock.maxFallDamage: Double
    get() = get(Keys.MAX_FALL_DAMAGE).orElse(0.0)
    set(value) {
        offer(Keys.MAX_FALL_DAMAGE, value)
    }