package frontier.ske.world

import org.spongepowered.api.entity.explosive.Explosive
import org.spongepowered.api.world.Location
import org.spongepowered.api.world.World
import org.spongepowered.api.world.explosion.Explosion

inline fun explosion(init: Explosion.Builder.() -> Unit): Explosion =
    Explosion.builder().apply(init).build()

inline var Explosion.Builder.location: Location<World>
    get() = error("Cannot get current value of builder")
    set(value) {
        this.location(value)
    }

inline var Explosion.Builder.source: Explosive?
    get() = error("Cannot get current value of builder")
    set(value) {
        this.sourceExplosive(value)
    }

inline var Explosion.Builder.radius: Float
    get() = error("Cannot get current value of builder")
    set(value) {
        this.radius(value)
    }

inline var Explosion.Builder.causesFire: Boolean
    get() = error("Cannot get current value of builder")
    set(value) {
        this.canCauseFire(value)
    }

inline var Explosion.Builder.damagesEntities: Boolean
    get() = error("Cannot get current value of builder")
    set(value) {
        this.shouldDamageEntities(value)
    }

inline var Explosion.Builder.playsSmoke: Boolean
    get() = error("Cannot get current value of builder")
    set(value) {
        this.shouldPlaySmoke(value)
    }

inline var Explosion.Builder.breaksBlocks: Boolean
    get() = error("Cannot get current value of builder")
    set(value) {
        this.shouldBreakBlocks(value)
    }