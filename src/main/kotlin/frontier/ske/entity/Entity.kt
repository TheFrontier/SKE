package frontier.ske.entity

import com.flowpowered.math.vector.Vector3d
import frontier.ske.java.util.unwrap
import org.spongepowered.api.data.key.Keys
import org.spongepowered.api.effect.potion.PotionEffect
import org.spongepowered.api.entity.Entity
import org.spongepowered.api.text.Text

inline var Entity.angerLevel: Int
    get() = getOrElse(Keys.ANGER, 0)
    set(value) {
        offer(Keys.ANGER, value)
    }

inline var Entity.canBreed: Boolean
    get() = getOrElse(Keys.CAN_BREED, false)
    set(value) {
        offer(Keys.CAN_BREED, value)
    }

inline var Entity.canGrief: Boolean
    get() = getOrElse(Keys.CAN_GRIEF, false)
    set(value) {
        offer(Keys.CAN_GRIEF, value)
    }

inline var Entity.isAngry: Boolean
    get() = getOrElse(Keys.ANGRY, false)
    set(value) {
        offer(Keys.ANGRY, value)
    }

inline var Entity.baseSize: Float
    get() = getOrElse(Keys.BASE_SIZE, 0F)
    set(value) {
        offer(Keys.BASE_SIZE, value)
    }

inline var Entity.customNameVisible: Boolean
    get() = get(Keys.CUSTOM_NAME_VISIBLE).orElse(false)
    set(value) {
        offer(Keys.CUSTOM_NAME_VISIBLE, value)
    }

inline var Entity.displayName: Text?
    get() = get(Keys.DISPLAY_NAME).unwrap()
    set(value) {
        offer(Keys.DISPLAY_NAME, value)
    }

inline var Entity.fireDamageDelay: Int
    get() = get(Keys.FIRE_DAMAGE_DELAY).orElse(0)
    set(value) {
        offer(Keys.FIRE_DAMAGE_DELAY, value)
    }

inline var Entity.fireTicks: Int
    get() = get(Keys.FIRE_TICKS).orElse(0)
    set(value) {
        offer(Keys.FIRE_TICKS, value)
    }

inline var Entity.hasGravity: Boolean
    get() = get(Keys.HAS_GRAVITY).orElse(false)
    set(value) {
        offer(Keys.HAS_GRAVITY, value)
    }

inline var Entity.height: Float
    get() = get(Keys.HEIGHT).orElse(0F)
    set(value) {
        offer(Keys.HEIGHT, value)
    }

inline var Entity.isInvisible: Boolean
    get() = get(Keys.INVISIBLE).orElse(false)
    set(value) {
        offer(Keys.INVISIBLE, value)
    }

inline var Entity.invulnerabilityTicks: Int
    get() = get(Keys.INVULNERABILITY_TICKS).orElse(0)
    set(value) {
        offer(Keys.INVULNERABILITY_TICKS, value)
    }

inline var Entity.isInvulnerable: Boolean
    get() = get(Keys.INVULNERABLE).orElse(false)
    set(value) {
        offer(Keys.INVULNERABLE, value)
    }

inline var Entity.isFlying: Boolean
    get() = get(Keys.IS_FLYING).orElse(false)
    set(value) {
        offer(Keys.IS_FLYING, value)
    }

inline var Entity.isSilent: Boolean
    get() = get(Keys.IS_SILENT).orElse(false)
    set(value) {
        offer(Keys.IS_SILENT, value)
    }

inline var Entity.isSneaking: Boolean
    get() = get(Keys.IS_SNEAKING).orElse(false)
    set(value) {
        offer(Keys.IS_SNEAKING, value)
    }

inline var Entity.isSprinting: Boolean
    get() = get(Keys.IS_SPRINTING).orElse(false)
    set(value) {
        offer(Keys.IS_SPRINTING, value)
    }

inline var Entity.leftArmRotation: Vector3d
    get() = get(Keys.LEFT_ARM_ROTATION).get()
    set(value) {
        offer(Keys.LEFT_ARM_ROTATION, value)
    }

inline var Entity.leftLegRotation: Vector3d
    get() = get(Keys.LEFT_LEG_ROTATION).get()
    set(value) {
        offer(Keys.LEFT_LEG_ROTATION, value)
    }

inline var Entity.isPersisted: Boolean
    get() = get(Keys.PERSISTS).orElse(false)
    set(value) {
        offer(Keys.PERSISTS, value)
    }

inline var Entity.potionEffects: List<PotionEffect>
    get() = get(Keys.POTION_EFFECTS).unwrap().orEmpty()
    set(value) {
        offer(Keys.POTION_EFFECTS, value)
    }

inline var Entity.rightArmRotation: Vector3d
    get() = get(Keys.RIGHT_ARM_ROTATION).get()
    set(value) {
        offer(Keys.RIGHT_ARM_ROTATION, value)
    }

inline var Entity.rightLegRotation: Vector3d
    get() = get(Keys.RIGHT_LEG_ROTATION).get()
    set(value) {
        offer(Keys.RIGHT_LEG_ROTATION, value)
    }

inline var Entity.isVanished: Boolean
    get() = get(Keys.VANISH).orElse(false)
    set(value) {
        offer(Keys.VANISH, value)
    }

inline var Entity.vanishIgnoresCollision: Boolean
    get() = get(Keys.VANISH_IGNORES_COLLISION).orElse(false)
    set(value) {
        offer(Keys.VANISH_IGNORES_COLLISION, value)
    }

inline var Entity.vanishPreventsTargeting: Boolean
    get() = get(Keys.VANISH_PREVENTS_TARGETING).orElse(false)
    set(value) {
        offer(Keys.VANISH_PREVENTS_TARGETING, value)
    }

inline var Entity.walkingSpeed: Double
    get() = get(Keys.WALKING_SPEED).orElse(0.0)
    set(value) {
        offer(Keys.WALKING_SPEED, value)
    }